package estudos.io.projeto1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import estudos.io.projeto1.service.UserService;

@Controller
public class UserController {
//	A responsabilidade dessa classe é enviar e receber requisições
//	para a model e para a view.
	
	@Autowired
//	Agora o Autowired chamará a camada service, como o demosntrado abaixo.
	private UserService userService;
	
//	private UserRepository userRepository; // Com o @Autowired eu posso remover o construtor logo abaixo
//	em função da injeção de dependências.

//	CONSTRUTOR DA CLASSE
//	public UserController(UserRepository userRepository) {
//		this.userRepository = userRepository;
//	}
//	
	@RequestMapping("/user") //Mapeia a rota até a chegada neste método --> Injeção de dependência!!
	public String getUsers(Model model) {
		model.addAttribute("usersList", this.userService.findAll());
		return "user";
	}
	
//	O IDEAL É NÃO CRIAR NENHUMA REGRA DE NEGÓCIO NA CONTROLER. DEIXEMOS TUDO NA SERVICE;
}
