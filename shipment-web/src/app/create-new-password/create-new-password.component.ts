import {Component, Input, OnInit} from '@angular/core';
import {FormBuilder} from "@angular/forms";
import {ActivatedRoute, NavigationEnd, Router} from "@angular/router";
import { filter } from "rxjs/operators";
import {User} from "../model/user";
import {CreateNewPasswordService} from "./create-new-password.service";

@Component({
  selector: 'app-create-new-password',
  templateUrl: './create-new-password.component.html',
  styleUrls: ['./create-new-password.component.css']
})
export class CreateNewPasswordComponent implements OnInit {


  userId: string;
  passwordCreated = false;

  constructor(private formBuilder: FormBuilder,
              private routerA: ActivatedRoute,
              private router: Router,
              private createPasswordService: CreateNewPasswordService) { }

  ngOnInit(): void {
    this.routerA.paramMap.subscribe(params => {
      this.userId = params.get("user");
    });
  }

  createPasswordForm = this.formBuilder.group({
      newPassword: [''],
      confirmPassword: ['']
    }
  );

  save() {
    let user: User;
    user = new User();
    user.userId = this.userId;
    console.log(this.createPasswordForm.get('newPassword').value);
    user.passLocal = this.createPasswordForm.get('newPassword').value;
    this.createPasswordService.saveUser(user).subscribe((data: any) => {
        this.passwordCreated = true;
      }
    );
  }

}
