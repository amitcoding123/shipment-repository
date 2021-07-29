import { Shipper } from "./shipper";
import { Shipment } from "./shipment";
import { User } from "./user";

export class TaxInvoice {

  id: number;
  shipper: Shipper;
  shipments: Shipment[];
  user: User;

}
