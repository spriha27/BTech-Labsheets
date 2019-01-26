create table emplyee(
emplyee_id varchar(15),
ename varchar(20),
date_of_birth date,
salary numeric(9,2)
);
select * from emplyee;
drop table emplyee;

insert into emplyee values('1', 'Aruna', '2018/5/3', 1000);
insert into emplyee values('2', 'Sonam', '2018/12/17', 2005.60);
insert into emplyee values('3', 'Kriya', '2018/7/22', 1047.77);
insert into emplyee values('4', 'Saru', '2018/4/3', 2307.55);
insert into emplyee values('5', 'Khushi', '2018/5/4', 1255.88);
insert into emplyee values('6', 'Ravin', '2018/9/1', 1255.88);

select emplyee_id, ceil(salary) from emplyee;
select emplyee_id, round(salary,2) from emplyee;
select emplyee_id, power(salary,2) from emplyee;
select emplyee_id, lower(ename) from emplyee;
select emplyee_id, lower(ename), length(ename) from emplyee;
select emplyee_id, lpad(ename,10,'*') from emplyee;
select emplyee_id, rpad(ename,6, '*') from emplyee;
select emplyee_id, ltrim(ename, ' ') from emplyee;
select emplyee_id, rtrim(ename, ' ') from emplyee;
select emplyee_id, substring(ename, 2, 3) from emplyee;
Select to_char (date_of_birth,'DD/Month/YYYY') from emplyee;
select to_date('20170103','YYYYMMDD');
select to_date('2017 Feb 20','YYYY Mon DD');
select ename from emplyee where extract(month from date_of_birth)=5;