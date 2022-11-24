package animals;

import java.util.Objects;

public class Predators extends Mammals{

    public Predators(String name, int age, String livingEnvironment, String movementSpeed, String typeFood) {
        super(name, age, livingEnvironment, movementSpeed, typeFood);
    }


    public void hunt(){
        System.out.println("Охотиться");
    }
    public String toString() {
        return "Класс: Хищники. " + " Имя: " + getName() + ". Возраст: " + getAge() + ". Среда обитания: " + getLivingEnvironment() + ". Тип пищи: " + getTypeFood();
    }
}
