import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ContenttypeComponent } from './contenttype.component';

describe('ContenttypeComponent', () => {
  let component: ContenttypeComponent;
  let fixture: ComponentFixture<ContenttypeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ContenttypeComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ContenttypeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
