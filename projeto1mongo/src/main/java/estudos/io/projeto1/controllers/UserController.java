package estudos.io.projeto1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import estudos.io.projeto1.repository.UserRepository;

@Controller
public class UserController {
//	A responsabilidade dessa classe é enviar e receber requisições
//	para a model e para a view.
	
	private UserRepository userRepository;

//	CONSTRUTOR DA CLASSE
	public UserController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@RequestMapping("/user") //Mapeia a rota até a chegada neste método
	public String getUsers(Model model) {
		model.addAttribute("usersList", this.userRepository.findAll());
		return "user";
	}
	
	
}
