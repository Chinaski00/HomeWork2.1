package animals;

import java.util.Objects;

public class Mammals extends Animals{
    private String movementSpeed;
    private String typeFood;

    public Mammals(String name, int age, String livingEnvironment, String movementSpeed, String typeFood) {
        super(name, age, livingEnvironment);
        this.movementSpeed = movementSpeed;
        if (this.movementSpeed != null || !this.movementSpeed.isEmpty() || !this.movementSpeed.isBlank()){
            this.movementSpeed = movementSpeed;
        } else {
            this.movementSpeed = "Неизвестно";
        }
        this.typeFood = typeFood;
        if (this.typeFood != null || !this.typeFood.isEmpty() || !this.typeFood.isBlank()){
            this.typeFood = typeFood;
        } else {
            this.typeFood = "Неизвестно";
        }
    }


    public String getMovementSpeed() {
        return movementSpeed;
    }

    public String getTypeFood() {
        return typeFood;
    }

    public void walk(){
        System.out.println("Погулять");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammals mammals = (Mammals) o;
        return Objects.equals(movementSpeed, mammals.movementSpeed) && Objects.equals(typeFood, mammals.typeFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), movementSpeed, typeFood);
    }
}
