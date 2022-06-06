use c123;

create table EMP1(
ID numeric(2),
Name varchar(10),
Basic numeric(6,2),
Designation varchar(10),
Age numeric(2)
);
alter table emp1 modify Basic integer(6);
alter table emp1 modify Name varchar(15);

create table EMP_trainee(
Emp_id numeric(2),
Name varchar(15),
Basic integer(6),
Designation varchar(10),
Age numeric(2)
);
insert into emp1 value
(1,'Rohit',6700,'Manager',24),
(2,'Sunil',6200,'Engineer',27),
(3,'Payal',6300,'Engineer',25),
(4,'Kunal',6700,'Trainee',28),
(5,'Sunita',6230,'Trainee',26),
(6,'Bimal',7000,'Trainee',25);
insert into emp_trainee select*from emp1; 
select * from emp1,emp_trainee;
alter table emp1 add Skills varchar(15);
alter table emp1 add DOJ date;

update emp1 set Skills = 'c' where ID = 1;
update emp1 set Skills = 'Python' where ID = 2;
update emp1 set Skills = 'C++' where ID = 3;
update emp1 set Skills = 'SQL' where ID = 4;
update emp1 set Skills = 'java' where ID = 5;
update emp1 set Skills = 'dotnet' where ID = 6;

update emp1 set DOJ = '2022-03-09' where ID = 1;
update emp1 set DOJ = '2021-12-28' where ID = 2;
update emp1 set DOJ = '2021-11-05' where ID = 3;
update emp1 set DOJ = '2022-01-8' where ID = 4;
update emp1 set DOJ = '2022-02-18' where ID = 5;
update emp1 set DOJ = '2022-04-23' where ID = 6;

alter table emp_trainee modify Designation varchar(30);
update emp_trainee set Designation = 'Programmer_Trainee';

alter table emp1 modify ID varchar(5);
select * from emp1,emp_trainee;

alter table emp1 rename column Age to Age_in_Years;
delete from emp1 where Designation = 'Trainee';

alter table emp_trainee drop column Age;