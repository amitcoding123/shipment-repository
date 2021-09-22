import { TestBed } from '@angular/core/testing';

import { HistoricalCustomerService } from './historical-customer.service';

describe('HistoricalCustomerService', () => {
  let service: HistoricalCustomerService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(HistoricalCustomerService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
