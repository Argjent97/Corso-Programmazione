drop table if exists tmpdel;
create table tmpdel as
(SELECT a.id_anagrafica FROM t_anagrafiche a left join t_iscrizioni i on a.id_anagrafica = i.id_anagrafica 
left join t_docenti d on a.id_anagrafica = d.id_anagrafica
where i.id_anagrafica is null and d.id_docenti is null

order by a.id_anagrafica
limit 2);

delete from t_anagrafiche 
where id_anagrafica in (select id_anagrafica from tmpdel);

