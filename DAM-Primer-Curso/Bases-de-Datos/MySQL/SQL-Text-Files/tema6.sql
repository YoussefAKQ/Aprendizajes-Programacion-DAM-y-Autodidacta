show variables;

show variables like 'sql_mode';

select @@sql_mode;						#Esto es lo mismo que lo de arriba

show variables like '%transaction%';	#Todas las variables que incluyen la palabra transaction

show global variables;

show global variables like 'sql_mode';

show session variables;					#Enseña las variables de sesión, es lo mismo que show variables

show global variables like 'error_count';		#No hay globalmente

show session variables like 'error_count';		#Devuelve una

show variables like 'error_count';				#Show session es lo mismo que show solo, el diferente es global

show session variables like 'sql_safe_updates';

show global variables like 'sql_safe_updates';

show variables like 'sql_safe_updates';				#El que prevalece siempre es el de sesión

set session sql_safe_updates = OFF;

show session variables like 'sql_mode';				#Esto lo que hace es cuando haces un group by mal te da un error

set session sql_mode = replace(@@sql_mode, 'ONLY_FULL_GROUP_BY','');		#Quita el group by por nada('')

use employees;

select title, from_date
  from titles
 group by from_date
 limit 1;										#Esto está mal aunque ahora dé bien
 
show global variables like 'sql_mode';

set global sql_mode = replace(@@sql_mode, 'ONLY_FULL_GROUP_BY','');			#Ahora en global

show global variables like 'sql_mode';										#Ahora es diferente

set persist sql_mode = concat('ONLY_FULL_GROUP_BY,',@@sql_mode);

show global variables like 'sql_mode';

select database()
union
select current_user();

set @primera :=1, @segunda = 0, @tercera = 'tercera';
select @primera,@segunda,@tercera;

set @segunda = 'segunda';
select @primera, @segunda;

use employees;

set @nombre = (select first_name
			     from employees
				where emp_no = 33333);

set @apellido = (select last_name
			       from employees
				  where emp_no = 33333);

select @nombre, @apellido;

select first_name,last_name into @nombre, @apellido
  from employees
 where emp_no = 33334;

select @nombre, @apellido;

use world;

select name, region into @pais, @region
  from country									#Da bien porque almacena una cosa
 where Code = 'MEX';	

select @pais, @region;

select name, region into @pais, @region
  from country;									#Esto da error porque no puede almacenar tantas filas

create database prueba;

use prueba;

#hemos creado procedimientos de la pagina 19 

call prueba();			#Cuando haya parametros se ponen entre los paréntesis
						#Sin paréntesis funcuiba
                        #El hola mundo sale muy rápido y no da tiempo a verlo, en el cmd/pwrshl se ve mejor
                        #en el CMD al cambiar el alias del procedure el primer valor se vuelve el nombre

use world;
#creamos el prodecimiento variables de la pag 20

call variables(); #sin variables globales

call variables(); #con variables globales

select @codPais;		#Al hacerlo con variables globales y usar @ sí se puede ver luego

call variables_con_arroba;

select @v_con_arroba;		#Esto sí me da ya que la hemos declarado globalmente, no como sin @

use prueba;

#CREAMOS LA FUNCION DE LA PAG 22 pero añadimos antes de beggin la palabra DETERMINISTIC

select ComparaNumeros(9,5);

select ComparaNumeros(5,9);

select ComparaNumeros(5,5);

#Siempre que haya if hay que poner endif, en cambio con elseif no

select rand();

select rand()*10;

select truncate(rand()*10,0);

select truncate(rand()*10,0)+1;

#Hacemos el procedimiento de abajo
call nota_10_companeros();
#En el CMD se ve mejor

#INTO SE USA CUANDO TENGAMOS VARIAS COLUMNAS, SI NO SET 

#Hacemos el procedimiento de abajo de la página 24
call procedimiento_CASE;
#INTO V es para declarar la variable, es decir que se mete a v(la variable) la cual se declara antes

#Hacemos el procedimiento de abajo de la pag 25
call prueba_case(2);

call prueba_case(55555);

#in es un parametro de entrada, int que es un entero, con el when comprobamos el parametro

