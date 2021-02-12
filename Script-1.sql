create table people(
   id Integer primary key,
   full_name VARCHAR(40) not null,
   birth_date TIMESTAMP not null
)

create table countries(
    country_id Integer primary key,
    country_name VARCHAR(50)not null,
    code Integer not null,
    country_population INTEGER ,
    president integer references people(id)
)

create table cities(
    city_id Integer primary key,
    city_name VARCHAR(50)not null,
    countries_id int references countries(id),
    mayor int references people(id),
    city_population INTEGER
)

select * from countries

insert into people
values (1,'Man in Black','18000301'),
       (2,'Caption America','19200406'),
       (3,'Spider man','20000910'),
       (4,'Iron man','18901002'),
       (5,'Ronaldo','19401203'),
       (6,'Fire man','19420412'),
       (7,'Davies','19990902'),
       (8,'Leonardo','20031212'),
       (9,'Robert','20100412'),
       (10,'Harry','20120203')
       
insert into countries 
values (1,'Singapore',001,30000000,2),
       (2,'France',002,60000000,7),
       (3,'UK',003,90000000,10)
       
insert into cities 
values (1,'London',3,9,4000000),
       (2,'Paris',2,3,5000000),
       (3,'Singapore',1,6,30000000),
       (4,'Manchester',3,8,8000000)
insert into cities 
values (5,'Liverpole',3,1,16000000)
      

alter table cities 
rename column country_id to countries_id
select * 
from cities c 

select * 
from countries c 
join people p3 on c.president = p3.id 
delete from people p2 
delete from countries
delete from cities

select * 
from cities c 
full join people p on c.mayor = p.id 
full join countries c2 on c.countries_id = c2.country_id 


