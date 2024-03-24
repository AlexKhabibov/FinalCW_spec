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
Last login: Sun Mar 24 00:17:31 on ttys000
a04@MacBook-Pro-Aleksej ~ % ssh ak04@192.168.68.60           
ak04@192.168.68.60's password: 
Welcome to Ubuntu 22.04.4 LTS (GNU/Linux 6.5.0-21-generic x86_64)

 * Documentation:  https://help.ubuntu.com
 * Management:     https://landscape.canonical.com
 * Support:        https://ubuntu.com/pro

Expanded Security Maintenance for Applications is not enabled.

0 updates can be applied immediately.

1 additional security update can be applied with ESM Apps.
Learn more about enabling ESM Apps service at https://ubuntu.com/esm


The list of available updates is more than a week old.
To check for new updates run: sudo apt update
Last login: Mon Mar  4 12:15:55 2024 from 192.168.68.51
ak04@alex04-Linux:~$ pwd
/home/ak04
ak04@alex04-Linux:~$ mkdir FinalCW_spec_dir
ak04@alex04-Linux:~$ ll
total 228
drwxr-x--- 25 ak04  ak04      4096 Mar 24 16:22 ./
drwxr-xr-x  6 root  root      4096 Jan 15 15:30 ../
-rw-rw-r--  1 ak04  ak04       176 Jan 31 15:20 all.txt
-rw-rw-r--  1 ak04  ak04      1275 Feb 16 15:49 app.py
-rw-------  1 ak04  ak04     17249 Mar  4 12:45 .bash_history
-rw-r--r--  1 ak04  ak04       220 Dec 23 19:24 .bash_logout
-rw-r--r--  1 ak04  ak04      3771 Dec 23 19:24 .bashrc
drwx------ 19 ak04  ak04      4096 Jan 25 15:01 .cache/
drwxrwxr-x  2 ak04  ak04      4096 Jan 19 17:19 cd/
drwx------ 17 ak04  ak04      4096 Jan 25 15:12 .config/
drwxr-xr-x  2 ak04  ak04      4096 Dec 23 19:32 Desktop/
-rw-rw-r--  1 ak04  ak04       270 Feb 20 14:35 docker-compose.yml
-rw-rw-r--  1 ak04  ak04       162 Feb 16 15:21 Dockerfile
drwxr-xr-x  2 ak04  ak04      4096 Dec 23 19:32 Documents/
drwxr-xr-x  2 ak04  ak04      4096 Jan 12 11:51 Downloads/
-rw-rw-r--  1 ak04  ak04        72 Jan 31 15:19 errors.txt
drwxrwxr-x  3 ak04  ak04      4096 Feb  3 18:22 example/
drwxrwxr-x  2 ak04  ak04      4096 Mar 24 16:22 FinalCW_spec_dir/
drwxrwxr-x  3 ak04  ak04      4096 Jan 19 17:07 home_work/
-rw-rw-r--  1 ak04  ak04       391 Jan 22 01:41 iptables.rules
drwxrwxr-x  4 ak04  ak04      4096 Jan 19 16:58 .java/
-rw-------  1 ak04  ak04        36 Feb  1 16:07 .lesshst
-rw-rw-r--  1 ak04  ak04      3377 Jan 31 15:14 ll_txt
drwx------  3 ak04  ak04      4096 Dec 23 19:32 .local/
drwxr-xr-x  2 ak04  ak04      4096 Dec 23 19:32 Music/
drwxrwxr-x  3 ak04  www-data  4096 Jan 15 12:26 newdir22/
-rw-r--r--  1 ak04  ak04       310 Dec 24 01:35 .pam_environment
drwxr-xr-x  2 ak04  ak04      4096 Dec 23 19:32 Pictures/
drwx------  3 ak04  ak04      4096 Jan 25 15:01 .pki/
-rw-r--r--  1 ak04  ak04       807 Dec 23 19:24 .profile
drwxr-xr-x  2 ak04  ak04      4096 Dec 23 19:32 Public/
-rw-rw-r--  1 ak04  ak04        66 Jan 19 17:09 .selected_editor
drwxrwxr-x  5 ak04  ak04      4096 Feb  6 15:33 sem1testfolder/
drwxrwx---  1 root  vboxsf     128 Jan 19 16:25 shared/
drwx------  6 ak04  ak04      4096 Jan 19 16:58 snap/
-rw-rw-r--  1 ak04  ak04       104 Jan 31 15:19 std.txt
-rw-r--r--  1 ak04  ak04         0 Dec 24 01:37 .sudo_as_admin_successful
drwxr-xr-x  2 ak04  ak04      4096 Dec 23 19:32 Templates/
drwxrwxr-x  3 user2 www-data  4096 Feb  4 16:33 testdir/
drwxrwxr-x  2 ak04  docker    4096 Feb 13 16:28 testdockersem3/
lrwxrwxrwx  1 ak04  ak04         5 Jan 11 15:53 test_ln_dir -> test3
-rwxrwxr-x  1 ak04  ak04       280 Feb  1 16:15 testscript*
-rwxrwxr-x  1 ak04  ak04        55 Feb  2 14:50 testscript2*
-rw-rw-r--  1 ak04  ak04        17 Feb  3 14:59 testscript2err.txt
-rw-rw-r--  1 ak04  ak04        20 Feb  3 14:59 testscript2out.txt
-rw-r-----  1 ak04  ak04         5 Feb 20 15:24 .vboxclient-clipboard-tty2-control.pid
-rw-r-----  1 ak04  ak04         5 Feb 20 15:24 .vboxclient-draganddrop-tty2-control.pid
-rw-r-----  1 ak04  ak04         5 Feb 20 15:24 .vboxclient-hostversion-tty2-control.pid
-rw-r-----  1 ak04  ak04         5 Feb 20 15:24 .vboxclient-seamless-tty2-control.pid
-rw-r-----  1 ak04  ak04         5 Feb 20 15:24 .vboxclient-vmsvga-session-tty2-control.pid
drwxr-xr-x  2 ak04  ak04      4096 Dec 23 19:32 Videos/
-rw-------  1 ak04  ak04      9653 Jan 11 17:23 .viminfo
-rw-rw-r--  1 ak04  ak04       173 Jan 19 16:02 .wget-hsts
ak04@alex04-Linux:~$ cd FinalCW_spec_dir
ak04@alex04-Linux:~/FinalCW_spec_dir$ cat > Pets.txt
собаки                                
кошки
хомяки        
^C
ak04@alex04-Linux:~/FinalCW_spec_dir$ cat Pets.txt 
собаки
кошки
хомяки
ak04@alex04-Linux:~/FinalCW_spec_dir$ ll
total 12
drwxrwxr-x  2 ak04 ak04 4096 Mar 24 16:28 ./
drwxr-x--- 25 ak04 ak04 4096 Mar 24 16:22 ../
-rw-rw-r--  1 ak04 ak04    0 Mar 24 16:28 Pack
-rw-rw-r--  1 ak04 ak04   37 Mar 24 16:26 Pets.txt
ak04@alex04-Linux:~/FinalCW_spec_dir$ cat > Pack_animals.txt
лошади
верблюды
ослы
^C
ak04@alex04-Linux:~/FinalCW_spec_dir$ cat Pack_animals.txt
лошади
верблюды
ослы
ak04@alex04-Linux:~/FinalCW_spec_dir$ cat Pets.txt Pack_animals.txt > All_animals.txt
ak04@alex04-Linux:~/FinalCW_spec_dir$ cat All_animals.txt 
собаки
кошки
хомяки
лошади
верблюды
ослы
ak04@alex04-Linux:~/FinalCW_spec_dir$ mv All_animals.txt Human_Friends.txt
ak04@alex04-Linux:~/FinalCW_spec_dir$ ll
total 20
drwxrwxr-x  2 ak04 ak04 4096 Mar 24 16:34 ./
drwxr-x--- 25 ak04 ak04 4096 Mar 24 16:22 ../
-rw-rw-r--  1 ak04 ak04   76 Mar 24 16:32 Human_Friends.txt
-rw-rw-r--  1 ak04 ak04    0 Mar 24 16:29 Pack
-rw-rw-r--  1 ak04 ak04   39 Mar 24 16:30 Pack_animals.txt
-rw-rw-r--  1 ak04 ak04   37 Mar 24 16:26 Pets.txt
ak04@alex04-Linux:~/FinalCW_spec_dir$ rm Pack
ak04@alex04-Linux:~/FinalCW_spec_dir$ ll
total 20
drwxrwxr-x  2 ak04 ak04 4096 Mar 24 16:34 ./
drwxr-x--- 25 ak04 ak04 4096 Mar 24 16:22 ../
-rw-rw-r--  1 ak04 ak04   76 Mar 24 16:32 Human_Friends.txt
-rw-rw-r--  1 ak04 ak04   39 Mar 24 16:30 Pack_animals.txt
-rw-rw-r--  1 ak04 ak04   37 Mar 24 16:26 Pets.txt
ak04@alex04-Linux:~/FinalCW_spec_dir$ mkdir animals_dir
ak04@alex04-Linux:~/FinalCW_spec_dir$ mv Human_Friends.txt animals_dir
ak04@alex04-Linux:~/FinalCW_spec_dir$ ll
total 20
drwxrwxr-x  3 ak04 ak04 4096 Mar 24 16:45 ./
drwxr-x--- 25 ak04 ak04 4096 Mar 24 16:22 ../
drwxrwxr-x  2 ak04 ak04 4096 Mar 24 16:45 animals_dir/
-rw-rw-r--  1 ak04 ak04   39 Mar 24 16:30 Pack_animals.txt
-rw-rw-r--  1 ak04 ak04   37 Mar 24 16:26 Pets.txt
ak04@alex04-Linux:~/FinalCW_spec_dir$ cd animals_dir/
ak04@alex04-Linux:~/FinalCW_spec_dir/animals_dir$ ll
total 12
drwxrwxr-x 2 ak04 ak04 4096 Mar 24 16:45 ./
drwxrwxr-x 3 ak04 ak04 4096 Mar 24 16:45 ../
-rw-rw-r-- 1 ak04 ak04   76 Mar 24 16:32 Human_Friends.txt
ak04@alex04-Linux:~/FinalCW_spec_dir/animals_dir$ cd
ak04@alex04-Linux:~$ sudo mysql
[sudo] password for ak04: 
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 8
Server version: 8.0.36-0ubuntu0.22.04.1 (Ubuntu)

