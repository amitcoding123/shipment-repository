import { Component, OnInit } from '@angular/core';

import {FormBuilder} from "@angular/forms";
import { Validators } from '@angular/forms';
import { EventEmitter } from '@angular/core';

@Component({
  selector: 'app-contenttype',
  templateUrl: './contenttype.component.html',
  styleUrls: ['./contenttype.component.css']
})
export class ContenttypeComponent implements OnInit {

  contentType = new EventEmitter();

  constructor(private formBuilder: FormBuilder) { }

  ngOnInit(): void {
  }

  contentTypeForm = this.formBuilder.group({
    description: ['', [Validators.required]]
  });

  get description(): any {
    return this.contentTypeForm.get('description');
  }

  createNewContent() {
    this.contentType.emit(this.contentTypeForm.get('description').value);
  }

}
