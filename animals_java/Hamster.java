package Java;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hamster extends Pet {
    List<String> commands = Arrays.asList("есть", "спать", "гулять", "быть домашним животным");

    public Hamster(String name, LocalDate birthDate, char gender) {
        super(name, birthDate, gender);
    }

    // Переопределение общих для всех животных навыков для хомяка с учетом пола
    @Override
    public void eat() {
        if (this.gender == 'f')
            System.out.println("Хомячиха по имени " + this.name + " ест");
        else
            System.out.println("Хомяк по имени " + this.name + " ест");
    }

    @Override
    public void sleep() {
        if (this.gender == 'f')
            System.out.println("Хомячиха по имени " + this.name + " спит");
        else
            System.out.println("Хомяк по имени " + this.name + " спит");
    }

    @Override
    public void walk() {
        if (this.gender == 'f')
            System.out.println("Хомячиха по имени " + this.name + " гуляет");
        else
            System.out.println("Хомяк по имени " + this.name + " гуляет");
    }

    // Переопределение навыков питомцев (быть домашним живтоным) для хомяка с учетом
    // пола
    @Override
    public void domestic() {
        if (this.gender == 'f')
            System.out.println("Хомячиха по имени " + this.name + " является домашним животным");
        else
            System.out.println("Хомяк по имени " + this.name + " является домашним животным");
    }

    // Уникальный навык хомяка - бегать по клетке со звуком

    public void shooh() {
        if (this.gender == 'f')
            System.out.println("Хомячиха по имени " + this.name + " очень быстро бегает по клетке");
        else
            System.out.println("Хомяк по имени " + this.name + " очень быстро бегает по клетке\"");
    }

    @Override
    public String toString() {
        return String.format("Хомяк (имя: " + this.name +
                ", пол: " + this.gender + ", дата рождения: " + this.birthDate +
                ", явл.хищником: " )");
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
