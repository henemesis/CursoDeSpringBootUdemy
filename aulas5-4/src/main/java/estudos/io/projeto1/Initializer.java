package estudos.io.projeto1;

import java.util.Arrays;

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
	
	

	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		
		Functionality functionality = new Functionality();
		functionality.setName("Add");
		
		Functionality functionality2 = new Functionality();
		functionality2.setName("Delete");
		
		Role role = new Role("Admin", StatusRole.ATIVO, Arrays.asList(functionality));
		
		
		Role role3 = new Role("Aluno", StatusRole.ATIVO, Arrays.asList(functionality2));
		
		
		User user = new User();
		user.setName("Thiago");
		user.setEmail("thiago@email.com");
		user.setRoles(Arrays.asList(role, role3));
		this.userRepository.save(user);
		
		
		User user2 = new User();
		user2.setName("Joseph");
		user2.setEmail("joseph@email.com");
		this.userRepository.save(user2);
		
		
		User userR = this.userRepository.findByName("Thiago");
		System.out.println(userR.getEmail());
		
		User userR2 = this.userRepository.findByName("Jo");
		System.out.println(userR2.getName());

	}
	
	
}
