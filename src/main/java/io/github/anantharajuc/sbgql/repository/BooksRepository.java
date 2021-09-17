package io.github.anantharajuc.sbgql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.github.anantharajuc.sbgql.domain.model.person.Books;

@Repository
public interface BooksRepository extends JpaRepository<Books, Long>
{

}
