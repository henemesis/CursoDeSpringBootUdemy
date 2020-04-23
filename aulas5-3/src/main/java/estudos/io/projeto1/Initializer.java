package estudos.io.projeto1;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import estudos.io.projeto1.entity.Functionality;
import estudos.io.projeto1.entity.Role;
import estudos.io.projeto1.entity.User;
import estudos.io.projeto1.repository.UserRepository;

@Component
public class Initializer implements ApplicationListener<ContextRefreshedEvent>{
	
	@Autowired
	private UserRepository userRepository;
	
	
//	@Autowired
//	private RoleRepository roleRepository;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		
		Functionality functionality = new Functionality();
		functionality.setName("Add");
		
		Functionality functionality2 = new Functionality();
		functionality2.setName("Delete");
		
		Role role = new Role("Admin", StatusRole.ATIVO, Arrays.asList(functionality));
		
//		Role role3 = new Role("Aluno", StatusRole.ATIVO); Roda sem o FetchType.EAGER da classe Role.
		
		Role role3 = new Role("Aluno", StatusRole.ATIVO, Arrays.asList(functionality2));
		
//		this.roleRepository.save(role);
		
		User user = new User();
		user.setName("Thiago");
		user.setEmail("thiago@email.com");
		user.setRoles(Arrays.asList(role, role3));
		this.userRepository.save(user);
		
		List<User> userR = this.userRepository.findAll();
		
		
		for (User user2: userR) {
			for (Role role2: user2.getRoles()) {
				for (Functionality f : role2.getFunctionalities()) {
					System.out.println(f.getName());
				}
//				System.out.println(role2.getName()); Imprime os perfis!
			}
		}
		
		
	}
	
	
}
