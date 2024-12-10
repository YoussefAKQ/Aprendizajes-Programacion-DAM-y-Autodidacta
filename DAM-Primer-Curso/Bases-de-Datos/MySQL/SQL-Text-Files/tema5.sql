#TEMA 5 TAREA 1
create database centro_educativo;			#Esto para crear la base de datos

use centro_educativo;						#Usas la base de datos

create table Asignatura (
	CodAsig		numeric(3),
    CodCF		numeric(3) not null,
    NumHoras	numeric(3),
    Nombre		varchar(50) not null,
    primary key (CodAsig),
    constraint ck_asig check(NumHoras between 10 and 900)
);											#Creas la tabla Asignatura con una primary key

insert into Asignatura values (1, 1, 165, 'Bases de datos');	#Insert es para meter datos

select *
  from Asignatura;							#Para ver todo lo que hay en la tabla Asignatura
  
insert into Asignatura (CodAsig, CodCF, NumHoras, Nombre)
values (2, 1, 120, 'Lenguaje de marcas');	#Aquí podemos poner arriba los valores en el orden que vamos a introducirlos

select *
  from Asignatura;

insert into Asignatura (CodAsig, Nombre, CodCF, NumHoras)
values (3, 'Seguridad informática', 2, 90);	#Podemos cambiar el orden de los valoresd

select *
  from Asignatura;

insert into  Asignatura (CodAsig, CodCF, Nombre)
values (4, 1, 'Despliegue aplicaciones web'); #Aquí si no metemos NumHoras se queda en NULL

select *
  from Asignatura;

insert into Asignatura values (5, 2, NULL, 'Fundamentos de hardware'); #O podemos meter NULL directamente

select *
  from Asignatura;
  
create table Departamento (
	CodDep		numeric(2),
    Nombre		varchar(40) not null,
    Planta		numeric(2) default 1,
    DNI			varchar(9) not null,
    primary key (CodDep)
);

insert into Departamento (CodDep, Nombre, DNI)
values (1, 'Infórmatica y Comunicaciones', '48103100');

select *
  from Departamento
 where CodDep = 1;

select *
  from Departamento;					#EL DEFAULT DE ARRIBA ES PARA QUE SI ES NULL SE PONGA ESO AUTOMÁTICAMENTE

insert into Asignatura (CodAsig, CodCF, NumHoras, Nombre)
values (6, 1, 180, 'Acceso a datos');

select * 
  from Asignatura;

truncate table Asignatura;				#Borras todos los insert que has metido con truncate

select *
  from Asignatura;

insert into Asignatura values
(1, 1, 165, 'Bases de datos'),
(2, 1, 120, 'Lenguaje de marcas'),
(3, 2, 90, 'Seguridad informática');

select *
  from Asignatura;

insert into Asignatura values
(4, 1, 110, 'Despliegue aplicaciones web'),
(5, 2, 90, 'Fundamentos de hardware'),
(6, 1, 180, 'Acceso a datos');

select *
  from Asignatura;

create table Ciclo (
	CodCF	int not null auto_increment primary key,	#int para que la columna sea int, autoincrement va con el int
    Nombre	varchar(255) not null,						#el autoincriment es para que vaya incrementando el valor int automáticamente a más columnas añadamos
    Siglas	varchar(4) not null,
    Tipo	varchar(1) not null
);

desc Ciclo;

insert into Ciclo (Nombre, Siglas, Tipo ) values
('Desarollo de aplicaciones web', 'DAW', 'S'),
('Administración de sistemas informáticos en red', 'ASIR', 'S'),
('Desarollo de aplicaciones multiplataforma', 'DAM', 'S');

select *
  from Ciclo;						#Como podemos ver el CodCF se pone solo y va subiendo solo

truncate table Ciclo;

select *
  from Ciclo;

insert into Ciclo (CodCF, Nombre, Siglas, Tipo ) values
(11,'Desarollo de aplicaciones web', 'DAW', 'S'),
(22,'Administración de sistemas informáticos en red', 'ASIR', 'S');

select *
  from Ciclo;   					#Al ponerlo manualmente no se autoincrementa 

insert into Ciclo (Nombre, Siglas, Tipo ) values
('Desarollo de aplicaciones multiplataforma', 'DAM', 'S');

select *
  from Ciclo;						#El autoincrementar pilla el valor más grande y le incrementa
  
truncate table Ciclo;

alter table Ciclo auto_increment = 1; 

delete from Ciclo;

select count(*)
  from Ciclo;

show variables like 'sql_safe_updates';	#Esto es para ver si esta opción está activada
										#Esta opción es para eliminar y modificar filas sin where

delete from ciclo; 						#Ahora no va

set sql_safe_updates = 0;

show variables like 'sql_safe_updates';

select *
  from Asignatura;

delete from Asignatura
 where CodAsig >= 5;

select *
  from Asignatura;

delete from Asignatura
 where Nombre like 'B%'
	or Nombre like 'S%';

select *
  from Asignatura;