#Hacemos el procedimiento de la pagina 27
call prueba_WHILE();

#Hacemos el procedimiento de la pagina 29
call prueba_REPEAT(3);
USE PRUEBA;

#Hacemos el procedimiento de la pagina 31
call prueba_LOOP(20);

select curdate(), curtime(), now();

select date_format(curdate(), '%W %D %M %Y'); #W es week(día de la semana) D para day(día) M para month e Y para year

select date_format(curdate(), '%w %d %m %y');

select date_format(curdate(), '%W %d %M %y');

select date_format(curdate(), '%W-%D-%M-%Y');

use prueba;

select adddate(curdate(), interval 1 month) UN_MES_DESPUES,
	   date_add(curdate(), interval 1 week) UNA_SEMANA_DESPUES,
       subdate(curdate(), interval 1 month) UN_MES_ANTES,
       date_sub(curdate(), interval 1 week) UNA_SEMANA_ANTES;

select abs(-15), abs(15);	#ABS es absolute, valor absoluto, un valor absoluto es quitar el signo a un numero, de -3 es 3 y de +3 es 3 también

select ceil(-15.3), ceiling(15.3);	#El techo es un numero sin decimales y encima del numero que le pasamos
									#En -15.3 es el numero por encima de él, cuando es negativo se hace eso, se quitan los decimales simplemenete

select floor(-15.3), floor(15.3);	#Aquí es lo contrario, se coge menos al ser suelo

select (17/4);

select (4.25*4);

select 23/4;		#Esto da la divisón exacta

select 23 DIV 4;	#Esto da enteros sin el resto

select 23 % 4;		#El resto de 24/3

select mod(23,4);	#Da el resto también

select 23 mod 4; 	#Lo mismo

#al ser funciones se usa select y no call

select pow(2,4), pow(16,0.5);	#Pow es para elevar el primer número a la potencia del segundo número, 2 a la cuarta

select sqrt(256), sqrt(2.25); 		#Esto para la raíz cuadrada

select pow(27,1/3);

select rand(), rand(), rand();		#Random entre 0 y 1

select rand()*10, rand()*10, rand()*10;	#Nunca saldrá 10, es el top

select rand()*10+1, rand()*10+1, rand()*10+1;	#Puede salir 10

select truncate(rand()*10,0), truncate(rand()*10,0), truncate(rand()*10,0); #Con truncate le quitamos los decimales

select floor(rand()*10 + 1);

select ceiling(rand()*10);	#Nunca sale por debajo de 1 ni por encima de 10

select truncate(rand()*10,0);

select truncate(rand()*10,4);	#Salen 4 decimales

select truncate(rand()*10,2);	#Salen 2 decimales

select round(3.746,0), round(3.746,1), round(3.746,2);	#Redondear y le pongo cuantos decimales quiero
														#En el ultimo round como 6 es grande se redondea al mayor, de 3.746 pasa a 3.75
                                                        
select round(23.473,2), round(23.478,2);		#Si es 1,2,3,4 se resta y si sale 5,6,7,8,9 se suma
												#Nos basamos el el número siguiente para redondear

select truncate(3.746,0), truncate(3.746,1), truncate(3.746,2);

select round(427,-1);	#Redondea a las decenas

select truncate(427,-1);

select length('hola mundo'); 	#Para ver la cantidad de caracteres

select concat('hola',' ','mundo');	#Concat es lo mismo que + en python

select substr('hola mundo', 3), right('hola mundo', 3), left('hola mundo', 3);	#La pos 3 está incluida

select locate('mundo', 'hola mundo'),		#Busca mundo en la cadena hola mundo
	   position('mundo' in 'hola mundo'), 	#Es lo mismo que locate pero con otra sintaxis 
       instr('hola mundo', 'mundo');		#Al revés que en locate

select ltrim('   hola'), rtrim('mundo   '), trim('   adios mundo     ');
#trim significa podar, quita los caracteres en blanco básicamente

select lcase('Hola'), lower('Mundo'), 	#Convertir a minúsculas
	   ucase('Hola'), upper('Mundo');	#Convertir a mayúsculas

select reverse('odnum aloh');	#Invertir una cadena

