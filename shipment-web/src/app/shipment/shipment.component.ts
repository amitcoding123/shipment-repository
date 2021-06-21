import {Component, OnInit, Output, ViewChild} from '@angular/core';
import {Shipment} from "../model/shipment";
import {HttpClient} from "@angular/common/http";
import {ShipmentService} from "./shipment.service";
import {Router} from "@angular/router";
import {ItemType} from "../model/item-type";
import {InvoiceService} from "./invoice.service";
import {Observable} from "rxjs";
import {AuthService} from "../login/auth.service";
import {MatTableDataSource} from "@angular/material/table";
import {MatSort} from "@angular/material/sort";

@Component({
  selector: 'app-shipment',
  templateUrl: './shipment.component.html',
  styleUrls: ['./shipment.component.css']
})
export class ShipmentComponent implements OnInit {

  shipments: Shipment[] = [];
  shipments$: Observable<Shipment[]>;
  selectedShipment: Shipment;
  selected: boolean;
  blob: Blob;
  page = 1;
  count = 0;
  tableSize = 3;
  tableSizes = [3, 6, 9, 12];
  headers = ['Service Provider', 'Tracking Number', 'Shipper', 'Consignee', 'Status'];
  userId: string;
  displayedColumns: string [] = ['provider', 'trackingNumber', 'shipper-name', 'consignee-name', 'status', 'invoice', 'actions'];
  dataSource: any;

  @ViewChild(MatSort) sort: MatSort;

  constructor(private http: HttpClient,
              private shipmentService: ShipmentService,
              private router: Router,
              private invoiceService: InvoiceService,
              private authService: AuthService) {
    this.userId = authService.getLoggedInUserName();
  }

  ngOnInit(): void {
    console.log('Inside shipment component');
    this.getShipmentList();
    console.log('Headers = ' + this.headers);
    console.log('Shipments = ' + this.shipments);
  }

  ngAfterViewInit() {
    this.dataSource.sort = this.sort;
  }

  getShipmentList(): void {
    this.shipmentService
      .getShipments()
    .subscribe(value => {
      value.forEach(val => {
        this.shipments.push(val);
      });
      this.dataSource = new MatTableDataSource(this.shipments);
    });
  }

  onTableDataChange(event) {
    this.page = event;
    this.getShipmentList();
  }

  onTableSizeChange(event) {
    this.tableSize = event.target.value;
    this.page = 1;
    this.getShipmentList();
  }

  getInvoiceFile(shipmentId: number) {
    this.invoiceService.getInvoice(shipmentId).subscribe((data) => {
      console.log(data);
      //this.blob = new Blob([data as BlobPart], {type: 'application/vnd.openxmlformats-officedocument.spreadsheetml.sheet'});
      var downloadURL = window.URL.createObjectURL(data);
      var link = document.createElement('a');
      link.href = downloadURL;
      // link.download = "help.pdf";
      link.download = "invoice_" + shipmentId + ".xslx";
      link.click();
      this.blob = data as Blob;
    });
    console.log(this.blob);
    return this.blob;
  }

  selectShipment(shipment: Shipment): void {
    this.selectedShipment = shipment;
    this.selected = true;
    console.log('Selected the shipment = ' + shipment.trackingNumber);
  }


  bookShipment(): void {
    this.router.navigate(['/shipment-create']);
  }

  modifyShipment(shipment): void {
    this.router.navigate(['/shipment-create/modify/' + shipment.id])
  }

  deleteShipment(shipment): void {
    if(confirm("Are you sure you want to delete the shipment?")) {
      console.log('Deleting shipment with id = ' + shipment.id);
      this.shipmentService.deleteShipment(shipment);
      console.log('After making service call');
      window.location.reload();
    }
  }

  isNew(status: string): boolean {
    if(status == "NEW")
      return true;
    else
      return false;
  }

  onRowClicked(row) {
    console.log('Selected Row = ' + row.trackingNumber);
  }

}
