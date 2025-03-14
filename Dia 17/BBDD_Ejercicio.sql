CREATE DATABASE Ejercicio;
USE Ejercicio;

create table perfumes(
	id int auto_increment primary key,
    nombre varchar(50) not null,
    precio int not null,
    cantidad int not null
);

select * from perfumes;