truncate table asignatura;

insert into Asignatura values
(1, 1, 165, 'Bases de datos'),
(2, 1, 120, 'Lenguaje de marcas'),
(3, 2, 90, 'Seguridad informática');

select *
  from Asignatura;

insert into Asignatura values
(4, 1, 110, 'Despliegue aplicaciones web'),
(5, 2, 90, 'Fundamentos de hardware'),
(6, 1, 180, 'Acceso a datos');

select *
  from Asignatura;

update Asignatura
   set NumHoras = 243
 where CodAsig = 1;

select *
  from Asignatura;

select NumHoras
  from Asignatura
 where Nombre = 'Bases de datos';
 
update Asignatura
   set NumHoras = NumHoras*1.20
 where NumHoras < 100;				#Aquí hemos añadadido un 20% a todas las asignaturas con menos de 100h

select *
  from Asignatura;
  
update Asignatura
   set NumHoras = null;				#No hace falta usar el where

select *
  from Asignatura;

update Asignatura
   set NumHoras = 190, 
	   Nombre = 'Bases de Datos'
 where CodAsig = 1;

select *
  from Asignatura;
  
select *
  from Asignatura
 where CodAsig = 1;					#Pagina 33

create table Ciudad (				#Pagina 39
	CodCiudad	numeric(2)	primary key,
    Nombre		varchar(15) not null

);

insert into Ciudad values
(3,'Sevilla'),
(6,'Bilbao'),
(7,'Granada'),
(8,'Barcelona'),
(9,'Pamplona'),
(10,'Ciudad Real'),
(11,'Tarragona'),
(22,'Barcelona'),
(44,'Málaga');

select *
  from Ciudad;

set autocommit = 0;

update Ciudad
   set CodCiudad = 2
 where CodCiudad = 22;

commit;

update Ciudad
   set CodCiudad = 4
 where CodCiudad = 44;

rollback;
  
select *
  from Ciudad;

insert into Ciudad (CodCiudad, Nombre)
values (1, 'Madrid');

update Ciudad
   set CodCiudad = 4
 where CodCiudad = 44;
 
commit;

insert into Ciudad (CodCiudad, Nombre)
values (12,'Zaragoza');

rollback;

select *
  from Ciudad;

set autocommit = 1;
start transaction;
insert into Ciudad (CodCiudad, Nombre) values (13, 'Valladolid');
commit;
insert into Ciudad (CodCiudad, Nombre) values (15, 'Valencia');
rollback;

select *
  from Ciudad
 where CodCiudad in (13,15);

set autocommit = 0;

desc Ciudad;

set autocommit = 0;

alter table Ciudad
modify column Nombre varchar(20) not null;

rollback;

set autocommit = 0;

drop user 'director'@'localhost';

create user 'director'@'localhost'
identified by 'vistaalegre';

rollback;

select user, host
  from mysql.user
 where user = 'director';
 
select *
  from Ciudad;
  
set autocommit = 0;  
  
insert into Ciudad (CodCiudad, Nombre) values (12, 'Zaragoza');

drop user 'director'@'localhost';				#SE HA HECHO UN COMMIT AQUÍ

rollback;

select *
  from Ciudad
 where CodCiudad = 12;
 
set autocommit = 0;

delete from Ciudad
 where CodCiudad = 12;
 
rollback;

select *
  from Ciudad
 where CodCiudad = 12;

set autocommit = OFF;

truncate table Ciudad
   where CodCiudad = 12;				#El truncate no permite where encima truncate no va con where

create table Copia_Ciudad as (select * from Ciudad);

select count(*)
  from Copia_Ciudad;
  
select * 
  from Ciudad;

set autocommit = 0;

truncate table Copia_Ciudad;		#truncate es DDL

rollback;

select count(*)
  from Copia_Ciudad;				#LAS SENTENCIAS DDL HACEN UN COMMIT IMPLÍCITO

show variables like 'transaction_isolation';

select @@transaction_isolation; 		#NIVEL DE BASTANTE AISLAMIENTO, NO PERMITE LOS PROBLEMAS

set session transaction isolation level read uncommitted;		#0 aislaminento

show variables like 'transaction_isolation';

set session transaction isolation level read committed;			#evita la sucia

show variables like 'transaction_isolation';

set session transaction isolation level serializable;			#nivel paranoico, evita todo

show variables like 'transaction_isolation';

set session transaction isolation level repeatable read;		#EN MYSQL evita los 3

show variables like 'transaction_isolation';

use centro_educativo;

select *
  from Ciudad
 where Nombre = 'Pamplona';

start transaction;

update Ciudad set CodCiudad = 99 where CodCiudad = 9;

rollback;

select * from Ciudad where Nombre = 'Pamplona';
start transaction;
update Ciudad set CodCiudad = 99 where CodCiudad = 9;

set session transaction isolation level read committed;

start transaction;

select * from Ciudad;

commit;


use employees;

create table MejoresEmpleadosVentas like employees;






