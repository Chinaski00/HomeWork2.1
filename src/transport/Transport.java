package transport;

public abstract class Transport {

    private String brand;
    private String model;
    private int year;
    private String country;
    private String color;
    private String maxKm;


    public Transport(String brand, String model, int year, String country, String color, String maxKm) {
        this.brand = brand;
        if (this.brand == null || this.brand == ""){
            this.brand = "default";
        }
        this.model = model;
        if (this.model == null || this.model == ""){
            this.model = "default";
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
        this.maxKm = maxKm;
        if (this.maxKm == null || this.maxKm == ""){
            this.maxKm = "белый";
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public String getMaxKm() {
        return maxKm;
    }

    public void setColor(String color) {
        if (color != null || !color.isBlank() || !color.isEmpty()){
            this.color = color;
        } else {
            this.color = "Белый";
        }
    }

    public void setMaxKm(String maxKm) {
        if (maxKm != null || !maxKm.isBlank() || !maxKm.isEmpty()){
            this.maxKm = maxKm;
        } else {
            this.maxKm = "15";
        }
    }

    public abstract void refill();
}

