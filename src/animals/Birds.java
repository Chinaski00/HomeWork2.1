package animals;

import java.util.Objects;

public class Birds extends Animals {
    private String typeMovement;

    public Birds(String name, int age, String livingEnvironment, String typeMovement) {
        super(name, age, livingEnvironment);
        this.typeMovement = typeMovement;
        if (this.typeMovement != null || !this.typeMovement.isEmpty() || !this.typeMovement.isBlank()){
            this.typeMovement = typeMovement;
        } else {
            this.typeMovement = "Неизвестно";
        }
    }

    public String getTypeMovement() {
        return typeMovement;
    }

    public void hunt(){
        System.out.println("Пойти охотиться");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Birds birds = (Birds) o;
        return Objects.equals(typeMovement, birds.typeMovement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeMovement);
    }
}
