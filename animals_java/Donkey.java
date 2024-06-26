package Java;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Donkey extends PackAnimal {
    List<String> commands = Arrays.asList("кушать", "спать", "гулять", "катать на себе",
            "везти груз", "делать 'ИА'");

    public Donkey(String name, LocalDate birthDate, char gender) {
        super(name, birthDate, gender);
    }

    // Переопределение общих для всех животных навыков для осла с учетом пола
    @Override
    public void eat() {
        if (this.gender == 'f')
            System.out.println("Ослица по имени " + this.name + " ест");
        else
            System.out.println("Осёл по имени " + this.name + " ест");
    }

    @Override
    public void sleep() {
        if (this.gender == 'f')
            System.out.println("Ослица по имени " + this.name + " спит");
        else
            System.out.println("Осёл по имени " + this.name + " спит");
    }

    @Override
    public void walk() {
        if (this.gender == 'f')
            System.out.println("Ослица по имени " + this.name + " гуляет");
        else
            System.out.println("Осёл по имени " + this.name + " гуляет");
    }

    // Переопределение навыков вьючных животных для осла с учетом пола
    @Override
    public void transportRider() {
        if (this.gender == 'f')
            System.out.println("Ослица по имени " + this.name + " катает вас на себе");
        else
            System.out.println("Осёл по имени " + this.name + " катает вас на себе");
    }

    @Override
    public void transportLoad() {
        if (this.gender == 'f')
            System.out.println("Ослица по имени " + this.name + " везет на себе ваш груз");
        else
            System.out.println("Осёл по имени " + this.name + " везет на себе ваш груз");
    }

    // Уникальный навык осла - кричать "И-а!"
    public void ea() {
        if (this.gender == 'f')
            System.out.println("Ослица по имени " + this.name + " кричит 'ИА!'");
        else
            System.out.println("Осёл по имени " + this.name + " кричит 'ИА!'");
    }

    @Override
    public String toString() {
        return String.format("Осёл (имя: " + this.name + ", пол: " + this.gender + ", дата рождения: " + this.birthDate )");
    }

    @Override
    public List<String> getCommands() {
        return this.commands;
    }

    @Override
    public void newCommand(String newCommand) {
        List<String> list = new ArrayList<>();
        for (String command : this.commands) {
            list.add(command);
        }
        list.add(newCommand);
        this.commands = list;
    }

}
