package io.github.anantharajuc.sbgql.domain.model.dto;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@FieldDefaults(level=AccessLevel.PRIVATE)
public class PersonResponse 
{
	String name;
	String email;
	String mobileNumber;
}
