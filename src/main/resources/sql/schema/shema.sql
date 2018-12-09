
-- -----------------------------------------------------
-- Table `mydb`.`Typeprofil`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Typeprofil` (
  `idType` INT NOT NULL AUTO_INCREMENT,
  `nom` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idType`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Utilisateur`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Utilisateur` (
  `idUtilisateur` INT NOT NULL AUTO_INCREMENT,
  `nom` VARCHAR(250) NOT NULL,
  `prenom` VARCHAR(250) NOT NULL,
  `adresse` VARCHAR(250) NULL,
  `telephone` VARCHAR(250) NULL,
  `Typeprofil_idType` INT NOT NULL,
  PRIMARY KEY (`idUtilisateur`, `Typeprofil_idType`),
  INDEX `fk_Utilisateur_Typeprofil1_idx` (`Typeprofil_idType` ASC),
  CONSTRAINT `fk_Utilisateur_Typeprofil1`
    FOREIGN KEY (`Typeprofil_idType`)
    REFERENCES `Typeprofil` (`idType`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Login`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Login` (
  `Mail` INT NOT NULL AUTO_INCREMENT,
  `pseudo` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `Utilisateur_idUtilisateur` INT NOT NULL,
  PRIMARY KEY (`Mail`, `Utilisateur_idUtilisateur`),
  INDEX `fk_Login_Utilisateur_idx` (`Utilisateur_idUtilisateur` ASC) ,
  CONSTRAINT `fk_Login_Utilisateur`
    FOREIGN KEY (`Utilisateur_idUtilisateur`)
    REFERENCES `Utilisateur` (`idUtilisateur`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`TypeLieu`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `TypeLieu` (
  `Type` VARCHAR(250) NOT NULL,
  PRIMARY KEY (`Type`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Lieu`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Lieu` (
  `idLieu` INT NOT NULL AUTO_INCREMENT,
  `adresse` VARCHAR(250) NOT NULL,
  `capacite` INT NOT NULL,
  `Club_idClub` INT NOT NULL,
  `TypeLieu_Type` VARCHAR(250) NOT NULL,
  PRIMARY KEY (`idLieu`, `Club_idClub`, `TypeLieu_Type`),
  INDEX `fk_Lieu_TypeLieu1_idx` (`TypeLieu_Type` ASC) ,
  CONSTRAINT `fk_Lieu_TypeLieu1`
    FOREIGN KEY (`TypeLieu_Type`)
    REFERENCES `TypeLieu` (`Type`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Club`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Club` (
  `idClub` INT NOT NULL AUTO_INCREMENT,
  `nomclub` VARCHAR(250) NOT NULL,
  `Lieu_idLieu` INT NOT NULL,
  PRIMARY KEY (`idClub`, `Lieu_idLieu`),
  INDEX `fk_Club_Lieu1_idx` (`Lieu_idLieu` ASC) ,
  CONSTRAINT `fk_Club_Lieu1`
    FOREIGN KEY (`Lieu_idLieu`)
    REFERENCES `Lieu` (`idLieu`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`TypeCategorie`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Categorie` (
  `Type` VARCHAR(250) NOT NULL,
  PRIMARY KEY (`Type`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Equipe`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Equipe` (
  `idEquipe` INT NOT NULL AUTO_INCREMENT,
  `nomequipe` VARCHAR(250) NOT NULL,
  `Categorie_Type` VARCHAR(250) NOT NULL,
  `Club_idClub` INT NOT NULL,
  PRIMARY KEY (`idEquipe`, `Categorie_Type`, `Club_idClub`),
  INDEX `fk_Equipe_Categorie1_idx` (`Categorie_Type` ASC) ,
  INDEX `fk_Equipe_Club1_idx` (`Club_idClub` ASC) ,
  CONSTRAINT `fk_Equipe_Categorie1`
    FOREIGN KEY (`Categorie_Type`)
    REFERENCES `Categorie` (`Type`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Equipe_Club1`
    FOREIGN KEY (`Club_idClub`)
    REFERENCES `Club` (`idClub`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`TypeEvenement`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `TypeEvenement` (
  `Type` VARCHAR(250) NOT NULL,
  PRIMARY KEY (`Type`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Evenement`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Evenement` (
  `idEvenement` INT NOT NULL AUTO_INCREMENT,
  `datedebut` DATETIME NOT NULL,
  `datedefin` DATETIME NOT NULL,
  `TypeEvenement_Type` VARCHAR(250) NOT NULL,
  `Lieu_idLieu` INT NOT NULL,
  PRIMARY KEY (`idEvenement`, `TypeEvenement_Type`, `Lieu_idLieu`),
  INDEX `fk_Evenement_TypeEvenement1_idx` (`TypeEvenement_Type` ASC) ,
  INDEX `fk_Evenement_Lieu1_idx` (`Lieu_idLieu` ASC) ,
  CONSTRAINT `fk_Evenement_TypeEvenement1`
    FOREIGN KEY (`TypeEvenement_Type`)
    REFERENCES `TypeEvenement` (`Type`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Evenement_Lieu1`
    FOREIGN KEY (`Lieu_idLieu`)
    REFERENCES `Lieu` (`idLieu`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`resultat`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `resultat` (
  `idmatch` INT NOT NULL AUTO_INCREMENT,
  `score` VARCHAR(45) NOT NULL,
  `Evenement_idEvenement` INT NOT NULL,
  PRIMARY KEY (`idmatch`, `Evenement_idEvenement`),
  INDEX `fk_resultat_Evenement1_idx` (`Evenement_idEvenement` ASC) ,
  CONSTRAINT `fk_resultat_Evenement1`
    FOREIGN KEY (`Evenement_idEvenement`)
    REFERENCES `Evenement` (`idEvenement`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Equipe_has_Evenement`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Equipe_has_Evenement` (
  `Equipe_idEquipe` INT NOT NULL,
  `Evenement_idEvenement` INT NOT NULL,
  PRIMARY KEY (`Equipe_idEquipe`, `Evenement_idEvenement`),
  INDEX `fk_Equipe_has_Evenement_Evenement1_idx` (`Evenement_idEvenement` ASC) ,
  INDEX `fk_Equipe_has_Evenement_Equipe1_idx` (`Equipe_idEquipe` ASC) ,
  CONSTRAINT `fk_Equipe_has_Evenement_Equipe1`
    FOREIGN KEY (`Equipe_idEquipe`)
    REFERENCES `Equipe` (`idEquipe`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Equipe_has_Evenement_Evenement1`
    FOREIGN KEY (`Evenement_idEvenement`)
    REFERENCES `Evenement` (`idEvenement`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Utilisateur_has_Equipe`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Utilisateur_has_Equipe` (
  `Utilisateur_idUtilisateur` INT NOT NULL,
  `Equipe_idEquipe` INT NOT NULL,
  PRIMARY KEY (`Utilisateur_idUtilisateur`, `Equipe_idEquipe`),
  INDEX `fk_Utilisateur_has_Equipe_Equipe1_idx` (`Equipe_idEquipe` ASC) ,
  INDEX `fk_Utilisateur_has_Equipe_Utilisateur1_idx` (`Utilisateur_idUtilisateur` ASC) ,
  CONSTRAINT `fk_Utilisateur_has_Equipe_Utilisateur1`
    FOREIGN KEY (`Utilisateur_idUtilisateur`)
    REFERENCES `Utilisateur` (`idUtilisateur`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Utilisateur_has_Equipe_Equipe1`
    FOREIGN KEY (`Equipe_idEquipe`)
    REFERENCES `Equipe` (`idEquipe`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Club_has_Utilisateur`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Club_has_Utilisateur` (
  `Club_idClub` INT NOT NULL,
  `Utilisateur_idUtilisateur` INT NOT NULL,
  PRIMARY KEY (`Club_idClub`, `Utilisateur_idUtilisateur`),
  INDEX `fk_Club_has_Utilisateur_Utilisateur1_idx` (`Utilisateur_idUtilisateur` ASC) ,
  INDEX `fk_Club_has_Utilisateur_Club1_idx` (`Club_idClub` ASC) ,
  CONSTRAINT `fk_Club_has_Utilisateur_Club1`
    FOREIGN KEY (`Club_idClub`)
    REFERENCES `Club` (`idClub`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Club_has_Utilisateur_Utilisateur1`
    FOREIGN KEY (`Utilisateur_idUtilisateur`)
    REFERENCES `Utilisateur` (`idUtilisateur`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

