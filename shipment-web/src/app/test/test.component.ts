import {Component, ElementRef, OnInit, ViewChild} from '@angular/core';
import {FormControl, FormGroup, FormArray, FormBuilder, Validators} from "@angular/forms";
import { ICountry, IState, ICity} from "country-state-city";
import csc from 'country-state-city';
import {ActivatedRoute, Router} from "@angular/router";
import {Observable} from "rxjs";
import { MatGridListModule } from "@angular/material/grid-list";
import { ShipmentDocument } from 'src/app/model/shipment-document';
import {MatDialog, MatDialogConfig} from "@angular/material/dialog";
import { ContenttypeComponent } from 'src/app/contenttype/contenttype.component';
import {MatDatepickerInputEvent} from '@angular/material/datepicker';
import {map, startWith} from 'rxjs/operators';
import { ShipmentService } from '../shipment/shipment.service';
import { AuthService } from '../login/auth.service';
import { Shipper } from '../model/shipper';

@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
  styleUrls: ['./test.component.css']
})
export class TestComponent implements OnInit {

  shippers: Shipper[] = [];
  filteredShippers: Observable<Shipper[]>;

  constructor(private shipmentService: ShipmentService,
    private authService: AuthService,
    private formBuilder: FormBuilder) { }

  ngOnInit(): void {
    this.shipmentService.getShippersForUser('amitg').subscribe((data: any) => {
      this.shippers = data;
      console.log('Test Component: Email = ' + data[0].email);
      this.filteredShippers = this.testForm.get('selectedShipper').valueChanges
      .pipe(
        startWith(''),
        map(value => typeof value === 'string' ? value : value.name),
        map(name => name ? this._filter(name) : this.shippers.slice())
      );
    });
  }

  testForm = this.formBuilder.group({
    selectedShipper: ['']
  });

  displayFn(shipper: Shipper): string {
    return shipper && shipper.name ? shipper.name : '';
  }

  private _filter(name: string): Shipper[] {
    const filterValue = name.toLowerCase();

    return this.shippers.filter(Shipper => Shipper.name.toLowerCase().includes(filterValue));
  }

  populateShipperDetails() {
    console.log(this.testForm.get('selectedShipper').value);
    if(!(typeof this.testForm.get('selectedShipper').value === 'object')) {
      return;
    }
    console.log('Selected shipper' + this.testForm.get('selectedShipper'));
  }

}
