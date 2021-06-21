import {Injectable} from '@angular/core';
import {Observable, throwError} from "rxjs";
import {Shipment} from "../model/shipment";
import {catchError, map} from "rxjs/operators";
import {HttpClient} from "@angular/common/http";
import {ItemType} from "../model/item-type";
import {environment} from "../../environments/environment";

@Injectable({
  providedIn: 'root'
})
export class ItemtypeService {

  private api_url: string;

  private itemTypeUrl = '/shipments/itemtypes';

  constructor(private http: HttpClient) {
    this.api_url = environment.api_url;
  }

  getItemTypes(): Observable<ItemType[]> {
    return this.http.get(this.api_url + this.itemTypeUrl).pipe(
      map((data: ItemType[]) => {
        return data;
      }), catchError(error => {
        return throwError('Something went wrong');
      })
    );
  }

}
