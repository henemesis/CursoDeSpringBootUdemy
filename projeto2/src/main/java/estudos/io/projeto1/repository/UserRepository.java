package estudos.io.projeto1.repository;

//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import estudos.io.projeto1.entity.User;

public interface UserRepository extends MongoRepository<User, Long>{

	
//	O long é em funçao do ID da classe User;	
//	
//	@Query("select u from User u where u.name like %?1%")
//	User findByNameQualquerCoisa(String name);
//	
	@Query("{'email' : ?0 }")
	User findByEmailQualquerCoisa(String email);
	
	User findByNameIgnoreCaseLike(String name);
	
	
}
