insert into user_log.user(id, user_id, password, first_name, last_name, email, country_code, mobile_number, created_by, created_on, modified_by, modified_on, role, parent_id)
values (1000, 'amitg', '$2a$10$plDtBGpprrMS6xLqHRR0yu8rpcbf7w2H7mfv6u44Qtmu2HFwYIXA6', 'Amit', 'Gupta', 'meetamit01@gmail.com', '91', '9527026200', 'batch', sysdate(), 'batch', sysdate(), 'ADMIN', null);
insert into user_log.user(id, user_id, password, first_name, last_name, email, country_code, mobile_number, created_by, created_on, modified_by, modified_on, role, parent_id)
values (1001, 'vaibhavn', '$2a$10$plDtBGpprrMS6xLqHRR0yu8rpcbf7w2H7mfv6u44Qtmu2HFwYIXA6', 'Vaibhav', 'N', 'abc@gmail.com', '91', '8374653433', 'batch', sysdate(), 'batch', sysdate(), 'USER', 1000);

INSERT INTO `user_log`.`organization`
(`id`,
`created_by`,
`created_on`,
`modified_by`,
`modified_on`,
`email`,
`gstin`,
`name`,
`telephone_number`,
`address`)
VALUES
(1000,
'batch',
sysdate(),
'batch',
sysdate(),
'ispeedlink9@gmail.com',
'27AKMPN9403C1Z4',
'INTERNATIONAL SPEED LINK',
'+91 98345030075',
'Flat No. 10, 3rd Floor, Lane No. 4, Atharva Heights, Survey No. 54/6D, Mahatama Society, Kothrud, Pune, Maharastra, 411038');

INSERT INTO `user_log`.`bank_details` (`id`, `created_by`, `created_on`, `modified_by`, `modified_on`, `account_number`, `bank_name`, `ifsc_code`, `micr_code`, `organization_id`)
VALUES
(1000,
'batch',
sysdate(),
'batch',
sysdate(),
'6920787780',
'Indian Bank',
'IDIB000D007',
null,
1000);

update `user_log`.`user` set `organization_id`=1000;