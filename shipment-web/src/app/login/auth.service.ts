import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable, throwError} from "rxjs";
import {User} from "../model/user";
import {catchError} from "rxjs/operators";
import { environment } from "../../environments/environment";

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  USER_ID_SESSION_ATTRIBUTE_NAME = 'authenticatedUserId';
  USER_NAME_SESSION_ATTRIBUTE_NAME = 'authenticatedUserName';
  USER_EMAIL_SESSION_ATTRIBUTE_NAME = 'authenticatedUserEmail';
  USER_MOBILE_SESSION_ATTRIBUTE_NAME = 'authenticatedUserMobile';

  public username: string;
  private userFulName: string;
  public password: string;
  private apiUrl: string;
  private user: Observable<User>;
  private authenticateUrl = '/user/authenticate';

  constructor(private http: HttpClient) {
    console.log('Api Url = ' + environment.api_url);
    this.apiUrl = environment.api_url;
  }

  authService(user: User): Observable<Object> {
    this.username = user.userId;
    this.user = this.http.post<User>(this.apiUrl + this.authenticateUrl, user)
      .pipe(
        catchError(error => {
          return throwError('Error occured while creating new password. Please try again.');
        })
      );
    this.registerSuccessfulLogin();
    return this.user;
  }

  registerSuccessfulLogin(): void {
    sessionStorage.setItem(this.USER_ID_SESSION_ATTRIBUTE_NAME, this.username);
  }

  isUserLoggedIn(): boolean {
    const user = sessionStorage.getItem(this.USER_ID_SESSION_ATTRIBUTE_NAME);
    console.log('Auth Service = ' + user);
    if (user === null) {
      return false;
    }
    return true;
  }

  getLoggedInUserName(): any {
    const user = sessionStorage.getItem(this.USER_ID_SESSION_ATTRIBUTE_NAME);
    if (user === null) {
      return '';
    }
    return user;
  }

  getLoggedInUserFullName(): any {
    const user = sessionStorage.getItem(this.USER_NAME_SESSION_ATTRIBUTE_NAME);
    if (user === null) {
      return '';
    }
    return user;
  }

  clearSession(): void {
    sessionStorage.clear();
  }

}
