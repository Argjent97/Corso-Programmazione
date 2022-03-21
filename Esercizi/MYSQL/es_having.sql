    SELECT 
        `c`.`id_corso` AS `id_corso`,
        `c`.`titolo_corso` AS `titolo_corso`,
        COUNT(`i`.`id_iscrizione`) AS `tot_iscritti`,
        ROUND(`c`.`costo_scontato` * COUNT(`i`.`id_iscrizione`),
                2) AS `profitto`
    FROM
        (`v_corsi_ok` `c`
        LEFT JOIN `t_iscrizioni` `i` ON (`c`.`id_corso` = `i`.`id_corso`))
        
       
    GROUP BY `c`.`id_corso`
		having profitto > minprofitto
    ORDER BY profitto DESC , `c`.`titolo_corso`