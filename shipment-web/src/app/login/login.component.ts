import {Component, OnInit} from '@angular/core';
import {ActivatedRoute, Router} from "@angular/router";
import {AuthService} from "./auth.service";
import {FormBuilder} from "@angular/forms";
import {User} from "../model/user";
import { Validators } from '@angular/forms';
import {MatDialog, MatDialogConfig} from "@angular/material/dialog";
import { ForgotPasswordComponent } from "../forgot-password/forgot-password.component";

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  errorMessage = 'Invalid Credentials';
  successMessage: string;
  invalidLogin = false;
  loginSuccess = false;
  showSpinner = false;
  hide = true;
  fieldTextType = false;


  loginForm = this.formBuilder.group({
      username: ['', [Validators.required, Validators.minLength(5)]],
      password: ['', [Validators.required]]
    }
  );

  get username(): any {
    return this.loginForm.get('username');
  }

  get password(): any {
    return this.loginForm.get('password');
  }

  setValue() {
  }

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private authService: AuthService,
    private formBuilder: FormBuilder,
    private dialog: MatDialog
  ) {

  }

  ngOnInit(): void {
  }

  handleLogin(): void {
    this.showSpinner = true;
    this.invalidLogin = false;
    let user: User;
    user = new User();
    user.userId = this.loginForm.get('username').value;
    user.passLocal = this.loginForm.get('password').value;
    if(this.authService.authService(user)) {
      this.loginSuccess = true;
      this.successMessage = 'Login Successful.';
    } else {
      this.invalidLogin = true;
      this.loginSuccess = false;
      this.showSpinner = false;
    }
  }

  openForgotPassword(): void {
    const dialogConfig = new MatDialogConfig();
    dialogConfig.height = '350px';
    dialogConfig.width = '600px';
    dialogConfig.disableClose = true;
    let dialogRef = this.dialog.open(ForgotPasswordComponent, dialogConfig);
  }

}
