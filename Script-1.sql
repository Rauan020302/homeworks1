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
