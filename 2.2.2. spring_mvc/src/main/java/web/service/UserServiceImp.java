package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.UserDao;
import web.dao.UserDaoImp;
import web.model.Car;

import java.util.List;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<Car>  createCarList() {
        return userDao.createCarList();
    }

    @Override
    public List<Car> getCarList(int cout) {
        return userDao.getCarList(cout) ;
    }
}
