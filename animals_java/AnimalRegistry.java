package Java;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class AnimalRegistry {

    static List<Animal> animals = new ArrayList<>();

    public static void addAnimal() {
        Scanner addAnimalScanner1 = new Scanner(System.in);
        System.out.println("Вы завели новое животное. Как его зовут?\n" +
                "Введите имя на англ языке.\n"
                + "Введите имя: ");
        String resultName = addAnimalScanner1.next();
        try {
            Scanner addAnimalScanner2 = new Scanner(System.in);
            System.out.println(resultName + "? " + "Это мальчик или девочка?\n"
                    + "Введите пол: m - mail(мужской), f - female(женский)");
            char resultGender = addAnimalScanner2.next().charAt(0);
            if (resultGender != 'm' && resultGender != 'f') {
                throw new Exception("Неправильный символ");
            }
            Scanner addAnimalScanner3 = new Scanner(System.in);
            System.out.println("Введите дату рождения животного\n" +
                    "Введите дату в формате год-месяц-день. Например: 2024-02-13");
            LocalDate resultDate = LocalDate.parse(addAnimalScanner3.next());

            Scanner addAnimalScanner4 = new Scanner(System.in);
            System.out.println("Вы знаете, к какому виду относится это животное?\n"
                    + "1 - Кошка, 2 - Собака, 3 - Хомяк, 4 - Лошадь,\n" +
                    "5 - Осёл, 6 - Верблюд, 7 - помогите определить" +
                    "\nВведите цифру вашего выбора:");
            int resultType = addAnimalScanner4.nextInt();
            switch (resultType) {
                case 1:
                    try (Counter counter = new Counter()) {
                        Cat cat = new Cat(resultName, resultDate, resultGender);
                        animals.add(cat);
                        System.out.println("Вы добавили животное " + cat.toString());
                        Counter.add();
                    } catch (Exception e) {
                        System.out.println("Ошибка. Попробуйте еще раз.");
                    }
                    break;
                case 2:
                    try (Counter counter = new Counter()) {
                        Dog dog = new Dog(resultName, resultDate, resultGender);
                        animals.add(dog);
                        System.out.println("Добавлено животное" + dog.toString());
                        Counter.add();
                    } catch (Exception e) {
                        System.out.println("Ошибка. Попробуйте еще раз.");
                    }
                    break;
                case 3:
                    try (Counter counter = new Counter()) {
                        Hamster hamster = new Hamster(resultName, resultDate, resultGender);
                        animals.add(hamster);
                        System.out.println("Добавлено животное " + hamster.toString());
                        Counter.add();
                    } catch (Exception e) {
                        System.out.println("Ошибка. Попробуйте еще раз.");
                    }
                    break;
                case 4:
                    try (Counter counter = new Counter()) {
                        Horse horse = new Horse(resultName, resultDate, resultGender);
                        animals.add(horse);
                        System.out.println("Добавлено животное " + horse.toString());
                        Counter.add();
                    } catch (Exception e) {
                        System.out.println("Ошибка. Попробуйте еще раз.");
                    }
                    break;
                case 5:
                    try (Counter counter = new Counter()) {
                        Donkey donkey = new Donkey(resultName, resultDate, resultGender);
                        animals.add(donkey);
                        System.out.println("Добавлено животное " + donkey.toString());
                        Counter.add();
                    } catch (Exception e) {
                        System.out.println("Ошибка. Попробуйте еще раз.");
                    }
                    break;
                case 6:
                    try (Counter counter = new Counter()) {
                        Camel camel = new Camel(resultName, resultDate, resultGender);
                        animals.add(camel);
                        System.out.println("Добавлено животное " + camel.toString());
                        Counter.add();
                    } catch (Exception e) {
                        System.out.println("Ошибка. Попробуйте еще раз.");
                    }
                    break;
                case 7:
                    determineType();
                default:
                    throw new Exception("Введен некорректный номер");
            }
        } catch (Exception e) {
            System.out.println("Ошибка." +
                    "Введите пожалуйста корректные значения.\n");
            addAnimal();
        }
    }

    public static void determineType() {
        Scanner determineAnimalScan1 = new Scanner(System.in);
        System.out.println(
                "Это животное может перевозить грузы? 1 - да, 2 - нет\nВведите номер ответа:");
        int resultChoice1 = determineAnimalScan1.nextInt();
        if (resultChoice1 == 1) {
            Scanner determineAnimalScan2 = new Scanner(System.in);
            System.out.println("У этого животного есть горб на спине? 1 - да, 2 - нет\nВведите номер ответа:");
            int resultChoice2 = determineAnimalScan2.nextInt();
            if (resultChoice2 == 1) {
                System.out.println("Это верблюд!");
                System.out.println("А теперь введите все данные заново.\n" +
                        "Попробуем еще раз.");
            } else if (resultChoice2 == 2) {
                Scanner determineAnimalScan3 = new Scanner(System.in);
                System.out.println("Это животное произносит звук 'ИА'?. 1 - да, 2 - нет\nВведите номер ответа:");
                int resultChoice3 = determineAnimalScan3.nextInt();
                if (resultChoice3 == 1) {
                    System.out.println("Это ослик!");
                    System.out.println("А теперь введите все данные заново.\n" +
                            "Попробуем еще раз.");
                } else if (resultChoice3 == 2) {
                    System.out.println("Это лошадь!");
                    System.out.println("А теперь введите все данные заново.\n" +
                            "Попробуем еще раз.");
                } else {
                    System.out.println("Давайте заново.");
                    determineType();
                }
            } else {
                System.out.println("Давайте заново.");
                determineType();
            }
        } else if (resultChoice1 == 2) {
            Scanner determineAnimalScan4 = new Scanner(System.in);
            System.out.println("Это животное хищное? 1 - да, 2 - нет\nВведите номер ответа:");
            int resultChoice4 = determineAnimalScan4.nextInt();
            if (resultChoice4 == 1) {
                Scanner determineAnimalScan5 = new Scanner(System.in);
                System.out.println("Это животное мяукает? 1 - да, 2 - нет\nВведите номер ответа:");
                int resultChoice5 = determineAnimalScan4.nextInt();
                if (resultChoice5 == 1) {
                    System.out.println("Это кошка");
                    System.out.println("А теперь введите все данные заново.\n" +
                    "Попробуем еще раз.");
                } else if (resultChoice5 == 2) {
                    System.out.println("Это собака!");
                    System.out.println("А теперь введите все данные заново.\n" +
                    "Попробуем еще раз.");
                } else {
                    System.out.println("Давайте заново.");
                    determineType();
                }
            } else if (resultChoice4 == 2) {
                System.out.println("Это хомяк!");
                System.out.println("А теперь введите все данные заново.\n" +
                "Попробуем еще раз.");
            } else {
                System.out.println("Давайте заново.");
                determineType();
            }
        } else {
            System.out.println("Давайте заново.");
            determineType();
        }
    }

    public static void showAnimalCommands(Animal animal) {
        System.out.println("Животное " + animal + " знает команды: " + animal.getCommands());
    }

    public static void showAnimalList() {
        if (animals.size() == 0) {
            System.out.println("В реестре пока нет животных, но вы можете их добавить.");
        } else {
            System.out.println("Cписок животных в реестре:\n" + animals);
        }
    }

    public static void trainAnimal(Animal animal) {
        int newcommands = 0;
        for (String command : animal.getCommands()) {
            if (command.equals("встать и просить еду"))
                newcommands++;
            else if (command.equals("принести предмет"))
                newcommands++;
            else if (command.equals("сидеть"))
                newcommands++;
            else
                continue;
        }
        animal.addTrainingPoints();
        ;
        if (newcommands == 0) {
            animal.newCommand("встать попросить еду");
            System.out.println("Ваше животное освоило новый приём - встать просить еду.\n" +
                    "Используйте команду standUp().");
        } else if (newcommands == 1) {
            animal.newCommand("принести предмет");
            System.out.println(
                    "Ваше животное освоило новый приём - принести предмет.\n" +
                            "Используйте команду bringItToMe(String object), указав в скобках желаемый предмет, " +
                            "и животное его принесёт.");
        } else if (newcommands == 2) {
            animal.newCommand("сидеть");
            System.out.println(
                    "Ваше животное освоило новый приём - сидеть. \n" +
                            "Используйте команду sitDown(), и животное сядет.\n" +
                            "Используйте команду lieDown(), и животное ляжет.");
        } else if (newcommands == 3) {
            System.out.println("Животное уже всё умеет.");
        } else {
            System.out.println("Животное уже всё умеет.");
        }
    }
}
