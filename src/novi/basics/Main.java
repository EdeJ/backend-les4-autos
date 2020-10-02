package novi.basics;

import java.util.ArrayList;
import java.util.List;

public class Main {

//    Op de auto verkoopbeurs hebben we verschillende verkopers met verschillende auto's.
//    Van de verkopers willen we de bedrijfsnaam, telefoonnummers, website en btw-nummer registreren. De verkopers kunnen meerdere auto's verkopen.
//
//    Van de auto's willen we het bouwjaar, merk, soort, kenteken en aantal gereden kilometers registreren.
//    Daarnaast heeft elke auto een vraagprijs en willen we de uiteindelijke verkoopprijs registreren.
//    De prijzen die we registreren zijn ex Btw.
//
//    Maak bovenstaande klasse aan.
//
//    Voeg aan de klasse auto twee methodes toes: askPriceVatInclusive() en sellPriceVatInclusive() en laat deze de vraag- en verkoopprijs inclusief btw terugggeven.
//
//    Maak een vijftal verkopers aan. Geeft elke verkoper 2-10 auto's. Druk van elke verkoper zijn auto's af.
//    Het netste is om dit in een toString() methode te doen in Verkoper!

    public static void main(String[] args) {

        // create a car seller
        CarSeller seller1 = new CarSeller("Car World", "www.sellit.com", "56987456");

        // add multiple phone numbers
        seller1.addPhoneNumber("0625489965");
        seller1.addPhoneNumber("0615659874");
        System.out.println("\n");

        // print seller data
        System.out.println(seller1.toString());

        // create a car
        Car car1 = new Car("1975", "beatle", "65-YH-45",123650, 4000, CarType.CABRIOLET);

        // print car data
        System.out.println(car1.toString());

        // set selling price
        car1.setSellingPrice(3500);

        //  get selling price including VAT
        System.out.println("Selling price incl VAT: " + car1.sellPriceVatInclusive());

        // check if this was a good or bad deal?
        car1.dealCheck();

        // add one car to seller
        seller1.addCar(car1);

        // try to add the same car again
        seller1.addCar(car1);

        // check the number of cars this seller has
        seller1.getCarCount();

        // create a list of cars
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("1984", "citroën", "78-TD-99", 240356, 5600, CarType.HATCHBACK));
        carList.add(new Car("1981", "lada", "49-TM-19", 240356, 5600, CarType.CROSSOVER));

        // add multiple cars in one go (method overloading)
        seller1.addCar(carList);

        // print seller data
        System.out.println(seller1.toString());

    }
}
