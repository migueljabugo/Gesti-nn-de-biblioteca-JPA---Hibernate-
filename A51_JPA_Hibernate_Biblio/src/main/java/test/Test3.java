package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import JPAControladorDAO.LibroFacadeImpl;
import entidades.Libro;

public class Test3 {

	

	public static void main(String[] args) {
		EntityManagerFactory emfactory=Persistence.createEntityManagerFactory("Persistencia");
		EntityManager emanager=emfactory.createEntityManager();
		LibroFacadeImpl lf=new LibroFacadeImpl();
		
		TypedQuery<Libro> consultaLibrosISBN=lf.getEm().createNamedQuery("Libro.seleccionarISBN",Libro.class);
		
	}

}
