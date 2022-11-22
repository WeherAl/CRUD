package web.service;

import org.springframework.stereotype.Component;
import web.dao.CarDaoImp;
import web.models.Car;

import java.util.List;

@Component
public class CarServiceImp implements CarService {

    CarDaoImp carDaoImp = new CarDaoImp();

    @Override
    public List<Car> getSomeCars(int count) {
        return carDaoImp.getSomeCars(count);
    }

    public List<Car> getCars() {
        return carDaoImp.getCars();
    }
}
