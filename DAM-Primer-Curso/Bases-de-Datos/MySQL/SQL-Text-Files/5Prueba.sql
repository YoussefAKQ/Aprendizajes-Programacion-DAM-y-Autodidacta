show create table empleado;

drop table empleado;

CREATE TABLE empleado2 (
  DNI varchar(9) NOT NULL,
  Nombre varchar(20) DEFAULT NULL,
  Apellido1 varchar(20) DEFAULT NULL,
  Apellido2 varchar(20) DEFAULT NULL,
  CodDepartamento decimal(2,0) NOT NULL,
  NumSS varchar(12) DEFAULT NULL,
  CtaCorriente varchar(20) DEFAULT NULL,
  PRIMARY KEY (DNI, CodDepartamento),
  UNIQUE KEY EMPLEADO_NumSS_UK (DNI, CtaCorriente),
  UNIQUE KEY EMPLEADO_CtaCorriente_UK (Nombre, Apellido1, Apellido2, CtaCorriente)
);

desc empleado;

show create table empleado;

create table empleado2 as (select * from empleado);

desc empleado2;

drop table empleado2;

drop table Empleado;

create table familiar (
    DNI  varchar(9) primary key,
    Nombre varchar(20) not null,
    Ap1 varchar(20) not null,
    Ap2 varchar(20),
    DniEmpleado varchar(12),
    constraint familiar_Empleado_fk foreign key (DniEmpleado) references Empleado (DNI)
    );
    
drop table familiar;

desc familiar;