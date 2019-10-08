package repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
	public User findByEmailAndPassword(String email, String password);

}
