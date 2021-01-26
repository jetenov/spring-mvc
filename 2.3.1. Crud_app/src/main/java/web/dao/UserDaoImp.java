package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao {
    private List<User> userList;
    {
        userList = new ArrayList<>();
        userList.add(new User(777, "Porsh", "red"));
        userList.add(new User(888, "Ferrari", "blue"));
        userList.add(new User(999, "Lambo", "orange"));
        userList.add(new User(100, "Toyota", "white"));
        userList.add(new User(000, "BMW", "black"));
    }
    @Override
    public List<User>  createCarList() {
        return userList;
    }

    @Override
    public List<User> getCarList(int count) {
        return userList.subList(0, count);
    }
}
