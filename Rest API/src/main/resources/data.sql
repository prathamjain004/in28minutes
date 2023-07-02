insert into user_details(id,birth_date,name)
values (10001,current_date(),'Pratham');

insert into user_details(id,birth_date,name)
values (10002,current_date(),'Jain');

insert into post(id,description,user_id)
values(20001,'I want to learn AWS', 10001);

insert into post(id,description,user_id)
values(20002,'I want to learn DevOps', 10002);