package estudos.io.projeto1.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import estudos.io.projeto1.entity.User;
import estudos.io.projeto1.repository.UserRepository;

@Component // Carga Inicial do BD
public class DataInitilizr implements ApplicationListener<ContextRefreshedEvent>{
	
	// Será aqui que iniciamos os dados!
	@Autowired
	
	//	Chamando a interface UserRepository
	UserRepository userRepository;
	

	@Override
	public void onApplicationEvent(ContextRefreshedEvent arg0) {
		
		//	Recuperando Lista de Usuários do banco
		List<User> users = userRepository.findAll();
		
		if (users.isEmpty()) {
			createUser("Nataniel", "nataniel@email.com");
			createUser("João", "joao@email.com");
			createUser("Maria", "maria@email.com");
		}
	
//		Dados da aula passada Aula 10
//		userRepository.deleteById(2L); // Apagar Usuário pelo ID!
///		User user = userRepository.getOne(1L);
//		user.setName("Reina Caires Souza");
//		System.out.println(user.getName());
//		userRepository.save(user);
		
//		AULA 11
//		EXECUÇÃO DE QUERIES CUSTOMIZADAS. --> Ir para UserRepository!
		
//		QUERY PERSONALIZADA PARA NOME
//		User user = userRepository.findByNameQualquerCoisa("Natan");
//		userRepository.save(user);
//		System.out.println(user.getName());
		
//		User user = userRepository.findByEmail("nataniel@email.com");
		
//		AULA 12
//		User user = userRepository.findByNameIgnoreCaseLike("mari");
//		System.out.println(user.getName());
		
	
//		Aula13
		User user = userRepository.findByEmailQualquerCoisa("nataniel@email.com");
		System.out.println(user.getName());
		
	}
	
	public void createUser(String name, String email) {
		
		User user = new User(name, email);
		userRepository.save(user);
	}
	
}
