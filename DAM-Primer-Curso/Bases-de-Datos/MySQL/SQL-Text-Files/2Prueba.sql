create database SerieTV;

create user productor@localhost identified by 'Producer*23';

create user realizador@localhost identified by 'vistaalegre';
grant all on SerieTV.* to realizador@localhost;

grant all on SerieTV.* to productor@localhost with grant option;


use SerieTV;
CREATE TABLE Departamento (
CodDepartamento NUMERIC(2),
Descripcion VARCHAR(20)
);
ALTER TABLE Departamento ADD CONSTRAINT CodDepartamento_pk PRIMARY KEY ( CodDepartamento );

CREATE TABLE Empleado (
DNI CHAR(9) NOT NULL,
DNIGERENTE CHAR(9) NOT NULL,
Nombre VARCHAR(15) NOT NULL,
PrApellido VARCHAR(15) NOT NULL,
SgApellido VARCHAR(15),
FecNacimiento DATE NOT NULL,
CodDepartamento NUMERIC(2,0) NOT NULL,
Tipo CHAR(1) NOT NULL 
);

ALTER TABLE Empleado ADD CONSTRAINT empleado_pk PRIMARY KEY ( DNI, CodDepartamento );

ALTER TABLE Empleado ADD CONSTRAINT empleado_uq UNIQUE KEY ( Nombre, PrApellido, SgApellido );

alter table empleado add column NumSS varchar(20) NOT NULL;

alter table empleado modify column CodDepartamento NUMERIC(3,0) NOT NULL;

alter table empleado rename column CodDepartamento to CodDep;

desc Empleado;

create table antiguos_empleados as(select* from empleado);

drop table antiguos_empleados;

use departamento_universidad;

CREATE TABLE empleado (
	secuencia NUMERIC(3) NOT NULL,
    nombre VARCHAR(20) NOT NULL,
    prapellido VARCHAR(20) NOT NULL,
	sgapellido VARCHAR(20) NOT NULL,
	coddep NUMERIC(2) NOT NULL,
    tipo VARCHAR(1) NOT NULL
);

desc empleado;

alter table empleado add column NumSS varchar(20) NOT NULL;

alter table empleado modify column CodDep NUMERIC(3,0) NOT NULL;

create table profesor as (select* from empleado);

desc profesor;

alter table profesor drop column NumSS;

