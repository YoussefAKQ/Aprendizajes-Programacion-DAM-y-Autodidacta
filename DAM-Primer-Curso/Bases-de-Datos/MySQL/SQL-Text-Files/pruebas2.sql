use sakila;

select rating, special_features, count(*)
  from film
 where title like 'Tr%'
 group by rating, special_features
 order by 1 ASC, 2 ASC, 3 DESC;

#------------------------------------------------------------------------------------

use employees;

drop table empleado;

create table empleado as
(select emp_no DNI, first_name Nombre, last_name Apellido,
		gender Genero, 10000 as DNI_JEFE
   from employees 
  order by 1
  limit 1000);
  
  alter table empleado modify column DNI_JEFE int null;
  
  alter table empleado add primary key(DNI);
  
  update empleado
     set DNI_JEFE = null
   where DNI in (10001,10501);

update empleado 
   set DNI_JEFE = 10001
 where DNI between 10002 and 10500;

update empleado 
   set DNI_JEFE = 10501
 where DNI between 10502 and 11000;
 
alter table empleado add constraint DNI_JEFE_FK
foreign key (DNI_JEFE) references empleado(DNI);

select trabajador.*, jefe.*
  from empleado trabajador, empleado jefe
 where trabajador.DNI_JEFE = jefe.DNI
   and trabajador.DNI in (10002, 10500);

select trabajador.*, jefe.*
  from empleado trabajador, empleado jefe
 where trabajador.DNI_JEFE = jefe.DNI
   and trabajador.DNI in (10502, 11000);
#------------------------------------------------------------------

select first_name, last_name, count(*)
  from employees
  group by first_name, last_name
  having count(*) >4
  order by 3 DESC;

select first_name, last_name, emp_no
  from employees
 where emp_no in (select emp_no, salary
					from salaries
				   where salary =(SELECT MAX(salary) FROM salaries));
  

#Ejercicio típico de examen pagina 71

use world;

select *
  from city
 where CountryCode = (select Code
						from country
					   where LocalName = 'Portugal');

select *
  from city
 where CountryCode in (select Code
						from country
					   where LocalName = 'Portugal');
                       
select *
  from city
 where CountryCode <> (select Code
						from country
					   where city.name = 'Toledo'
                         and LocalName = 'España');

select *
  from city
 where name = 'Toledo'
   and CountryCode <> (select code
						 from Country
						where LocalName='España');


use employees;

select current_date();

select count(*)
  from employees
 where birth_date < (select subdate(currentdate(), interval 69 year));
 
 select subdate(current_date(),interval 71 year);
 
 select count(*)
   from employees
  where birth_date>=(select subdate(current_date(),interval 59 year));
  
use world;

select LocalName, continent, region
  from country
 where Code in (select CountryCode
			      from countrylanguage
				 where language = 'Portuguese')
   and Continent = 'Africa';
   
select LocalName, continent
  from country
 where Code not in (select CountryCode
			      from countrylanguage
				 where language = 'Spanish')
   and Continent = 'South America';

#EJER 13

use employees;

select e.first_name, e.last_name, s.salary
  from employees e
  join salaries s on e.emp_no = s.emp_no
 where s.salary = (select max(salary) from salaries);

use employees;

#EJERCICIO 18
use sakila;
select count(*)
  from address
 where address2 is not null
 union all
select count(address2)
  from address;
  

use world;

select co.name, cl.language
  from country co
  join countrylanguage cl 
 where cl.language ='SPANISH';

























