package JPAControladorDAO;

import java.util.List;

import entidades.Libro;

public interface LibroFacade extends AbstractFacadeJPA<Libro>{

	List<Libro> buscarPorAutor(String autor);
	List<Libro> buscarPorTitulo(String titulo);
	List<Libro> buscarTodos();
	Object contador();
}
