package estudos.io.projeto1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import estudos.io.projeto1.entity.Role;
import estudos.io.projeto1.entity.User;
import estudos.io.projeto1.repository.RoleRepository;
import estudos.io.projeto1.repository.UserRepository;

@Component
public class Initializer implements ApplicationListener<ContextRefreshedEvent>{
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {

		Role role = new Role();
		role.setName("Admin");
		role.setStatus(StatusRole.ATIVO);
		
		Role role2 = new Role();
		role2.setName("Aluno");
		role2.setStatus(StatusRole.INATIVO);
		
		this.roleRepository.save(role);
		this.roleRepository.save(role2);
		
		User user = new User();
		user.setName("Thiago");
		user.setEmail("thiago@email.com");
		user.setRole(role);
		this.userRepository.save(user);
		
		
		User user2 = new User();
		user2.setName("José Couves");
		user2.setEmail("couves@email.com");
		user2.setRole(role2);
		this.userRepository.save(user2);
		
//		Verificando o findByStatus declarado como list na interface RoleRepository
		List<Role> roles = this.roleRepository.findByStatus(StatusRole.ATIVO);
		
//		System.out.println() --> neste for ele retorna os status ativos.
		for (Role role3 : roles) {
			System.out.println(role3.getName());
		}
	}
	
	
}
