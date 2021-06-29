package com.controleveiculos.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.controleveiculos.exception.ResourceNotFoundException;
import com.controleveiculos.model.User;
import com.controleveiculos.repository.UserRepository;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
	private List<User> users = new ArrayList<>();

	@Autowired
	private UserRepository userRepository;

	@GetMapping("/{id}")
	public User user(@PathVariable("id") Long id) {
		Optional<User> userFind = this.userRepository.findById(id);
		return userFind.orElseThrow(() -> new ResourceNotFoundException(id));
	}

	@PostMapping("/")
	public User user(@RequestBody User user) {
		return this.userRepository.save(user);
	}

	@DeleteMapping("/")
	public void deletaUsuario(@RequestBody @Valid User usuario) {
		userRepository.delete(usuario);
	}

	@GetMapping("/")
	public List<User> list() {
		return this.userRepository.findAll();
	}
	
	@PutMapping("/")
	public User atualizaUsuario(@RequestBody @Valid User usuario) {
		return userRepository.save(usuario);
	}
	 
}
