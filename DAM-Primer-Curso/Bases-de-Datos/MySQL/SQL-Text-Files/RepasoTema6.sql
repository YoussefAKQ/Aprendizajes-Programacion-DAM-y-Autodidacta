show variables;						##Ver variables predefinidas por mysql

show variables like 'sql_mode';		#Ver el valor de dicha variable

show variables like '%transaction%';	#Ver todas las variables que tengan esa palabra

#Hay 2 tipos de variables, las globales y las de sistema,

show global variables;				#Así se ven las globales

#La variable sql_mode se define a nivel global

show session variables;			#Variables de sesión

show session variables like 'error_count';	#Solo existe a nivel de sesión

#Aquí abajo podemos observar en los 2 shows que el valor pueden ser distintos
show session variables like 'sql_safe_updates';

show global variables like 'sql_safe_updates';

set global sql_safe_updates = ON;		#se modifica con set y con =

set session sql_safe_updates = OFF;

show session variables like 'sql_mode';	#Podemos ver que la variable impide a only_full_group_by usar columnas que no sean del agrupamiento

use employees;
select title, from_date
  from titles
 group by from_date
 limit 1;
#Como vemos arriba no deja, da un error

#Sin embargo se puede modificar para que no pase eso
set session sql_mode = replace(@@sql_mode, 'ONLY_FULL_GROUP_BY','');
#Para cambiar ese valor en específicamente es con replace, sqlmode, la variable y sustituir por "nada"
select title, from_date
  from titles
 group by from_date
 limit 1;
#Como podemos observar ahora sí que permite hacer este select

#No seleccionamos ninguna base de datos
select database()
union
select current_user();

#Definimos 3 variables con set y las leemos con select
set @primera = 1, @segunda = 0, @tercera = 'tercera';
select @primera, @segunda, @tercera;

#Podemos modificarlas simplemente dándolas otro valor
set @segunda = 'segunda';
select @primera, @segunda;

use employees;

#Ahora vamos a definir unas variables como un select de la base de datos de employees

set @nombre = (select first_name
				 from employees
				where emp_no = 33333);

set @apellido = (select last_name
				   from employees
				  where emp_no = 33333);

select @nombre, @apellido;
#Como podemos observar podemos meter select enteras dentro de las variables con set

#Hay otra manera mejor para meter valores en variables que es haciendo un select normal pero con un into arriba
use world;
select name, region into @pais, @region
  from country
 where Code = 'MEX';

select @pais, @region;

select name, region into @pais, @region
  from country;								#Con esta consulta da un error debido a que no puede almacenar una variable que tiene muchas filas

#También podemos ejecutar scripts con source

#Las subrutinas. Funciones, Procedimientos, Triggers, Eventos;
#Toda subrutina debe tener begin y end

use prueba;
#Creamos el procedimiento de la página 19
call prueba();				#Ejecuta 2 select este procedimiento pero va tan rápido que no da tiempo a ver el primero

#Ahora vamos a declarar variables para poder usarlas en el procedimiento, esto se hace con declare
use world;
#Creamos el procedimiento de la página 20, en este procedimiento creamos variables como antes pero las definimos dentro del mismo procedimiento
call variables();

#Ahora vamos a crear un procedimiento que usa una variable de usuario(variables con @), las de @ no hace falta declararlas, solo definir el valor
use prueba;
#Creamos el procedimiento de la página 21
call variables_con_arroba;

#Estructuras de control de flujo (if - then - elseif - then - else - end if)
#Siempre que haya un IF tiene que acabar con un END IF, y es recomendable usar ELSEIF si hay más de 2 casos posibles, también se tiene que poner THEN después de cada IF
SET GLOBAL log_bin_trust_function_creators = 1;		#Esto lo creamos para "fiarnos" de los creadores de variables y para así poder crearla
#Creamos el procedimiento de la página 22, CONCAT es para unir cadenas
select ComparaNumeros(5,9);
select ComparaNumeros(22,9);
select ComparaNumeros(3,3);

#También existen las sentencias case - when - then - else - end case
#Me he quedado en la página 24
use prueba;
#Creamos el procedimiento de la página 24
#Los CASE son como los if-else, son condiciones que usan when simplemente, rand es random entre el 10 y el 0
call procedimiento_CASE();

