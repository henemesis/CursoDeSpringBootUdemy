package estudos.io.projeto1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import estudos.io.projeto1.controller.MyController;

@SpringBootApplication
public class AulasApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(AulasApplication.class, args);
		
		MyController controller = (MyController) ctx.getBean("myController");
		
		controller.hello();
	}

}
