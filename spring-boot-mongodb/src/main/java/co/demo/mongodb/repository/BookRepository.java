package co.demo.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import co.demo.mongodb.entity.Book;

@Repository
public interface BookRepository extends MongoRepository<Book, String> {

}
