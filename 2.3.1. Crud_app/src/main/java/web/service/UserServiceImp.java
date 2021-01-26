package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.UserDao;
import web.dao.UserDaoImp;
import web.model.User;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserDao userDao;

    public UserServiceImp() {
        userDao = new UserDaoImp();
    }

    @Override
    public List<User>  createCarList() {
        return userDao.createCarList();
    }

    @Override
    public List<User> getCarList(int count) {
        return userDao.getCarList(count) ;
    }
}
