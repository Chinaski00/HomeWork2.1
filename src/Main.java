public class Main {
    public static void main(String[] args) {

        Human maksim = new Human("Максим", "Минск", 1988, "бренд-менеджером");
        Human anya = new Human("Аня", "Москва", 1993, "методистом образовательных программ");
        Human katya = new Human("Катя", "Калининград", 1992, "продакт-менеджером");
        Human artem = new Human("Артем", "Москва", 1995, "директором по развитию бизнеса");
        System.out.println(maksim.toString());
        System.out.println(anya.toString());
        System.out.println(katya.toString());
        System.out.println(artem.toString());


        Car car1 = new Car("Lada","Granta", 1.7, "желтый", 2015, "Россия" );
        Car car2 = new Car("Audi","A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия" );
        Car car3 = new Car("BMW","Z8", 3.0, "черный", 2021, "Германия" );
        Car car4 = new Car("Kia","Sportage 4-го поколения", 2.4, "красный", 2016, "Южная Корея" );
        Car car5 = new Car("Hyundai","Avante", 1.6, "оранжевый", 2016, "Южная Корея" );
        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());
        System.out.println(car4.toString());
        System.out.println(car5.toString());
    }
}