package io.github.anantharajuc.sbgql.service;

import io.github.anantharajuc.sbgql.domain.model.person.Person;

public interface IPersonService 
{
	Person findPersonById(Long id);
}