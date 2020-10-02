package novi.basics;

public class Car {

    String year;
    String Brand;
    String licensePlate;
    int kilometers;
    double initialPrice;
    double sellingPrice;
    enum Type {
        HATCHBACK,
        CABRIOLET,
        SUV,
        CROSSOVER,
        SEDAN,
        CONVERTABLE,
        COUPE
    }

    public Car(String year, String brand, String licensePlate, int kilometers, double initialPrice, Type type) {
        this.year = year;
        Brand = brand;
        this.licensePlate = licensePlate;
        this.kilometers = kilometers;
        this.initialPrice = initialPrice;
        this.sellingPrice = sellingPrice;
    }

    public double askPriceVatInclusive() {
        return this.initialPrice /100 *121;
    }

    public double sellPriceVatInclusive() {
        return this.sellingPrice /100 *121;
    }

    public String getYear() {
        return year;
    }

    public String getBrand() {
        return Brand;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public int getKilometers() {
        return kilometers;
    }

    public double getInitialPrice() {
        return initialPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }
    public void dealCheck() {
        if(sellPriceVatInclusive() < askPriceVatInclusive()) {
            double difference = askPriceVatInclusive() - sellPriceVatInclusive();
            System.out.println("This was a BAD deal! You lost "+ difference);
        } else {
            double difference = sellPriceVatInclusive() - askPriceVatInclusive();
            System.out.println("This was a GOOD deal! You earned "+ difference);
        }
    }

    @Override
    public String toString() {
        return "\t\t---Car---" + "\n" +
                "\t\tYear: " + year + "\n" +
                "\t\tBrand: " + Brand + "\n" +
                "\t\tLicense Plate: " + licensePlate + "\n" +
                "\t\tKilometers: " + kilometers +"\n" +
                "\t\tInitial Price: " + initialPrice +"\n" +
                "\t\tSellingPrice: " + sellingPrice +"\n" +
                "\t\tInitial Price INCL VAT: " + this.askPriceVatInclusive() +"\n" +
                "\t\tSelling Price INCL VAT: " + this.sellPriceVatInclusive() +"\n";
    }
}
