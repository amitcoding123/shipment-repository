import { Component, OnInit } from '@angular/core';

import { EventEmitter } from '@angular/core';
import {FormBuilder} from "@angular/forms";
import { Validators } from '@angular/forms';

@Component({
  selector: 'app-tracking',
  templateUrl: './tracking.component.html',
  styleUrls: ['./tracking.component.css']
})
export class TrackingComponent implements OnInit {

  trackingEvent = new EventEmitter();
  updateDone = false;

  constructor(private formBuilder: FormBuilder) { }

  ngOnInit(): void {
  }

  trackingNumberForm = this.formBuilder.group({
    trackingNumber: ['', [Validators.required]]
  });

  get trackingNumber(): any {
    return this.trackingNumberForm.get('trackingNumber');
  }

  updateTrackingNumber() {
    this.trackingEvent.emit(this.trackingNumberForm.get('trackingNumber').value);
  }

  onClose() {
    this.trackingEvent.emit(this.trackingNumberForm.get('trackingNumber').value);
  }

}
