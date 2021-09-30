package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {

    void fiveCarsAdd();
    List<Car> getAllCars();
    List<Car> getSeveralCars(int amount);
}
