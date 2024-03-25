package Java;

import java.time.LocalDate;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Horse extends PackAnimal {
    List<String> commands = Arrays.asList("есть", "спать", "гулять", "покатать на себе",
            "понести груз", "издавать звук");

    public Horse(String name, LocalDate birthDate, char gender) {
        super(name, birthDate, gender);

    // Переопределение общих для всех животных навыков для лошади с учетом пола
    @Override
    public void eat() {
        if (this.gender == 'f')
            System.out.println("Лошадь по имени " + this.name + " ест");
        else
            System.out.println("Конь по имени " + this.name + " ест");
    }

    @Override
    public void sleep() {
        if (this.gender == 'f')
            System.out.println("Лошадь по имени " + this.name + " спит");
        else
            System.out.println("Конь по имени " + this.name + " спит");
    }

    @Override
    public void walk() {
        if (this.gender == 'f')
            System.out.println("Лошадь по имени " + this.name + " гуляет");
        else
            System.out.println("Конь по имени " + this.name + " гуляет");
    }

    // Переопределение навыков вьючных животных для лошади с учетом пола
    @Override
    public void transportRider() {
        if (this.gender == 'f')
            System.out.println("Лошадь по имени " + this.name + " катает вас");
        else
            System.out.println("Конь по имени " + this.name + " катает вас");
    }

    @Override
    public void transportLoad() {
        if (this.gender == 'f')
            System.out.println("Лошадь по имени " + this.name + " везет на себе груз");
        else
            System.out.println("Конь по имени " + this.name + " везет на себе груз");
    }

    // Уникальный навык лошади - издавать звук Игого
    public void igogo() {
        if (this.gender == 'f')
            System.out.println("Лошадь по имени " + this.name + " ржот");
        else
            System.out.println("Конь по имени " + this.name + " ржот");
    }

    @Override
    public String toString() {
        return String.format("Лошадь (имя: " + this.name +
                ", пол: " + this.gender + ", дата рождения: " + this.birthDate +
                ", явл.хищником: ")");
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
