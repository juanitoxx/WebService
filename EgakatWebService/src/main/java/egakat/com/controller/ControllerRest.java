package egakat.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import egakat.com.model.User;
import egakat.com.repositoryimpl.UserRepositoryImpl;

@RestController
public class ControllerRest {

	@Autowired
	private UserRepositoryImpl userRepositoryImpl;
	
	@GetMapping(value = "/Users", produces = { MediaType.APPLICATION_JSON_VALUE})
    public List<User> getAllUsers() {
        return userRepositoryImpl.getUsers();
	}
	
	@GetMapping(value = "/Users/{id}", produces = { MediaType.APPLICATION_JSON_VALUE} )
	public User getUserById(@PathVariable("id") Integer id) {
		return userRepositoryImpl.getUserById(id);
	}
	
	@PostMapping(value = "/Users", produces = { MediaType.APPLICATION_JSON_VALUE})
	public User addUser(@RequestBody User user) {
		return userRepositoryImpl.addUser(user);
	}
	
	@PutMapping(value = "/Users/{id}", produces = { MediaType.APPLICATION_JSON_VALUE})
	public User updateUser(@RequestBody User user, @PathVariable("id") Integer id) {
		User users = userRepositoryImpl.getUserById(id);
		users.setUserName(user.getUserName());
		users.setPassword(user.getPassword());
		return userRepositoryImpl.addUser(users);
			
	}
	
	@DeleteMapping(value = "/Users/{id}", produces = { MediaType.APPLICATION_JSON_VALUE})
	public void deleteUser(@PathVariable("id") Integer id) {
		userRepositoryImpl.deleteUser(id);
	}
	
	
}
