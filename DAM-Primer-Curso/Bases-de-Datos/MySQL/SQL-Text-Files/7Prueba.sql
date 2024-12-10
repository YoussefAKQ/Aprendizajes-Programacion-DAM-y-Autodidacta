create database SerieTV;

create user producto@localhost identified by 'Producer*23';

create user realizador@localhost identified by 'vistaalegre';

grant all on SerieTV.* to realizador@localhost;

grant all on SerieTV.* to productor@localhost with grant option;

use SerieTV;
CREATE TABLE Departamento (
CodDepartamento NUMERIC(2),
Descripcion		VARCHAR(20)
);
ALTER TABLE Departamento ADD CONSTRAINT CodDepartamento_pk PRIMARY KEY (CodDepartamento);

CREATE TABLE Empleado  (
DNI CHAR(9) NOT NULL,
DNIGERENTE CHAR(9) NOT NULL,
Nombre VARCHAR(15) NOT NULL,
PrApellido VARCHAR(15) NOT NULL,
SgApellido VARCHAR(15),
FecNacimiento DATE NOT NULL,
CodDepartamento NUMERIC(2,0) NOT NULL,
Tipo CHAR(1) NOT NULL
);

ALTER TABLE Empleado ADD CONSTRAINT empleado_pk PRIMARY KEY ( DNI, CodDepartamento);

ALTER TABLE Empleado ADD CONSTRAINT empleado_uk UNIQUE KEY ( Nombre, PrApellido, SgApellido);

ALTER TABLE Empleado ADD CONSTRAINT empleado_tipo_ck CHECK ( tipo IN ( 'D' , 'R' ) );

ALTER TABLE Departamento ADD COLUMN DNI CHAR(9) NOT NULL;

ALTER TABLE Departamento DROP PRIMARY KEY;
ALTER TABLE Departamento ADD CONSTRAINT departamento_pk PRIMARY KEY ( DNI, CodDepartamento );

ALTER TABLE Empleado ADD CONSTRAINT Empleado_Departamento_FK FOREIGN KEY ( DNIGerente, CodDepartamento) 
references Departamento (DNI,CodDepartamento);
