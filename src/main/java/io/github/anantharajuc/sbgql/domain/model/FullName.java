package io.github.anantharajuc.sbgql.domain.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level=AccessLevel.PRIVATE)
public class FullName 
{
	String firstName;
	
	String lastName;
}
