package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import web.dao.CarDaoImp;
import web.models.Car;
import web.service.CarServiceImp;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    private CarServiceImp carServiceImp;

    @Autowired
    private CarController(CarServiceImp carServiceImp) {
        this.carServiceImp = carServiceImp;
    }

    @GetMapping("/cars")
    public String getSomeCars(@RequestParam("count") String count, ModelMap model) {
        ;
        if (count == null) {
            model.addAttribute("carsList", carServiceImp.getCars());
        } else {
            model.addAttribute("carsList", carServiceImp.getSomeCars(Integer.parseInt(count)));
        }
        return "cars";
    }

}
