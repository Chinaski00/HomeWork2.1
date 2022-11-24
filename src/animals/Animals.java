package animals;

import java.util.Objects;

public class Animals {

    private String name;
    private int age;
    private String livingEnvironment;

    public Animals(String name, int age, String livingEnvironment) {
        this.name = name;
        if (this.name != null || !this.name.isEmpty() || !this.name.isBlank()){
            this.name = name;
        } else {
            this.name = "Имени нет";
        }
        this.age = Math.abs(age);
        this.livingEnvironment = livingEnvironment;
        if (this.livingEnvironment != null || !this.livingEnvironment.isEmpty() || !this.livingEnvironment.isBlank()){
            this.livingEnvironment = livingEnvironment;
        } else {
            this.livingEnvironment = "Неизвестно";
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = livingEnvironment;
    }


    public void eat(){
        System.out.println("Кушать");
    }
    public void sleep(){
        System.out.println("Спать");
    }
    public void move(){
        System.out.println("Пойти");
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return age == animals.age && Objects.equals(name, animals.name) && Objects.equals(livingEnvironment, animals.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, livingEnvironment);
    }
}
