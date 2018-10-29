package etf.unsa.ba.FileManagementSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import etf.unsa.ba.FileManagementSystem.model.Person;
import etf.unsa.ba.FileManagementSystem.repository.PersonRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
    private PersonRepository personRepository;
	
	public List<Person> getAllUsers() {
		return personRepository.findAll();
	}
}
