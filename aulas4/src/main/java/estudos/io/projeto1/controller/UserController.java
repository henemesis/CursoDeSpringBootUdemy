package estudos.io.projeto1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import estudos.io.projeto1.entity.User;

@Controller
public class UserController {

	@GetMapping("/user") // Rota para mapear o User class
	public String getUser(Model model) {
		
		model.addAttribute("user", new User());
		
		return "user";
		
//		O formulário enviado será via post!
	}
	
	@PostMapping("/user")
	public String userSubmit(@ModelAttribute User user) {
		
		return "result";
	}
}
