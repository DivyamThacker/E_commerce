package com.example.demo.user;

import java.util.List;

// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.user.repository.UserRepository;


@RestController
public class UserJpaResource {
	
	private UserRepository userRepository;
	
	public UserJpaResource(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@GetMapping("/users")
	public List<User> retrieveUsers() {
		//return todoService.findByUsername(username);
		return userRepository.findAll();
	}
	
	@PostMapping("/users")
	public User createUser(@RequestBody User user) {
		return userRepository.save(user);
	}

	// @GetMapping("/users/{username}/todos/{id}")
	// public Todo retrieveTodo(@PathVariable String username,
	// 		@PathVariable int id) {
	// 	//return todoService.findById(id);
	// 	return todoRepository.findById(id).get();
	// }

// 	@DeleteMapping("/users/{username}/todos/{id}")
// 	public ResponseEntity<Void> deleteTodo(@PathVariable String username,
// 			@PathVariable int id) {
// 		//todoService.deleteById(id);
// 		todoRepository.deleteById(id);
// 		return ResponseEntity.noContent().build();
// 	}

// 	@PutMapping("/users/{username}/todos/{id}")
// 	public Todo updateTodo(@PathVariable String username,
// 			@PathVariable int id, @RequestBody Todo todo) {
// 		//todoService.updateTodo(todo);
// 		todoRepository.save(todo);
// 		return todo;
// 	}


}