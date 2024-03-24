-- Создаем базу данных Human Friends
DROP DATABASE IF EXISTS human_friends;
CREATE DATABASE human_friends;

-- Выбираем созданную базу данных для работы
USE human_friends;

-- Создаем таблицы отдельных видов животных
DROP TABLE IF EXISTS human_friends.cats;
CREATE TABLE human_friends.cats (
  id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(45) NOT NULL,
  birthDate DATE NOT NULL,
  gender CHAR(1) NOT NULL,
  color VARCHAR(45) NOT NULL,
  commands TEXT NOT NULL,
  PRIMARY KEY (id));
  
DROP TABLE IF EXISTS human_friends.dogs;
CREATE TABLE human_friends.dogs (
  id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(45) NOT NULL,
  birthDate DATE NOT NULL,
  gender CHAR(1) NOT NULL,
  color VARCHAR(45) NOT NULL,
  commands TEXT NOT NULL,
  PRIMARY KEY (id));
  
DROP TABLE IF EXISTS human_friends.hamsters;
CREATE TABLE human_friends.hamsters (
  id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(45) NOT NULL,
  birthDate DATE NOT NULL,
  gender CHAR(1) NOT NULL,
  color VARCHAR(45) NOT NULL,
  commands TEXT NOT NULL,
  PRIMARY KEY (id));
  
DROP TABLE IF EXISTS human_friends.horses;
CREATE TABLE human_friends.horses (
  id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(45) NOT NULL,
  birthDate DATE NOT NULL,
  gender CHAR(1) NOT NULL,
  color VARCHAR(45) NOT NULL,
  commands TEXT NOT NULL,
  PRIMARY KEY (id));
  
DROP TABLE IF EXISTS human_friends.donkeys;
CREATE TABLE human_friends.donkeys (
  id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(45) NOT NULL,
  birthDate DATE NOT NULL,
  gender CHAR(1) NOT NULL,
  color VARCHAR(45) NOT NULL,
  commands TEXT NOT NULL,
  PRIMARY KEY (id));

DROP TABLE IF EXISTS human_friends.camels;
CREATE TABLE human_friends.camels (
  id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(45) NOT NULL,
  birthDate DATE NOT NULL,
  gender CHAR(1) NOT NULL,
  color VARCHAR(45) NOT NULL,
  commands TEXT NOT NULL,
  PRIMARY KEY (id));
  
-- Создаем таблицы домашних животных
DROP TABLE IF EXISTS human_friends.pets;
CREATE TABLE human_friends.pets (
  id INT NOT NULL UNIQUE AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(45) NOT NULL,
  subtype VARCHAR(45) NOT NULL,
  birthDate DATE NOT NULL,
  gender CHAR(1) NOT NULL,
  color VARCHAR(45) NOT NULL,
  commands TEXT NOT NULL);

-- Создаем таблицу вьючных животных
DROP TABLE IF EXISTS human_friends.pack_animals;
CREATE TABLE human_friends.pack_animals (
  id INT NOT NULL UNIQUE AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(45) NOT NULL,
  subtype VARCHAR(45) NOT NULL,
  birthDate DATE NOT NULL,
  gender CHAR(1) NOT NULL,
  color VARCHAR(45) NOT NULL,
  commands TEXT NOT NULL);

-- Создаем таблицу со всеми живтоными  
DROP TABLE IF EXISTS human_friends.animals;
CREATE TABLE human_friends.animals (
  id INT NOT NULL UNIQUE AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(45) NOT NULL,
  type VARCHAR(45) NOT NULL,
  subtype VARCHAR(45) NOT NULL,
  birthDate DATE NOT NULL,
  gender CHAR(1) NOT NULL,
  color VARCHAR(45) NOT NULL,
  commands TEXT NOT NULL);

-- Заполняем таблицы животными 
INSERT INTO human_friends.cats (name, birthDate, gender, color, commands)
VALUES 
('Musya', '2015-03-10', 'f', 'black', 'eat, sleap, makeSound, domestic, meow'),
('Tasha', '2020-02-01', 'f', 'white', 'eat, sleap, makeSound, domestic, meow'),
('Vasya', '2019-01-05', 'm', 'brown', 'eat, sleap, makeSound, domestic, meow');

INSERT INTO human_friends.dogs (name, birthDate, gender, color, commands)
VALUES 
('Jack', '2014-03-10', 'm', 'red', 'eat, sleap, makeSound, domestic, woof'),
('Muhtar', '2012-03-10', 'm', 'brown', 'eat, sleap, makeSound, domestic, woof'),
('Sharik', '2016-03-10', 'm', 'black/white', 'eat, sleap, makeSound, domestic, woof');

INSERT INTO human_friends.hamsters (name, birthDate, gender, color, commands)
VALUES 
('Pity', '2024-01-10', 'm', 'black', 'eat, sleap, makeSound, domestic, shooh'),
('Suzy', '2024-03-10', 'f', 'brown', 'eat, sleap, makeSound, domestic, shooh'),
('Kyle', '2024-02-10', 'm', 'brown/black', 'eat, sleap, makeSound, domestic, shooh');

INSERT INTO human_friends.horses (name, birthDate, gender, color, commands)
VALUES 
('King', '2010-03-10', 'm', 'black', 'eat, sleap, makeSound, transport, igogo'),
('Geronimo', '2011-03-10', 'm', 'white', 'eat, sleap, makeSound, transport, igogo');

INSERT INTO human_friends.donkeys (name, birthDate, gender, color, commands)
VALUES 
('Fred', '2013-03-10', 'm', 'black', 'eat, sleap, makeSound, transport, ea'),
('Bred', '2016-05-10', 'm', 'black', 'eat, sleap, makeSound, transport, ea'),
('Lena', '2017-03-10', 'f', 'black', 'eat, sleap, makeSound, transport, ea');

