package web.Service;

import web.Model.User;

import java.util.List;

public interface UserService {
     void addUser(User user);
     void editUser(User user);
     void deleteUser(User user);
     List<User> getAllUsers();
}
