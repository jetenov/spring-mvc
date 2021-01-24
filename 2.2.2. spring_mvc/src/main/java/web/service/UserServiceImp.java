package web.service;

import web.dao.UserDao;
import web.dao.UserDaoImp;
import web.model.Car;

import java.util.List;

public class UserServiceImp implements UserService {
    private UserDao userDao;

    public UserServiceImp() {
        userDao = new UserDaoImp();
    }

    @Override
    public List<Car>  createCarList() {
        return userDao.createCarList();
    }

    @Override
    public List<Car> getCarList(int cout, List<Car> carList) {
        return userDao.getCarList(cout, carList) ;
    }
}
