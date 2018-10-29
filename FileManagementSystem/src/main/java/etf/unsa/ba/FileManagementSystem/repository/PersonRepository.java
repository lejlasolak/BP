package etf.unsa.ba.FileManagementSystem.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import etf.unsa.ba.FileManagementSystem.model.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Integer> {

	public Optional<Person> findById(Integer id);
	public List<Person> findAll();
}
