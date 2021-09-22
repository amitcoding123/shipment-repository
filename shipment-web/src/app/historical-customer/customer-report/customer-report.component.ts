import { Component, OnInit } from '@angular/core';
import { HistoricalCustomerService } from '../historical-customer.service';

import * as fileSaver from 'file-saver';

@Component({
  selector: 'app-customer-report',
  templateUrl: './customer-report.component.html',
  styleUrls: ['./customer-report.component.css']
})
export class CustomerReportComponent implements OnInit {

  constructor(private service: HistoricalCustomerService) { }

  ngOnInit(): void {
    this.service.generateReport().subscribe((data : any) => {
      console.log(data.type);
      let blob: any = new Blob([data], {type:data.type});
      const url = window.URL.createObjectURL(blob);
      fileSaver.saveAs(blob, 'PotentialCustomers.xslx');
    });
  }

}
