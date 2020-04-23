package estudos.io.projeto1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

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
		
		Role role = new Role("Admin", StatusRole.ATIVO);
		
//		this.roleRepository.save(role);
		
		User user = new User();
		user.setName("Thiago");
		user.setEmail("thiago@email.com");
		user.setRole(role);
		this.userRepository.save(user);
		
		List<User> userR = this.userRepository.findAll();
		
		for (User user2 : userR) {
			Role role2 = user2.getRole();
			
			
			
			System.out.println(role2.getName());
		}

	}
	
	
}
