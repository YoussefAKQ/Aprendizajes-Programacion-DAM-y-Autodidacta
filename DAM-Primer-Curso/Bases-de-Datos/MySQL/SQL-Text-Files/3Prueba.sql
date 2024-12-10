desc departamento;

drop table departamento;

create table departamento as (select* from empleado);

alter table profesor add column Dni CHAR(9) NOT NULL;

desc profesor;

alter table profesor add constraint profesor_pk primary key (dni);

alter table departamento add constraint departamentoprofesor_fk foreign key (dni) 
references profesor(dni);

alter table departamento drop constraint departamentoprofesor_fk;

alter table departamento rename column dni to dnijefe;

desc departamento;

alter table departamento drop constraint departamentoprofesor_fk;

alter table profesor drop primary key;

show create table profesor;

create table alumno as (select * from departamento);

desc alumno;

rename table alumno to estudiante;

create table PRODUCTO (
	codProducto NUMERIC (4) NOT NULL,
    precio		NUMERIC (6,2) NOT NULL,
    fecha 		date		NOT NULL,
    primary key (codProducto),
    constraint PRODUCTO_CK1
		check (precio >0 and precio <=3000),
	constraint PRODUCTO_CK2
		check (fecha between '2021-01-01' and '2021-12-31')
    );
    
show create table PRODUCTO;

