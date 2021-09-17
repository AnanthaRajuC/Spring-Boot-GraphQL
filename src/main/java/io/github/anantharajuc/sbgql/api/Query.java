package io.github.anantharajuc.sbgql.api;

import java.time.LocalDateTime;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import io.github.anantharajuc.sbgql.domain.model.FullName;
import io.github.anantharajuc.sbgql.domain.model.dto.PersonResponse;
import io.github.anantharajuc.sbgql.domain.model.person.Person;
import io.github.anantharajuc.sbgql.service.PersonServiceImpl;

@Component
public class Query implements GraphQLQueryResolver
{
	@Autowired
	private PersonServiceImpl personServiceImpl;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public PersonResponse findPersonById(long id)
	{
		return modelMapper.map(personServiceImpl.findPersonById(id), PersonResponse.class);
	}

	public String getString()
	{
		return "Hello GraphQL World! "+LocalDateTime.now();
	}
	
	public String getGreetingsFirstName(String firstName)
	{
		return "Hello "+firstName+ "! "+LocalDateTime.now();
	}
	
	public String getGreetingsFullName(String firstName, String lastName)
	{
		return "Hello "+firstName+" "+lastName+ "! "+LocalDateTime.now();
	}
	
	public String getGreetingsFullNameJSONrequest(FullName fullName)
	{
		return "Hello "+fullName.getFirstName()+" "+fullName.getLastName()+ "! "+LocalDateTime.now();
	}
	
	/*public Person findPersonById(long id)
	{
		return personServiceImpl.findPersonById(id);
	}*/
}
