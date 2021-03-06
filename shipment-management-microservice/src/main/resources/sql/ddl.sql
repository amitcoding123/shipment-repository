create table shipment_log.address (id bigint not null, created_by varchar(255), created_on datetime, modified_by varchar(255), modified_on datetime, address_line1 varchar(255), address_line2 varchar(255), city varchar(255), country varchar(255), state varchar(255), zip_code varchar(255), primary key (id)) engine=MyISAM;
create table shipment_log.charge (id bigint not null, category integer, rate bigint, weight double precision not null, currency_id bigint, zone_id bigint, primary key (id)) engine=MyISAM;
create table shipment_log.consignee (id bigint not null, created_by varchar(255), created_on datetime, modified_by varchar(255), modified_on datetime, email varchar(255), name varchar(255), phone_number varchar(255), place varchar(255), consignee_address_id bigint, primary key (id)) engine=MyISAM;
create table shipment_log.country (id bigint not null, description varchar(255), iso_code varchar(255), zone_id bigint, primary key (id)) engine=MyISAM;
create table shipment_log.covid_surcharge (id bigint not null, amount double precision, charge_type char(1) not null, provider integer, static_weight double precision, country_id bigint, primary key (id)) engine=MyISAM;
create table shipment_log.currency (id bigint not null, description varchar(255), iso_currency_code varchar(255), primary key (id)) engine=MyISAM;
create table shipment_log.hibernate_sequence (next_val bigint) engine=MyISAM;
insert into shipment_log.hibernate_sequence values ( 1 );
create table shipment_log.item (id bigint not null, created_by varchar(255), created_on datetime, modified_by varchar(255), modified_on datetime, price decimal(19,2), quantity bigint, item_type_id bigint, shipment_id bigint, primary key (id)) engine=MyISAM;
create table shipment_log.item_type (id bigint not null, created_by varchar(255), created_on datetime, modified_by varchar(255), modified_on datetime, description varchar(255), primary key (id)) engine=MyISAM;
create table shipment_log.shipment (id bigint not null, created_by varchar(255), created_on datetime, modified_by varchar(255), modified_on datetime, actual_weight decimal(19,2), box_height bigint, box_length bigint, box_weight decimal(19,2), box_width bigint, category integer, comments varchar(255), frieght_charge decimal(19,2), invoice_number varchar(255), provider integer, selling_cost double precision, special_instruction varchar(255), status integer, tracking_number bigint, user_id varchar(255), consignee_id bigint, shipper_id bigint, primary key (id)) engine=MyISAM;
create table shipment_log.shipper (id bigint not null, created_by varchar(255), created_on datetime, modified_by varchar(255), modified_on datetime, aadhar_number varchar(255), email varchar(255), name varchar(255), phone_number varchar(255), place varchar(255), shipper_address_id bigint, primary key (id)) engine=MyISAM;
create table shipment_log.tracking_comment (id bigint not null, comment varchar(255), history_id bigint, primary key (id)) engine=MyISAM;
create table shipment_log.tracking_history (id bigint not null, tracking_number bigint, primary key (id)) engine=MyISAM;
create table shipment_log.zone (id bigint not null, code varchar(255), primary key (id)) engine=MyISAM;
alter table shipment_log.charge add constraint fk_charge_currency foreign key (currency_id) references currency (id);
alter table shipment_log.charge add constraint fk_charge_zone foreign key (zone_id) references zone (id);
alter table shipment_log.consignee add constraint fk_consignee_add foreign key (consignee_address_id) references address (id);
alter table shipment_log.country add constraint fk_country_zone foreign key (zone_id) references zone (id);
alter table shipment_log.covid_surcharge add constraint fk_cs_country foreign key (country_id) references country (id);
alter table shipment_log.item add constraint fk_item_type foreign key (item_type_id) references item_type (id);
alter table shipment_log.item add constraint fk_item_shipment foreign key (shipment_id) references shipment (id);
alter table shipment_log.shipment add constraint fk_shipment_consignee foreign key (consignee_id) references consignee (id);
alter table shipment_log.shipment add constraint fk_shipment_shipper foreign key (shipper_id) references shipper (id);
alter table shipment_log.shipper add constraint fk_shipper_address foreign key (shipper_address_id) references address (id);
alter table shipment_log.tracking_comment add constraint fk_tc_th foreign key (history_id) references tracking_history (id);

create table shipment_log.user_commision (id bigint not null, created_by varchar(255), created_on datetime, modified_by varchar(255), modified_on datetime, cocourier_user_id varchar(255), parent_user_id varchar(255), percentage double precision not null, primary key (id)) engine=MyISAM