Copyright (c) 2000, 2024, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> exit
Bye
ak04@alex04-Linux:~$ cd shared
ak04@alex04-Linux:~/shared$ ll
total 102552
drwxrwx---  1 root vboxsf       128 Jan 19 16:25 ./
drwxr-x--- 25 ak04 ak04        4096 Mar 24 17:31 ../
-rwxrwx---  1 root vboxsf      6148 Jan 19 16:25 .DS_Store*
-rwxrwx---  1 root vboxsf 105000828 Jan 19 16:25 google-chrome-stable_current_amd64.deb*
ak04@alex04-Linux:~/shared$ dpkg -i google-chrome-stable_current_amd64.deb 
dpkg: error: requested operation requires superuser privilege
ak04@alex04-Linux:~/shared$ sudo dpkg -i google-chrome-stable_current_amd64.deb 
dpkg: warning: downgrading google-chrome-stable from 122.0.6261.94-1 to 120.0.6099.224-1
(Reading database ... 305175 files and directories currently installed.)
Preparing to unpack google-chrome-stable_current_amd64.deb ...
Unpacking google-chrome-stable (120.0.6099.224-1) over (122.0.6261.94-1) ...
Setting up google-chrome-stable (120.0.6099.224-1) ...
Processing triggers for mailcap (3.70+nmu1ubuntu1) ...
Processing triggers for gnome-menus (3.36.0-1ubuntu3) ...
Processing triggers for desktop-file-utils (0.26-1ubuntu3) ...
Processing triggers for man-db (2.10.2-1) ...
ak04@alex04-Linux:~/shared$ sudo dpkg -r google-chrome-stable 
(Reading database ... 305177 files and directories currently installed.)
Removing google-chrome-stable (120.0.6099.224-1) ...
update-alternatives: using /usr/bin/firefox to provide /usr/bin/x-www-browser (x-www-browser) in auto mode
update-alternatives: using /usr/bin/firefox to provide /usr/bin/gnome-www-browser (gnome-www-browser) in auto mode
Processing triggers for man-db (2.10.2-1) ...
Processing triggers for mailcap (3.70+nmu1ubuntu1) ...
Processing triggers for gnome-menus (3.36.0-1ubuntu3) ...
Processing triggers for desktop-file-utils (0.26-1ubuntu3) ...
ak04@alex04-Linux:~/shared$ sudo dpkg -i google-chrome-stable_current_amd64.deb 
Selecting previously unselected package google-chrome-stable.
(Reading database ... 305063 files and directories currently installed.)
Preparing to unpack google-chrome-stable_current_amd64.deb ...
Unpacking google-chrome-stable (120.0.6099.224-1) ...
Setting up google-chrome-stable (120.0.6099.224-1) ...
update-alternatives: using /usr/bin/google-chrome-stable to provide /usr/bin/x-www-browser (x-www-browser) in auto mode
update-alternatives: using /usr/bin/google-chrome-stable to provide /usr/bin/gnome-www-browser (gnome-www-browser) in auto mode
update-alternatives: using /usr/bin/google-chrome-stable to provide /usr/bin/google-chrome (google-chrome) in auto mode
Processing triggers for mailcap (3.70+nmu1ubuntu1) ...
Processing triggers for gnome-menus (3.36.0-1ubuntu3) ...
Processing triggers for desktop-file-utils (0.26-1ubuntu3) ...
Processing triggers for man-db (2.10.2-1) ...
ak04@alex04-Linux:~/shared$ 
