######################################################################TEMA 6############################################################################
show variables like 'sql_mode';

show global variables like 'sql_mode';

show session variables like 'sql_mode';

set @primera = 1, @segunda = 2;

select @primera, @segunda;

set sql_mode = replace(@@sql_mode, 'ONLY_FULL_GROUP_BY','');

select database()
union
select user();

set @nombre = ( select first_name
				  from employees
				 where emp_no = 10002);

select @nombre;

select first_name, last_name into @nombre, @apellido
  from employees
 where emp_no = 10009;

select @nombre, @apellido;

use world;

DELIMITER $$
CREATE PROCEDURE `PRUEBA`()
BEGIN
	declare ciudad VARCHAR(155);
    declare pais VARCHAR(155);
    
    select co.Name, ci.Name into ciudad, pais
      from country co 
      join city ci on co.Code = ci.CountryCode
	 where co.LocalName='España'
	   and ci.Name = 'Madrid';
     
     select ciudad, pais;
     
END$$
DELIMITER ;

call prueba();

set GLOBAL log_bin_trust_function_creators = 1;

DELIMITER $$
CREATE FUNCTION funcionprueba(n int, m int) RETURNS VARCHAR(20)
BEGIN
	declare valor varchar(20);
    
    IF m < n THEN
		set valor = '<';
	ELSEIF m > n THEN
		set valor = '>';
	ELSE
		set valor = '=';
	END IF;
    
    set valor = concat(m,valor,n);
    
    RETURN valor;
END$$
DELIMITER ;

select funcionprueba(2,2);

drop function funcionprueba;

set GLOBAL log_bin_trust_function_creators = 0;

DELIMITER $$
CREATE FUNCTION funcionprueba(n int, m int) RETURNS VARCHAR(20)
	DETERMINISTIC
BEGIN
	declare valor varchar(20);
    
    IF m < n THEN
		set valor = '<';
	ELSEIF m > n THEN
		set valor = '>';
	ELSE
		set valor = '=';
	END IF;
    
    set valor = concat(m,valor,n);
    
    RETURN valor;
END$$
DELIMITER ;

drop function funcionprueba;

DELIMITER $$
CREATE PROCEDURE procedimientoconcase()
	NO SQL
BEGIN
	DECLARE v INT;
    select truncate(rand()*10,0) into v;
    CASE v
		WHEN 1 THEN
			SELECT 'UNO';
		WHEN 2 THEN
			SELECT 'DOS';
		ELSE
			SELECT 'OTRO';
		END CASE; 
END$$
DELIMITER ;

call procedimientoconcase();

DELIMITER $$
CREATE PROCEDURE procedimiento_do_while()
	NO SQL
BEGIN
	DECLARE v INT DEFAULT 0;
    WHILE v <= 3 DO
		select v;
        set v = v + 1;
	END WHILE;
END$$
DELIMITER ;

call procedimiento_do_while();

DELIMITER $$
CREATE PROCEDURE prueba_REPEAT(p1 INT)
	NO SQL
BEGIN
	DECLARE x INT;
    SET x = 0;
    REPEAT
		SET x = x + 1;
        SELECT x;
	UNTIL x = p1
    END REPEAT;
END$$
DELIMITER ;

call prueba_REPEAT(7);

DELIMITER $$
CREATE PROCEDURE prueba_con_LOOP(p1 INT)
	NO SQL
BEGIN
	DECLARE v INT DEFAULT 0;
	miBucle: LOOP
		SET v = v + 1;
        select v;
        IF v < p1 THEN
			ITERATE miBucle;
		ELSE
			LEAVE miBucle;
		END IF;
	END LOOP miBucle;
END$$
DELIMITER ;

call prueba_con_LOOP(7);

#MYSQL permite incluir dentro de los procedimientos comandos de mysql, ddl, dcl, dml y tcl y llamar a otros procedimientos y funciones
#No va ni drop table, ni select normal, ni create table, ni show variables ni start transaction, ni set autocommit, ni rollback

select truncate(125.23,1);	#el número 1 determina la cantidad de decimales que permite

select truncate(rand()*10,0);

select rand()*10;

