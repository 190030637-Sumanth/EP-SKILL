use skill;
create table Employe(eid int primary key,name varchar(30),salary int,pno bigint,email varchar(40) );
 insert into Employe values('100', 'Sumanth', '300000', '9550003909', 'sumanth@gmail.com');
 insert into Employe values('101', 'Vamsi', '450000', '9848866078', 'vamsi@gmail.com');
 insert into Employe values('102', 'Kiran', '30000', '9848461836', 'kiran@gmail.com');
 insert into Employe values('103', 'Sai', '150000', '7837536477', 'sai@gmail.com');
 insert into Employe values('104', 'Ravi', '200000', '9878774465', 'ravi@gmail.com');
 delete from Employe where eid=104;
 update Employe set salary="10000" where eid=101;
 SELECT * FROM Employe

