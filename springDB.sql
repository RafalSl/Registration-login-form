drop database if exists springLogin;
CREATE database springLogin;
use springLogin;
drop table if exists springLogin;
create table users ( `user_id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  `surename` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  `password` VARCHAR(45) NULL,
  PRIMARY KEY (`user_id`));
  set foreign_key_checks=0;