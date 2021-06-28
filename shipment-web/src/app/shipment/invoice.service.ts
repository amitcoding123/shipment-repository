import {Injectable} from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Observable, throwError} from "rxjs";
import {Shipment} from "../model/shipment";
import {catchError, map} from "rxjs/operators";
import {Dsr} from "../model/dsr";
import {AuthService} from "../login/auth.service";
import { environment } from "../../environments/environment";

@Injectable({
  providedIn: 'root'
})
export class InvoiceService {
  private url = '/invoice/';
  private dsrUrl = '/dsrs/'
  private getDsrUrl = '/dsrs/file/'

  private apiUrl: string;

  constructor(private http: HttpClient,
              private authService: AuthService) {
    this.apiUrl = environment.api_url;
  }

  getInvoice(shipmentId: number) {
    const httpOptions = {
      responseType: 'blob' as 'json',
      headers: new HttpHeaders({})
    };
    return this.http.get(this.apiUrl+ this.url + shipmentId, httpOptions);
  }

  getDSR(id: number) {
    const httpOptions = {
      responseType: 'blob' as 'json',
      headers: new HttpHeaders({})
    };
    return this.http.get(this.apiUrl + this.getDsrUrl + id, httpOptions);
  }

  getDsrs(): Observable<Dsr[]> {
    return this.http.get(this.apiUrl+ this.dsrUrl + this.authService.getUser().userId).pipe(
      map((data: Shipment[]) => {
        return data;
      }), catchError(error => {
        return throwError('Something went wrong');
      })
    );
  }

}
