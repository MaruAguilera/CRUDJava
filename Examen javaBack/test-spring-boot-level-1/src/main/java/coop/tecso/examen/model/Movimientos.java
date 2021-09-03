package coop.tecso.examen.model;

import java.sql.Date;
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
import javax.persistence.OrderBy;
import javax.persistence.Table;


@Entity
@Table (name = "movimientos")
public class Movimientos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@OrderBy ()
	private Date fecha;
	private String tipoMovimiento;
	private String	descripcion;
	private int saldo;
	
	
	@ManyToMany (cascade = CascadeType.PERSIST)
	@JoinTable (name = "cuenta_movimiento", joinColumns = @JoinColumn(name = "movimientos_id"), inverseJoinColumns =  @JoinColumn(name = "cuentaCorriente_id") )
	private Set<CuentaCorriente> cuentaCorriente =new HashSet<>(); 

	public Movimientos() {
	
	}

	public Movimientos(Date fecha, String tipoMovimiento, String descripcion, int saldo) {
		super();
		this.fecha = fecha;
		this.tipoMovimiento = tipoMovimiento;
		this.descripcion = descripcion;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getTipoMovimiento() {
		return tipoMovimiento;
	}

	public void setTipoMovimiento(String tipoMovimiento) {
		this.tipoMovimiento = tipoMovimiento;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	
	
}
