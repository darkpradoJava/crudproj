package mygroup.crudproj.dao;

import mygroup.crudproj.model.User;
import java.util.List;

public interface UserDAO {

    List<User> allUsers();
    void add(User user);
    void delete(User user);
    void edit(User user);
    User getUserById(Long id);

}
