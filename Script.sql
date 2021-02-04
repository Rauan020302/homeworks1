
CREATE table sport_types(
   sport_type_id INTEGER primary key,
   sport_type_name VARCHAR(30) unique not null, 
   sport_type_salary INTEGER 
)

create table trainers(
    trainers_id SERIAL primary key,
    trainer_full_name VARCHAR(50) not null,
    sport_type_id INTEGER references sport_types(sport_type_id),
    phone_number VARCHAR(10),
    inn INTEGER unique not null
) 

create table visitors(
    visitors_id SERIAL primary key,
    visitors_full_name VARCHAR(50) not null,
    visitors_date_of_birth TIMESTAMP not null,
    visitors_gender VARCHAR(1) not null
)

create table visits(
    visitor INTEGER references visitors(visitors_id),
    visits_time TIMESTAMP not null,
    visits_trainers INTEGER references trainers(trainers_id)
)



insert into visitors(visitors_full_name,visitors_date_of_birth,visitors_gender)   
values ('Rauan','20020302','M'),
       ('Ruslan','20020901','M')

insert into visits
values(1,'20210203',1),
      (2,'20200302',2)


      
/*
 1. Для чего нам нужны Базы Данных?
для облегчения жизни , хранения информации и т.д 
2. Что такое первичный ключ (Primary Key)?
это как-бы основной ключ на который ссылается внешний ключ он автоматически not null & unuqie 
3. Что такое внешний ключ (Foreign Key)?
ключ который будет ссылатся на основной ключ 
4. Чем отличаются колонки от строк?
строка это наименование а колонки это перечисление 
5. Чем отличаются таблицы от базы данных?
база данных имеет сложные функции которыми не обладает таблица
6. Что такое CRUD операции?
четыре базовые функции, используемые при работе с базами данных: создание, чтение, модификация, удаление

 */



