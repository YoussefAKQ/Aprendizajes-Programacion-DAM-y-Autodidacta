use world;

set @ciudades_world = (select count(*)
			             from city);

use sakila;

set @ciudades_sakila = (select count(*)
			             from city);

set @diferencia_ciudades = (@ciudades_world - @ciudades_sakila);

select @diferencia_ciudades, @ciudades_sakila, @ciudades_world;