INSERT INTO human_friends.camels (name, birthDate, gender, color, commands)
VALUES 
('Camel1', '2018-04-10', 'm', 'yellow', 'eat, sleap, makeSound, transport, spit'),
('Camel2', '2017-02-10', 'm', 'yellow', 'eat, sleap, makeSound, transport, spit'),
('Camel3', '2019-03-10', 'f', 'yellow', 'eat, sleap, makeSound, transport, spit');

-- Заполняем таблицу домашних животных через селект-запрос с объединением (к кошкам, собакам, хомякам)
INSERT INTO human_friends.pets(name, subtype, birthDate, gender, color, commands)
SELECT cats.name, 'Cat' AS subtype, cats.birthDate, cats.gender, cats.color, cats.commands
FROM human_friends.cats
UNION 
SELECT dogs.name, 'Dog' AS subtype, dogs.birthDate, dogs.gender, dogs.color, dogs.commands
FROM human_friends.dogs
UNION 
SELECT hamsters.name, 'Hamster' AS subtype, hamsters.birthDate, hamsters.gender, hamsters.color, hamsters.commands
FROM human_friends.hamsters;

-- Удаляем записи о верблюдах в соответствии с заданием
SET SQL_SAFE_UPDATES = 0;
DELETE FROM human_friends.camels;
SET SQL_SAFE_UPDATES = 1;

-- Объединяем лошадей и ослов в единую таблицу
INSERT INTO human_friends.pack_animals (name, subtype, birthDate, gender, color, commands)
SELECT horses.name, 'Horse' AS subtype, horses.birthDate, horses.gender, horses.color, horses.commands
FROM human_friends.horses
UNION 
SELECT donkeys.name, 'Donkey' AS subtype, donkeys.birthDate, donkeys.gender, donkeys.color, donkeys.commands
FROM human_friends.donkeys;

-- Создаем таблицу для животных в возрасте от 1 до 3 лет и вычисляем их возраст с точностью до месяца с округлением (до полных месяцев), 
-- записывая его в отдельный столбец.
DROP TABLE IF EXISTS human_friends.one_to_three_year_old_animals;
CREATE TABLE human_friends.one_to_three_year_old_animals AS
SELECT *, FLOOR(DATEDIFF(CURDATE(), birthDate)/30) as age_in_months FROM human_friends.pets
WHERE DATEDIFF(CURDATE(), birthDate)/30 >= 12 AND DATEDIFF(CURDATE(), birthDate)/30 <= 36
UNION
SELECT *, FLOOR(DATEDIFF(CURDATE(), birthDate)/30) as age_in_months FROM human_friends.pack_animals
WHERE DATEDIFF(CURDATE(), birthDate)/30 >= 12 AND DATEDIFF(CURDATE(), birthDate)/30 <= 36;

-- Объединим все созданные таблицы с животными в одну (верблюдов тоже указываем, хотя помним, что таблица была очищена).

INSERT INTO human_friends.animals (name, type, subtype, birthDate, gender, color, commands)
SELECT cats.name, 'Pet' as type, 'Cat' AS subtype, cats.birthDate, cats.gender, cats.color, cats.commands FROM human_friends.cats
UNION
SELECT dogs.name, 'Pet' as type, 'Dog' AS subtype, dogs.birthDate, dogs.gender, dogs.color, dogs.commands FROM human_friends.dogs
UNION
SELECT hamsters.name, 'Pet' as type, 'Hamster' AS subtype, hamsters.birthDate, hamsters.gender, hamsters.color, hamsters.commands FROM human_friends.hamsters
UNION
SELECT horses.name, 'Pack Animal' as type, 'Horse' AS subtype, horses.birthDate, horses.gender, horses.color, horses.commands FROM human_friends.horses
UNION
SELECT donkeys.name, 'Pack Animal' as type, 'Donkey' AS subtype, donkeys.birthDate, donkeys.gender, donkeys.color, donkeys.commands FROM human_friends.donkeys
UNION
SELECT camels.name, 'Pack Animal' as type, 'Camel' AS subtype, camels.birthDate, camels.gender, camels.color, camels.commands FROM human_friends.camels;

-- Присоединяем с помощью RIGHT JOIN'а колонку с возрастом (в месяцах) из таблицы молодых животных для тех животных, которые были в той таблице.
CREATE TABLE human_friends.allanimalswithage AS
SELECT animals.*, one_to_three_year_old_animals.age_in_months FROM human_friends.animals 
RIGHT OUTER JOIN human_friends.one_to_three_year_old_animals
ON animals.name = one_to_three_year_old_animals.name
UNION
SELECT animals.*, one_to_three_year_old_animals.age_in_months IS NULL FROM human_friends.animals 
RIGHT OUTER JOIN human_friends.one_to_three_year_old_animals
ON animals.name NOT IN (SELECT one_to_three_year_old_animals.name FROM human_friends.one_to_three_year_old_animals where one_to_three_year_old_animals.name IS NOT NULL);

-- Перезаполняем возраст (в месяцах) для всех животных, чтобы он отображался у каждой строки в таблице
SET SQL_SAFE_UPDATES = 0;
UPDATE human_friends.allanimalswithage 
SET age_in_months = FLOOR(DATEDIFF(CURDATE(), allanimalswithage.birthDate)/30);
SET SQL_SAFE_UPDATES = 1;

-- Выводим финальный результат в порядке возрастания индексов
SELECT * FROM human_friends.allanimalswithage
ORDER BY id;