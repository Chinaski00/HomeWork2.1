import transport.Car;
import transport.Car.Key;
import transport.Car.Insurance;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Human maksim = new Human("Максим", "Минск", 1988, "бренд-менеджером");
        Human anya = new Human("Аня", "Москва", 1993, "методистом образовательных программ");
        Human katya = new Human("Катя", "Калининград", 1992, "продакт-менеджером");
        Human artem = new Human("Артем", "Москва", 1995, "директором по развитию бизнеса");
        Human vladimir = new Human("Владимир", "Казань", 2001, "нигде не работает" );
        System.out.println(maksim.toString());
        System.out.println(anya.toString());
        System.out.println(katya.toString());
        System.out.println(artem.toString());
        System.out.println(vladimir.toString());


        Car car1 = new Car("Lada","Granta", 1.7, "желтый", 2015, "Россия", "автомат", "универсал", "Летняя резина", "а313аа232", 4, null, null);
        Car car2 = new Car("Audi","A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия",  "механика", "универсал", "Зимняя резина", "а312ва232", 4 , null,null);
        Car car3 = new Car("BMW","Z8", 3.0, "черный", 2021, "Германия", "автомат", "универсал", "Летняя резина", "а313аа232", 4 , null,null);
        Car car4 = new Car("Kia","Sportage 4-го поколения", 2.4, "красный", 2016, "Южная Корея",  "автомат", "универсал", "Летняя резина", "а313аа232", 4,null,null );
        Car car5 = new Car("Hyundai","Avante", 1.6, "оранжевый", 2016, "Южная Корея",  "автомат", "универсал", "Летняя резина", "а313аа232", 4,null,null );
        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());
        System.out.println(car4.toString());
        System.out.println(car5.toString());
        car1.setInsurance(new Car.Insurance(LocalDate.now(), 30000, "123123123"));
        car1.getInsurance().checkInsDate();
        car1.getInsurance().checkNumber();


        Flower flower1 = new Flower("Роза","", "Голландия", 35.59, 0);
        Flower flower2 = new Flower("Хризантема","", "", 15, 5);
        Flower flower3 = new Flower("Пион","розовый", "Англия", 69.9, 1);
        Flower flower4 = new Flower("Гипсофил","", "Турция", 19.5, 10);

        System.out.println(flower1.toString());
        System.out.println(flower2.toString());
        System.out.println(flower3.toString());
        System.out.println(flower4.toString());
    }
}