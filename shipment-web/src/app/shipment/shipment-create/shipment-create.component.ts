import {Component, ElementRef, OnInit, ViewChild} from '@angular/core';
import {Shipment} from "../../model/shipment";
import {ShipmentService} from "../shipment.service";
import {FormControl, FormGroup, FormArray, FormBuilder, Validators} from "@angular/forms";
import {ItemType} from "../../model/item-type";
import {ItemtypeService} from "../itemtype.service";
import {Shipper} from "../../model/shipper";
import {Consignee} from "../../model/consignee";
import {Item} from "../../model/item";
import {AuthService} from "../../login/auth.service";
import {Address} from "../../model/address";
import { ICountry, IState, ICity} from "country-state-city";
import csc from 'country-state-city';
import {ActivatedRoute, Router} from "@angular/router";
import {Observable} from "rxjs";
import {Charge} from "../../model/charge";
import { MatGridListModule } from "@angular/material/grid-list";
import { ShipmentDocument } from 'src/app/model/shipment-document';
import {MatDialog, MatDialogConfig} from "@angular/material/dialog";
import { ContenttypeComponent } from 'src/app/contenttype/contenttype.component';


@Component({
  selector: 'app-shipment-create',
  templateUrl: './shipment-create.component.html',
  styleUrls: ['./shipment-create.component.css']
})
export class ShipmentCreateComponent implements OnInit {

  shipment: Shipment;
  submitted: boolean = false;
  itemTypes: ItemType[];
  selectedItemTypeId: number;
  totalAmount: number = 0;
  sCountries: ICountry[];
  sStates: IState[];
  sCities: ICity[];
  cCountries: ICountry[];
  cStates: IState[];
  cCities: ICity[];
  create: boolean;
  shipmentId: string;
  aadharFile: ShipmentDocument;
  panFile: ShipmentDocument;

  @ViewChild("itemTypeList") itemTypeList: ElementRef;

  createShipmentForm = this.formBuilder.group({
    id: [''],
    provider: ['', [Validators.required]],
    comments: [''],
    specialInstruction: [''],
    createdBy: [''],
    createdOn: [''],
    modifiedBy: [''],
    modifiedOn: [''],
    trackingNumber: [''],
    category: [''],
    frieghtCharge: [''],
    selectedItemTypeId: [''],
    sellingCost: [''],
    paymentMode: ['', [Validators.required]],
    shipper: this.formBuilder.group({
      id: [''],
      name: ['', [Validators.required, Validators.minLength(6)]],
      phoneNumber: ['', [Validators.required, Validators.pattern(new RegExp("[0-9]{10}"))]],
      email: ['', [Validators.required, Validators.email]],
      aadharNumber: ['', [Validators.required, Validators.pattern(new RegExp("[0-9]{12}"))]],
      createdBy: [''],
      createdOn: [''],
      modifiedBy: [''],
      modifiedOn: [''],
      panNumber: [''],
      gstin: [''],
      address: this.formBuilder.group ({
          id: [''],
          addressLine1: ['', [Validators.required]],
          addressLine2: [''],
          zipCode: ['', [Validators.required]],
          city: ['', [Validators.required]],
          state: ['', [Validators.required]],
          createdBy: [''],
          createdOn: [''],
          modifiedBy: [''],
          modifiedOn: [''],
          country: ['', [Validators.required]]
        }
      )
    }),
    consignee: this.formBuilder.group({
      id: [''],
      name: ['', [Validators.required, Validators.minLength(6)]],
      phoneNumber: ['', [Validators.required, Validators.pattern(new RegExp("[0-9]{10}"))]],
      email: ['', [Validators.required, Validators.email]],
      createdBy: [''],
      createdOn: [''],
      modifiedBy: [''],
      modifiedOn: [''],
      address: this.formBuilder.group ({
          id: [''],
          addressLine1: ['', [Validators.required]],
          addressLine2: [''],
          zipCode: ['', [Validators.required]],
          city: ['', [Validators.required]],
          state: ['', [Validators.required]],
          createdBy: [''],
          createdOn: [''],
          modifiedBy: [''],
          modifiedOn: [''],
          country: ['', [Validators.required]]
        }
      )
    }),
    selectedItemTypeDescription: [''],
    items: this.formBuilder.array([]),
    invoiceNumber: ['', Validators.required],
    boxLength: ['', Validators.required],
    boxWidth: ['', Validators.required],
    boxHeight: ['', Validators.required],
    boxWeight: ['', Validators.required],
    actualWeight: ['', Validators.required]
  });

