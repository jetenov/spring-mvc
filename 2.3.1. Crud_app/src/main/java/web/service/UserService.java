package web.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import web.model.User;

import java.util.List;

public interface UserService extends UserDetailsService {
    List<User> UserList();
    void add(User user);
    User getById(Long id);
    void update(User user);
    void delete(User user);
    UserDetails loadUserByUsername(String s);
}
