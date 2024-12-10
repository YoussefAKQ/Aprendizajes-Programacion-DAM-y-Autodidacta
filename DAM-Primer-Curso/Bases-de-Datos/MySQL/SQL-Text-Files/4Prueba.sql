create table persona (
	DNI			VARCHAR(9) NOT NULL PRIMARY KEY,
    Nombre		VARCHAR(20) NOT NULL,
    PrApellido	VARCHAR(20) NOT NULL,
    SgApellido	VARCHAR(20),
    CodDepartamento	NUMERIC(2) NOT NULL
);

desc EMPLEADO;

ALTER TABLE EMPLEADO ADD CONSTRAINT NumSS_uk UNIQUE KEY ( NUMSS);

show create table EMPLEADO;

use serietv;

CREATE TABLE trabajador (
  DNI char(9),
  NumSS varchar(20),
  Nombre varchar(20) NOT NULL,
  Apellido1 varchar(20) NOT NULL,
  Apellido2 varchar(20),
  CodDepartamento decimal(3,0),
  PRIMARY KEY (DNI),
  UNIQUE KEY (NumSS)
);

drop table trabajador;

desc trabajador;