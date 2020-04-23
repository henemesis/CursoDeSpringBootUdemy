package estudos.io.projeto1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ExemploApplication {
//	Trata-se de um contexto do spring!

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		ApplicationContext ctx = SpringApplication.run(ExemploApplication.class, args);
		
//		Visto na SEÇÃO 3 AULA 22 @Qualifier
//		VehicleComponent  component=  (VehicleComponent) ctx.getBean("vehicleComponent"); // --> Chamando diretamente a component
//		component.service();
		
	}

}
