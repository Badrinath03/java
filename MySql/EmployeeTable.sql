use c123;
create table EMPLOYEE(
EMPLOYEE_ID numeric(6),
LAST_NAME varchar(25),
JOB_ID varchar(10),
SALARY numeric(8,2),
 COMM_PCT numeric(4,2),
 MGR_ID numeric(6),
 DEPARTMENT_ID numeric(4)
 );
 
 insert into employee value
 (198,'Connell','SH_CLERK',2600,2.5,124,50),
 (199,'Grant','SH_CLERK',2600,2.5,124,50),
 (200,'Whalen','AD_ASST',4400,1.3,101,10),
 (201,'Hartstein','IT_PROG',6000,null,100,20),
 (202,'Fay','AC_MGR',6500,null,210,20),
 (203,'Mavris','AD_VP',7500,null,101,40),
 (204,'Baer','AD_PRES',3500,1.5,101,90),
 (205,'Higgins','AC_MGR',2300,null,101,60),
 (206,'Gitz','IT_PROG',5000,null,103,60),
 (100,'King','AD_ASST',8956,0.3,108,100),
 (101,'Kochar','SH_CLERK',3400,1.3,118,30);
 
 select last_name, job_id, employee_id from employee;
 select* from employee where DEPARTMENT_ID = 60;
 select * from employee where LAST_NAME = 'king';
 select  job_id from employee;
 select * from employee where COMM_PCT >=0.1;
 select * from employee where COMM_PCT;
 select Employee_id, Department_id , Salary from employee where SALARY >5000;
 select Last_Name, Salary from employee where SALARY between 4000 and 7000;
 select * from employee where SALARY =6000 or SALARY=6500 or SALARY=7000;
 select * from employee where DEPARTMENT_ID=10 or DEPARTMENT_ID=20 or DEPARTMENT_ID=30 or DEPARTMENT_ID=50;
 select * from employee where SALARY != 5000;
 select * from employee where JOB_ID = 'SH_CLERK';
 update employee set JOB_ID = 'Grade_A' where SALARY >= 5000;
 select * from employee where JOB_ID ='SH_CLERK' or JOB_ID='IT_PROG' or JOB_ID='AD_ASST';
 select * from employee where JOB_ID ='SH_CLERK' and SALARY<3000;
select last_name,MGR_ID from employee where SALARY>3000 and MGR_ID=101;