  constructor(private shipmentService: ShipmentService,
              private formBuilder: FormBuilder,
              private itemTypeService: ItemtypeService,
              private authService: AuthService,
              private routerA: ActivatedRoute,
              private router: Router,
              private dialog: MatDialog) {
  }

  ngOnInit(): void {
    this.getItemTypes();
    this.sCountries = csc.getAllCountries();
    this.cCountries = csc.getAllCountries();
    this.routerA.paramMap.subscribe(params => {
      if(params.get("create") === "modify") {
        this.create = false;
      } else
        this.create = true;
      this.shipmentId = params.get("shipmentId");
      if(!this.create) {
        this.shipmentService.getShipment(this.shipmentId).subscribe(res => {
          this.shipment = res;
          this.sStates = csc.getStatesOfCountry(this.shipment.shipper.address.country);
          this.cStates = csc.getStatesOfCountry(this.shipment.consignee.address.country);
          this.sCities = csc.getCitiesOfState(this.shipment.shipper.address.country, this.shipment.shipper.address.state);
          this.cCities = csc.getCitiesOfState(this.shipment.consignee.address.country, this.shipment.consignee.address.state);
          this.populateFormData();
        });
      }
    });
  }

  getItemTypes(): void {
    this.itemTypeService
      .getItemTypes()
      .subscribe((data: any) => {
          this.itemTypes = data;
        }
      );
  }

  get provider(): any {
    return this.createShipmentForm.get('provider');
  }

  get panNumber(): any {
    return this.createShipmentForm.get('panNumber');
  }

  get gstin(): any {
    return this.createShipmentForm.get('gstin');
  }

  get paymentMode(): any {
    return this.createShipmentForm.get('paymentMode');
  }

  get invoiceNumber(): any {
    return this.createShipmentForm.get('invoiceNumber');
  }

  get shipperName(): any {
    return this.createShipmentForm.get('shipper.name');
  }

  get shipperMobile(): any {
    return this.createShipmentForm.get('shipper.phoneNumber');
  }

  get shipperEmail(): any {
    return this.createShipmentForm.get('shipper.email');
  }

  get aadharNumber(): any {
    return this.createShipmentForm.get('shipper.aadharNumber');
  }

  get consigneeMobile(): any {
    return this.createShipmentForm.get('consignee.phoneNumber');
  }

  get consigneeEmail(): any {
    return this.createShipmentForm.get('consignee.email');
  }

  get consigneeName(): any {
    return this.createShipmentForm.get('consignee.name');
  }

  get sAddressLine1(): any {
    return this.createShipmentForm.get('shipper.address.addressLine1');
  }

  get sZipCode(): any {
    return this.createShipmentForm.get('shipper.address.city');
  }

  get sCity(): any {
    return this.createShipmentForm.get('shipper.address.zipCode');
  }

  get sCountry(): any {
    return this.createShipmentForm.get('shipper.address.country');
  }

  get sState(): any {
    return this.createShipmentForm.get('shipper.address.state');
  }

  get cAddressLine1(): any {
    return this.createShipmentForm.get('consignee.address.addressLine1');
  }

  get cZipCode(): any {
    return this.createShipmentForm.get('consignee.address.city');
  }

  get cCity(): any {
    return this.createShipmentForm.get('consignee.address.zipCode');
  }

  get cCountry(): any {
    return this.createShipmentForm.get('consignee.address.country');
  }

  get cState(): any {
    return this.createShipmentForm.get('consignee.address.state');
  }

  get boxLength(): any {
    return this.createShipmentForm.get('boxLength');
  }

  get boxWidth(): any {
    return this.createShipmentForm.get('boxWidth');
  }

  get boxHeight(): any {
    return this.createShipmentForm.get('boxHeight');
  }

  get boxWeight(): any {
    return this.createShipmentForm.get('boxWeight');
  }

  get actualWeight(): any {
    return this.createShipmentForm.get('actualWeight');
  }

  get category(): any {
    return this.createShipmentForm.get('category');
  }

  setValue() {
  }

  get comments(): any {
    return this.createShipmentForm.get('comments');
  }

