alter view v1_elencoImpiegati as
-- select
select territory, country, city, e.jobTitle, lastName, firstName, employeeNumber, o.officeCode
-- da quali tabelle agganciamo
from 
	offices o     
inner join 
	employees e 
		on o.officeCode = e.officeCode
inner join hierarchy h on left (h.jobTitle,8) = left(e.jobTitle,8)
-- filtri vari
-- where

-- eventuali raggruppamenti
-- group by

-- eventuali filtri sui campi raggruppati sumo, min, avg, count
-- having (having = where dopo il group by)

-- eventuali ordinamenti
-- order by
order by territory, country, city, hierarchy desc, lastName, firstName;
-- eventuali limit massimo numero di record e paginazione 
-- limit(n,e) dove n = posizione da cui partire, e = numero elementi da selezionare