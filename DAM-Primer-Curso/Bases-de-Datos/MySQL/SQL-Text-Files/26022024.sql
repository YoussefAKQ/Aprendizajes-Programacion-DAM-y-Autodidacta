select *
  from Ciudad;

set session transaction isolation level read committed;

start transaction;

select * from Ciudad;

start transaction;
update Ciudad
set CodCiudad = 9
where CodCiudad = 99;
commit;
select * from Ciudad;

set session transaction isolation level repeatable read;
start transaction;
select * from Ciudad;

start transaction;
update Ciudad set Nombre = 'San Sebastián' where CodCiudad = 6;
commit;
rollback;
select * from Ciudad;

set session transaction isolation level read committed;
delete 
  from Ciudad
 where CodCiudad = '12';
 select * from Ciudad;

select *
  from Ciudad;
  
delete 
  from Ciudad
 where CodCiudad = 12;

commit;
set session transaction isolation level read committed;
select *
  from Ciudad;
  
rollback;

delete 
  from Ciudad 
 where CodCiudad = 12;
 
 commit;

set session transaction isolation level serializable;
start transaction;
select * from Ciudad;

rollback;

use employees;

#Repaso examen
#Escribe una consulta que muestre en una columna y dos filas el numero de filas de employees y departments
select count(*)
  from employees
union
select count(*)
  from departments;				#tiene que dar la misma cantidad de filas
  
#Select antes del from:
select (select count(*)
		  from employees) as Contar,
	   (select count(*)
          from departments) as Ola
  from dual;
  
#Ejemplo UNION
select count(*), 'hola'
  from employees
UNION
select count(*), 'adios'
  from departments;				#Prueba a hacer cosas

#Repasar group by
#Vamos a contar cuantas ciudad tiene cada región, district es región
use world;

select  District, count(*)
  from city
 where CountryCode = 'BRA'
 group by District;

select district, Population,  count(*)
  from city
 where CountryCode = 'BRA'
 group by District;						#Si añades Population por ejemplo se va a la mierda porque no sabe a que city se refiere
 
select district, SUM(Population),  count(*)
  from city
 where CountryCode = 'BRA'
 group by District;						#SUMA todas las citys
 
 select district, AVG(Population),  count(*)
  from city
 where CountryCode = 'BRA'
 group by District;						#Saca el promedio de las ciudades
 
 select district, AVG(Population),sum(population)/count(*)
  from city
 where CountryCode = 'BRA'
 group by District;						#Da lo mismo
 
select district, MAX(Population),MIN(Population), count(*)
  from city
 where CountryCode = 'BRA'
 group by District;		
 
 #Order by
select district, MAX(Population),MIN(Population), count(*)
  from city
 where CountryCode = 'BRA'
 group by District
 order by 2 DESC;		

select district, MAX(Population),MIN(Population), count(*)
  from city
 where CountryCode = 'BRA'
 group by District
 order by 4 DESC, 1 asc;			#el uno es para que ordene alfabéticamente también

  select district, MAX(Population),MIN(Population), count(*)
  from city
 where CountryCode = 'BRA'
 group by District
 order by 3 DESC;
 
select district, MAX(Population),MIN(Population), count(*)
  from city
 where CountryCode = 'BRA'
 and count(*) > 25
 group by District
 order by 4 DESC, 1 asc;			#da error, having tiene que estar, no el and

select district, MAX(Population),MIN(Population), count(*)
  from city
 where CountryCode = 'BRA'
 group by District
 having count(*) > 25
 order by 2 DESC, 1 asc;			
 

select district, MAX(Population),MIN(Population), count(*)
  from city
 where CountryCode = 'BRA'
   and District like 'S%'
   and SUM(Population) >5000000
 group by District
 order by 2 DESC, 1 asc;			#having para funciones de agrupacion
 

#JOINS
use employees;
#Obtener con 2 subconsultas anidadas el numero de empleadas del departamento de marketing
   
#LA MANERA BUENA:
select count(*)
  from employees
 where emp_no in (select emp_no
				    from dept_emp
				   where dept_no in (select dept_no
                                       from departments
									  where dept_name = 'Marketing'))
									and gender = 'F';					#EN CASO DE DUDA IN
                                    
#Obtener con join pero sin escribir JOIN
select count(*)
  from employees e, dept_emp d, departments de
 where e.emp_no = d.emp_no
   and d.dept_no = de.dept_no
   and dept_name = 'Marketing'
   and gender = 'F';
 
												#ambiguedad es que no sabe de que tabla es
#Obtener con join:
select count(*) 
  from employees e
  join dept_emp d on e.emp_no = d.emp_no
  join departments de on de.dept_no = d.dept_no  
 where e.gender = 'F'
   and de.dept_name = 'Marketing';