  get items(): FormArray {
    return this.createShipmentForm.get('items') as FormArray;
  }

  newItem(): FormGroup {
    return this.formBuilder.group({
        id: '',
        quantity: '',
        price: '',
        description: '',
        itemTypeId: '',
        amount: '',
        createdBy: [''],
        createdOn: [''],
        modifiedBy: [''],
        modifiedOn: ['']
      }
    )
  }

  addItem() {
    const description = this.itemTypes.find(itemType => itemType.id == this.selectedItemTypeId).description;
    this.items.push(this.newItem());
    this.items.at(this.items.length - 1).patchValue({
      description: description,
      itemTypeId: this.selectedItemTypeId
    });
  }

  calculateAmount(index: number) {
    const w = this.items.at(index).get('quantity').value;
    const price = this.items.at(index).get('price').value;
    const amount = w * price;
    this.items.at(index).patchValue({
      amount: amount
    });
    this.calculateTotalAmount();
  }

  getStatesForCountry() {
    this.sStates = csc.getStatesOfCountry(this.createShipmentForm.get('shipper.address.country').value);
  }

  getCitiesForState() {
    this.sCities = csc.getCitiesOfState(this.createShipmentForm.get('shipper.address.country').value,
      this.createShipmentForm.get('shipper.address.state').value);
  }

  getCStatesForCountry() {
    console.log(this.createShipmentForm.get('consignee.address.country').value);
    this.cStates = csc.getStatesOfCountry(this.createShipmentForm.get('consignee.address.country').value);
  }

  getCCitiesForState() {
    this.cCities = csc.getCitiesOfState(this.createShipmentForm.get('consignee.address.country').value,
      this.createShipmentForm.get('consignee.address.state').value);
  }

  calculateTotalAmount() {
    let total = 0;
    for (let item of this.items.controls) {
      total = total + item.get('amount').value;
    }
    this.totalAmount = total;
  }

  removeItem(index: number) {
    this.items.removeAt(index);
  }

  createShipment() {
    this.populateShipmentFromFormData();
    this.shipmentService.createShipment(this.shipment).subscribe((data: any) => {
        console.log(data);
        this.shipment = data;
        this.submitted = true;
        this.aadharFile.shipmentId = this.shipment.id;
        //Create documents
        if(this.aadharFile != null) {
          this.shipmentService.persistDocument(this.aadharFile);
        }
        if(this.panFile != null) {
          this.shipmentService.persistDocument(this.panFile);
        }
      }
    );
  }

