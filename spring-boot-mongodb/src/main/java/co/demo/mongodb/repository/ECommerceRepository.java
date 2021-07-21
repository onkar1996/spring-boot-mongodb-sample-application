package co.demo.mongodb.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import co.demo.mongodb.entity.User;

@Repository
public interface ECommerceRepository extends MongoRepository<User, Long> {

	List<User> findAllByName(String name);

	@Query("{'Address.city':?0}")
	List<User> findByCity(String city);

}
