package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    void add(User user);
    List<User> UserList();
    User getById(Long id);
    User loadUserByUsername(String s);
    void update(User user);
    void delete(User user);
}
