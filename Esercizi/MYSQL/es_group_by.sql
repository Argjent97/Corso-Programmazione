alter view v_profitto_corsi as

SELECT c.id_corso, titolo_corso, count(id_iscrizione) as tot_iscritti, round(costo_scontato*count(id_iscrizione),2) as profitto
from v_corsi_ok c left join t_iscrizioni i 
	on c.id_corso = i.id_corso group by c.id_corso order by profitto desc, titolo_corso;