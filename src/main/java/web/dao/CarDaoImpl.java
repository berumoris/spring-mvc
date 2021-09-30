package web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Component
public class CarDaoImpl implements CarDao{

    List<Car> cars = new ArrayList<>();

    @Override
    public void fiveCarsAdd() {
        cars.add(new Car("Kia", "Chan", 42));
        cars.add(new Car("BMW", "Ivan", 59));
        cars.add(new Car("Opel", "Jo", 178));
        cars.add(new Car("Zil", "Kristen", 27582));
        cars.add(new Car("Volvo", "Norris", 2));
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }

    @Override
    public List<Car> getSeveralCars(int amount) {
        return cars.subList(0, amount);
    }
}
