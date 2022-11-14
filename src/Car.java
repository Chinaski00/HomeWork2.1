public class Car {

    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;

    public Car(String brand, String model, double engineVolume, String color, int year, String country){
        this.brand = brand;
        if (this.brand == null || this.brand == ""){
            this.brand = "default";
        }

        this.model = model;
        if (this.model == null || this.model == ""){
            this.model = "default";
        }

        this.engineVolume = engineVolume;
        if (this.engineVolume <= 0){
            this.engineVolume = 1.5;
        }

        this.color = color;
        if (this.color == null || this.color == ""){
            this.color = "белый";
        }

        this.year = year;
        if (this.year <= 0){
            this.year = 2000;
        }

        this.country = country;
        if (this.country == null || this.country == ""){
            this.country = "default";
        }
    }

    public String toString(){
        return "Марка " + brand + ". Модель: " + model + ". Объём двигателя - " + engineVolume + ", цвет - " + color + ", год выпуска - " + year + ", страна сборки - " + country;
    }

}
