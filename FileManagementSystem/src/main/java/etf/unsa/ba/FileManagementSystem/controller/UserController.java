package etf.unsa.ba.FileManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import etf.unsa.ba.FileManagementSystem.model.Person;
import etf.unsa.ba.FileManagementSystem.service.*;

@RestController
public class UserController {

	@Autowired
	private UserServiceImpl userService;
	
	@RequestMapping("/users")
	public List<Person> getAllUsers(){
		return userService.getAllUsers();
	}
}
