package estudos.io.projeto1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import estudos.io.projeto1.entity.User;
import estudos.io.projeto1.repository.UserRepository;

@Service
public class UserService {

//	Onde determinamos as regras de negócio;
//	Aqui é determinado algo como: quero paginar o resultado da busca;
//	ou modificar parâmetros na minha busca.
	
	@Autowired
	UserRepository userRepository;
	
	
	public List<User> findAll() {
		return userRepository.findAll();
	}
	
	
}
