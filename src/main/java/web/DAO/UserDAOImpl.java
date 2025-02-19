package web.DAO;


import org.springframework.stereotype.Repository;
import web.Model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void addUser(User user) {
        entityManager.persist(user);
    }


    @Override
    public void deleteUser(User user) {
        entityManager.remove(entityManager.merge(user));
    }

    @Override
    public List<User> getAllUsers() {
        TypedQuery<User> query = entityManager.createQuery("from User", User.class);
        return query.getResultList();
    }

    @Override
    public User getUserById(long id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void updateUser(long id,String name,String email,int age) {
        User user = entityManager.find(User.class,id);
        user.setName(name);
        user.setEmail(email);
        user.setAge(age);

    }
}
