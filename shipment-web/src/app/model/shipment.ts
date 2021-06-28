import {Shipper} from "./shipper";
import {Consignee} from "./consignee";
import {Item} from "./item";

export class Shipment {
  id: number;
  invoiceNumber: string;
  shipper: Shipper;
  consignee: Consignee;
  items: Item[];
  comments: string;
  specialInstruction: string;
  trackingNumber: number;
  status: string;
  provider: string;
  userId: string;
  boxWeight: number;
  actualWeight: number;
  boxLength: number;
  boxWidth: number;
  boxHeight: number;
  createdBy: string;
  createdOn: any;
  modifiedBy: string;
  modifiedOn: any;
  category: string;
  frieghtCharge: number;
  sellingCost: number;
  paymentMode: string;
}
