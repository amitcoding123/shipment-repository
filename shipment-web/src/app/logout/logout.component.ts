import {Component, OnInit} from '@angular/core';
import {AuthService} from "../login/auth.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-logout',
  templateUrl: './logout.component.html',
  styleUrls: ['./logout.component.css']
})
export class LogoutComponent implements OnInit {

  constructor(private authService: AuthService,
              private router: Router) {
  }

  ngOnInit(): void {
  }

  handleLogout() {
    this.authService.clearSession();
    this.router.navigate(['/login']);
  }

}
