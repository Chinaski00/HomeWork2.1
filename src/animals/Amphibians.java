package animals;

import java.util.Objects;

public class Amphibians extends Animals {

    public Amphibians(String name, int age, String livingEnvironment) {
        super(name, age, livingEnvironment);
    }


    public void hunt(){
        System.out.println("Пойти охотиться");
    }
    public String toString() {
        return "Класс: Земноводные. " + " Имя: " + getName() + ". Возраст: " + getAge() + ". Среда обитания: " + getLivingEnvironment();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
