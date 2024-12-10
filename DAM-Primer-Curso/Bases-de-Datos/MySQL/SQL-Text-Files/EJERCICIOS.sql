#Ejercicio 16
use sakila;
select title, description
  from film 
 where description like '%MySQL%'
   and description like '%Mad Scientist%'
 order by title ASC;
 
#Ejercicio 7 "Supuestamente 8"
use sakila;
select count(*) as rental_return_null
  from rental
 where customer_id = 155
   and return_date is null;

#Ejercicio 19
use sakila;
select
		(select count(*) as rental_return_null
		   from rental
		  where customer_id = 155
		  and return_date is null
          ) as Rental_es_NULL,
		(select count(*) as rental_return_null
		   from rental
		  where customer_id = 155
		  and return_date is not null
		)as Rental_No_NULL;



#Ejercicio 20
use sakila;
select a.last_name Apellido, a.first_name Nombre
  from actor a
  join film_actor fa on a.actor_id = fa.actor_id
  join film fi on fa.film_id = fi.film_id
 where fi.title like 'Panic Club'
 order by a.last_name ASC, a.first_name ASC;

#Ejercicio 18 tema 5
use employees;

create table ultimos_mil_empleados as
select *
  from employees
  order by hire_Date desc
  limit 1000;

set sql_safe_updates = 0;

delete 
  from ultimos_mil_empleados
 where emp_no in (select emp_no
				     from dept_emp
					where dept_no = 'd008')
 and gender = 'M';
 
 select count(*)
   from ultimos_mil_empleados;
 
#Ejercicio 19 tema 5
use sakila;

create table Pagos
	as select *
         from payment;

update Pagos
   set amount = (amount)*2
 where amount is not null
   and payment_date between '2006-02-01' and '2006-02-28'
   and staff_id in (select staff_id
					  from staff
					  where username = 'Jon'
   and store_id in (select store_id
					  from store
					where store_id = 2));

select count(*)
  from pagos;
  
use employees;

###########################################################################################
#Ejercicio 18 tema 5
use employees;

create table ultimos_mil_empleados as
select *
  from employees
  order by hire_date desc
  limit 1000;

set sql_safe_updates = 0;

delete 
  from ultimos_mil_empleados
 where emp_no in (select emp_no
				     from dept_emp
					where dept_no = 'd008')
 and gender = 'M';
 
 select count(*)
     from ultimos_mil_empleados
 where emp_no in (select emp_no
				     from dept_emp
					where dept_no = 'd008')
 and gender = 'M';

###########################################################################################
#Ejercicio 3 tema 6
use employees;

call datos_Kristina_Perez();
###########################################################################################
#Ejercicio 4 tema 6
use world;

show variables like 'sql_mode';

set session sql_mode = replace(@@sql_mode, 'ONLY_FULL_GROUP_BY','');

show variables like 'sql_mode';

select name, district
  from city
 where CountryCode = 'PRT'
 group by district;

set session sql_mode = concat('ONLY_FULL_GROUP_BY,',@@sql_mode);

show variables like 'sql_mode';

select name, district
  from city
 where CountryCode = 'PRT'
 group by district;
 
 ###########################################################################################
#Ejercicio 5 tema 6
use prueba;

select ComparaNumeros_CASE(8,8);
 ###########################################################################################
#Ejercicio 6 tema 6
use prueba;

call procedimiento_IF();

 ###########################################################################################
#Ejercicio 7 tema 6
use prueba;

call ComparaNumeros(7,2);
 ###########################################################################################
#Ejercicio 8 tema 6
use employees;

create table empleado as 
(select emp_no DNI, first_name Nombre, last_name Apellido,
	    gender Genero, 1000 as DNI_JEFE
   from employees
  order by 1
  limit 1000);
  
alter table empleado modify column DNI_JEFE int null;

alter table empleado add primary key(DNI);

update empleado
   set DNI_JEFE = null
 where DNI in (10001, 10501);

update empleado
   set DNI_JEFE = 10001
 where DNI between 10002 and 10500;
 
update empleado 
   set DNI_JEFE = 10501
 where DNI between 10502 and 11000;

alter table empleado add constraint DNI_JEFE_FK
foreign key (DNI_JEFE) references empleado(DNI);

call procedimiento_join_consigo_misma(10765);

 ###########################################################################################
#Ejercicio 9 tema 6
use prueba;

call procedimiento_dias_semana('2024-03-31');
 ###########################################################################################
#Ejercicio 10 tema 6
use employees;
/*
DELIMITER $$
CREATE FUNCTION salario_medio() RETURNS float
	DETERMINISTIC
BEGIN
	DECLARE promedio float;
	set promedio = (select  avg(salary) from salaries);
RETURN round(promedio,2);
END $$
delimiter ;
*/
set global log_bin_trust_function_creators = 0;

