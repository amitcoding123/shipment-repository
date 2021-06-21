import { TestBed } from '@angular/core/testing';

import { CreateNewPasswordService } from './create-new-password.service';

describe('CreateNewPasswordService', () => {
  let service: CreateNewPasswordService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CreateNewPasswordService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
