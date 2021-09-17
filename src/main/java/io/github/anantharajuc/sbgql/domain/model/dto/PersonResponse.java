package io.github.anantharajuc.sbgql.domain.model.dto;

import java.util.List;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@FieldDefaults(level=AccessLevel.PRIVATE)
public class PersonResponse 
{
	Long id;
	String name;
	String email;
	String mobileNumber;
	Boolean isAdult;
	Integer age;
	List<BooksResponse> books;
}
