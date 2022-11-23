package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.dao.CarDaoImp;
import web.models.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarService {

    private CarDaoImp carDaoImp = new CarDaoImp();

    @Override
    public List<Car> getSomeCars(int count) {
        return carDaoImp.getSomeCars(count);
    }

    public List<Car> getCars() {
        return carDaoImp.getCars();
    }
}
