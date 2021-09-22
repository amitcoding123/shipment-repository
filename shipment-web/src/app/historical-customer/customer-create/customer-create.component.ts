import { Component, Inject, OnInit } from '@angular/core';

import { EventEmitter } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { HistoricalCustomerService } from '../historical-customer.service';

import { Validators } from '@angular/forms';
import { LeadCustomer } from 'src/app/model/lead-customer';
import { MAT_DIALOG_DATA } from '@angular/material/dialog';

@Component({
  selector: 'app-customer-create',
  templateUrl: './customer-create.component.html',
  styleUrls: ['./customer-create.component.css']
})
export class CustomerCreateComponent implements OnInit {

  constructor(private service: HistoricalCustomerService,
    private formBuilder: FormBuilder,
    @Inject(MAT_DIALOG_DATA) public data: {mode: string}) {
      if(data.mode === "modify") {
        this.modify = true;
      }
    }

  ngOnInit(): void {
    if(this.modify) {
      console.log('Year of last shipment ' + this.service.modifiedCustomer.yearLastBooked);
      this.customerForm.get('id').setValue(this.service.modifiedCustomer.id);
      this.customerForm.get('name').setValue(this.service.modifiedCustomer.name);
      this.customerForm.get('yearLastBooked').setValue(this.service.modifiedCustomer.yearLastBooked);
      this.customerForm.get('mobileNumber').setValue(this.service.modifiedCustomer.mobileNumber);
    }
  }

  customerEvent = new EventEmitter();
  modify = false;

  customerForm = this.formBuilder.group({
    id: [''],
    name: ['', [Validators.required, Validators.minLength(5)]],
    mobileNumber: ['', [Validators.required, Validators.minLength(10), Validators.maxLength(10)]],
    yearLastBooked: ['', [Validators.required]]
    }
  );

  get name(): any {
    return this.customerForm.get('name');
  }

  get mobileNumber(): any {
    return this.customerForm.get('mobileNumber');
  }

  get yearLastBooked(): any {
    return this.customerForm.get('yearLastBooked');
  }

  createCustomer() {
    let customer = new LeadCustomer();
    if(this.modify) {
      customer.id = this.customerForm.get('id').value;
    }
    customer.mobileNumber = this.customerForm.get('mobileNumber').value;
    customer.name = this.customerForm.get('name').value;
    customer.yearLastBooked = this.customerForm.get('yearLastBooked').value;
    this.service.saveCustomer(customer).subscribe((data: LeadCustomer) => {
      console.log('Created customer = ' + data);
      this.service.createdCustomer = data;
      this.customerEvent.emit('created');
    });
  }

}
