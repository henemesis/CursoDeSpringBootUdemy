package estudos.io.projeto1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import estudos.io.projeto1.StatusRole;
import estudos.io.projeto1.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{
	
	List<Role>findByStatus(StatusRole status);
}
