package coop.tecso.examen.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import javax.persistence.Table;

@Entity
@Table (name = "cuentaCorriente")
public class CuentaCorriente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private int numero;
	private String moneda;
	private double saldo;
	
	@ManyToMany (cascade = CascadeType.PERSIST)
	@JoinTable (name = "cuenta_movimiento", joinColumns = @JoinColumn(name = "cuentaCorriente_id"), inverseJoinColumns =  @JoinColumn(name = "movimientos_id") )
	private Set<Movimientos> movimientos =new HashSet<>(); 
	

	public CuentaCorriente() {
		super();
	}


	public CuentaCorriente(long id, int numero, String moneda, double saldo, Set<Movimientos> movimientos) {
		super();
		this.id = id;
		this.numero = numero;
		this.moneda = moneda;
		this.saldo = saldo;
		this.movimientos = movimientos;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getMoneda() {
		return moneda;
	}


	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public Set<Movimientos> getMovimientos() {
		return movimientos;
	}


	public void setMovimientos(Set<Movimientos> movimientos) {
		this.movimientos = movimientos;
	}


	
}
