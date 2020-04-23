package estudos.io.projeto1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import estudos.io.projeto1.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{ // Implementa o objeto e o id utilizado pelo objeto.

}
