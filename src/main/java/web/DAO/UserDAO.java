package web.DAO;

import web.Model.User;

import java.util.List;

public interface UserDAO {

    void addUser(User user);
    void deleteUser(User user);
    List<User> getAllUsers();
    User getUserById(long id);
    void updateUser(long id,String name,String email,int age);
}
