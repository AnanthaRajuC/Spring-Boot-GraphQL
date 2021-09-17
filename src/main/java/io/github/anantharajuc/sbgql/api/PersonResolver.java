package io.github.anantharajuc.sbgql.api;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coxautodev.graphql.tools.GraphQLResolver;

import io.github.anantharajuc.sbgql.domain.model.dto.BooksResponse;
import io.github.anantharajuc.sbgql.domain.model.dto.PersonResponse;
import io.github.anantharajuc.sbgql.domain.model.person.Books;
import io.github.anantharajuc.sbgql.domain.model.person.Person;
import io.github.anantharajuc.sbgql.repository.BooksRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PersonResolver implements GraphQLResolver<Person>
{
	@Autowired
	private BooksRepository booksRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public BooksResponse getBooksList(PersonResponse personResponse)
	{
		return modelMapper.map(booksRepository.findById(personResponse.getId()).orElseThrow(null), BooksResponse.class);
	}

	/*public Books getBooksList(Person person)
	{
		return booksRepository.findById(person.getId()).orElseThrow(null);
	}*/
}
  