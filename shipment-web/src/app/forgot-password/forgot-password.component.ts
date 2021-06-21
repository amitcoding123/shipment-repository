import {Component, OnInit, ViewChild} from '@angular/core';
import {FormBuilder, Validators} from "@angular/forms";
import {ForgotpasswordserviceService} from "./forgotpasswordservice.service";
import {Router} from "@angular/router";
import {CreateNewPasswordComponent} from "../create-new-password/create-new-password.component";
import {User} from "../model/user";
import { CreateNewPasswordService } from "../create-new-password/create-new-password.service";

@Component({
  selector: 'app-forgot-password',
  templateUrl: './forgot-password.component.html',
  styleUrls: ['./forgot-password.component.css']
})
export class ForgotPasswordComponent implements OnInit {

  userId: string;
  otpGenerated = false;
  otpvalidated = true;
  showCreatePassword = false;
  passwordCreated = false;
  showSpinner = false;
  screenMode: string = "C";
  hide = true;
  message = 'OTP generated and sent to your registered email address. Please validate the same below to create new password';

  constructor(private formBuilder: FormBuilder,
              private forgotPasswordService: ForgotpasswordserviceService,
              private router: Router,
              private createPasswordService: CreateNewPasswordService) {
  }

  forgotPasswordForm = this.formBuilder.group({
      userid: ['', [Validators.required, Validators.minLength(5)]],
      otp: ['', [Validators.required]],
      newPassword: ['', [Validators.required, Validators.minLength(6)]],
      confirmPassword: ['', [Validators.required]]
    }
  );

  // save() {
  //   let user: User;
  //   user = new User();
  //   user.userId = this.userId;
  //   console.log(this.createPasswordForm.get('newPassword').value);
  //   user.passLocal = this.createPasswordForm.get('newPassword').value;
  //   this.createPasswordService.saveUser(user).subscribe((data: any) => {
  //       this.passwordCreated = true;
  //     }
  //   );
  // }

  get userid(): any {
    return this.forgotPasswordForm.get('userid');
  }

  get otp(): any {
    return this.forgotPasswordForm.get("otp");
  }

  get confirmPassword(): any {
    return this.forgotPasswordForm.get("confirmPassword");
  }

  get newPassword(): any {
    return this.forgotPasswordForm.get("newPassword");
  }

  ngOnInit(): void {
  }

  generateOtp() {
    this.showSpinner=true;
    this.forgotPasswordService.generateOtp(this.forgotPasswordForm.get('userid').value).subscribe((result): void => {
      this.otpGenerated = true;
      this.screenMode = "V";
      this.showSpinner=false;
    }, () => {
      this.showSpinner=false;
    });
  }

  validate() {
    console.log('Inside validate otp method.');
    this.showSpinner=true;
    this.forgotPasswordService.validateOtp(this.forgotPasswordForm.get('userid').value, this.forgotPasswordForm.get('otp').value).subscribe((result): void => {
      this.otpvalidated = true;
      this.showCreatePassword = true;
      this.showSpinner=false;
    }, () => {
      this.otpvalidated = false;
      this.showSpinner=false;
    });
  }

  save() {
    let user: User;
    this.showSpinner=true;
    user = new User();
    user.userId = this.forgotPasswordForm.get('userid').value;
    console.log(this.forgotPasswordForm.get('newPassword').value);
    user.passLocal = this.forgotPasswordForm.get('newPassword').value;
    this.createPasswordService.saveUser(user).subscribe((data: any) => {
        this.passwordCreated = true;
        this.router.navigate(['/login']);
      }, () => {
        this.showSpinner = false;
      }
    );
  }

  passwordMatch() {
    if(this.forgotPasswordForm.get('newPassword').value != this.forgotPasswordForm.get('confirmPassword').value) {
      return false;
    } else {
      return true;
    }
  }

}
