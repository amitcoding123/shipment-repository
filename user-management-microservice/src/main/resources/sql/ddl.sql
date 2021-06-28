create table user_log.hibernate_sequence (next_val bigint) engine=MyISAM;
insert into user_log.hibernate_sequence values ( 1 );
create table user_log.user (id bigint not null, created_by varchar(255), created_on datetime, modified_by varchar(255), modified_on datetime, country_code varchar(255), email varchar(255), first_name varchar(255), last_name varchar(255), mobile_number varchar(255), password varchar(255), role varchar(255), user_id varchar(255), parent_id bigint, primary key (id)) engine=MyISAM;
alter table user_log.one_time_password add constraint FKq1ndyyo893fod7ea13y3ak300 foreign key (user_id) references user (id);
alter table user_log.user add constraint FK4k8a1qa0wofm01aijepmu0d4g foreign key (parent_id) references user (id);