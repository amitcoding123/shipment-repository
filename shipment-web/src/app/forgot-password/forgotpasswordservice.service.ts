import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import { environment } from "../../environments/environment";

@Injectable({
  providedIn: 'root'
})
export class ForgotpasswordserviceService {

  userId: string;
  apiUrl: string;

  private generateOtpUrl = '/otp/generate/';
  private validateOtpUrl = '/otp/validate/';

  constructor(private http: HttpClient) {
    this.apiUrl = environment.api_url;
  }

  generateOtp(userId: string): Observable<Object> {
    return this.http.get(this.apiUrl + this.generateOtpUrl + userId, {headers: {}});
  }

  validateOtp(userId: string, otp: string): Observable<Object> {
    console.log('In Service ' + userId + ' ' + otp);
    let valid = this.http.get(this.apiUrl + this.validateOtpUrl + userId + '/' + otp, {headers: {}});
    console.log('Valid = ' + valid);
    return valid;
  }

}
