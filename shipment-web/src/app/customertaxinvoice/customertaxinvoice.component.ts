import { Component, OnInit } from '@angular/core';

import {FormBuilder, FormControl, FormArray} from "@angular/forms";
import { Validators } from '@angular/forms';
import { AuthService } from '../login/auth.service';
import { Shipper } from '../model/shipper';
import { ShipmentService } from '../shipment/shipment.service';
import {map, startWith} from 'rxjs/operators';

import {Observable, Subscription} from "rxjs";
import { TaxInvoice } from '../model/tax-invoice';
import { Shipment } from '../model/shipment';
import { CustomerTaxInvoice } from '../model/customer-tax-invoice';

import * as fileSaver from 'file-saver';

@Component({
  selector: 'app-customertaxinvoice',
  templateUrl: './customertaxinvoice.component.html',
  styleUrls: ['./customertaxinvoice.component.css']
})
export class CustomertaxinvoiceComponent implements OnInit {

  shippers: Shipper[] = [];
  filteredShippers: Observable<Shipper[]>;
  shipperSelectionControl = new FormControl();
  validSelection = true;
  taxInvoices: TaxInvoice [] = [];
  eligibleShipments: Shipment[] = [];
  createTaxInvoiceFlag = false;
  selectedShipmentsForTI: Shipment[] = [];
  taxInvoiceGenerated = false;
  customerTaxInvoice: CustomerTaxInvoice;

  displayedColumns: string[] = ['select', 'trackingNumber', 'createdOn', 'status'];
  columnsToDisplay: string[] = this.displayedColumns.slice();
  displayedColumns1: string[] = ['id', 'createdOn', 'download'];
  columnsToDisplay1: string[] = this.displayedColumns1.slice();

  constructor(private formBuilder: FormBuilder, private shipmentService: ShipmentService,
    private authService: AuthService) { }

  ngOnInit(): void {
    this.shipmentService.getShippersForUser(this.authService.getUser().userId).subscribe((data: any) => {
      this.shippers = data;
      console.log('CustomertaxinvoiceComponent: Email = ' + data[0].email);
      this.filteredShippers = this.customerTaxInvoiceForm.get('selectedShipper').valueChanges
      .pipe(
        startWith(''),
        map(value => typeof value === 'string' ? value : value.name),
        map(name => name ? this._filter(name) : this.shippers.slice())
      );
    });
  }

  displayFn(shipper: Shipper): string {
    return shipper && shipper.name ? shipper.name : '';
  }

  private _filter(name: string): Shipper[] {
    const filterValue = name.toLowerCase();

    return this.shippers.filter(Shipper => Shipper.name.toLowerCase().includes(filterValue));
  }

  customerTaxInvoiceForm = this.formBuilder.group({
    selectedShipper: ['', [Validators.required]]
  });

  createTaxInvoiceForm = this.formBuilder.group({
    selectedShipments: this.formBuilder.array([])
  });

  getSelectedShipper(): any {
    return this.customerTaxInvoiceForm.get('selectedShipper');
  }

  get selectedShipments(): FormArray {
    return this.createTaxInvoiceForm.get('selectedShipments') as FormArray;
  }

  getTaxInvoices() {
    console.log('Selected shipper is ' + (this.customerTaxInvoiceForm.get('selectedShipper').value).id);

    if(!(typeof this.customerTaxInvoiceForm.get('selectedShipper').value === 'object')) {
      this.validSelection = false;
      return;
    }
    this.validSelection = true;
    this.shipmentService.getTaxInvoicesForShipper((this.customerTaxInvoiceForm.get('selectedShipper').value).id).subscribe((data: any) => {
      this.taxInvoices = data;
      console.log('Fetched the tax invoices');
    });
  }

  clearShipper(event: Event) {
    this.customerTaxInvoiceForm.get('selectedShipper').setValue(['']);
    this.shipmentService.getShippersForUser(this.authService.getUser().userId).subscribe((data: any) => {
      this.shippers = data;
      console.log('CustomertaxinvoiceComponent: Email = ' + data[0].email);
      this.filteredShippers = this.customerTaxInvoiceForm.get('selectedShipper').valueChanges
      .pipe(
        startWith(''),
        map(value => typeof value === 'string' ? value : value.name),
        map(name => name ? this._filter(name) : this.shippers.slice())
      );
    });
  }

  createTaxInvoice() {
    this.shipmentService.getEligibleShipmentsForTaxInvoice(this.authService.getUser().userId, (this.customerTaxInvoiceForm.get('selectedShipper').value).id)
      .subscribe((data: any) => {
        this.eligibleShipments = data;
        this.createTaxInvoiceFlag = true;
        console.log('Eligible Shipments = ' + data);
      });
  }

  updateSelectedShipments(checked: boolean, shipment: Shipment) {
    if(checked) {
      this.selectedShipmentsForTI.push(shipment);
    } else {
      let i = 0;
      while(i < this.selectedShipmentsForTI.length) {
        if(this.selectedShipmentsForTI[i].id == shipment.id) {
          this.selectedShipmentsForTI.splice(i, 1);
          break;
        }
        i++;
      }
    }
    console.log('Selected shipments are = ' + this.selectedShipmentsForTI);
  }

  generateTaxInvoice() {
    const taxInvoice = new TaxInvoice();
    taxInvoice.shipper = this.getSelectedShipper().value;
    taxInvoice.shipments = [...this.selectedShipmentsForTI];
    taxInvoice.user = this.authService.getUser();
    this.shipmentService.generateTaxInvoice(taxInvoice).subscribe(data => {
      this.customerTaxInvoice = data;
      console.log('Tax Invoice Dto = ' + taxInvoice);
      this.taxInvoiceGenerated = true;
    });
  }

  downloadTaxInvoice() {
    this.shipmentService.downloadTaxInvoiceFile(this.customerTaxInvoice.id).subscribe((data : any) => {
      console.log(data.type);
      let blob: any = new Blob([data], {type:data.type});
      const url = window.URL.createObjectURL(blob);
      fileSaver.saveAs(blob, 'Tax_Invoice.pdf');
    });
  }

  downloadTaxInvoiceRow(id: number) {
    this.shipmentService.downloadTaxInvoiceFile(id).subscribe((data : any) => {
      console.log(data.type);
      let blob: any = new Blob([data], {type:data.type});
      const url = window.URL.createObjectURL(blob);
      fileSaver.saveAs(blob, 'Tax_Invoice.pdf');
    });
  }

}
