package transport;

public class Bus extends Transport{

    public Bus(String brand, String model, int year, String country, String color, String maxKm) {
        super(brand, model, year, country, color, maxKm);
        refill();
    }

    @Override
    public void refill() {
        System.out.println("Автобус заправь бензином");
    }
}
