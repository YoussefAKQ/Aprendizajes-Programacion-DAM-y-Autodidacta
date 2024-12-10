use sakila;

select * 
  from language
 where language_id in (select language_id 
						 from film);

select * 
  from language
 where language_id not in (select language_id 
						 from film);

select count(*)
  from film;

select distinct count(*) language_id
  from film;

select * 
  from language
 where language_id not in (select distinct language_id 
						 from film);

use employees;

select *
  from employees
 where emp_no in (select emp_no
                    from dept_emp
				   where dept_no  in (select dept_no			#en vez de in debería también ir el =
									   from departments
									  where dept_name = 'Finance'));

use world;

select * 
  from city
 where CountryCode in (select code
						 from country
						where LocalName !='España')
						  and city.name = 'Córdoba';

select District, count(*)
  from city
 group by District 
having count(*) > (select count(*)
                     from city
					where CountryCode = 'ESP');
 
 #join es para consultas de más de una tabla
select a.first_name Nombre, 
	   a.last_name Apellido, 
	   a.gender Genero, 
	   'Ventas' Departamento
  from employees a
  join dept_emp b on a.emp_no = b.emp_no
  join departments c on b.dept_no = c.dept_no
where c.dept_name = 'Sales'
  and a.first_name like 'Ma%'
  and a.last_name like 'San%'
order by 2, 1, 3;

select a.first_name Nombre, 
	   a.last_name Apellido, 
	   a.gender Genero, 
	   if (c.dept_name, 'Sales', 'Ventas') Departamento
  from employees a
  join dept_emp b on a.emp_no = b.emp_no
  join departments c on b.dept_no = c.dept_no
where c.dept_name = 'Sales'
  and a.first_name like 'Ma%'
  and a.last_name like 'San%'
order by 2, 1, 3;

select a.first_name Nombre, 
	   a.last_name Apellido, 
	   a.gender Genero, 
	   if (c.dept_name, 'Finance', 'Finanzas') Departamento
  from employees a, dept_emp b, departments c
 where a.emp_no = b.emp_no
   and b.dept_no = c.dept_no
   and c.dept_name = 'Finance'
   and a.first_name != 'M%'
   and a.last_name like 'Jon%'
 order by 2, 1, 3;
 
 
 use employees;

#si la palabra select aparece una vez es que no hay subconsulta, si aparece varias veces sí que hay subconsulta
select a.*
  from employees a
  join dept_emp b on a.emp_no = b.emp_no
  join departments c on b.dept_no = c.dept_no
 where c.dept_name = 'Finance';
 
 #está mal el de abajo
 select a.*
   from employees a, dept_emp b, departmets c
   where a.emp_no = b.emp_no
   and b.dept_no = c.dept_no
   and c.dept_name = 'Finance';
   
   
   
use world;

select name 
  from country
 where name like 'A%'
   and name not like '%A';
   
use world;

select LocalName, continent
  from country as Pais
 where exists (select Language
                 from countrylanguage
				where Pais.Code = CountryCode
                  and Language = 'Portuguese')
	   and continent = 'Africa';
       
select LocalName, continent
  from country as Pais
 where not exists (select Language
                 from countrylanguage
				where Pais.Code = CountryCode
                  and Language = 'Portuguese')
	   and continent = 'Africa';

use employees;

select distinct birth_date
  from employees
 where birth_date > all (select '1965-01-31'
						   union
						  select '1965-01-30');

select *, (select max(salary) from salaries) as SALARIO_MAXIMO
  from salaries where emp_no = 10012;

select *, (select max(salary)
			 from salaries as a
			where a.emp_no = b.emp_no) as Maxsueldo
  from salaries as b
 where emp_no = 10012;
 
 select Nombre, Apellido, Genero, Salarios.salary Salario
from(select a.emp_no, a.first_name Nombre, a.last_name Apellido, a.gender Genero, c.dept_name
  from employees a, dept_emp b, departments c
 where a.emp_no = b.emp_no
   and b.dept_no = c.dept_no
   and c.dept_name = 'Development') as Empleados_desarrollo, salaries as Salarios
where Empleado_desarrollo.emp.no = Salarios.emp_no;
