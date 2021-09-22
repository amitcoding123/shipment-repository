import { Component, OnInit } from '@angular/core';
import { MatDialog, MatDialogConfig } from '@angular/material/dialog';
import { Router } from '@angular/router';
import { LeadCustomer } from '../model/lead-customer';
import { CustomerCreateComponent } from './customer-create/customer-create.component';
import { HistoricalCustomerService } from './historical-customer.service';

@Component({
  selector: 'app-historical-customer',
  templateUrl: './historical-customer.component.html',
  styleUrls: ['./historical-customer.component.css']
})
export class HistoricalCustomerComponent implements OnInit {

  leadCustomers: LeadCustomer[] = [];
  selectedCustomer: LeadCustomer;
  created = false;
  modified = false;

  displayedColumns: string[] = ['select', 'name', 'mobileNumber', 'yearLastBooked'];

  constructor(private service: HistoricalCustomerService,
    private dialog: MatDialog,
    private router: Router) {

  }

  ngOnInit(): void {
    this.service.getLeadCustomers().subscribe((data: LeadCustomer[]) => {
      this.leadCustomers = data;
      console.log(this.leadCustomers);
    });
  }

  selectCustomer(customer: LeadCustomer): void {
    this.selectedCustomer = customer;
    console.log('Selected the customer = ' + customer.mobileNumber);
  }

  editCustomer(customer: LeadCustomer) {
    this.service.modifiedCustomer = customer;
    const dialogConfig = new MatDialogConfig();
    let dialogRef = this.dialog.open(CustomerCreateComponent, {data: {mode: "modify"}});
    const sub = dialogRef.componentInstance.customerEvent.subscribe(data => {
      console.log('Customer created/ edited successfully');
      this.created = false;
      this.modified = true;
      this.service.getLeadCustomers().subscribe((data: LeadCustomer[]) => {
        this.leadCustomers = data;
        console.log(this.leadCustomers);
      });
      dialogRef.close();
    });
    dialogRef.afterClosed().subscribe(() => {
       sub.unsubscribe();
    });
  }

  addCustomer() {
    const dialogConfig = new MatDialogConfig();
    let dialogRef = this.dialog.open(CustomerCreateComponent, {data: {mode: "create"}});
    console.log('Opened login pop-up');
    const sub = dialogRef.componentInstance.customerEvent.subscribe(data => {
      console.log('Customer created/ edited successfully');
      console.log()
      this.leadCustomers.push(this.service.createdCustomer);
      console.log('Customer instance in service = ' + this.service.createdCustomer.name);
      console.log('Lead customers length = ' + this.leadCustomers.length);
      this.created = true;
      this.modified = false;
      this.service.getLeadCustomers().subscribe((data: LeadCustomer[]) => {
        this.leadCustomers = data;
        console.log(this.leadCustomers);
      });
      dialogRef.close();
    });
    dialogRef.afterClosed().subscribe(() => {
       sub.unsubscribe();
    });
  }

}
