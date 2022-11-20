import java.text.DecimalFormat;

public class Flower {

    private String flowerColor;
    private String nameFlower;
    private String country;
    private double cost;
    int lifeSpan;
    private DecimalFormat dF = new DecimalFormat( "#.##" );


    public Flower (String nameFlower, String flowerColor, String country, double cost, int lifeSpan){
        this.nameFlower = nameFlower;
        this.flowerColor = flowerColor;
        if (this.flowerColor == null || this.flowerColor == ""){
            this.flowerColor = "белый";
        } else {
            this.flowerColor = flowerColor;
        }
        this.country = country;
        if (this.country == null || this.country == ""){
            this.country = "Россия";
        } else {
            this.country = country;
        }
        this.cost = cost;
        if (this.cost <= 0){
            this.cost = 1;
        } else {
            this.cost = cost;
        }

        this.lifeSpan = Math.abs(lifeSpan);
        if (this.lifeSpan == 0){
            this.lifeSpan = 3;
        }
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public double getCost() {
        return cost;
    }

    public void setFlowerColor(String flowerColor) {
        this.flowerColor = flowerColor;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String toString(){

        return  nameFlower + ". Цвет: " + flowerColor + ". Страна: " + country + ". Cтоимость: " + dF.format(cost) + ". Срок хранения: " + lifeSpan;
    }
}
