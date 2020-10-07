package novi.basics;

import java.util.ArrayList;
import java.util.List;

public class CarSeller {


    private String companyName;
    private List<String> phoneNumbers;
    private String website;
    private String vatNumber;

    List<Car> cars;

    public CarSeller(String companyName, String website, String vatNumber) {
        this.companyName = companyName;
        this.phoneNumbers = phoneNumbers;//BvS vergeten als arg?
        this.website = website;
        this.vatNumber = vatNumber;
        this.cars = new ArrayList<>();
        this.phoneNumbers = new ArrayList<>();
    }

    public boolean addCar(Car car) {
        if (!isInCarList(car)) {
            this.cars.add(car);
            System.out.println("\n" + car.getBrand() + " with licens plate " + car.getLicensePlate() + " added to this seller");
            return true;
        }
        System.out.println("Warning! " + car.getBrand() + " with licens plate " + car.getLicensePlate() + " is already in the car list. This car is not added!");
        return false;
    }

    public boolean addCar(List<Car> incommingCars) {
        boolean success = false;
        for (Car incommingCar : incommingCars) {
            if (!isInCarList(incommingCar)) {
                this.cars.add(incommingCar);
                System.out.println("\n" + incommingCar.getBrand() + " with licens plate " + incommingCar.getLicensePlate() + " added to this seller");
                success = true;
            } else {
                System.out.println("Warning! " + incommingCar.getBrand() + " with licens plate " + incommingCar.getLicensePlate() + " is already in the car list. This car is not added!");
                success = false;
            }
        }
        return success;
    }

    public void addPhoneNumber(String number) {
        this.phoneNumbers.add(number);
        System.out.println(this.phoneNumbers.size() + " phone numbers in total added");
    }

    public int getCarCount() {
        System.out.println("\nThis seller has " + this.cars.size() + (this.cars.size() > 1 ? " cars" : " car "));
        return this.cars.size();
    }

    private boolean isInCarList(Car car) {
        for (Car checkedCar : cars) {
            if (checkedCar.getLicensePlate().equalsIgnoreCase(car.getLicensePlate())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {

        String sellerData = "--- CarSeller ---" + "\n" +
                "Company name: " + companyName + "\n" +
                "Phone Numbers: " + phoneNumbers + "\n" +
                "Website: " + website + '\'' + "\n" +
                "VAT Number: " + vatNumber + '\'' + "\n";

        if(cars.size() > 0) {
            for (Car car : this.cars) {
                sellerData += car.toString();
            }
        }

        return sellerData;
    }
}
