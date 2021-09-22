import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable, throwError} from "rxjs";
import {User} from "../model/user";
import {catchError} from "rxjs/operators";
import { environment } from "../../environments/environment";
import { EventEmitter } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  USER_ID_SESSION_ATTRIBUTE_NAME = 'authenticatedUserId';
  USER_NAME_SESSION_ATTRIBUTE_NAME = 'authenticatedUserName';
  USER_EMAIL_SESSION_ATTRIBUTE_NAME = 'authenticatedUserEmail';
  USER_MOBILE_SESSION_ATTRIBUTE_NAME = 'authenticatedUserMobile';

  private apiUrl: string;
  private user: User;
  private loggedIn = false;
  private authenticateUrl = '/user/authenticate';
  loginEvent = new EventEmitter();

  constructor(private http: HttpClient) {
    console.log('Api Url = ' + environment.api_url);
    this.apiUrl = environment.api_url;
  }

  authService(user: User): boolean {
    this.http.post<User>(this.apiUrl + this.authenticateUrl, user)
    .subscribe(response => {
      console.log('After authenticaton = ' + response.userId);
      console.log('After authenticaton = ' + response.email);
      console.log('After authenticaton = ' + response.firstName);
      console.log('After authenticaton = ' + response.lastName);
      this.user = response;
      this.loggedIn = true;
      this.loginEvent.emit("logged");
      return true;
    });
    return false;
  }

  registerSuccessfulLogin(): void {
    sessionStorage.setItem(this.USER_ID_SESSION_ATTRIBUTE_NAME, this.user.firstName + this.user.lastName);
  }

  isUserLoggedIn(): boolean {
    return this.loggedIn;
  }

  getUser(): User {
    return this.user;
  }

  clearSession(): void {
    sessionStorage.clear();
    this.user = null;
    this.loggedIn = false;
  }

}
