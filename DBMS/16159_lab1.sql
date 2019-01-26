create table department(
dept_name varchar(16),
building varchar(10),
budget int
);

create table course(
course_id varchar(10),
title varchar(30),
dept_name varchar(10),
credits int
);

insert into department values('Comp.Sci', 'Taylor', 10000),('Biology', 'Watson', 9000), ('Elec_Eng', 'Taylor', 9866);

insert into course values('BIO-101', 'Intro to biology', 'Biology', 4), ('CS-101', 'Game Design', 'Comp.Sci', 4),('CS-102','Intro into computer science', 'Comp.Sci', 4),('EE-181','Intro. into digital sciences', 'Elec.Eng', 4);
select * from course;
select * from department;
select title from course where dept_name='Comp.Sci';
select title from course where dept_name='Comp.Sci' and credits=4;

