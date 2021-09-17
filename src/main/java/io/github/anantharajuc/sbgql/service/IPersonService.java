package io.github.anantharajuc.sbgql.service;

import io.github.anantharajuc.sbgql.domain.model.person.Books;
import io.github.anantharajuc.sbgql.domain.model.person.Person;

/**
 * Person Service.
 * 
 * @author <a href="mailto:arcswdev@gmail.com">Anantha Raju C</a>
 */
public interface IPersonService 
{
	Person findPersonById(Long id);
	
	Iterable<Books> findAllBooks();
	
	long countPersons();
	
	long countBooks();
}
