import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {HttpClientModule} from "@angular/common/http";

import {AppComponent} from './app.component';
import {LoginComponent} from './login/login.component';
import {RouterModule} from "@angular/router";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {BrowserAnimationsModule} from "@angular/platform-browser/animations";
import {MenuComponent} from './menu/menu.component';
import {DashboardComponent} from './dashboard/dashboard.component';
import {ShipmentComponent} from './shipment/shipment.component';
import {ViewshipmentComponent} from './shipment/viewshipment/viewshipment.component';
import {ShipmentCreateComponent} from './shipment/shipment-create/shipment-create.component';
import {CurrencyPipe} from "@angular/common";
import {NgxPaginationModule} from "ngx-pagination";
import {MatTable, MatTableModule} from "@angular/material/table";
import {MDBBootstrapModule} from "angular-bootstrap-md";
import {LogoutComponent} from './logout/logout.component';
import {ForgotPasswordComponent} from './forgot-password/forgot-password.component';
import { CreateNewPasswordComponent } from './create-new-password/create-new-password.component';
import { DsrComponent } from './dsr/dsr.component';
import { MatSliderModule } from '@angular/material/slider';
import { MatInputModule } from '@angular/material/input';
import { MatCardModule } from '@angular/material/card'
import { MatProgressSpinnerModule } from '@angular/material/progress-spinner'
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatDialogModule } from '@angular/material/dialog';
import { MatButtonModule } from '@angular/material/button';
import {MatSelectModule} from "@angular/material/select";
import { FlexLayoutModule } from "@angular/flex-layout";
import {MatPaginatorModule} from "@angular/material/paginator";
import { MatSortModule } from "@angular/material/sort";
import { MatToolbarModule } from "@angular/material/toolbar";
import { MatSidenavModule } from "@angular/material/sidenav";
import { MatDividerModule } from "@angular/material/divider";
import { MatIconModule } from "@angular/material/icon";

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    MenuComponent,
    DashboardComponent,
    ShipmentComponent,
    ViewshipmentComponent,
    ShipmentCreateComponent,
    LogoutComponent,
    ForgotPasswordComponent,
    CreateNewPasswordComponent,
    DsrComponent
  ],
  imports: [
    BrowserModule,
    RouterModule,
    FormsModule,
    BrowserAnimationsModule,
    HttpClientModule,
    NgxPaginationModule,
    MatTableModule,
    MatSliderModule,
    MatInputModule,
    MatCardModule,
    MatProgressSpinnerModule,
    MatFormFieldModule,
    MatDialogModule,
    MatButtonModule,
    FlexLayoutModule,
    MatSortModule,
    MatToolbarModule,
    MatSidenavModule,
    MatIconModule,
    MDBBootstrapModule.forRoot(),
    RouterModule.forRoot([
      {path: '', component: LoginComponent},
      {path: 'login', component: LoginComponent},
      {path: 'dashboard', component: DashboardComponent},
      {path: 'shipment', component: ShipmentComponent},
      {path: 'view-shipment', component: ViewshipmentComponent},
      {path: 'shipment-create', component: ShipmentCreateComponent},
      {path: 'forgotPassword', component: ForgotPasswordComponent},
      {path: 'createnewpassword/:user', component: CreateNewPasswordComponent},
      {path: 'shipment-create/:create/:shipmentId', component: ShipmentCreateComponent},
      {path: 'dsr', component: DsrComponent}
    ]),
    ReactiveFormsModule,
    MatSelectModule,
    MatPaginatorModule,
    MatDividerModule
  ],
  providers: [CurrencyPipe],
  bootstrap: [AppComponent]
})
export class AppModule {
}