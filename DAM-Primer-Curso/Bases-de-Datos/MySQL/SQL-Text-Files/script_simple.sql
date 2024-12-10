use employees;
select count(*) into @num_empleados
  from employees;

use world;
select count(*) into @num_paises
  from country;

select @num_empleados as empleados,
       @num_paises as paises;