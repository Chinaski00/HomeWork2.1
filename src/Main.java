import animals.*;
import transport.Bus;
import transport.Car;
import transport.Car.Key;
import transport.Car.Insurance;
import transport.Train;
import transport.Transport;

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


        Car car1 = new Car("Lada","Granta", 1.7, "желтый", 2015, "Россия", "автомат", "универсал", "Летняя резина", "а313аа232", 4, null, null, "500");
        Car car2 = new Car("Audi","A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия",  "механика", "универсал", "Зимняя резина", "а312ва232", 4 , null,null, "500");
        Car car3 = new Car("BMW","Z8", 3.0, "черный", 2021, "Германия", "автомат", "универсал", "Летняя резина", "а313аа232", 4 , null,null, "500");
        Car car4 = new Car("Kia","Sportage 4-го поколения", 2.4, "красный", 2016, "Южная Корея",  "автомат", "универсал", "Летняя резина", "а313аа232", 4,null,null, "500" );
        Car car5 = new Car("Hyundai","Avante", 1.6, "оранжевый", 2016, "Южная Корея",  "автомат", "универсал", "Летняя резина", "а313аа232", 4,null,null , "500");
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

        Train lastoshka = new Train(3500, "Белорусский вокзал", "Минск-Пассажирский",11, "B-901", "301 км/ч",2011, "Поезд Ласточка", "Россия", "Желтый");
        Train leningrad = new Train(1700, "Ленинградский вокзал", "Ленинград-Пассажирский",8, "D-125", "270 км/ч",2019, "Поезд Ленинград", "Россия", "Зелёный");
        System.out.println(lastoshka.toString());
        System.out.println(leningrad.toString());

        Bus bus1 = new Bus("ПАЗ", "2011", 2004,"Россия", "Белый", "115 км/ч");
        Bus bus2 = new Bus("ВАЗ", "2003", 2008,"Россия", "Зелёный", "90 км/ч");
        Bus bus3 = new Bus("ГАЗ", "2013", 2010,"Россия", "Белый", "150 км/ч");


        //Травоядные
        Herbivores gazel = new Herbivores("Газель", 3, "Степи","114 км/ч", "Трава");
        Herbivores giraffe = new Herbivores("Жираф", 5,"Саванны Африки", "55 км/ч", "Трава");
        Herbivores horse = new Herbivores("Лошадь", 6, "Степи", "60 км/ч", "Трава");
        System.out.println(gazel.toString());
        System.out.println(giraffe.toString());
        System.out.println(horse.toString());

        //Хищники
        Predators hyena = new Predators("Гиена", 2, "Африка", "60 км/ч", "Мясо");
        Predators tiger = new Predators("Тигр", 8, "Тайга", "96 км/ч", "Мясо");
        Predators bear = new Predators("Медведь", 10, "Высокогорье", "до 50 км/ч", "Мясо");
        System.out.println(hyena.toString());
        System.out.println(tiger.toString());
        System.out.println(bear.toString());

        //Земноводные
        Amphibians frog = new Amphibians("Лягушка", 1, "Водоёмы");
        Amphibians freshwaterSnake = new Amphibians("Уж пресноводный",4, "Южная Европа");
        System.out.println(frog.toString());
        System.out.println(freshwaterSnake.toString());

        //Птицы(нелетающие)
        Flightless peacock = new Flightless("Павлин", 4,"Бангладеш", "Ходьба");
        Flightless pigwin = new Flightless("Пингвин", 3, "Антарктида", "Смешанный");
        Flightless dodoBird = new Flightless("Птица Додо", 2, "Мадагаскар", "Ходьба");
        System.out.println(peacock.toString());
        System.out.println(pigwin.toString());
        System.out.println(dodoBird.toString());

        //Птицы(летающие)
        Flying seagull = new Flying("Чайка", 1, "Везде где есть выход к морю", "Смешанный");
        Flying albatross = new Flying("Альбатрос", 2, "Тихий и Южный окены", "Смешанный");
        Flying falcon = new Flying("Сокол", 3, "Южная Америка и Африка", "Смешанный");
        System.out.println(seagull.toString());
        System.out.println(albatross.toString());
        System.out.println(falcon.toString());

    }
}