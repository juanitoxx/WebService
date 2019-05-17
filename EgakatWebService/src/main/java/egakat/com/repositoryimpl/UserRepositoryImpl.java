package egakat.com.repositoryimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import egakat.com.model.User;
import egakat.com.repository.UserRepository;

@Service
public class UserRepositoryImpl {

	@Autowired
	private UserRepository userRepository;
	
	public User addUser(User user) {
		return userRepository.save(user);
	}
	
	public List<User> getUsers() {
		return userRepository.findAll();
		
	}
	
	public User getUserById(Integer id) {
		return userRepository.userById(id);
	}
	
	public void deleteUser(Integer id) {
		userRepository.deleteById(id);
	}
}
