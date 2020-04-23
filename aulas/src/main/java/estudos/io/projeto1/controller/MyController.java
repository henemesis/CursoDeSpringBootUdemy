package estudos.io.projeto1.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

@ComponentScan(basePackages = {"estudos.io.projeto1.service", "estudos.io.projeto1.controller"}) // Realiza o mapeamento de pacotes

public class MyController {
	
	@RequestMapping("/")
	public String hello() {
		System.out.println("Entrei no método hello");
		return "olá";
//		O teste acima demonstra que a Controller está funcionando;
//		  Quando acessado localhost:8080 o restultado será printado
//		no terminal
	}
}