select curdate(), curtime(), now();

select date_format(curdate(), '%W %D %M %Y');

select adddate(curdate(), interval 1 month) UN_MES_DESPUES,	#SUMA
	   date_add(curdate(), interval 1 week) UNA_SEMANA_DESPUES,	#SUMA
       subdate(curdate(), interval 1 month) UN_MES_ANTES,	#RESTA
       date_sub(curdate(), interval 1 week) UNA_SEMANA_ANTES;	#RESTA

select abs(-15), abs(15);

DELIMITER $$
CREATE PROCEDURE procedimiento_con_out(IN p_codigo VARCHAR(3), OUT p_nombre varchar(20))
	NO SQL
BEGIN
	select name into p_nombre
      from country
	 where code = p_codigo;
END$$
DELIMITER ;

call procedimiento_con_out('ESP', @nombrePais);

select @nombrePais;

DELIMITER $$
CREATE PROCEDURE tres_primeros_departamentos_prueba()
BEGIN
	
    DECLARE control int DEFAULT 0;
    DECLARE contador int DEFAULT 0;
    DECLARE identificador VARCHAR(155);
    DECLARE nombre VARCHAR(155);
    
	DECLARE miCursor CURSOR FOR select dept_no, dept_name FROM DEPARTMENTS ORDER BY 1 LIMIT 3;
    DECLARE continue HANDLER for not found set control = 1;
    OPEN miCursor;
		miBucle: loop
			fetch miCursor into identificador, nombre;
		if control = 1 then
			leave miBucle;
		END IF;
        SELECT concat('Nombre',' ', nombre),
			   concat('Identifiacdor',' ', identificador);
	end loop miBucle;
	CLOSE miCursor;
END$$
DELIMITER ;

call tres_primeros_departamentos_prueba();










DELIMITER $$
CREATE PROCEDURE tres_primeros_departamentosDELUXE2()
BEGIN
	DECLARE identificador varchar(100);
    DECLARE nombre		  varchar(100);
    DECLARE control       int default 0;
    
    DECLARE miCursor cursor for select dept_no, dept_name from departments;
    DECLARE continue HANDLER for not found set control = 1;
    
    open miCursor;
		miBucle: loop
		fetch miCursor into identificador, nombre;
        if control = 1 then
			leave miBucle;
		END IF;
        select concat('Nombre', ' ', nombre),
			   concat('Identificador',' ', identificador);
		end loop miBucle;
        close miCursor;
    
END$$
DELIMITER ;

call tres_primeros_departamentosDELUXE2;

use ebanca;

CREATE TRIGGER insertar_movimiento2
BEFORE INSERT ON cuenta FOR EACH ROW
set @suma = @suma + NEW.saldo;

set @suma = 0;

insert into cuenta values
(curdate(), 20, 11220, 500);

select @suma;

CREATE TRIGGER insertar_movimiento3
BEFORE INSERT ON cuenta FOR EACH ROW
FOLLOWS insertar_movimiento2
set @suma3 = @suma3 + NEW.saldo;

DELIMITER $$
CREATE TRIGGER insertar_movimiento4
BEFORE INSERT ON cuenta FOR EACH ROW
BEGIN
	set @suma = @suma + NEW.saldo;
    set @ahora = now();
END$$
DELIMITER ;

show triggers where `Table` = 'cuenta';

DELIMITER $$
CREATE EVENT bonificacion
ON SCHEDULE AT CURRENT_TIMESTAMP + INTERVAL 1 MONTH
DO
UPDATE ebanca.cuenta SET saldo = saldo + 100
 where fecha_creacion between date_add(now(), interval -1 month) and now();$$
delimiter ;

DELIMITER $$
use prueba;
CREATE PROCEDURE inserta_Etiqueta_Articulo (in p_articulo_id int, in p_etiqueta_id int)
BEGIN
	DECLARE CONTINUE HANDLER FOR 1062
    SELECT concat('Ya existe la fila con articulo_id:', p_articulo_id,' y etiqueta id: ', p_etiqueta_id) AS MENSAJE;
END$$
DELIMITER ;
################################################TEMA 7############################################################################################