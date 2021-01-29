package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> UserList();
    void add(User user);
    User getById(Long id);
    void update(User user);
    void delete(User user);
}
