-- SELECT * FROM DBScuola.t_corsi where data_inizio >= '2022-01-01' and data_inizio <= '2022-02-03';
-- SELECT * FROM DBScuola.t_corsi where (titolo_corso like '%java%') or (titolo_corso like 'html_');
/* SELECT *, if(descrizione_corso is null, '---', upper(descrizione_corso)) as descr from DBScuola.t_corsi
	where id_corso in(
		SELECT id_corso FROM t_docenti where costo_orario<100
        );
        */
create view v_corsi_fasce as
select id_corso,
case
when durata_corso <soglia_corto then 'corto'
when durata_corso <soglia_medio then 'medio'
when durata_corso <soglia_lungo  then 'lungo'
else 'extra'
end as fascia_corso
from t_corsi, t_opzioni;