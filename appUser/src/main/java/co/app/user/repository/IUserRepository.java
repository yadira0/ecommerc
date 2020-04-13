package co.app.user.repository;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import co.app.user.model.User;

public interface IUserRepository extends CrudRepository<User, Long>{
	
	@Query("SELECT u FROM User u WHERE u.username= :user AND u.password= :pass")
	List<User> authentic(@Param("user") String user, @Param("pass") String password);

}
