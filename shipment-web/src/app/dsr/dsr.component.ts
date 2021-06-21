import { Component, OnInit } from '@angular/core';
import {AuthService} from "../login/auth.service";
import {InvoiceService} from "../shipment/invoice.service";
import {Dsr} from "../model/dsr";

@Component({
  selector: 'app-dsr',
  templateUrl: './dsr.component.html',
  styleUrls: ['./dsr.component.css']
})
export class DsrComponent implements OnInit {

  dsrs: Dsr[];
  userId: string;
  displayedColumns: string [] = ['id', 'createdOn', 'dsr'];

  constructor(private authService: AuthService,
              private invoiceService: InvoiceService) {
    this.userId = authService.getLoggedInUserName();
  }

  ngOnInit(): void {
    this.invoiceService.getDsrs().subscribe((data: any) => {
        this.dsrs = data;
      }
    );
  }

  getDSR(id: number) {
    this.invoiceService.getDSR(id).subscribe((data) => {
      var downloadURL = window.URL.createObjectURL(data);
      var link = document.createElement('a');
      link.href = downloadURL;
      link.download = "dsr_" + id + ".xslx";
      link.click();
    });
  }

}
