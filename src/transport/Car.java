package transport;

import java.time.LocalDate;

public class Car extends Transport{

    private double engineVolume;
    String transmission;
    private String typeBody;
    String registratonNumber;
    private int numbersOfSeats;
    String tire;
    private Key key;
    private Insurance insurance;




    public Car(String brand, String model, double engineVolume, String color, int year, String country, String transmission, String typeBody, String tire, String registratonNumber, int numbersOfSeats, Key key, Insurance insurance, String maxKm){
        super(brand, model, year, country, color, maxKm);
        this.engineVolume = engineVolume;
        if (this.engineVolume <= 0){
            this.engineVolume = 1.5;
        }

        this.transmission = transmission;
        if (this.transmission == null || this.transmission == ""){
            this.transmission = "default";
        }
        this.typeBody = typeBody;
        if (this.typeBody == null || this.typeBody == ""){
            this.typeBody = "default";
        }
        this.tire = tire;
        if (this.tire == null || this.tire == ""){
            this.tire = "default";
        }

        this.registratonNumber = registratonNumber;
        if (this.registratonNumber == null || this.registratonNumber == ""){
            this.registratonNumber = "default";
        }

        if (key == null){
            this.key = new Key();
        }else {
            this.key = key;
        }

        if (insurance == null){
            this.insurance = new Insurance();
        }else {
            this.insurance = insurance;
        }

        this.numbersOfSeats = numbersOfSeats;
        if (this.numbersOfSeats <= 0){
            this.numbersOfSeats = Math.abs(numbersOfSeats);
        }

    }

    public String getTypeBody() {
        return typeBody;
    }


    public int getNumbersOfSeats() {
        return numbersOfSeats;
    }

    public String getTransmission() {
        return transmission;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public void setTransmission() {
        this.transmission = transmission;
    }

    public String getRegistratonNumber() {
        return registratonNumber;
    }

    public void setRegistratonNumber() {
        this.registratonNumber = registratonNumber;
    }

    public String getTire() {
        return tire;
    }

    public void setTire() {
        this.tire = tire;
    }
    public void changeTier(){
        tire = "Зимняя резина";
        if (this.tire.equals(tire)){
            this.tire = "Зимняя резина";
        } else if (this.tire.equals(tire)) {
            this.tire = "Летняя резина";
        }
    }
    public boolean checkCarNumber(){
        if (registratonNumber.length() != 9){
            return false;
        }
        char chars[] = registratonNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])){
            return false;
        }
        if (!Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3]) || !Character.isDigit(chars[6]) || !Character.isDigit(chars[7]) || !Character.isDigit(chars[8])){
            return false;
        }
        return true;
    }
    public class Key{
        private final boolean remoteRunKey;
        private final boolean withoutKeyAccsess;

        public Key(boolean remoteRunKey, boolean withoutKeyAccsess) {
            this.remoteRunKey = remoteRunKey;
            this.withoutKeyAccsess = withoutKeyAccsess;
        }
        public Key(){
            this(false, false);
        }

        public boolean isRemoteRunKey() {
            return remoteRunKey;
        }

        public boolean isWithoutKeyAccsess() {
            return withoutKeyAccsess;
        }
    }
    public static class Insurance{
        private final LocalDate expireDate;
        private final double cost;
        private final String number;

        public Insurance(LocalDate expireDate, double cost, String number) {
            if (expireDate == null){
                this.expireDate = LocalDate.now().plusDays(365);
            } else {
                this.expireDate = expireDate;
            }
            this.cost = cost;
            if (number == null){
                this.number = "123456789";
            } else {
                this.number = number;
            }
        }

        public Insurance(){
            this(null, 10000, null);
        }


        public LocalDate getExpireDate() {
            return expireDate;
        }

        public double getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }

        public void checkInsDate(){
            if (expireDate.isBefore(LocalDate.now()) || expireDate.isEqual(LocalDate.now())){
                System.out.println("Срочно едь оформлять новую строку");
            }
        }
        public void checkNumber(){
            if (number.length() != 9){
                System.out.println("Номер страховки некорректный");
            }
        }
    }

    @Override
    public void refill() {
        System.out.println("Машину можешь заправить бензином, дизелем заряжать на специальных электропарковках, если это электрокар");
    }
    public String toString(){
        return "Марка " + getBrand() + ". Модель: " + getModel() + ". Объём двигателя - " + engineVolume + ", цвет - " + getColor() + ", год выпуска - " + getYear() + ", страна сборки - "
                + getCountry() + ", коробка передач - " + transmission + ", тип кузова - " + typeBody + ", рег.номер - " + registratonNumber + ", количество мест " + numbersOfSeats
                + ", резина - " + tire + ", срок действия страховки - " + getInsurance().getNumber() + ",  стоимосить - " + getInsurance().getCost() + ", срок - "
                + getInsurance().getExpireDate(); }

}
