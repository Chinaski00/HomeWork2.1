package animals;

import java.util.Objects;

public class Herbivores extends Mammals{


    public Herbivores(String name, int age, String livingEnvironment, String movementSpeed, String typeFood) {
        super(name, age, livingEnvironment, movementSpeed, typeFood);
    }

    public void graze(){
        System.out.println("Пастись");
    }
    public String toString() {
        return "Класс: Травоядные. " + " Имя: " + getName() + ". Возраст: " + getAge() + ". Среда обитания: " + getLivingEnvironment() + ". Тип пищи: " + getTypeFood();
    }
}
