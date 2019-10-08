package repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import entities.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long>{

}
