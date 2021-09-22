import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';

@Component({
  selector: 'app-user-profile',
  templateUrl: './user-profile.component.html',
  styleUrls: ['./user-profile.component.css']
})
export class UserProfileComponent implements OnInit {

  constructor(private formBuilder: FormBuilder) { }

  ngOnInit(): void {
  }

  userForm = this.formBuilder.group({
      id: [''],
      firstName: ['', [Validators.required, Validators.minLength(5)]],
      lastName: ['', [Validators.required, Validators.minLength(5)]],
      email: ['', [Validators.required, Validators.email]],
      mobileNumber: ['', [Validators.required, Validators.minLength(10), Validators.maxLength(10)]],
      countryCode: ['', [Validators.required]],
      userId: ['']
    }
  );

  get firstName(): any {
    return this.userForm.get('firstName');
  }

  get lastName(): any {
    return this.userForm.get('lastName');
  }

  get email(): any {
    return this.userForm.get('email');
  }

  get mobileNumber(): any {
    return this.userForm.get('mobileNumber');
  }

  get countryCode(): any {
    return this.userForm.get('countryCode');
  }

  get userId(): any {
    return this.userForm.get('userId');
  }

}
