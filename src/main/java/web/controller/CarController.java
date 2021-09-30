package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDaoImpl;
import web.service.CarService;

@Controller
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping(value = "/cars")
    public String printCars(ModelMap model, @RequestParam(value = "count", required = false) Integer count) {

        if (carService.getAllCars().isEmpty()) {
            carService.fiveCarsAdd();
        }
        if (count == null || count > 4 || count < 0) {
            model.addAttribute("cars", carService.getAllCars());
        } else {
            model.addAttribute("cars", carService.getSeveralCars(count));
        }
        return "cars";
    }
}
