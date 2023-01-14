import Transport.Car;
import Transport.Bus;
import Transport.Transport;

public class Main {
    public static void main(String[] args) {

        Bus pazik = new Bus("PAZ", "53210", "Black", 1975,"USSR", 100);
        Bus balabus = new Bus("Balabus", "dus", "white", 2010, "Ephiopia", 200);
        Bus electrobus = new Bus("Electrobus", "eBus", "green", 2020, "Russia", 250);

        Car ladaGranta = new Car("Lada", "Granta",0,"Yellow",2015,"Russia", 180,
                "automatic", "sedan", "х666хх161",5, true, true, false);

        System.out.println(ladaGranta);
        System.out.println();
        System.out.println(pazik);
        System.out.println();
        System.out.println(balabus);
        System.out.println();
        System.out.println(electrobus);


//        Transport.Car audiA8 = new Transport.Car("Audi", "A8 50 L TDI quattro", 0.0,"Black", 2020, "Germany");
//        audiA8.printAutomobile();
//
//        System.out.println();
//
//        Transport.Car bmwZ8 = new Transport.Car("BMW","Z8",3.0,"Black",2021,"Germany");
//        bmwZ8.printAutomobile();
//
//        System.out.println();
//
//        Transport.Car kiaSportage = new Transport.Car("Kia", "Spotrage QL",2.4,"Red",2018,"South Korea");
//        kiaSportage.printAutomobile();
//
//        System.out.println();
//
//        Transport.Car hyundaiAvante = new Transport.Car("Hyundai","Avante",1.6, "Orange", 2016, "South Korea" );
//        hyundaiAvante.printAutomobile();



    }
}