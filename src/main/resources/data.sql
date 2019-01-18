-- Pour que le sql soit importé ajouté la ligne suivante dans le fichier application.
-- properties : spring.datasource.initialization-mode=always


-- Définition des types de profil 

INSERT INTO tb_type_profile VALUES("abr","Arbitre");

-- Création du profil de l'utilisateur ainsi que son login

INSERT INTO tb_login VALUES("Robin@gmail.com","2020-08-08","azerty");
INSERT INTO tb_utilisateur VALUES (1,"Langevin 29200 Brest","Louarn","Robin","Robin@gmail.com","abr");

INSERT INTO tb_login VALUES("Sebastien@gmail.com","2020-08-08","azerty");
INSERT INTO tb_utilisateur VALUES (2,"Kerinou 29200 Brest","Bossert","Sebastien","Sebastien@gmail.com","abr");

INSERT INTO tb_login VALUES("Nicolas@gmail.com","2020-08-08","azerty");
INSERT INTO tb_utilisateur VALUES (3,"Jaures 29200 Brest","LeGuyader","Nicolas","Nicolas@gmail.com","abr");

-- Création des clubs

INSERT INTO tb_club VALUES (1,"Marseille");

-- Liaison entre le club et l'utilisateur (  id de l'utilisateur, id du club )

INSERT INTO tb_ass_club_utilisateur VALUES (1,1);
INSERT INTO tb_ass_club_utilisateur VALUES (2,1);
INSERT INTO tb_ass_club_utilisateur VALUES (3,1);

-- Catégorie de l'équipe ... Par défaut si il s'agit pas d'une equipe de foot on mettra adulte

INSERT INTO tb_type_categorie VALUES (1,"Adulte");

-- Création d'une equipe dans la bdd

INSERT INTO tb_equipe VALUES (1,"Arbitrage",1,1);

-- Création d'un type de lieu -> pour les matchs il y aura le stade

INSERT INTO tb_type_lieu VALUES (1,"stade");

-- Création d'un lieu ( lié à un type de lieu par l'identifiant du type de lieu ) 

INSERT INTO tb_lieu VALUES (1,"Le vélodrome",1);

-- Création d'un évènement match ( le null correspond au résultat ... Si vous voulez ajouter
-- un résultat de match créer une entrée dans la table et rajouter son id à la place )

INSERT INTO tb_match VALUES (1,"2018-10-10 20:00:00","2018-10-10 22:15:00",1,NULL);

-- Mise en lien du club avec un lieu

INSERT INTO tb_ass_club_lieu VALUES (1,1);

-- Mise en lien de l'equipe avec un match

INSERT INTO tb_ass_equipe_match VALUES (1,1);

-- Mise en lien de l'equipe avec un utilisateur

INSERT INTO tb_ass_equipe_utilisateur VALUES (1,1);
INSERT INTO tb_ass_equipe_utilisateur VALUES (2,1);
INSERT INTO tb_ass_equipe_utilisateur VALUES (3,1);



