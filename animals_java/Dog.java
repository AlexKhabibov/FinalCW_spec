package Java;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dog extends Pet {
    List<String> commands = Arrays.asList("есть", "спать", , "быть домашним животным", "издавать звук");

    public Dog(String name, LocalDate birthDate, char gender) {
        super(name, birthDate, gender);
    }

    // Переопределение общих навыков для собаки с учетом пола
    @Override
    public void eat() {
        if (this.gender == 'f')
            System.out.println("Собака по имени " + this.name + " ест");
        else
            System.out.println("Собач по имени " + this.name + " ест");
    }

    @Override
    public void sleep() {
        if (this.gender == 'f')
            System.out.println("Собака по имени " + this.name + " спит");
        else
            System.out.println("Собач по имени " + this.name + " спит");
    }

    @Override
    public void makeSound() {
        if (this.gender == 'f')
            System.out.println("Собака по имени " + this.name + " лает");
        else
            System.out.println("Собач по имени " + this.name + " лает");
    }

    // Переопределение навыков питомцев (быть домашним животным) для собаки с учетом пола
    @Override
    public void domestic() {
        if (this.gender == 'f')
            System.out.println("Собака по имени " + this.name + " является домашним животным");
        else
            System.out.println("Собач по имени " + this.name + " является домашним животным");
    }

    // Уникальный навык собаки - издавать звук
    public void woof() {
        if (this.gender == 'f')
            System.out.println("Собака по имени " + this.name + " лает");
        else
            System.out.println("Собач по имени " + this.name + " лает");
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
