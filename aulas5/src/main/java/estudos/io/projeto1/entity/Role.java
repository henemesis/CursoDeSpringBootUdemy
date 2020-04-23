package estudos.io.projeto1.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import estudos.io.projeto1.StatusRole;

// Classe de Perfil.

@Entity
public class Role {

	@Id // Chave primária
	@GeneratedValue(strategy = GenerationType.AUTO)

	private Long Id;
	private String name;
	
//	Campo de status usando Enums. Podemos cadastrar status!
	@Enumerated(EnumType.STRING) // "Transforma" de enum númerico para enum string
	private StatusRole status;
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public StatusRole getStatus() {
		return status;
	}
	public void setStatus(StatusRole status) {
		this.status = status;
	}
	
	
	
}
