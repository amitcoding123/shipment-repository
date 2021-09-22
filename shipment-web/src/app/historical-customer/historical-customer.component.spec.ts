import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HistoricalCustomerComponent } from './historical-customer.component';

describe('HistoricalCustomerComponent', () => {
  let component: HistoricalCustomerComponent;
  let fixture: ComponentFixture<HistoricalCustomerComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ HistoricalCustomerComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(HistoricalCustomerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