  populateFormData() {
    this.createShipmentForm.get('id').setValue(this.shipment.id);
    this.createShipmentForm.get('provider').setValue(this.shipment.provider);
    this.createShipmentForm.get('comments').setValue(this.shipment.comments);
    this.createShipmentForm.get('specialInstruction').setValue(this.shipment.specialInstruction);
    this.createShipmentForm.get('trackingNumber').setValue(this.shipment.trackingNumber);
    this.createShipmentForm.get('createdBy').setValue(this.shipment.createdBy);
    this.createShipmentForm.get('createdOn').setValue(this.shipment.createdOn);
    this.createShipmentForm.get('modifiedBy').setValue(this.shipment.modifiedBy);
    this.createShipmentForm.get('modifiedOn').setValue(this.shipment.modifiedOn);
    this.createShipmentForm.get('paymentMode').setValue(this.shipment.paymentMode);
    this.createShipmentForm.get('shipper.id').setValue(this.shipment.shipper.id);
    this.createShipmentForm.get('shipper.name').setValue(this.shipment.shipper.name);
    this.createShipmentForm.get('shipper.phoneNumber').setValue(this.shipment.shipper.phoneNumber);
    this.createShipmentForm.get('shipper.email').setValue(this.shipment.shipper.email);
    this.createShipmentForm.get('shipper.aadharNumber').setValue(this.shipment.shipper.aadharNumber);
    this.createShipmentForm.get('shipper.panNumber').setValue(this.shipment.shipper.panNumber);
    this.createShipmentForm.get('shipper.gstin').setValue(this.shipment.shipper.gstin);
    this.createShipmentForm.get('shipper.createdBy').setValue(this.shipment.shipper.createdBy);
    this.createShipmentForm.get('shipper.createdOn').setValue(this.shipment.shipper.createdOn);
    this.createShipmentForm.get('shipper.modifiedBy').setValue(this.shipment.shipper.modifiedBy);
    this.createShipmentForm.get('shipper.modifiedOn').setValue(this.shipment.shipper.modifiedOn);
    this.createShipmentForm.get('shipper.address.id').setValue(this.shipment.shipper.address.id);
    this.createShipmentForm.get('shipper.address.addressLine1').setValue(this.shipment.shipper.address.addressLine1);
    this.createShipmentForm.get('shipper.address.addressLine2').setValue(this.shipment.shipper.address.addressLine2);
    this.createShipmentForm.get('shipper.address.zipCode').setValue(this.shipment.shipper.address.zipCode);
    this.createShipmentForm.get('shipper.address.country').setValue(this.shipment.shipper.address.country);
    this.createShipmentForm.get('shipper.address.state').setValue(this.shipment.shipper.address.state);
    this.createShipmentForm.get('shipper.address.city').setValue(this.shipment.shipper.address.city);
    this.createShipmentForm.get('shipper.address.createdBy').setValue(this.shipment.shipper.address.createdBy);
    this.createShipmentForm.get('shipper.address.createdOn').setValue(this.shipment.shipper.address.createdOn);
    this.createShipmentForm.get('shipper.address.modifiedBy').setValue(this.shipment.shipper.address.modifiedBy);
    this.createShipmentForm.get('shipper.address.modifiedOn').setValue(this.shipment.shipper.address.modifiedOn);
    this.createShipmentForm.get('consignee.id').setValue(this.shipment.consignee.id);
    this.createShipmentForm.get('consignee.name').setValue(this.shipment.consignee.name);
    this.createShipmentForm.get('consignee.phoneNumber').setValue(this.shipment.consignee.phoneNumber);
    this.createShipmentForm.get('consignee.email').setValue(this.shipment.consignee.email);
    this.createShipmentForm.get('consignee.createdBy').setValue(this.shipment.consignee.createdBy);
    this.createShipmentForm.get('consignee.createdOn').setValue(this.shipment.consignee.createdOn);
    this.createShipmentForm.get('consignee.modifiedBy').setValue(this.shipment.consignee.modifiedBy);
    this.createShipmentForm.get('consignee.modifiedOn').setValue(this.shipment.consignee.modifiedOn);
    this.createShipmentForm.get('consignee.address.id').setValue(this.shipment.consignee.address.id);
    this.createShipmentForm.get('consignee.address.addressLine1').setValue(this.shipment.consignee.address.addressLine1);
    this.createShipmentForm.get('consignee.address.addressLine2').setValue(this.shipment.consignee.address.addressLine2);
    this.createShipmentForm.get('consignee.address.zipCode').setValue(this.shipment.consignee.address.zipCode);
    this.createShipmentForm.get('consignee.address.country').setValue(this.shipment.consignee.address.country);
    this.createShipmentForm.get('consignee.address.createdBy').setValue(this.shipment.consignee.address.createdBy);
    this.createShipmentForm.get('consignee.address.createdOn').setValue(this.shipment.consignee.address.createdOn);
    this.createShipmentForm.get('consignee.address.modifiedBy').setValue(this.shipment.consignee.address.modifiedBy);
    this.createShipmentForm.get('consignee.address.modifiedOn').setValue(this.shipment.consignee.address.modifiedOn);
    this.createShipmentForm.get('consignee.address.state').setValue(this.shipment.consignee.address.state);
    this.createShipmentForm.get('consignee.address.city').setValue(this.shipment.consignee.address.city);
    this.createShipmentForm.get('invoiceNumber').setValue(this.shipment.invoiceNumber);
    this.createShipmentForm.get('boxLength').setValue(this.shipment.boxLength);
    this.createShipmentForm.get('boxWidth').setValue(this.shipment.boxWidth);
    this.createShipmentForm.get('boxHeight').setValue(this.shipment.boxHeight);
    this.createShipmentForm.get('boxWeight').setValue(this.shipment.boxWeight);
    this.createShipmentForm.get('actualWeight').setValue(this.shipment.actualWeight);
    this.createShipmentForm.get('category').setValue(this.shipment.category);
    this.createShipmentForm.get('frieghtCharge').setValue(this.shipment.frieghtCharge);
    this.createShipmentForm.get('sellingCost').setValue(this.shipment.sellingCost);
    for(let i = 0; i < this.shipment.items.length; i++) {
      this.items.push(this.newItem());
      this.items.at(i).patchValue({
        id: this.shipment.items[i].id,
        quantity: this.shipment.items[i].quantity,
        price: this.shipment.items[i].price,
        description: this.shipment.items[i].itemType.description,
        itemTypeId: this.shipment.items[i].itemType.id,
        amount: this.shipment.items[i].quantity * this.shipment.items[i].price,
        createdBy: this.shipment.items[i].createdBy,
        createdOn: this.shipment.items[i].createdOn,
        modifiedBy: this.shipment.items[i].modifiedBy,
        modifiedOn: this.shipment.items[i].modifiedOn
      });
    }
    this.calculateTotalAmount();
  }