#Creamos el procedimiento de la parte inferior de la página 25
#En este procedimiento usamos el case pero de otra manera, en vez de poner la variable después de case, ponemos la variable en cada condición. También vamos a introducir un entrante(in) declarado ahí mismo como int
call prueba_CASE(2);

#Sentencia WHILE DO - END WHILE
#Creamos el procedimiento de la página 27
#En el procedimiento usamos while do, siempre que haya un while debe haber un do tras la condición
call prueba_WHILE();

#Sentencia REPEAT - UNTIL - END REPEAT
#Creamos el procedimiento de la página 29
#Es lo mismo que un while si no que la condición se pone al final, detrás de until y NO se pone ; detrás de la condición
call prueba_REPEAT(20);

#Sentencia LOOP - ITERATE - LEAVE - END LOOP
#Creamos el procedimiento de la página 31
#Los LOOP(bucles) hay que nombrarlos como si fuesen variables al abrirlos y cerrarlos. Para que haya la posibilidad de que cierre el bucle hay que meter una condición IF
#ITERATE es básicamente "repetir el bucle" al cual hay que nombrar denuevo, el iterate va después del if, y la salida del bucle en un else
call prueba_LOOP(5);

#FUNCIONES
#LAS FUNCIONES siempre se llaman con SELECT 
#Fecha
select curdate(),current_date(), current_date();
#Hora
select curtime(), current_time(), current_time();
#Fecha y hora
select now(), current_timestamp();

#También podemos usar date_format para especificar lo que devuelve
select date_format(curdate(), '%W %D %M %Y');
#También podemos poner fechas anteriores con date_sub o fechas próximas con date_add
select date_add(curdate(), interval 1 month);
select date_sub(curdate(), interval 1 month);

#Funciones para números
select abs(-15), abs(15);	#Da el valor absoluto(es lo mismo pero quitando el - o +)
select ceil(-15.3), ceiling(15.3);	#Techo, en positivo simplemente coge al que va a llegar, independientemente del décimal que sea, el negativo hace lo contrario
select floor(-15.3), floor(15.3);	#Suelo, en positivo coge del valor entero que proviene independientemente del décimal, el negativo hace lo contrario
select 11 DIV 4, mod(12,4), 11 % 4, 11/4; #Div da el cociente. mod y % da el resto
select pow(2,4), pow(16, 0.5);	#Es elevar el primer número al segundo
select sqrt(256), sqrt(256);	#Saca la raíz cuadrada
select rand(), rand(), rand();	#Saca un valor aleatorio entre el 0 y el 1
select round(3.746,0), round(3.746,1), round(3.746,2); #Redondea indicando el número de decimales que quieres
select truncate(3.746,0), truncate(3.746,1), truncate(3.746,2);	#Elimina la cantidad de decimales indicado

#Funciones para cadenas de caracteres
select length('hola mundo');	#Devuelve la cantidad de caracteres que hay en una cadena
select concat('hola',' ','mundo');	#Junta las cadenas que le indiques
select substr('hola mundo', 3), right('hola mundo', 3), left('hola mundo', 3);	#El substring corta la cadena detrás de la posición que le indiques, right sigue la cadena entera hacia la derecha desde donde le indiques y left lo mismo pero a la izquierda
select locate('mundo', 'hola mundo'),position('mundo' in 'hola mundo');	#Es lo mismo, devuelve la posición de la subcadena dentro de una cadena
select instr('hola mundo', 'mundo');	#Es lo mismo pero cambias las posiciones
select ltrim('   hola');	#Elimina los espacios blancos de la izquierda
select rtrim('hola    ');	#Elimina los espacios blancos de la derecha
select trim('   adios mundo   ');	#Elimina los espacios blancos a la derecha e izquierda
select lcase('Hola'), lower('Mundo');	#Transforma la cadena a minúscula
select ucase('Hola'), upper('Mundo');	#Transforma la cadena a mayúscula
select reverse('odnum aloh');	#Inviete una cadena
select repeat('hola ', 3);	#Repite la cadena las veces que le indiques
select rpad('hola', 12, '*%'), lpad('mundo', 12, '*%');	#Rellena hasta alcanzar la longitud indicada
select replace('hoola mundoo','oo','o');	#Remplaza lo primero que le decimos por lo segundo

