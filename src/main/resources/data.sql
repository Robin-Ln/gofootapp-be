 -- Pour que le sql soit importé ajouté la ligne suivante dans le fichier application.
-- properties : spring.datasource.initialization-mode=always

 
 -- Création des clubs

INSERT INTO tb_club VALUES (1,"Marseille");
INSERT INTO tb_club VALUES (2,"Rennes");
INSERT INTO tb_club VALUES (3,"Guingamp");

-- Définition des types de profil 

INSERT INTO tb_type_profile VALUES("abr","Arbitre");
INSERT INTO tb_type_profile VALUES("jou","Joueur");

-- Création du profil de l'utilisateur ainsi que son login

INSERT INTO tb_login VALUES("robin@louarn.fr","2020-08-08","azerty");
INSERT INTO tb_utilisateur VALUES (1,"Langevin 29200 Brest","Louarn","Robin","robin@louarn.fr",NULL);

INSERT INTO tb_login VALUES("Sebastien@gmail.com","2020-08-08","azerty");
INSERT INTO tb_utilisateur VALUES (2,"Kerinou 29200 Brest","Bossert","Sebastien","Sebastien@gmail.com",NULL);

INSERT INTO tb_login VALUES("Nicolas@gmail.com","2020-08-08","azerty");
INSERT INTO tb_utilisateur VALUES (3,"Jaures 29200 Brest","LeGuyader","Nicolas","Nicolas@gmail.com",NULL);

INSERT INTO tb_login VALUES("Yohann@gmail.com","2020-08-08","azerty");
INSERT INTO tb_utilisateur VALUES (4,"Victor 29200 Brest","Quillivéré","Yohann","Yohann@gmail.com",NULL);

INSERT INTO tb_login VALUES("Benoit@gmail.com","2020-08-08","azerty");
INSERT INTO tb_utilisateur VALUES (5,"Jaures 29200 Brest","Autret","Benoit","Benoit@gmail.com",NULL);

-- Création d'une typePosition correspondant au poste du joueur

INSERT INTO tb_position VALUES(1,"DCG");
INSERT INTO tb_position VALUES(2,"DCD");
INSERT INTO tb_position VALUES(3,"DD");
INSERT INTO tb_position VALUES(4,"DG");
INSERT INTO tb_position VALUES(5,"GD");
INSERT INTO tb_position VALUES(6,"MDCG");
INSERT INTO tb_position VALUES(7,"MDCD");
INSERT INTO tb_position VALUES(8,"MOC");
INSERT INTO tb_position VALUES(9,"ATD");
INSERT INTO tb_position VALUES(10,"ATG");
INSERT INTO tb_position VALUES(11,"AT");

-- Ajout des données pour l'écran gestion d'equipe

