create table association_club_utilisateur (
  id_association_club_utilisateur int not null primary key,
  club_id_club                    int null,
  utilisateur_id_utilisateur      int null
) engine = MyISAM;

create index FK96it9x18t4q9afi9q74wh0ebr on association_club_utilisateur (club_id_club);

create index FKe51eaxt8rtagsx3lsg4fpr0cs on association_club_utilisateur (utilisateur_id_utilisateur);

create table association_equipe_evenement(
  id_association_equipe_evenement int not null primary key,
  equipe_id_equipe                int null,
  evenement_id_evenement          int null
) engine = MyISAM;

create index FK4k7kqi2c0bpastvh1jb4ei9n1  on association_equipe_evenement (evenement_id_evenement);

create index FKk8c5bo80my108n9c8cq01ftc on association_equipe_evenement (equipe_id_equipe);

create table association_utilisateur_equipe (
  id_association_utilisateur_equipe int not null primary key,
  equipe_id_equipe                  int null,
  utilisateur_id_utilisateur        int null
) engine = MyISAM;

create index FK9joj3cjxwury3m8ngdxgst2f7
  on association_utilisateur_equipe (utilisateur_id_utilisateur);

create index FKa20e8836n8tak28rj8oepcriu
  on association_utilisateur_equipe (equipe_id_equipe);

create table club (
  id_club int          not null primary key,
  nom     varchar(255) null,
  id_lieu int          null
)
  engine = MyISAM;

create index FKkui8hc5y088spsjo0m62y25qa on club (id_lieu);

create table equipe (
  id_equipe int          not null primary key,
  nom       varchar(255) null,
  code      varchar(255) null,
  id_club   int          null
) engine = MyISAM;

create index FKaxolaebevf0h8uk6odi547ine on equipe (code);

create index FKii1fk3jfyimydd0raf9en6660 on equipe (id_club);

create table evenement (
  id_evenement int          not null primary key,
  date_debut   datetime     null,
  date_fin     datetime     null,
  code         varchar(255) null
) engine = MyISAM;

create index FKt2apvevxovkp79ovxbs772c4p on evenement (code);

create table hibernate_sequence (
  next_val bigint null
) engine = MyISAM;

create table lieu (
  id_lieu int          not null primary key,
  adresse varchar(255) null,
  code    varchar(255) null
) engine = MyISAM;

create index FKg5rj9i7er271itrao11v9rm4d on lieu (code);

create table login (
  mail           varchar(255) not null primary key,
  password       varchar(255) null,
  pseudo         varchar(255) null,
  id_utilisateur int          null
) engine = MyISAM;

create index FKtn4gxla2am6sa06b98tavhjqr on login (id_utilisateur);

create table resultat (
  id_resultat  varchar(255) not null primary key,
  id_evenement int          null,
  id_score     varchar(255) null
) engine = MyISAM;

create index FKhoe87t3yoc2tthk37k7e71vji on resultat (id_score);

create index FKpvyhid3rvu0c6m1qbn59waj2y on resultat (id_evenement);

create table score (
  id_score varchar(255) not null
    primary key
) engine = MyISAM;

create table type_categorie (
  code    varchar(255) not null primary key,
  libelle varchar(255) null
) engine = MyISAM;

create table type_evenement (
  code    varchar(255) not null primary key,
  libelle varchar(255) null
)
  engine = MyISAM;

create table type_lieu (
  code    varchar(255) not null primary key,
  libelle varchar(255) null
)
  engine = MyISAM;

create table type_profile (
  code    varchar(255) not null primary key,
  libelle varchar(255) null
) engine = MyISAM;

create table utilisateur (
  id_utilisateur int          not null primary key,
  adresse        varchar(255) null,
  nom            varchar(255) null,
  prenom         varchar(255) null,
  code           varchar(255) null
) engine = MyISAM;

create index FKe9hji47k4t2yg80hih0nwde4d on utilisateur (code);

