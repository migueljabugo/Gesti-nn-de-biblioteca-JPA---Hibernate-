package entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
@Table(name="LIBROS",catalog="biblio", uniqueConstraints={
		@UniqueConstraint(columnNames="ISBN")
})

@NamedQueries({
	@NamedQuery(name=Libro.BUSCAR_ISBN, query = "SELECT l FROM Libro l where l.isbn= :id"),
	@NamedQuery(name = Libro.BUSCAR_TITULO, query = "SELECT l FROM Libro l order by l.titulo desc")
	
})

public class Libro implements Serializable {
	public static final String BUSCAR_ISBN="Libro.seleccionarISBN";
	public static final String BUSCAR_TITULO="Libro.seleccionarTitulo";
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="ISBN",unique=true,nullable=false)
	private String isbn;
	
	@Column(name="AUTOR")
	private String autor;
	
	@Column(name="TITULO")
	private String titulo;
	
	@Column(name="PRESTADO")
	private byte prestado;
	
	
	
	public Libro() {
	}

	
	
	public Libro(String isbn, String autor, String titulo, byte prestado) {
		this.isbn=isbn;
		this.autor=autor;
		this.titulo=titulo;
		this.prestado=prestado;
	}



	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public byte getPrestado() {
		return prestado;
	}

	public void setPrestado(byte prestado) {
		this.prestado = prestado;
	}
	
	
	

}
