use departamento_universidad;

create table Empleado (
	NumSS	VARCHAR(12) primary key,
	DNI		VARCHAR(9) unique key,
	Nombre	VARCHAR(20) NOT NULL,
	Ap1 	VARCHAR(20) NOT NULL,
	Ap2 	VARCHAR(20)
);

create table Familiar (
	DNI		VARCHAR(9) primary key,
    Nombre	VARCHAR(20) not null,
    Ap1		VARCHAR(20) not null,
    Ap2		VARCHAR(20),
    DNI_empleado	VARCHAR(12),
    constraint Familiar_Empleado_FK
    foreign key (DNI_empleado) references Empleado (DNI)
    );

create table PROFESOR (
	DNI		VARCHAR(9),
    Nombre	VARCHAR(20) not null,
    Ap1		VARCHAR(20) not null,
    Ap2		VARCHAR(20) not null,
    NumSS	VARCHAR(20) not null,
    constraint PROFESOR_PK primary key (dni),
    constraint PROFESOR_UK unique key (NumSS)
    );

create table DEPARTAMENTO (
	CodDep	NUMERIC(2),
    Descripcion	VARCHAR(40) NOT NULL,
    dniJefe		VARCHAR(9) NOT NULL,
    constraint DEPARTAMENTO_PK primary key (CodDep)
    );
    
alter table DEPARTAMENTO add constraint DEPARTAMENTO_PROFESOR_FK
foreign key (dniJefe) references PROFESOR (dni)
on delete no action 
on update restrict;             #estas dos filas es como si no pusiesemos nada

insert into profesor values
('234567898','Alanis','Ruiz','Sorolla','1230912809098123908'),
('123456678','Kevin','Salinas','Droncuy','19828091320891309');               #esto es para meter valores en la tabla

insert into departamento values						#aqui metemos el jefe
('1','INFORMATICA','234567898');

select * from departamento;   #esto es para ver lo de dentro de esta tabla, los valores

select * from profesor;

delete from profesor where dni="123456678";                #PODEMOS ELIMINAR YA QUE NO ES JEFE 

delete from profesor where dni="234567898"; 				#NO PODEMOS YA QUE SI ES JEFE, foreign key es la que salva

insert into profesor values
('987644','Santiago','Restrepo','Cono','65487975');

update profesor									#update es para actualizar, modificar
	set dni = '654987'
    where dni = '987644';                       #esto es para cambiar un dni a otro

update profesor									#HEMOS PUESTO UPDATE RESTRICT, NO VA A IR, NO DEJA LA FK
	set dni = '23456789V'
    where dni = '234567898';
    
alter table DEPARTAMENTO drop constraint DEPARTAMENTO_PROFESOR_FK;				