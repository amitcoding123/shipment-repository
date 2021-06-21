create table invoice_log.dsr (id bigint not null, created_on date, dsr longblob, user_id varchar(255), primary key (id)) engine=MyISAM;
create table invoice_log.hibernate_sequence (next_val bigint) engine=MyISAM;
insert into invoice_log.hibernate_sequence values ( 1 );
create table invoice_log.invoice (id bigint not null, invoice longblob, shipment_id bigint, primary key (id)) engine=MyISAM;