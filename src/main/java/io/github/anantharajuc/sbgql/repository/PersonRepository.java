package io.github.anantharajuc.sbgql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.github.anantharajuc.sbgql.domain.model.person.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>
{

}
