CREATE TABLE IF NOT EXISTS `truyum`.`movie`(
  `mo_id` INT NOT NULL AUTO_INCREMENT,
  `mo_title` VARCHAR(100) NULL,
  `mo_boxoffice` VARCHAR(100) NULL,
  `mo_active` BOOLEAN NULL,
  `mo_date_of_launch` DATE NULL,
  `mo_genre` VARCHAR(45) NULL,
  `mo_hasTeaser` BOOLEAN NULL,
  PRIMARY KEY (`mo_id`))
ENGINE = InnoDB;