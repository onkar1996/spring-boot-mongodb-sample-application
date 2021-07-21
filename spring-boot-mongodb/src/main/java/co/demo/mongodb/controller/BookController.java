package co.demo.mongodb.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.demo.mongodb.entity.Book;
import co.demo.mongodb.repository.BookRepository;
import io.swagger.annotations.Api;

@RestController
@Api(description = "")
public class BookController {

	@Autowired
	BookRepository bookRepository;

	@PostMapping("/addBook")
	public Book saveBook(@RequestBody Book book) {
		return bookRepository.save(book);
	}

	@GetMapping("/findAllBooks")
	public List<Book> findAllBooks() {
		return bookRepository.findAll();
	}

	@GetMapping("/findBook/{id}")
	public Optional<Book> getBook(@PathVariable String id) {
		return bookRepository.findById(id);
	}

	@DeleteMapping("/deleteBook/{id}")
	public String deleteBook(@PathVariable String id) {
		bookRepository.deleteById(id);
		return "Book deleted with id -> " + id;
	}

}
