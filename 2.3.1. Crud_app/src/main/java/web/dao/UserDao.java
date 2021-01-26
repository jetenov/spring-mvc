package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    List<User> createCarList();
    List<User> getCarList(int count);
}
