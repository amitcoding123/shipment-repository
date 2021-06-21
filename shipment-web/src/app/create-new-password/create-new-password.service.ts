import { Injectable } from '@angular/core';
import {Observable, throwError} from "rxjs";
import {catchError} from "rxjs/operators";
import {HttpClient} from "@angular/common/http";
import {User} from "../model/user";
import { environment } from "../../environments/environment";

@Injectable({
  providedIn: 'root'
})
export class CreateNewPasswordService {

  private savePasswordUrl = '/saveNewPassword';
  apiUrl: string;

  constructor(private http: HttpClient) {
    this.apiUrl = environment.api_url;
  }

  saveUser(user: User): Observable<User> {
    return this.http.post<User>(this.apiUrl + this.savePasswordUrl, user)
      .pipe(
        catchError(error => {
          return throwError('Error occured while creating new password. Please try again.');
        })
      );
  }

}
