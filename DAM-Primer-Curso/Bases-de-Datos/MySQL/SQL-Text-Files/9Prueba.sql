create database Deportes;

use Deportes;

create table Deportista (
	documento VARCHAR(15) PRIMARY KEY,
    nombre VARCHAR(20) NOT NULL,
    ap1 VARCHAR(20) NOT NULL,
	ap2 VARCHAR(20) 
);

create table Equipo (
	codigo NUMERIC(10) PRIMARY KEY,
    nombre VARCHAR(20) NOT NULL,
    deporte VARCHAR(20) NOT NULL
);

ALTER TABLE Deportista ADD COLUMN codEquipo NUMERIC(10) NOT NULL;  

ALTER TABLE Deportista ADD CONSTRAINT Deportista_Equipo_FK FOREIGN KEY(codEquipo) references Equipo (codigo) 
on delete restrict
on update no action;

insert into Deportista values 
('12345678A','Lionel','Messi',NULL,'1');                #Esto es normal que dé error al principio por la FK

insert into Equipo values
(1,'PSG','Futbol'),                                     #Los datos númericos no necesitan comillas
(2,'AtleticoDeMadrid','Futbol');

select * from Equipo;

insert into Deportista values
('12345678A','Kilyan','Mbappe',NULL,1);					#Ahora no da error porque existe el equipo codEquipo 1

insert into Deportista values
('23456789B','Samuel','Lino',NULL,2);

select * from Deportista;

delete from Equipo where codigo=2;						#Por la opción de restrict no nos va a dejar, ya que de este depende Samuel Lino

delete from Deportista where documento='23456789B';		#No va a haber nada que me impida borrar a Samuel Lino

select * from Deportisa; 								#Solo sale Kilyan Mbappe

delete from Equipo where codigo=2;						#Al no estar Samuel, ya podemos eliminar el atletico

select * from Equipo;

update Equipo set nombre='Paris Saint Germain' where codigo=1;

select * from Equipo; 

update Equipo set codigo=1111 where codigo=1;			#Esto va a dar error por el update no action

ALTER TABLE Deportista drop constraint Deportista_Equipo_FK;

ALTER TABLE Deportista ADD CONSTRAINT Deportista_Equipo_FK FOREIGN KEY(codEquipo) references Equipo (codigo);
#A la izquierda en schemas podemos ver que la FK de la tabla Deportista es RESTRICT en on delete y on update

ALTER TABLE Deportista ADD CONSTRAINT Deportista_Equipo_FK FOREIGN KEY(codEquipo) references Equipo (codigo) 
on delete cascade
on update cascade;
#Ahora en ambos pone cascade

insert into Equipo values
(2,'Inter de Miami','Futbol');							#Aqui no podemos usar el codigo uno por la primary key

select * from Equipo;

insert into Deportista values
('87654321Z','Lionel','Messi',NULL,2);

select * from Deportista;

delete from Equipo where codigo=2;							#Cascade es el sicario que mata primero a los niños y luego mata a los padres
															#Con la secuencia de arriba hace 2 cosas, borra a Messi y al Equipo

select * from Deportista;

update Equipo set codigo=1111 where codigo=1;				#Al estar en update cascade me cambia el codigo del equipo y automaticamente me cambia el cod de equipo en Kilyan

select * from Equipo;

select * from Deportista;

alter table Deportista drop constraint Deportista_Equipo_FK;

alter table Deportista ADD CONSTRAINT Deportista_Equipo_FK FOREIGN KEY(codEquipo) references Equipo (codigo)
on delete SET NULL
on update SET NULL;											#No va a dejar porque la columna es NOT NULL

desc Deportista;

alter table Deportista modify column CodEquipo NUMERIC(10); 			#PUEDO NO PONER NADA O NULL

desc Deportista;

alter table Deportista ADD CONSTRAINT Deportista_Equipo_FK FOREIGN KEY(codEquipo) references Equipo (codigo)
on delete SET NULL
on update SET NULL;											#Ahora sí vamos a poder

delete from Equipo where codigo=1111;						#La columna de Kilyan Mbappe la va a dejar nula

select * from Equipo;										#Ahora está vacía la tabla de equipo

select * from Deportista;									#La columna de CodEquip de Mbappe está a NULL

desc Equipo;

insert into Equipo values
(1,'Real Madrid','Futbol');

select * from Equipo;										#Está el RM

update Deportista set codEquipo=2 where documento='12345678A';		#Da error porque no hay ningún código 2, la FK no lo permite

update Deportista set codEquipo=1 where documento='12345678A';		#Deja porque el equipo 1 existe

update Equipo set codigo=33 where codigo=1;							#No hay nada que me lo impida, sin embargo, ahora a Mbappé se le va a poner NULL debido a la FK que hemos creado