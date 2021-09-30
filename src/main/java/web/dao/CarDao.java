package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDao {
    void fiveCarsAdd();
    List<Car> getAllCars();
    List<Car> getSeveralCars(int amount);
}
