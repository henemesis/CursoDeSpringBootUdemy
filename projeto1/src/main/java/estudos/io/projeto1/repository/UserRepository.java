package estudos.io.projeto1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import estudos.io.projeto1.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
//	O long é em funçao do ID da classe User;	
	
	@Query("select u from User u where u.name like %?1%")
	User findByNameQualquerCoisa(String name);
	
	User findByEmail(String email);
	
	User findByNameIgnoreCase(String name);
	
	
}
