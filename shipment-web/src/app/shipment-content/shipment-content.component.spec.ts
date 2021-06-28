import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ShipmentContentComponent } from './shipment-content.component';

describe('ShipmentContentComponent', () => {
  let component: ShipmentContentComponent;
  let fixture: ComponentFixture<ShipmentContentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ShipmentContentComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ShipmentContentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
