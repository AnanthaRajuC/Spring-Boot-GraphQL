package io.github.anantharajuc.sbgql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import io.github.anantharajuc.sbgql.domain.model.person.Books;
import io.github.anantharajuc.sbgql.domain.model.person.Person;
import io.github.anantharajuc.sbgql.infra.exception.ResourceNotFoundException;
import io.github.anantharajuc.sbgql.repository.BooksRepository;
import io.github.anantharajuc.sbgql.repository.PersonRepository;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
@Component
public class PersonServiceImpl implements IPersonService
{
	@Autowired
	private PersonRepository personRepository;
	
	@Autowired
	private BooksRepository booksRepository;

	@Override
	public Person findPersonById(Long id) 
	{
		log.info("-----> findPersonById service: "+id);
		
		return personRepository.findById(id)
				               .orElseThrow(() -> new ResourceNotFoundException("Person", "id", id));
	}
	
	public List<Books> findAllBooks() 
	{
		return booksRepository.findAll();
	}
	
	public long countPersons() 
	{
		return personRepository.count();
	}
	
	public long countBooks() 
	{
		return booksRepository.count();
	}
}
 