import {Injectable} from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {from, Observable, throwError} from 'rxjs';
import {map, catchError, retry} from 'rxjs/operators';
import {Shipment} from '../model/shipment';
import {AuthService} from "../login/auth.service";
import {Router} from "@angular/router";
import {Charge} from "../model/charge";
import {environment} from "../../environments/environment";
import { ShipmentDocument } from '../model/shipment-document';
import { Shipper } from '../model/shipper';
import { TaxInvoice } from '../model/tax-invoice';
import { CustomerTaxInvoice } from '../model/customer-tax-invoice';

@Injectable({
  providedIn: 'root'
})
export class ShipmentService {

  private apiUrl: string;
  private shippers: Shipper[] = [];

  private shipmentUrl = '/shipments/user/';
  private shipmentDetailUrl = '/shipments';
  private createShipmentUrl = '/shipments';
  private updateShipmentUrl = '/shipments';
  private deleteShipmentUrl = '/shipments/';
  private calculateChargeUrl = '/shipments/charge/';
  private uploadDocumentUrl = '/uploadFile';
  private bulkUpdateUrl = '/bulkUpdate';
  private shipperUrl = '/shippers/';
  private taxInvoicesUrl = '/taxInvoices/';
  private eligibleShipmentsUrl = '/shipments/taxInvoices/';
  private generateTaxInvoiceUrl = '/customerTaxInvoices';
  private shipmentId: string;
  public shipments: Shipment[];
  public maxPosts: string;

  constructor(private http: HttpClient,
              private authService: AuthService
  ) {
    this.apiUrl = environment.api_url;
  }

  getShippers() {
    return this.shippers;
  }

  getShipments(): Observable<Shipment[]> {
    return this.http.get(this.shipmentUrl + this.authService.getUser().userId).pipe(
      map((data: Shipment[]) => {
        return data;
      }), catchError(error => {
        return throwError('Something went wrong');
      })
    );
  }

  getShipment(shipmentId: any): Observable<Shipment> {
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
    console.log('Shipment to create = ' + shipment.shipper.dob);
    console.log('Items size = ' + shipment.items.length);
    console.log('Shipment Items = ' + shipment.items[1].id);
    console.log('Shipment Items = ' + shipment.items[1].itemType.id);
    console.log('Shipment Items = ' + shipment.items[1].itemType.description);
    return this.http.post<Shipment>(this.apiUrl + this.createShipmentUrl, shipment)
      .pipe(
        catchError(error => {
          console.log('Error occurred = ' + error);
          return throwError('Error occured while creating shipment');
        })
      );
  }

  updateShipment(shipment: Shipment): Observable<Shipment> {
    console.log('Shipment to update = ' + shipment.shipper.dob);
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

  persistDocument(shipmentDocument: ShipmentDocument) {
    const postData = new FormData();
    postData.append("file", shipmentDocument.file, "aadhar");
    postData.append("shipmentId", shipmentDocument.shipmentId);
    postData.append("type", shipmentDocument.type);
    console.log(postData);
    this.http.post(this.apiUrl + this.uploadDocumentUrl, postData).subscribe( () => {
      console.log('Document Uploaded');
    })
  }

  bulkUpdate(shipmentDocument: ShipmentDocument) {
    const postData = new FormData();
    postData.append("file", shipmentDocument.file, "tracking");
    postData.append("userId", this.authService.getUser().userId);
    console.log(postData);
    this.http.post(this.apiUrl + this.bulkUpdateUrl, postData).subscribe( () => {
      console.log('Bulk update completed');
    })
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

  getShippersForUser(userId: string): Observable<Shipper[]> {
    console.log('getShippersForUser: userId = ' + userId);
    return this.http.get(this.apiUrl + this.shipperUrl + userId).pipe(
      map((data: Shipper[]) => {
        console.log('getShippersForUser = ' + data[0]);
        return data;
      }), catchError(error => {
        return throwError('Something went wrong');
      })
    );
  }

  getTaxInvoicesForShipper(shipperId: number): Observable<TaxInvoice[]> {
    console.log('getTaxInvoicesForShipper: shipperId = ' + shipperId);
    return this.http.get(this.apiUrl + this.taxInvoicesUrl + shipperId).pipe(
      map((data: TaxInvoice[]) => {
        console.log('getTaxInvoicesForShipper = ' + data);
        return data;
      }), catchError(error => {
        return throwError('Something went wrong');
      })
    );
  }

  getEligibleShipmentsForTaxInvoice(userId: string, shipperId: number): Observable<Shipment[]> {
    console.log('getEligibleShipmentsForTaxInvoice: shipperId = ' + shipperId);
    return this.http.get(this.apiUrl + this.eligibleShipmentsUrl + userId + '/' + shipperId).pipe(
      map((data: Shipment[]) => {
        console.log('getEligibleShipmentsForTaxInvoice = ' + data);
        return data;
      }), catchError(error => {
        return throwError('Something went wrong');
      })
    );
  }

  generateTaxInvoice(taxInvoice: TaxInvoice) {
    console.log('In shipment service: generateTaxInvoice method');
    console.log('URL to invoke = ' + (this.apiUrl + this.generateTaxInvoiceUrl));
    return this.http.post<CustomerTaxInvoice>(this.apiUrl + this.generateTaxInvoiceUrl, taxInvoice)
      .subscribe((data: CustomerTaxInvoice) => {
        console.log('Generated tax invoice');
      });
  }

}
