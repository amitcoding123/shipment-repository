import { Component, OnInit } from '@angular/core';

import {FormBuilder, FormControl} from "@angular/forms";
import { Validators } from '@angular/forms';
import { AuthService } from '../login/auth.service';
import { Shipper } from '../model/shipper';
import { ShipmentService } from '../shipment/shipment.service';
import {map, startWith} from 'rxjs/operators';

import {Observable, Subscription} from "rxjs";

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

  getSelectedShipper() {
    return this.customerTaxInvoiceForm.get('selectedShipper').value;
  }

  getTaxInvoices() {
    if(!(typeof this.customerTaxInvoiceForm.get('selectedShipper').value === 'object')) {
      this.validSelection = false;
      return;
    }
    this.validSelection = true;
  }

}
