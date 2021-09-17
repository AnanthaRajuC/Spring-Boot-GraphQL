package io.github.anantharajuc.sbgql.domain.model.person.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level=AccessLevel.PRIVATE)
public class BooksDTO 
{
	String title;
}
