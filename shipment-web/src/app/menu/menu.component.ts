import {Component, OnInit} from '@angular/core';
import {AuthService} from "../login/auth.service";
import {Observable} from "rxjs";
import {Router} from "@angular/router";

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {

  isLoggedIn: boolean;

  constructor(private authService: AuthService,
              private router: Router) {
  }

  ngOnInit(): void {
    this.isLoggedIn = this.authService.isUserLoggedIn();
    console.log('In menu component, is user logged in: ' + this.isLoggedIn);
  }

  handleLogout() {
    this.authService.clearSession();
    this.router.navigate(['/login']);
  }

}
