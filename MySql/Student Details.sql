#create db
create database c1236;

# use db
use c1236;

# create table inside db
create table student(
id int primary key auto_increment,
sname varchar(20) not null,
sphone bigint(13) not null unique,
semail varchar(30) not null unique,
saddr varchar(50),
squalification varchar(10) not null,
sfees double,
sdob date,
sdept varchar(20)
);

alter table student ADD age int after sdob;

alter table student MODIFY squalification  varchar(20) not null;
alter table student MODIFY sfees double not null;

alter table student DROP column sdept;

alter table student CHANGE COLUMN age sage int;

alter table student RENAME TO student_details;

insert into student_details values(1,Divya,divya@gmail.com,chennai,tamilnadu,ME,2000.65,30-05-1997,25),

insert into student_details values
(2,abi,abi@gmail.com,chennai,tamilnadu,ME,1000.65,13-06-1997,25),
(3,logi,logi@gmail.com,chennai,tamilnadu,BE,1560.65,30-06-1997,24),
(4,thanushka,thanushka@gmail.com,chennai,tamilnadu,BBA,2541.65,26-11-2013,12),

insert into student_details values
(5,badri,badri@gmail.com,chennai,tamilnadu,BE,1000.65,13-06-1997,23),
(6,pavan,pavan@gmail.com,chennai,tamilnadu,BE,1000.65,13-06-1997,22),
(7,surya,surya@gmail.com,chennai,tamilnadu,BE,1000.65,13-06-1997,24),