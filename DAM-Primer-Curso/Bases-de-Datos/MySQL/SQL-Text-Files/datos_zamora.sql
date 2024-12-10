use world;

select ci.District,c.Name, c.Continent, c.Region into @distrito, @pais, @continente, @region
  from city ci
  join country c on ci.CountryCode = c.Code
 where ci.Name = 'Zamora';

select @distrito, @pais, @continente, @region;