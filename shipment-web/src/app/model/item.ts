import {ItemType} from "./item-type";

export class Item {
  id: number;
  itemType: ItemType;
  quantity: number;
  price: number;
  createdBy: string;
  createdOn: any;
  modifiedBy: string;
  modifiedOn: any;
}
