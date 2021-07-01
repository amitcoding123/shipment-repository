import {Component, OnInit} from '@angular/core';
import {AuthService} from "../login/auth.service";
import {Observable} from "rxjs";
import {Router} from "@angular/router";

import {MatDialog, MatDialogConfig} from "@angular/material/dialog";
import { LoginComponent } from '../login/login.component';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {

  isLoggedIn: boolean;

  constructor(private authService: AuthService,
              private router: Router,
              private dialog: MatDialog) {
  }

  ngOnInit(): void {
    this.isLoggedIn = this.authService.isUserLoggedIn();
    console.log('In menu component, is user logged in: ' + this.isLoggedIn);
  }

  handleLogout() {
    this.authService.clearSession();
    console.log('After logging out' + this.authService.isUserLoggedIn());
    this.isLoggedIn = false;
    this.router.navigate(['/']);
  }

  openLogin() {
    const dialogConfig = new MatDialogConfig();
    // dialogConfig.height = '400px';
    // dialogConfig.width = '500px';
    let dialogRef = this.dialog.open(LoginComponent, dialogConfig);
    console.log('Opened login pop-up');
    const sub = this.authService.loginEvent.subscribe(data => {
      console.log('Menu event is = ' + data);
      dialogRef.componentInstance.invalidLogin = false;
      dialogRef.close();
      this.isLoggedIn = true;
      this.router.navigate(['/dashboard']);
    });
    dialogRef.afterClosed().subscribe(() => {
       sub.unsubscribe();
    });
  }

}
