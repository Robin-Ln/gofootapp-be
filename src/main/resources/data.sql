 -- Pour que le sql soit importé ajouté la ligne suivante dans le fichier application.
-- properties : spring.datasource.initialization-mode=always


-- Définition des types de profil 

INSERT INTO tb_type_profile VALUES("abr","Arbitre");
INSERT INTO tb_type_profile VALUES("jou","Joueur");

-- Création du profil de l'utilisateur ainsi que son login

INSERT INTO tb_login VALUES("robin@louarn.fr","2020-08-08","azerty");
INSERT INTO tb_utilisateur VALUES (1,"Langevin 29200 Brest","Louarn","Robin","robin@louarn.fr");

INSERT INTO tb_login VALUES("Sebastien@gmail.com","2020-08-08","azerty");
INSERT INTO tb_utilisateur VALUES (2,"Kerinou 29200 Brest","Bossert","Sebastien","Sebastien@gmail.com");

INSERT INTO tb_login VALUES("Nicolas@gmail.com","2020-08-08","azerty");
INSERT INTO tb_utilisateur VALUES (3,"Jaures 29200 Brest","LeGuyader","Nicolas","Nicolas@gmail.com");

INSERT INTO tb_login VALUES("Yohann@gmail.com","2020-08-08","azerty");
INSERT INTO tb_utilisateur VALUES (4,"Victor 29200 Brest","Quillivéré","Yohann","Yohann@gmail.com");

INSERT INTO tb_login VALUES("Benoit@gmail.com","2020-08-08","azerty");
INSERT INTO tb_utilisateur VALUES (5,"Jaures 29200 Brest","Autretjunior","Benoit","Benoit@gmail.com");

-- Création des clubs

INSERT INTO tb_club VALUES (1,"Marseille");
INSERT INTO tb_club VALUES (2,"Rennes");
INSERT INTO tb_club VALUES (3,"Guingamp");

-- Liaison entre le club et l'utilisateur (  id de l'utilisateur, id du club )

INSERT INTO tb_ass_club_utilisateur VALUES (1,1);
INSERT INTO tb_ass_club_utilisateur VALUES (2,1);
INSERT INTO tb_ass_club_utilisateur VALUES (3,1);
INSERT INTO tb_ass_club_utilisateur VALUES (4,3);
INSERT INTO tb_ass_club_utilisateur VALUES (5,2);

-- Catégorie de l'équipe ... Par défaut si il s'agit pas d'une equipe de foot on mettra adulte

INSERT INTO tb_type_categorie VALUES ("SE","Ségnor");

-- Création d'une equipe dans la bdd

INSERT INTO tb_equipe VALUES (1,"Arbitrage","SE",1);

INSERT INTO tb_equipe VALUES (2,"Guingamp","SE",3);

INSERT INTO tb_equipe VALUES (3,"Rennes","SE",2);

-- Création d'un type de lieu -> pour les matchs il y aura le stade

INSERT INTO tb_type_lieu VALUES (1,"stade");

-- Création d'un lieu ( lié à un type de lieu par l'identifiant du type de lieu ) 

INSERT INTO tb_lieu VALUES (1,"Le vélodrome",1);
INSERT INTO tb_lieu VALUES (2,"Le Roudourou",1);

-- Création d'un évènement match ( le null correspond au résultat ... Si vous voulez ajouter
-- un résultat de match créer une entrée dans la table et rajouter son id à la place )

INSERT INTO tb_match VALUES (1,"2018-10-10 20:00:00","2018-10-10 22:15:00",1,NULL);
INSERT INTO tb_match VALUES (2,"2018-10-10 20:00:00","2018-10-10 22:15:00",2,NULL);

-- Création du résultat d'un match

INSERT INTO tb_resultat VALUES (1,3,2,2);

-- Update du match pour que le résultat y soit lié

UPDATE tb_match SET i_e_id=1 WHERE i_ev_id=2;

-- Mise en lien du club avec un lieu

INSERT INTO tb_ass_club_lieu VALUES (1,2);

-- Mise en lien de l'equipe avec un match

INSERT INTO tb_ass_equipe_match VALUES (1,1);
INSERT INTO tb_ass_equipe_match VALUES (2,2);
INSERT INTO tb_ass_equipe_match VALUES (2,3);

-- Mise en lien de l'equipe avec un utilisateur

INSERT INTO tb_ass_equipe_utilisateur VALUES (1,"abr",1,NULL);
INSERT INTO tb_ass_equipe_utilisateur VALUES (2,"abr",1,NULL);
INSERT INTO tb_ass_equipe_utilisateur VALUES (3,"abr",1,NULL);
INSERT INTO tb_ass_equipe_utilisateur VALUES (4,"jou",2,NULL);
INSERT INTO tb_ass_equipe_utilisateur VALUES (5,"jou",3,NULL);

-- Création d'une typePosition correspondant au poste du joueur

INSERT INTO tb_position VALUES(1,"DC");

-- Cette typePosition on l'associe à une equipe et à un utilisateur
UPDATE tb_ass_equipe_utilisateur
SET i_p_id=1
WHERE i_u_id=4
AND i_eq_id=2;

-- tb_regroupement_evenement
INSERT `tb_regroupement_evenement` (`i_re_id`) VALUES ('1');

-- tb_evenement
INSERT INTO `tb_evenement` (`i_ev_id`, `dt_ev_date_debut`, `dt_ev_date_fin`, `i_re_id`) VALUES ('1', '2019-02-23 15:31:22', '2019-02-23 17:31:22', '1');
INSERT INTO `tb_evenement` (`i_ev_id`, `dt_ev_date_debut`, `dt_ev_date_fin`, `i_re_id`) VALUES ('2', '2019-02-23 15:31:22', '2019-02-23 17:31:22', '1');


-- tb_entrainement
INSERT INTO `tb_entrainement` (`i_en_id`, `i_en_regroupement_evenement`, `i_en_type_categorie`) VALUES ('1', '1', 'SE');


-- Mise a jour de la table des sequences
UPDATE `tb_sequence` SET `next_val` = '2' WHERE (`sequence_name` = 'tb_entrainement');
UPDATE `tb_sequence` SET `next_val` = '3' WHERE (`sequence_name` = 'tb_evenement');
UPDATE `tb_sequence` SET `next_val` = '2' WHERE (`sequence_name` = 'tb_regroupement_evenement');
UPDATE `tb_sequence` SET `next_val` = '4' WHERE (`sequence_name` = 'tb_club');
UPDATE `tb_sequence` SET `next_val` = '6' WHERE (`sequence_name` = 'tb_utilisateur');
UPDATE `tb_sequence` SET `next_val` = '2' WHERE (`sequence_name` = 'tb_resultat');
UPDATE `tb_sequence` SET `next_val` = '3' WHERE (`sequence_name` = 'tb_match');
UPDATE `tb_sequence` SET `next_val` = '3' WHERE (`sequence_name` = 'tb_lieu');
UPDATE `tb_sequence` SET `next_val` = '4' WHERE (`sequence_name` = 'tb_equipe');
UPDATE `tb_sequence` SET `next_val` = '2' WHERE (`sequence_name` = 'tb_position');