#FUNCIONES DE CONTROL
select if (date_format(curdate(), '%W')='Thursday', 'Es hoy', 'OTRO') HOY,
	   if (date_format(adddate(curdate(),1),'%W')='Sunday','Es hoy','OTRO');
use sakila;
select address2 into @direccion_nula
  from address
 where address_id = 1;
select address2 into @direccion_no_nula
  from address
 where address_id = 5;
select ifnull(@direccion_nula, 'NULA')DIR_NULA,
	   ifnull(@direccion_no_nula, 'NULA')DIR_NO_NULA;
select nullif('hola', 'hola') IGUALES,
	   nullif('hola', 'mundo') DIFERENTES;

#Procedimientos almacenados. Funciones de usuario.
#Los procedimientos almacenados pueden tener parámetros de entrada, de salida, entrada-salida
use world;
#Creamos el procedimiento de la página 45
#Le damos un valor y lo retorna pero lo tenemos que almacenar nosotros.
call procedimiento_NombrePais('USA', @nombrePais);
select @nombrePais;

#Creamos el procedimiento de la página 46, el delimiter lo pone el workbench 
call procedimiento_NombrePais2('ESP',@nombrePais2);
select @nombrePais2;

use prueba;
#Creamos el procedimiento de la página 47
set @p_INOUT = 8;
select @p_OUT, @p_INOUT;
call PR_clases_de_parametros(1, @p_OUT, @p_INOUT);
select @p_OUT, @p_INOUT;
#El parametro de entrada solo entra no sale, el out sale y el inout entra y sale

#Creamos el procedimiento de la página 48
call PR_parametro_IN(4);

#Creamos el procedimiento de la página 49
call PR_parametro_OUT(@p_OUT);
select @p_OUT;

set @p_OUT = 'PRUEBA';
call PR_parametro_OUT(@p_OUT);
select @p_OUT;
#Lo que hemos visto aquí arriba es que al sustituir un parametro, como dentro del procedimiento no le hemos dicho nada, automáticamente para a null
#Creamos el procedimiento de la página 51
#En este procedimiento vemos que al llamar al parametro sin inicializarlo dentro del procedimiento da null
call PR_parametro_INOUT(@p_INOUT);	#Hace 2 select muy rápido
select @p_INOUT;

#Eliminación de procedimientos
use world;
drop procedure if exists procedimiento_NombrePais;

#Funciones de usuario son las que creamos nosotros, las funciones normales son las del sistema
#Al crear una función hay que indica si es determinista, nosql, reds sqldata o activar el log_bin_trust_function_creators = 1;
#Determinista = La función devuelve siempre el mismo resultado con los mismo parámetros de entrada
#NoSQL = tiene sentido cuando la función no utiliza sql
#READS SQL DATA = no realiza modificaciones en la base de datos
#o bien se crea la función en el mismo workbench pero antes escribes log_bin_trust_function_creators = 1;

set GLOBAL log_bin_trust_function_creators = 0;

delimiter $$
CREATE FUNCTION funcion_nosql(a int, b int) RETURNS int
BEGIN
	select 1, 2 into a, b;
RETURN 1;
END $$
delimiter ;

#Lo de arriba da error debido a que está puesto a 0, si lo ponemos a 1 va
delimiter $$
CREATE FUNCTION funcion_nosql(a int, b int) RETURNS int
	NO SQL
BEGIN
	select 1, 2 into a, b;
RETURN 1;
END $$
delimiter ;
#Al agregar NO SQL sí que funciona lo de arriba

drop function if exists funcion_nosql;

#Abajo añadimos deterministic
delimiter $$
CREATE FUNCTION funcion_nosql(a int, b int) RETURNS int
DETERMINISTIC
BEGIN
	select 1, 2 into a, b;
RETURN 1;
END $$
delimiter ;
#Al poner DETERMINISTIC sí que funciona

drop function if exists funcion_nosql;

delimiter $$
CREATE FUNCTION funcion_nosql(a int, b int) RETURNS int
READS SQL DATA
BEGIN
	select 1, 2 into a, b;
RETURN 1;
END $$
delimiter ;
#Al poner READS SQL DATA sí que funciona

