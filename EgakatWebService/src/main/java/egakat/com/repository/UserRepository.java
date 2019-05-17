package egakat.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import egakat.com.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	@Query("select u from User u where id = ?1")
	User userById (Integer Id);
}
