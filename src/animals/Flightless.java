package animals;

import java.util.Objects;

public class Flightless extends Birds{

    public Flightless(String name, int age, String livingEnvironment, String typeMovement) {
        super(name, age, livingEnvironment, typeMovement);
    }

    public void walk(){
        System.out.println("Погулять");
    }

    public String toString() {
        return "Класс: Нелетающие. " + " Имя: " + getName() + ". Возраст: " + getAge() + ". Среда обитания: " + getLivingEnvironment() + ". Тип передвижения: " + getTypeMovement();
    }

}
