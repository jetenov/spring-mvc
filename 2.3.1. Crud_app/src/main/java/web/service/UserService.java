package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> createCarList();
    List<User> getCarList(int count);
}
