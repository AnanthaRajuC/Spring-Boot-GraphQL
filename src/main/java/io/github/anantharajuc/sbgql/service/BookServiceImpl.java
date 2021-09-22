package io.github.anantharajuc.sbgql.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import io.github.anantharajuc.sbgql.repository.BooksRepository;
import lombok.extern.log4j.Log4j2;

/**
 * Books Service Implementation.
 * 
 * @author <a href="mailto:arcswdev@gmail.com">Anantha Raju C</a>
 */
@Log4j2
@Service
@Component
public class BookServiceImpl implements IBooksService
{
	@Autowired
	private BooksRepository booksRepository;

	@Override
	public long countBooks() 
	{
		log.info("-----> countBooks service: ");
		
		return booksRepository.count();
	}
}
