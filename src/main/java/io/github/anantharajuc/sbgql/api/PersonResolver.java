package io.github.anantharajuc.sbgql.api;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coxautodev.graphql.tools.GraphQLResolver;

import io.github.anantharajuc.sbgql.domain.model.person.Person;
import io.github.anantharajuc.sbgql.domain.model.person.dto.BooksDTO;
import io.github.anantharajuc.sbgql.domain.model.person.dto.PersonDTO;
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
	
	public BooksDTO getBooksList(PersonDTO personResponse)
	{
		return modelMapper.map(booksRepository.findById(personResponse.getId()).orElseThrow(null), BooksDTO.class);
	}
}
  