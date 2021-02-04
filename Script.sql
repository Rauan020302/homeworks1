
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
 1. ��� ���� ��� ����� ���� ������?
��� ���������� ����� , �������� ���������� � �.� 
2. ��� ����� ��������� ���� (Primary Key)?
��� ���-�� �������� ���� �� ������� ��������� ������� ���� �� ������������� not null & unuqie 
3. ��� ����� ������� ���� (Foreign Key)?
���� ������� ����� �������� �� �������� ���� 
4. ��� ���������� ������� �� �����?
������ ��� ������������ � ������� ��� ������������ 
5. ��� ���������� ������� �� ���� ������?
���� ������ ����� ������� ������� �������� �� �������� �������
6. ��� ����� CRUD ��������?
������ ������� �������, ������������ ��� ������ � ������ ������: ��������, ������, �����������, ��������

 */



