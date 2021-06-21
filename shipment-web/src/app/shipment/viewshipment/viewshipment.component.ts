import {Component, OnInit, Input} from '@angular/core';
import {Router} from "@angular/router";
import {Shipment} from "../../model/shipment";

@Component({
  selector: 'app-viewshipment',
  templateUrl: './viewshipment.component.html',
  styleUrls: ['./viewshipment.component.css']
})
export class ViewshipmentComponent implements OnInit {

  @Input() selectedShipment: Shipment;

  constructor(private router: Router) {
  }

  ngOnInit(): void {
  }
}
