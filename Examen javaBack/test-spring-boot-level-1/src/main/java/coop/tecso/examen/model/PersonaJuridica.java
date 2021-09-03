package coop.tecso.examen.model;

import javax.persistence.*;
 	

@Entity
@Table(name = "PersonaJuridica")
public class PersonaJuridica {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column (length = 100)
	private String razonSocial;
	private int anio;
	private int rut;
	
	public PersonaJuridica() {
		
	}

	public PersonaJuridica(String razonSocial, int anio, int rut) {
		super();
		this.razonSocial = razonSocial;
		this.anio = anio;
		this.rut = rut;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public int getRut() {
		return rut;
	}

	public void setRut(int rut) {
		this.rut = rut;
	}



	
}
