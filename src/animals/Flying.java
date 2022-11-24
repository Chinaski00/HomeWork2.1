package animals;

import java.util.Objects;

public class Flying extends Birds{

    public Flying(String name, int age, String livingEnvironment, String typeMovement) {
        super(name, age, livingEnvironment, typeMovement);
    }

    public void flywalk(){
        System.out.println("Полетать");
    }
    public String toString() {
        return "Класс: Летающие. " + " Имя: " + getName() + ". Возраст: " + getAge() + ". Среда обитания: " + getLivingEnvironment() + ". Тип передвижения: " + getTypeMovement();
    }
}
