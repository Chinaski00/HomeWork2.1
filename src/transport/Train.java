package transport;

public class Train extends Transport{
    private int count;
    private String timeTravel;
    private String nameFirstStation;
    private String nameLastStation;
    private int wagon;

    public Train(int count, String nameFirstStation, String nameLastStation, int wagon, String model, String maxKm, int year, String brand, String country, String color) {
        super(brand, model, year,  country,  color, maxKm);
        refill();
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = Math.abs(count);
    }

    public String getTimeTravel() {
        return timeTravel;
    }

    public void setTimeTravel(String timeTravel) {
        if (timeTravel != null || !timeTravel.isBlank() || !timeTravel.isEmpty()){
            this.timeTravel = timeTravel;
        } else {
            this.timeTravel = "Один час";
        }
    }

    public String getNameFirstStation() {
        return nameFirstStation;
    }

    public void setNameFirstStation(String nameFirstStation) {
        if (nameFirstStation != null || !nameFirstStation.isBlank() || !nameFirstStation.isEmpty()){
            this.nameFirstStation = nameFirstStation;
        } else {
            this.nameFirstStation = "Начальная станция";
        }
    }

    public String getNameLastStation() {
        return nameLastStation;
    }

    public void setNameLastStation(String nameLastStation) {
        if (nameLastStation != null || !nameLastStation.isBlank() || !nameLastStation.isEmpty()){
            this.nameLastStation = nameLastStation;
        } else {
            this.nameLastStation = "Конечная станция";
        }
    }

    public int getWagon() {
        return wagon;
    }

    public void setWagon(int wagon) {
        this.wagon = Math.abs(wagon);
    }

    @Override
    public void refill() {
        System.out.println("Поезд заправь дизелем");
    }

    public String toString(){
        return getBrand() + ", модель " + getModel() + ", " + getYear() + " года выпуска в стране " + getCountry() + " скорость передвижения " + getMaxKm() + ", отходит от станции " +
                getNameFirstStation() + " и следует до станции " + getNameLastStation() + ". Цена поездки - " + getCount() + ", в поезде " + getWagon() + " вагонов. ";
    }

}