  populateShipmentFromFormData() {
    this.shipment = new Shipment();
    this.shipment.id = this.createShipmentForm.get('id').value;
    this.shipment.provider = this.createShipmentForm.get('provider').value;
    this.shipment.specialInstruction = this.createShipmentForm.get('specialInstruction').value;
    this.shipment.comments = this.createShipmentForm.get('comments').value;
    this.shipment.status = 'NEW';
    this.shipment.trackingNumber = this.createShipmentForm.get('trackingNumber').value;
    this.shipment.createdOn = this.createShipmentForm.get('createdOn').value;
    this.shipment.createdBy = this.createShipmentForm.get('createdBy').value;
    this.shipment.category = this.createShipmentForm.get('category').value;
    this.shipment.frieghtCharge = this.createShipmentForm.get('frieghtCharge').value;
    this.shipment.sellingCost = this.createShipmentForm.get('sellingCost').value;
    this.shipment.paymentMode = this.createShipmentForm.get('paymentMode').value;

    let shipper: Shipper;
    shipper = new Shipper();
    shipper.id = this.createShipmentForm.get('shipper.id').value;
    shipper.name = this.createShipmentForm.get('shipper.name').value;
    shipper.phoneNumber = this.createShipmentForm.get('shipper.phoneNumber').value;
    shipper.email = this.createShipmentForm.get('shipper.email').value;
    shipper.aadharNumber = this.createShipmentForm.get('shipper.aadharNumber').value;
    shipper.panNumber = this.createShipmentForm.get('shipper.panNumber').value;
    shipper.gstin = this.createShipmentForm.get('shipper.gstin').value;
    shipper.createdBy = this.createShipmentForm.get('shipper.createdBy').value;
    shipper.createdOn = this.createShipmentForm.get('shipper.createdOn').value;
    let shipperAddress: Address;
    shipperAddress = new Address();
    shipperAddress.id = this.createShipmentForm.get('shipper.address.id').value;
    shipperAddress.addressLine1 = this.createShipmentForm.get('shipper.address.addressLine1').value;
    shipperAddress.addressLine2 = this.createShipmentForm.get('shipper.address.addressLine2').value;
    shipperAddress.city = this.createShipmentForm.get('shipper.address.city').value;
    shipperAddress.state = this.createShipmentForm.get('shipper.address.state').value;
    shipperAddress.country = this.createShipmentForm.get('shipper.address.country').value;
    shipperAddress.zipCode = this.createShipmentForm.get('shipper.address.zipCode').value;
    shipperAddress.createdBy = this.createShipmentForm.get('shipper.address.createdBy').value;
    shipperAddress.createdOn = this.createShipmentForm.get('shipper.address.createdOn').value;
    shipper.address = shipperAddress;
    this.shipment.shipper = shipper;
    let consignee: Consignee;
    consignee = new Consignee();
    consignee.id = this.createShipmentForm.get('consignee.id').value;
    consignee.name = this.createShipmentForm.get('consignee.name').value;
    consignee.phoneNumber = this.createShipmentForm.get('consignee.phoneNumber').value;
    consignee.email = this.createShipmentForm.get('consignee.email').value;
    consignee.createdBy = this.createShipmentForm.get('consignee.createdBy').value;
    consignee.createdOn = this.createShipmentForm.get('consignee.createdOn').value;
    let consigneeAddress: Address;
    consigneeAddress = new Address();
    consigneeAddress.id = this.createShipmentForm.get('consignee.address.id').value;
    consigneeAddress.addressLine1 = this.createShipmentForm.get('consignee.address.addressLine1').value;
    consigneeAddress.addressLine2 = this.createShipmentForm.get('consignee.address.addressLine2').value;
    consigneeAddress.city = this.createShipmentForm.get('consignee.address.city').value;
    consigneeAddress.state = this.createShipmentForm.get('consignee.address.state').value;
    consigneeAddress.country = this.createShipmentForm.get('consignee.address.country').value;
    consigneeAddress.zipCode = this.createShipmentForm.get('consignee.address.zipCode').value;
    consigneeAddress.createdBy = this.createShipmentForm.get('consignee.address.createdBy').value;
    consigneeAddress.createdOn = this.createShipmentForm.get('consignee.address.createdOn').value;
    consignee.address = consigneeAddress;
    this.shipment.consignee = consignee;
    this.shipment.boxLength = this.createShipmentForm.get('boxLength').value;
    this.shipment.boxHeight = this.createShipmentForm.get('boxHeight').value;
    this.shipment.boxWidth = this.createShipmentForm.get('boxWidth').value;
    this.shipment.boxWeight = this.createShipmentForm.get('boxWeight').value;
    this.shipment.actualWeight = this.createShipmentForm.get('actualWeight').value;
    this.shipment.invoiceNumber = this.createShipmentForm.get('invoiceNumber').value;
    let items: Item[] = new Array(this.items.length);
    for (let item of this.items.controls) {
      let itemL: Item;
      itemL = new Item();
      itemL.id = item.get('id').value;
      itemL.price = item.get('price').value;
      itemL.quantity = item.get('quantity').value;
      itemL.createdBy = item.get('createdBy').value;
      itemL.createdOn = item.get('createdOn').value;
      let itemType: ItemType;
      itemType = new ItemType();
      itemType.id = item.get('itemTypeId').value;
      itemType.description = item.get('description').value
      itemL.itemType = itemType;
      items.push(itemL);
    }
    this.shipment.items = items;
    this.shipment.userId = this.authService.getUser().userId;
  }

