import {Address} from "./address";

export class Consignee {
  id: number;
  place: string;
  name: string;
  phoneNumber: string;
  email: string;
  address: Address;
  createdBy: string;
  createdOn: any;
  modifiedBy: string;
  modifiedOn: any;
}