select reverse('hola mundo');

select repeat('hola',3);	#Repite esa cadena el número de veces que pongamos

select rpad('hola', 8 ,'*%'), lpad('mundo', 9, '*%'); #Esto rellena hasta la pos 8 los caracteres que ponemos a continuación

select replace('hoola mundoo','oo','o');	#Sustituye en la primera cadena lo segundo con lo primero
/* Cuidado aquí que se va todo a la mierda cuando haces esto y no deja hacer control enter
#Hacemos el procedimiento de la pagina 45
call procedimiento_NombrePais('USA', @nombrePais);

select @nombrePAIS;

call procedimiento_NombrePais('ESP', @nombrePais);

select @nombrePAIS;

#Creamos el procedimiento de la pagina 47
set @p_INOUT = 8;

select @p_OUT, @p_INOUT;

CALL PR_clases_de_parametros(1, @p_OUT, @p_INOUT);

select @p_out, @p_INOUT;

#Creamos el procedimiento de la pagia 48
select database();

call PR_parametro_IN(4); #Sale 4 y al instante 5

#Hacemos el procedimiento de la pagina 51
set @p_INOUT = null;

select database();

call PR_parametro_INOUT(@p_INOUT);

select @p_INOUT;

call PR_parametro_INOUT(@p_INOUT);

drop procedure if exists holaquetal_hola;	#NO da error

drop procedure holaquetal_hola;	#Da error

SET GLOBAL log_bin_trust_function_creators = 0;

delimiter $$							
CREATE FUNCTION funcion_nosql(a int, b int) RETURNS int
BEGIN
	select 1, 2 into a, b;
RETURN 1;
END $$
delimiter ;			#da error sin no sql

delimiter $$
CREATE FUNCTION funcion_nosql(a int, b int) RETURNS int
	DETERMINISTIC
BEGIN
	select 1, 2 into a, b;
RETURN 1;
END $$
delimiter ;			#bien, devuelve siempre 1

#Podemos meternos en la función y cambiar DETERMINISTIC por NO SQL y va bien o podemos borrar la funcion y volver a crearla con eso mismo cambiado
drop function if exists funcion_nosql; 	#Prueba a ejecutarlo rodeando en azul

delimiter $$
CREATE FUNCTION funcion_nosql(a int, b int) RETURNS int
	NO SQL
BEGIN
	select 1, 2 into a, b;
RETURN 1;
END $$
delimiter ;			#bien, devuelve siempre 1

drop function if exists funcion_nosql;

delimiter $$
CREATE FUNCTION funcion_nosql(a int, b int) RETURNS int
	READS SQL DATA
BEGIN
	select 1, 2 into a, b;
RETURN 1;
END $$
delimiter ;			#bien, devuelve siempre 1

*/
#CREAMOS EL PROCEDIMIENTO DE LA PAGINA 56
use prueba;
call prueba_comandos_y_sentencias();

#Desde 56 a 60 no he podido avanzar en clase por un bug, hazlo

#Pagina 60 abajo
use employees;

select first_name into @nombre_empleado
  from employees limit 1;

select @nombre_empleado;


select first_name into @nombre_empleado
  from employees limit 2;	#DA ERROR PORQUE DEVUELVE MÁS DE UNA LINEA
							#SELECT INTO SOLO VA CUANDO DEVUELVE UNA FILA NADA MÁS
select @nombre_empleado;

use employees;
#Creamos el procedimiento de la página 62 

call tres_primeros_departamentos();		#hace 3 pero no da tiempo a ver

#Creamos el procedimiento de la página 64

call cinco_primeros_departamentos();	#hace 5 pero no da tiempo a ver

#Abajo desde pagina 77
select name, district
  from city
 group by district;						#Da error de sintaxis porque name no está en el grou pby
 
use prueba;

create table Etiqueta_Articulo (
	articulo_id int,
    etiqueta_id int,
    primary key (articulo_id, etiqueta_id)
);

insert into Etiqueta_Articulo values (100,30);

select *
  from city ci
  join country co on ci.CountryCode = co.Code
 where co.LocalName = 'Ireland/Éire';
 
select * 
  from country;
  

