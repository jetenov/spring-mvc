package web.service;

import web.model.Car;

import java.util.List;

public interface UserService {
    List<Car>  createCarList();
    List<Car> getCarList(int cout, List<Car> carList);
}
