import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CustomertaxinvoiceComponent } from './customertaxinvoice.component';

describe('CustomertaxinvoiceComponent', () => {
  let component: CustomertaxinvoiceComponent;
  let fixture: ComponentFixture<CustomertaxinvoiceComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CustomertaxinvoiceComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CustomertaxinvoiceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
