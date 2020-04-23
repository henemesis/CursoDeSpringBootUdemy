package estudos.io.projeto1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ExemploApplication {
//	Trata-se de um contexto do spring!

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(ExemploApplication.class, args);
		
		MyController  controller = (MyController) ctx.getBean("myController");
		controller.hello();
	}

}
