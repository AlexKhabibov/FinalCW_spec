package Java;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Animal {
    protected String name;
    protected LocalDate birthDate;
    protected char gender;
    protected int trainingPoints = 0;

    List<String> commands = Arrays.asList("есть", "спать", "издавать звук");

    protected Animal(String name, LocalDate birthDate, char gender) {
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
    };

    // Общие навыки, которыми обладают все животные - есть, спать, издавать звук
    public abstract void eat();

    public abstract void sleep();

    public abstract void makeSound();

    public abstract List<String> getCommands();

    public abstract void newCommand(String newCommand);

    public void addTrainingPoints() {
        this.trainingPoints += 10;
    }

    public void standUp() {
        if (this.trainingPoints > 0) {
            if (this.gender == 'f')
                System.out.println(this.name + " встает и просит еду");
            else
                System.out.println(this.name + " встает и просит еду");
        } else {
            if (this.gender == 'f')
                System.out.println(this.name
                        + " не понимает что от него хотят");
            else
                System.out.println(this.name
                        + " не понимает что от него хотят");
        }
    }

    public void bringItToMe(String object) {
        if (this.trainingPoints > 10) {
            if (this.gender == 'f')
                System.out.println(this.name + " команда апорт(приносит предмет): " + object);
            else
                System.out.println(this.name + " команда апорт(приносит предмет): " + object);
        } else {
            if (this.gender == 'f')
                System.out.println(this.name
                        + " не понимает что от него хотят");
            else
                System.out.println(this.name
                        + " не понимает что от него хотят");
        }
    }

    public void sitDown() {
        if (this.trainingPoints > 20) {
            if (this.gender == 'f')
                System.out.println(this.name + " садится");
            else
                System.out.println(this.name + " садится");
        } else {
            if (this.gender == 'f')
                System.out.println(this.name
                        + " не понимает что от него хотят");
            else
                System.out.println(this.name
                        + " ");
        }
    }

    public void lieDown() {
        if (this.trainingPoints > 20) {
            if (this.gender == 'f')
                System.out.println(this.name + " ложится");
            else
                System.out.println(this.name + " ложится");
        } else {
            if (this.gender == 'f')
                System.out.println(this.name
                        + " не понимает что от него хотят");
            else
                System.out.println(this.name
                        + " не понимает что от него хотят");
        }
    }
}
