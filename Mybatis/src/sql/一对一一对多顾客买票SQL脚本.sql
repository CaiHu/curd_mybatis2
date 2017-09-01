---�����˿ͱ�
CREATE TABLE t_customer(  
customerId number(4) PRIMARY KEY,  
customerName VARCHAR2(20) NOT NULL,  
customerTel number(4) NOT NULL  
);

alter table t_customer modify(customerTel number(30));

create sequence customerId_id increment by 1 start with 1;

--��������

insert into t_customer values(customerId_id.nextval,'С��',1888327654);  
insert into t_customer values(customerId_id.nextval,'����',3456546354);  
insert into t_customer values(customerId_id.nextval,'����',123345566); 

select * from t_customer;

---������Ʊ��

CREATE TABLE t_ticket(  
ticketId number(4) PRIMARY KEY,  
ticketAddress VARCHAR2(50) NOT NULL,  
ticketPrice number(4) NOT NULL,  
ticketCId number(4) NOT NULL  
);

create sequence ticketId_id increment by 1 start with 1;

insert into  t_ticket values(ticketId_id.nextval,'�人������',100,1);  
insert into  t_ticket values(ticketId_id.nextval,'�������Ϻ�',200,1);  
insert into  t_ticket values(ticketId_id.nextval,'���ڵ�����',50,1);

select * from t_ticket;

select c.*,t.* from t_customer c,t_ticket t  where  c.customerId=t.ticketCId and c.customerName ='С��';
