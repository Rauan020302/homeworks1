create table people(
   id Integer primary key,
   full_name VARCHAR(40) not null,
   birth_date TIMESTAMP not null
)

create table countries(
    id Integer primary key,
    name VARCHAR(50)not null,
    code Integer not null,
    country_population INTEGER ,
    president integer references people(id)
)

create table cities(
    id Integer primary key,
    name VARCHAR(50)not null,
    country_id int references countries(id),
    mayor int references people(id),
    city_population INTEGER
)

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
      
select c.name
from cities c 
join countries c2 on c.country_id = c2.id 
where c.name like 'L%' or c2.name like 'L%' 

select c2.name ,sum(city_population)
from countries c2 
join cities c3 on c2.id = c3.country_id 
group by c2.name

alter table countries 
add official_language VARCHAR(50)unique 

