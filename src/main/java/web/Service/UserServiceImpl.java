package web.Service;

import web.DAO.UserDAO;
import web.DAO.UserDAOImpl;
import web.Model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    private final UserDAO userDAO = new UserDAOImpl();


    @Override
    public void addUser(User user) {
        userDAO.addUser(user);
    }

    @Override
    public void editUser(User user) {
        userDAO.editUser(user);
    }

    @Override
    public void deleteUser(User user) {
        userDAO.deleteUser(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }
}
