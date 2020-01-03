package mygroup.crudproj.dao;

import mygroup.crudproj.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
