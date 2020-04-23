package estudos.io.projeto1.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

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
	
	@OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
	private List<Functionality> functionalities;
	
	public Role() {
		// TODO Auto-generated constructor stub
	}
	
	public Role(String name, StatusRole status, List<Functionality> functionalities) {
		super();
		this.name = name;
		this.status = status;
		this.functionalities = functionalities;
	}
	

	public Role(String name, StatusRole status) {
		super();
		this.name = name;
		this.status = status;
	}


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

	public List<Functionality> getFunctionalities() {
		return functionalities;
	}

	public void setFunctionalities(List<Functionality> functionalities) {
		this.functionalities = functionalities;
	}
	
	
	
}
