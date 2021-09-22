import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import { environment } from "../../environments/environment";
import { Observable } from 'rxjs';
import { LeadCustomer } from '../model/lead-customer';
import {map, catchError, retry} from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class HistoricalCustomerService {

  private apiUrl: string;
  private getHistoricalCustomerUrl = "/historicalCustomers";
  private createHistoricalCustomer = "/historicalCustomers";
  private generateReportUrl = "/historicalCustomers/report";

  createdCustomer: LeadCustomer;
  modifiedCustomer: LeadCustomer;

  constructor(private http: HttpClient) {
    this.apiUrl = environment.api_url;
  }

  getLeadCustomers(): Observable<LeadCustomer[]> {
    return this.http.get<LeadCustomer[]>(this.apiUrl + this.getHistoricalCustomerUrl);
  }

  saveCustomer(customer: LeadCustomer): Observable<LeadCustomer> {
    return this.http.post<LeadCustomer>(this.apiUrl + this.createHistoricalCustomer, customer);
  }

  generateReport(): any {
    return this.http.get(this.apiUrl + this.generateReportUrl, {responseType: 'blob'});
  }

}
