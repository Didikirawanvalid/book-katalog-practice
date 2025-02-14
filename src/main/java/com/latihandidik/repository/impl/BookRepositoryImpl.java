package com.latihandidik.repository.impl;

import java.util.HashMap;
import java.util.Map;

import com.latihandidik.domain.Author;
import com.latihandidik.domain.Book;
import com.latihandidik.repository.BookRepository;

public class BookRepositoryImpl implements BookRepository{
	private Map<Long, Book> bookMap;
	

	public BookRepositoryImpl() {
		super();
		bookMap = new HashMap<Long, Book>();
		Author author = new Author();
		author.setId(1L);
		author.setName("Pramoedya Ananta Toer");
		author.setBirthDate(-16401L);
		
		Book book1 = new Book(author);
		book1.setId(1L);
		book1.setTitle("Bumi Manusia");
		book1.setDescription("Bumi manusia adalah buku buatan Pramoedya Ananta Toer");
		
		
		bookMap.put(book1.getId(), book1);
	}


	@Override
	public Book findBookById(Long id) {
		Book book = bookMap.get(id);
		return book;
	}

}
