package estudos.io.projeto1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// Seção 3. Aula 22

@Component //  @Component --> será utilizado pelo Spring Context
@Qualifier("carBean") // --> Bean do carro
public class Car implements Vehicle{

	@Override
	public void start() {
		System.out.println("Iniciando carro");
	}

	@Override
	public void stop() {
		System.out.println("Parando carro");
	}
	
}
