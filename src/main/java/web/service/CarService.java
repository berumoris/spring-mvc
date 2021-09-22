package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {

    List <Car> carList = new ArrayList<>();
    List <Car> returnList = new ArrayList<>();

    public void addFiveCars() {
        carList.add(new Car("Kia", "Chan", 42));
        carList.add(new Car("BMW", "Ivan", 59));
        carList.add(new Car("Opel", "Jo", 178));
        carList.add(new Car("Zil", "Kristen", 27582));
        carList.add(new Car("Volvo", "Norris", 2));
    }

    public List getSeveralCars(int count) {
        for(int i = 0; i < count; i++) {
            returnList.add(carList.get(1));
        }
        return returnList;
    }
}
