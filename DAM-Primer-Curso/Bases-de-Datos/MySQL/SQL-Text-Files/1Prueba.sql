create database instituto;
use instituto;


CREATE TABLE alumno (
    dni    CHAR(9) NOT NULL,
    nombre VARCHAR(20) NOT NULL,
    ap1    VARCHAR(20) NOT NULL,
    ap2    VARCHAR(20) 
);

ALTER TABLE alumno ADD CONSTRAINT alumno_pk PRIMARY KEY ( dni );

CREATE TABLE asignatura (
    codasig  NUMERIC(3) NOT NULL,
    nombre   VARCHAR(20) NOT NULL,
    numhoras NUMERIC(3) NOT NULL
);

ALTER TABLE asignatura ADD CONSTRAINT asignatura_pk PRIMARY KEY ( codasig );

CREATE TABLE calificacion_final (
    dni     CHAR(9) NOT NULL,
    codasig NUMERIC(3) NOT NULL,
    nota    NUMERIC(2) NOT NULL
);

ALTER TABLE calificacion_final ADD CONSTRAINT calificacion_final_pk PRIMARY KEY ( dni,
                                                                                  codasig );
																				
ALTER TABLE calificacion_final
    ADD CONSTRAINT calificacion_final_alumno_fk FOREIGN KEY ( dni )
        REFERENCES alumno ( dni );

ALTER TABLE calificacion_final
    ADD CONSTRAINT calificacion_final_asignatura_fk FOREIGN KEY ( codasig )
        REFERENCES asignatura ( codasig );
#-----------------------------------------------------------------------------------------
drop user director@localhost;

create user director@localhost identified by 'vistaalegre';

grant select, insert on instituto.* to director@localhost;

revoke select, insert on instituto.alumno from director@localhost;
#-----------------------------------------------------------------------------------------
create user root2@localhost identified by 'root2';

grant all on *.* to root2@localhost with grant option;
#-----------------------------------------------------------------------------------------
create user dictador@localhost identified by 'vistaalegre';