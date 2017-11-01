package entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="SOCIO",catalog="biblio", uniqueConstraints={
		@UniqueConstraint(columnNames="ID_SOCIO")
})

@NamedQuery(name = "Socio.findAll", query = "Select s from Socio s")
public class Socio implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="ID_SOCIO", unique=true, nullable=false)
	private int idSocio;
	@Column(name="APELLIDOS")
	private String apellidos;
	@Column(name="NOMBRE")
	private String nombre;
	
	
	public Socio(){}


	public int getIdSocio() {
		return idSocio;
	}


	public void setIdSocio(int idSocio) {
		this.idSocio = idSocio;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public String toString() {
		return "Socio [idSocio=" + idSocio + ", apellidos=" + apellidos + ", nombre=" + nombre + "]";
	}
	
	
}