#MYSQL permite incluir dentro de los procedimientos comandos de mysql, ddl, dcl, dml y tcl y llamar a otros procedimientos y funciones
#Creamos el procedimiento de la página 57
call prueba_comandos_y_sentencias();
#Todo funciona bien arriba
#Sin embargo, las funciones no permiten tcl, ddl, dcl, select sin into, autcommit
#No va ni drop table, ni select normal, ni create table, ni show variables ni start transaction, ni set autocommit, ni rollback
#En las funciones sí que va el insert y también podemos llamar procedimientos desde funciones
use prueba;
#Creamos la función de la página 59
select funcion_comandos_y_sentencias();

#CURSORES
#Los cursores se tienen que manejar en un bucle loop, while o repeat
use employees;
#Creamos el procedimiento de la página 62
call tres_primeros_departamentos();
/*
Los cursores sirven para meter FILAS en variables, primero declaramos el cursor y hacemos el select que es lo que busca dentro de la tabla. 
con order by limit le damos un limite, sin embargo si usamos un handler no haría falta, 
Primero se abre el cursor, y el FETCH ES PARA METER LOS DATOS EN LAS VARIABLES, una vez metido hacemos el select con un concat simplemente
En este caso hemos usado el bucle LOOP pero podemos usar otros bucles
*/

#Eventos y disparadores(triggers)
#Los triggers se activan cuando en una tabla ocurre un evento de tipo INSERT, DELETE o UPDATE
use ebanca;
CREATE TRIGGER insertar_movimiento 
BEFORE INSERT ON movimiento FOR EACH ROW
set @sum = @sum + NEW.cantidad;
#El trigger anterior, Justo antes de hacer el insert dentro de la tabla movimiento, suma se suma lo que le digamos que es cantidad dentro del insert, EL NEW ES CLAVE
set @sum = 0;
select @sum;
insert into movimiento values 
(12345678, curdate(), 100, 1, 1);
select @sum;	#El valor es 100
insert into movimiento values 
(12345678, curdate(), 50, 1, 1);
select @sum;	#El valor es 150

#Un trigger puede ser BEFORE o AFTER, tiene que ser para INSERT O DELETE O UPDATE, también podemos poner que siga a otro trigger o que pase antes de otro trigger, 
#esto lo determinamos con FOLLOW o PRECEDES. Cuando hagamos INSERT hay que poner NEW, cuando hacemos DELETE usamos OLD y cuando usamos UPDATE USAMOS LOS 2, NEW Y OLD
delete from movimiento where cantidad = 100;
set sql_safe_updates = 0;
drop trigger insertar_movimiento_3;
CREATE TRIGGER insertar_movimiento_3 
BEFORE DELETE ON movimiento FOR EACH ROW
set @sum = @sum - OLD.cantidad;
select @sum;
#El old básicamente se hace con un -, quita a @sum el valor que hayamos borrado, por ejemplo borramos donde cantidad es 100 y le quita 100 a @sum
#Creamos el trigger de la página 69
use ebanca;
CREATE TRIGGER insertar_movimiento_2
BEFORE INSERT ON movimiento FOR EACH ROW
FOLLOWS insertar_movimiento
set @momento = now();
#En el trigger anterior le decimos que se ejecute después del trigger que le hemos dicho
select @sum, @momento;
insert into movimiento values (12345678, curdate(), 25, 1, 1);
select @sum, @momento;

#Eliminación de triggers
drop trigger if exists bono_ingreso;
drop trigger insertar_movimiento;
drop trigger insertar_movimiento_2;

#También podemos crear triggers que realiza 2 acciones, usamos DELIMITER, BEGIN Y END como si de un procedimiento se tratase
DELIMITER $$
CREATE TRIGGER antes_de_insertar_movimiento
BEFORE INSERT ON movimiento FOR EACH ROW
BEGIN
	set @sum = @sum + NEW.CANTIDAD;
    set @momento = now();
END $$
DELIMITER ;

#Consulta de triggers
show triggers where `Table` = 'movimiento';			#USAMOS ACENTOS GRAVES PARA NOMBRAR TABLA
show create trigger antes_de_insertar_movimiento;	#En el cmd podríamos ver el codigo de antes_de_insertar_movimiento

#EVENTOS