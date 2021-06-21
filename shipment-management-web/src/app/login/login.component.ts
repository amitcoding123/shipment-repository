import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  username: string;
  password: string;
  errorMessage = 'Invalid Credentials';
  successMessage: string;
  invalidLogin = false;
  loginSuccess = false;

  constructor(private route: ActivatedRoute,
              private router: Router) {
    this.username = '';
    this.password = '';
    this.successMessage = '';
  }

  ngOnInit(): void {
  }

  // tslint:disable-next-line:typedef
  handleLogin() {
  }
}
