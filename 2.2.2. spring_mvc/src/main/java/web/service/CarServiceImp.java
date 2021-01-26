package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarService {
    @Autowired
    private CarDao userDao;

    @Override
    public List<Car>  createCarList() {
        return userDao.createCarList();
    }

    @Override
    public List<Car> getCarList(int cout) {
        return userDao.getCarList(cout) ;
    }
}
