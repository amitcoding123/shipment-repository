import {Injectable} from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {from, Observable, throwError} from 'rxjs';
import {map, catchError, retry} from 'rxjs/operators';
import {Shipment} from '../model/shipment';
import {AuthService} from "../login/auth.service";
import {Router} from "@angular/router";
import {Charge} from "../model/charge";
import {environment} from "../../environments/environment";

@Injectable({
  providedIn: 'root'
})
export class ShipmentService {

  private apiUrl: string;

  private shipmentUrl = '/shipments/user/';
  private shipmentDetailUrl = '/shipments';
  private createShipmentUrl = '/shipments';
  private updateShipmentUrl = '/shipments';
  private deleteShipmentUrl = '/shipments/';
  private calculateChargeUrl = '/shipments/charge/';
  private shipmentId: string;

  constructor(private http: HttpClient,
              private authService: AuthService
  ) {
    this.apiUrl = environment.api_url;
  }

  getShipments(): Observable<Shipment[]> {
    console.log('Inside shipment service');
    console.log('Inside shipment service: shipment url = ' + this.shipmentUrl);
    console.log('Inside shipment service: user name = ' + this.authService.getLoggedInUserName());
    return this.http.get(this.apiUrl + this.shipmentUrl + this.authService.getLoggedInUserName()).pipe(
      map((data: Shipment[]) => {
        return data;
      }), catchError(error => {
        return throwError('Something went wrong');
      })
    );
  }

  getShipment(shipmentId: string): Observable<Shipment> {
    this.shipmentId = shipmentId;
    return this.http.get(this.apiUrl + this.shipmentDetailUrl + '/' + this.shipmentId).pipe(
      map((data: Shipment) => {
        return data;
      }), catchError(error => {
        return throwError('Error occured while fetching shipment details');
      })
    );
  }

  createShipment(shipment: Shipment): Observable<Shipment> {
    return this.http.post<Shipment>(this.apiUrl + this.createShipmentUrl, shipment)
      .pipe(
        catchError(error => {
          return throwError('Error occured while creating shipment');
        })
      );
  }

  updateShipment(shipment: Shipment): Observable<Shipment> {
    return this.http.put<Shipment>(this.apiUrl + this.updateShipmentUrl, shipment)
      .pipe(
        catchError(error => {
          return throwError("Error occurred while updating the shipment");
        })
      );
  }

  deleteShipment(shipment: Shipment) {
    console.log('In the shipment delete service');
    console.log('Calling url = ' + this.deleteShipmentUrl + shipment.id);
    return this.http.delete<Shipment>(this.apiUrl + this.deleteShipmentUrl + shipment.id)
      .subscribe(data => {
          console.log(data);
        }
      );
  }

  calculateCharge(country: string, category: string, weight: number, provider: string) {
    console.log('country: ' + country);
    console.log('category: ' + category);
    console.log('weight: ' + weight);
    console.log('provider: ' + provider);
    return this.http.get<Charge>(this.apiUrl + this.calculateChargeUrl + country + '/' + category + '/' + weight + '/' + provider)
      .pipe(
        map((data: Charge) => {
          return data;
        }), catchError(error => {
          return throwError('Error occured while fetching shipment details');
        })
      );
  }
}
