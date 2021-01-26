package web.dao;

import web.model.Car;

import java.util.List;

public interface UserDao {
    List<Car>  createCarList();
    List<Car> getCarList(int cout);
}
