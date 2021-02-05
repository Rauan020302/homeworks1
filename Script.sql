--task A

insert into visitors(visitors_full_name,visitors_date_of_birth,visitors_gender)
values ('Bruce Lee','19000203','M'),
       ('Jackie Chan','19201010','M')
       
insert into visits 
values (3,'20001020',4),
       (4,'20001221',5)
       
select visitors.visitors_full_name
from visitors v 
join visitors on visitors_id = visitors_full_name 

       
--task B 
     
create table university(
      university_id serial primary key,
      university_name VARCHAR(20) not null
);
create table subject(
      subject_id serial primary key,
      subject_name VARCHAR(50) not null unique
);

create table faculty(
    faculty_id serial primary key,
    faculty_name VARCHAR(30) not null,
    faculty_university INTEGER references university(university_id)
);

create table group1(
     group_id serial primary key,
     group_faculty INTEGER references faculty(faculty_id),
     group_code VARCHAR(20) not null unique
);
       
create table student(
     student_id serial primary key,
     student_full_name VARCHAR not null,
     student_group INTEGER references group1(group_id),
     student_date_birth TIMESTAMP not null
);

create table mark(
     mark_id serial primary key,
     mark_student INTEGER references student(student_id),
     mark_2345 INTEGER not null,
     mark_subject INTEGER references subject(subject_id)
);
insert into university (university_name)
values ('IT academy');

insert into faculty (faculty_name,faculty_university)
values ('information',1);

insert into subject (subject_name)
values ('VAJA'),
       ('C++');
insert into group1 (group_faculty,group_code)
values (1,'JAVA'),
       (1,'C++');
insert into student (student_full_name,student_group,student_date_birth)
values ('Rauan',1,'20020302'),
       ('Grizmann',2,'19300302'),
       ('Muller',1,'19020301');
insert into mark (mark_student,mark_2345,mark_subject)
values (1,5,1),
       (2,3,2),
       (3,4,1);

select student.student_full_name
from student s 
join group1 g on s.student_group = s.student_id 




--task C

create table academy(
    academy_id Serial primary key,
    academy_name VARCHAR(20) not null
)

create table course(
    course_id serial primary key,
    course_name VARCHAR(20) not null,
    course_academy INTEGER references academy(academy_id)
)

create table head(
    head_id serial primary key,
    head_name VARCHAR(30) not null,
    head_course INTEGER references course(course_id)
)

create table mentor(
    mentor_id serial primary key,
    mentor_name VARCHAR(30) not null,
    mentor_course INTEGER references course(course_id)
)

create table reviewer(
    reviewer_id serial primary key,
    reviewer_name VARCHAR(30) not null,
    reviewer_course INTEGER references course(course_id)
)

create table groupes(
   groupes_id serial primary key,
   groupes_name VARCHAR(20) not null unique,
   groupes_course INTEGER references course(course_id)
)

create table students(
   students_id serial primary key,
   students_name VARCHAR(30) not null,
   students_groupes INTEGER references groupes(groupes_id)
)
 
create table hw(
   hw_id serial primary key,
   hw_number INTEGER not null unique,
   hw_course INTEGER references course(course_id)
)






