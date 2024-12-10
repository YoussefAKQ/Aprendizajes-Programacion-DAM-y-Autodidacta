create table PROFESOR (
    dni  varchar(9),
    Nombre varchar(20) not null,
    Ap1 varchar(20) not null,
    Ap2 varchar(20) not null,
    NumSS varchar(20) not null,
    constraint profesor_uk primary key (dni),
    constraint profesor_fk unique key (dni)
    );
    
    create table DEPARTAMENTO (
		CodDep		Numeric(2),
        Descripcion	varchar(40) not null,
        dniJefe VARCHAR(9) not null,
        constraint departamento_pk primary key (CodDep)
    );
    
alter table DEPARTAMENTO add constraint DEPARTAMENTO_PROFESOR_FK
foreign key (dniJefe) references PROFESOR (dni)
on delete no action 
on update restrict;

insert into PROFESOR values 
('123456A','Jorge', 'Varela' ,'Jeiko','123123123a123123');

insert into departamento values
('1','INFORMATICA','1234567A');

delete from departamento where dni= 123455;

update profesor
	set dni = 123456B