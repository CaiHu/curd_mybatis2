---创建顾客表
CREATE TABLE t_customer(  
customerId number(4) PRIMARY KEY,  
customerName VARCHAR2(20) NOT NULL,  
customerTel number(4) NOT NULL  
);

alter table t_customer modify(customerTel number(30));

create sequence customerId_id increment by 1 start with 1;

--插入数据

insert into t_customer values(customerId_id.nextval,'小王',1888327654);  
insert into t_customer values(customerId_id.nextval,'天天',3456546354);  
insert into t_customer values(customerId_id.nextval,'阿大',123345566); 

select * from t_customer;

---创建车票表

CREATE TABLE t_ticket(  
ticketId number(4) PRIMARY KEY,  
ticketAddress VARCHAR2(50) NOT NULL,  
ticketPrice number(4) NOT NULL,  
ticketCId number(4) NOT NULL  
);

create sequence ticketId_id increment by 1 start with 1;

insert into  t_ticket values(ticketId_id.nextval,'武汉到重庆',100,1);  
insert into  t_ticket values(ticketId_id.nextval,'北京到上海',200,1);  
insert into  t_ticket values(ticketId_id.nextval,'深圳到广州',50,1);

select * from t_ticket;

select c.*,t.* from t_customer c,t_ticket t  where  c.customerId=t.ticketCId and c.customerName ='小王';
