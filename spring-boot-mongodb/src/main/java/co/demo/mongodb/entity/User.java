package co.demo.mongodb.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Document(collection = "order_DB")
public class User {
	@Id
	private Long id;
	private String name;
	private String gender;
	private List<Product> products;
	private Address address;
}
