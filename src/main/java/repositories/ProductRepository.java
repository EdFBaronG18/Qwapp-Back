package repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import entities.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long>{

}
