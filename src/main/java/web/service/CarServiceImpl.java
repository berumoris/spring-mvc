package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    @Autowired
    CarDaoImpl carDao;

    public void fiveCarsAdd() {
        carDao.fiveCarsAdd();
    }

    public List<Car> getAllCars() {
        return carDao.getAllCars();
    }

    public List<Car> getSeveralCars(int amount) {
        return carDao.getSeveralCars(amount);
    }
}
