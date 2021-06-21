insert into user_log.user(id, user_id, password, first_name, last_name, email, country_code, mobile_number, created_by, created_on, modified_by, modified_on, role, parent_id)
values (1000, 'amitg', 'password', 'Amit', 'Gupta', 'meetamit01@gmail.com', '91', '9527026200', 'batch', sysdate(), 'batch', sysdate(), 'ADMIN', null);
insert into user_log.user(id, user_id, password, first_name, last_name, email, country_code, mobile_number, created_by, created_on, modified_by, modified_on, role, parent_id)
values (1001, 'vaibhavn', 'password', 'Vaibhav', 'N', 'abc@gmail.com', '91', '8374653433', 'batch', sysdate(), 'batch', sysdate(), 'USER', 1000);
insert into user_log.user_commision(id, created_by, created_on, modified_by, modified_on, cocourier_user_id, parent_user_id, percentage)
values (1000, 'batch', sysdate(), 'batch', sysdate(), 'vaibhavn', 'amitg', 15);