  updateShipment() {
    this.populateShipmentFromFormData();
    this.shipmentService.updateShipment(this.shipment).subscribe((data: any) => {
        this.shipment = data;
        this.submitted = true;
      }
    );
  }

  calculateCharge() {
    let charge: Charge;
    let weight: number;
    let bWeight: number;
    let aWeight: number;
    bWeight = parseFloat(this.createShipmentForm.get('boxWeight').value);
    aWeight = parseFloat(this.createShipmentForm.get('actualWeight').value);
    if(bWeight >= aWeight) {
      weight = this.createShipmentForm.get('boxWeight').value
    } else {
      weight = this.createShipmentForm.get('actualWeight').value;
    }
    this.shipmentService.calculateCharge(this.createShipmentForm.get('consignee.address.country').value,
      this.createShipmentForm.get('category').value, weight, this.createShipmentForm.get('provider').value).subscribe((data: any) => {
        this.createShipmentForm.get('frieghtCharge').setValue(data.frieghtCharge);
        this.createShipmentForm.get('sellingCost').setValue(data.finalCharge);
      }
    );
  }

  cancel() {
    this.router.navigate(['/shipment']);
  }

  uploadAadhar(event: Event) {
    this.aadharFile = new ShipmentDocument();
    this.aadharFile.file = (event.target as HTMLInputElement).files[0];
    this.aadharFile.type = 'A';
  }

  uploadPan(event: Event) {
    this.panFile = new ShipmentDocument();
    this.panFile.file = (event.target as HTMLInputElement).files[0];
    this.panFile.type = 'P';
  }

  captureNewContentType() {
    const dialogConfig = new MatDialogConfig();
    let dialogRef = this.dialog.open(ContenttypeComponent, dialogConfig);
    const sub = dialogRef.componentInstance.contentType.subscribe(data => {
      const itemType = new ItemType();
      itemType.description = data;
      itemType.createdBy = this.authService.getUser().userId;
      itemType.modifiedBy = this.authService.getUser().userId;
      this.itemTypeService.createItemType(itemType).subscribe(data => {
        this.itemTypes.push(itemType);
        dialogRef.close();
      });
    });
    dialogRef.afterClosed().subscribe(() => {
       sub.unsubscribe();
    });
  }

}
