# Итоговая контрольная работа по блоку специализация (Хабибов Алексей, март 2024г)

## Ход выполнения заданий:

### Задание 1:

Использование команды cat в Linux
   - Создать два текстовых файла: "Pets"(Домашние животные) и "Pack animals"(вьючные животные), используя команду `cat` в терминале Linux. В первом файле перечислить собак, кошек и хомяков. Во втором — лошадей, верблюдов и ослов.
   - Объединить содержимое этих двух файлов в один и просмотреть его содержимое.
   - Переименовать получившийся файл в "Human Friends"(.
Пример конечного вывода после команды “ls” :
Desktop Documents Downloads  HumanFriends.txt  Music  PackAnimals.txt  Pets.txt  Pictures  Videos

#### Решение:
![image](Задание%201.png)

### Задание 2:

Работа с директориями в Linux
   - Создать новую директорию и переместить туда файл "Human Friends"

#### Решение:
![image](Задание%202.png)

### Задание 3:

Работа с MySQL в Linux. “Установить MySQL на вашу вычислительную машину ”
   - Подключить дополнительный репозиторий MySQL и установить один из пакетов из этого репозитория.

#### Решение:
![image](Задание%203.png)

### Задание 4:

Управление deb-пакетами
   - Установить и затем удалить deb-пакет, используя команду `dpkg`.

#### Решение:
![image](Задание%204.png)

### Задание 5:

История команд в терминале Ubuntu
   - Сохранить и выложить историю ваших терминальных команд в Ubuntu.

#### Решение:

ak04@alex04-Linux:~$ pwd

ak04@alex04-Linux:~$ mkdir FinalCW_spec_dir

ak04@alex04-Linux:~$ ll

ak04@alex04-Linux:~$ cd FinalCW_spec_dir

ak04@alex04-Linux:~/FinalCW_spec_dir$ cat > Pets.txt

ak04@alex04-Linux:~/FinalCW_spec_dir$ cat Pets.txt 

ak04@alex04-Linux:~/FinalCW_spec_dir$ ll

ak04@alex04-Linux:~/FinalCW_spec_dir$ cat > Pack_animals.txt

ak04@alex04-Linux:~/FinalCW_spec_dir$ cat Pack_animals.txt

ak04@alex04-Linux:~/FinalCW_spec_dir$ cat Pets.txt Pack_animals.txt > All_animals.txt

ak04@alex04-Linux:~/FinalCW_spec_dir$ cat All_animals.txt 

ak04@alex04-Linux:~/FinalCW_spec_dir$ mv All_animals.txt Human_Friends.txt

ak04@alex04-Linux:~/FinalCW_spec_dir$ ll

ak04@alex04-Linux:~/FinalCW_spec_dir$ mkdir animals_dir

ak04@alex04-Linux:~/FinalCW_spec_dir$ mv Human_Friends.txt animals_dir

ak04@alex04-Linux:~/FinalCW_spec_dir$ ll

ak04@alex04-Linux:~/FinalCW_spec_dir$ cd animals_dir/

ak04@alex04-Linux:~/FinalCW_spec_dir/animals_dir$ ll

ak04@alex04-Linux:~/FinalCW_spec_dir/animals_dir$ cd

ak04@alex04-Linux:~$ sudo mysql

ak04@alex04-Linux:~$ cd shared

ak04@alex04-Linux:~/shared$ ll

ak04@alex04-Linux:~/shared$ sudo dpkg -i google-chrome-stable_current_amd64.deb

ak04@alex04-Linux:~/shared$ sudo dpkg -r google-chrome-stable 

### Задание 6:

Диаграмма классов
- Создать диаграмму классов с родительским классом "Животные", и двумя подклассами: "Pets" и "Pack animals".

В составы классов которых в случае Pets войдут классы: собаки, кошки, хомяки, а в класс Pack animals войдут: Лошади, верблюды и ослы).
Каждый тип животных будет характеризоваться (например, имена, даты рождения, выполняемые команды и т.д)

#### Решение: 
![image](Задание%20.png)

### Задание 7, 7.1, 7.2:

Работа с MySQL (Задача выполняется в случае успешного выполнения задачи “Работа с MySQL в Linux. “Установить MySQL на вашу машину”

После создания диаграммы классов в 6 пункте, в 7 пункте база данных "Human Friends" должна быть структурирована в соответствии с этой диаграммой. Например, можно создать таблицы, которые будут соответствовать классам "Pets" и "Pack animals", и в этих таблицах будут поля, которые характеризуют каждый тип животных (например, имена, даты рождения, выполняемые команды и т.д.). 

В ранее подключенном MySQL создать базу данных с названием "Human Friends".
- Создать таблицы, соответствующие иерархии из вашей диаграммы классов.
- Заполнить таблицы данными о животных, их командах и датами рождения.
- Удалить записи о верблюдах и объединить таблицы лошадей и ослов.
- Создать новую таблицу для животных в возрасте от 1 до 3 лет и вычислить их возраст с точностью до месяца.
- Объединить все созданные таблицы в одну, сохраняя информацию о принадлежности к исходным таблицам.

#### Решение: 

[Ссылка на файл с кодом](human_friends.sql)

### Задание 8:

ООП и Java
   - Создать иерархию классов в Java, который будет повторять диаграмму классов созданную в задаче 6(Диаграмма классов) .