INSERT INTO tb_login VALUES("Rodolph@gmail.com","2020-08-08","azerty");
INSERT INTO tb_utilisateur VALUES (6,"Jaures 29200 Brest","Rodoplh","Goudin","Rodolph@gmail.com",2);
INSERT INTO tb_ass_club_utilisateur VALUES (6,3);
INSERT INTO tb_login VALUES("Denis@gmail.com","2020-08-08","azerty");
INSERT INTO tb_utilisateur VALUES (7,"Jaures 29200 Brest","Denis","Michel","Denis@gmail.com",3);
INSERT INTO tb_ass_club_utilisateur VALUES (7,3);
INSERT INTO tb_login VALUES("Roger@gmail.com","2020-08-08","azerty");
INSERT INTO tb_utilisateur VALUES (8,"Jaures 29200 Brest","Roger","Coco","Roger@gmail.com",4);
INSERT INTO tb_login VALUES("Claude@gmail.com","2020-08-08","azerty");
INSERT INTO tb_ass_club_utilisateur VALUES (8,3);
INSERT INTO tb_utilisateur VALUES (9,"Jaures 29200 Brest","Claude","Razga","Claude@gmail.com",5);
INSERT INTO tb_login VALUES("Julio@gmail.com","2020-08-08","azerty");
INSERT INTO tb_ass_club_utilisateur VALUES (9,3);
INSERT INTO tb_utilisateur VALUES (10,"Jaures 29200 Brest","Julio","Cesar","Julio@gmail.com",6);
INSERT INTO tb_login VALUES("Rimb@gmail.com","2020-08-08","azerty");
INSERT INTO tb_ass_club_utilisateur VALUES (10,3);
INSERT INTO tb_utilisateur VALUES (11,"Jaures 29200 Brest","Rimb","Ciboul","Rimb@gmail.com",7);
INSERT INTO tb_login VALUES("Touchi@gmail.com","2020-08-08","azerty");
INSERT INTO tb_ass_club_utilisateur VALUES (11,3);
INSERT INTO tb_utilisateur VALUES (12,"Jaures 29200 Brest","Touchi","Miguel","Touchi@gmail.com",8);
INSERT INTO tb_login VALUES("Mereles@gmail.com","2020-08-08","azerty");
INSERT INTO tb_ass_club_utilisateur VALUES (12,3);
INSERT INTO tb_utilisateur VALUES (13,"Jaures 29200 Brest","Mereles","Raul","Benoit@gmail.com",9);
INSERT INTO tb_login VALUES("MBappe@gmail.com","2020-08-08","azerty");
INSERT INTO tb_ass_club_utilisateur VALUES (13,3);
INSERT INTO tb_utilisateur VALUES (14,"Jaures 29200 Brest","MBappe","Killian","MBappe@gmail.com",10);
INSERT INTO tb_login VALUES("William@gmail.com","2020-08-08","azerty");
INSERT INTO tb_ass_club_utilisateur VALUES (14,3);
INSERT INTO tb_utilisateur VALUES (15,"Jaures 29200 Brest","William","Serin","William@gmail.com",11);
INSERT INTO tb_login VALUES("Luigi@gmail.com","2020-08-08","azerty");
INSERT INTO tb_ass_club_utilisateur VALUES (15,3);
INSERT INTO tb_utilisateur VALUES (16,"Jaures 29200 Brest","Luigi","Paulo","Luigi@gmail.com",1);
INSERT INTO tb_login VALUES("Younes@gmail.com","2020-08-08","azerty");
INSERT INTO tb_ass_club_utilisateur VALUES (16,3);
INSERT INTO tb_utilisateur VALUES (17,"Jaures 29200 Brest","Younes","Youssouf","Younes@gmail.com",2);
INSERT INTO tb_login VALUES("Mario@gmail.com","2020-08-08","azerty");
INSERT INTO tb_ass_club_utilisateur VALUES (17,3);
INSERT INTO tb_utilisateur VALUES (18,"Jaures 29200 Brest","Mario","Sapin","Mario@gmail.com",3);
INSERT INTO tb_login VALUES("Grizzly@gmail.com","2020-08-08","azerty");
INSERT INTO tb_ass_club_utilisateur VALUES (18,3);
INSERT INTO tb_utilisateur VALUES (19,"Jaures 29200 Brest","Grizzly","Ours","Grizzly@gmail.com",4);
INSERT INTO tb_ass_club_utilisateur VALUES (19,3);

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

INSERT INTO tb_ass_equipe_utilisateur VALUES (1,"abr",1);
INSERT INTO tb_ass_equipe_utilisateur VALUES (2,"abr",1);
INSERT INTO tb_ass_equipe_utilisateur VALUES (3,"abr",1);
INSERT INTO tb_ass_equipe_utilisateur VALUES (4,"jou",2);
INSERT INTO tb_ass_equipe_utilisateur VALUES (5,"jou",3);

-- Cette typePosition on l'associe à un utilisateur
UPDATE tb_utilisateur
SET i_p_id=1
WHERE i_u_id=5;

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

