package estudos.io.projeto1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import estudos.io.projeto1.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{ // Implementa o objeto e o id utilizado pelo objeto.

	
	@Query("select u from User u where u.name like %?1%") // ? Atributo a ser passado 1 --> Posição do atributo retornado.
//	% parâmetro que busca tudo a esquerda, exemplo == seph
//	% parâmetro final que busca tudo a direita, exemplo == jo
	
	User findByName(String name);

	User findByEmail(String email);
	
}