select salario_medio();
 ###########################################################################################
#Ejercicio 11 tema 6
use employees;

DELIMITER $$
CREATE FUNCTION salario_maximo_departamento(p_nombre_departamento varchar(100)) RETURNS float
	DETERMINISTIC
BEGIN
	declare salariomaximo int;
	select MAX(salary) into salariomaximo
      from salaries s
	join dept_emp de on s.emp_no = de.emp_no
    join departments d on de.dept_no = d.dept_no
    where d.dept_name = p_nombre_departamento;
	RETURN salariomaximo;
END $$
DELIMITER ;

select salario_maximo_departamento('Marketing');
select salario_maximo_departamento('Customer Service');
select salario_maximo_departamento('Development');
select salario_maximo_departamento('Finance');
select salario_maximo_departamento('Human Resources');
select salario_maximo_departamento('Production');
select salario_maximo_departamento('Quality Management'); 
select salario_maximo_departamento('Research');
select salario_maximo_departamento('Sales');
###########################################################################################
#Ejercicio 12 tema 6
use employees;

call cuatro_primeros_departamentos();
###########################################################################################
#Ejercicio 13 tema 6
use world;

set @p_numCiudades = 0;
call ciudades_del_pais('España', @p_numCiudades);
select @p_numCiudades;
###########################################################################################
#Ejercicio 14 tema 6
use employees;

create table departamentos as select * from departments where 1 = 0;

alter table departamentos add salario_maximo NUMERIC(12,2) NOT NULL;

call inserta_salarios_maximos_departamentos();

select * 
  from departamentos
 order by dept_no ASC;
 ###########################################################################################
#Ejercicio 15 tema 6
use employees;

call cinco_primeros_departamentos();
 ###########################################################################################
#Ejercicio 16 tema 6
use prueba;

select ComparaNumerosSinELSEIF(2,3);
select ComparaNumerosSinELSEIF(3,3);
select ComparaNumerosSinELSEIF(3,2);
 ###########################################################################################
#Ejercicio 16 tema 6
use sakila;

create table ventas_en_tienda as (select * from sales_by_store);

set @nuevas_ventas_en_tienda = 0;

CREATE TRIGGER tr_ventas_en_comercios
BEFORE INSERT ON ventas_en_tienda FOR EACH ROW
set @nuevas_ventas_en_tienda = @nuevas_ventas_en_tienda + NEW.total_sales;

INSERT INTO ventas_en_tienda VALUES
('Ponce, Puerto Rico', 'Damaris Hernandez', 30000),
('Alcobendas, Spain', 'Julian Garitano', 32000);

select @nuevas_ventas_en_tienda;

 ###########################################################################################
#Ejercicio 18 tema 6
use world;

create table paises as (select * from country);

create table ciudades as (select * from city);

DELIMITER $$
CREATE TRIGGER tr_peninsula_iberica
BEFORE UPDATE ON CIUDADES FOR EACH ROW
BEGIN
	IF (OLD.countrycode='ESP') THEN
		UPDATE paises set region = 'Iberia' WHERE name IN ('Spain','Portugal','Andorra','Gibraltar');
    END IF;
END$$
DELIMITER ;

update ciudades set district = 'Catalunya'
where district = 'Katalonia';

select *
  from paises
 where region = 'Iberia';
 ###########################################################################################
#Ejercicio 19 tema 6
use ebanca;

set global log_bin_trust_function_creators = 1;

DELIMITER $$
CREATE FUNCTION existe(entrada DATE) RETURNS TINYINT
BEGIN
	DECLARE resultado TINYINT DEFAULT 0;
		SELECT 1 INTO resultado FROM idia WHERE fecha = entrada;
	RETURN resultado;
END $$
DELIMITER ;

select existe('2024-05-08');

select existe();

create table idia
(cantidad INT,
 fecha 	  DATE);
 
insert into idia values
(10, '2030-05-10');

select * from idia;
 ###########################################################################################
#Ejercicio 20 tema 6
use ebanca;


DELIMITER $$
CREATE TRIGGER ingreso_dia
AFTER INSERT ON movimiento
FOR EACH ROW
BEGIN
	IF existe(NEW.fechahora)=0 THEN
		INSERT INTO idia(cantidad,fecha)
        VALUES(NEW.cantidad, NEW.fechahora);
	ELSE
		UPDATE idia SET cantidad=NEW.cantidad+cantidad
        WHERE fecha=NEW.fechahora;
	END IF;
END$$
DELIMITER ;

insert into movimiento values
('99999999','2100-05-10',15,23,2);

select * 
  from idia;

desc movimiento;

 ###########################################################################################
#Ejercicio 21 tema 6
use ebanca;

select * 
  from cuenta;






