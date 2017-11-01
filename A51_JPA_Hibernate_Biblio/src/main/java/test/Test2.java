package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import JPAControladorDAO.LibroFacadeImpl;
import entidades.Libro;

public class Test2 {

	public static void main(String[] args) {
		
		EntityManagerFactory emfactory=Persistence.createEntityManagerFactory("Persistencia");
		EntityManager emanager=emfactory.createEntityManager();
		
		emanager.getTransaction().begin();

		Libro l1=new Libro("199","pepito","titulo1",(byte)0);
		emanager.persist(l1);
		emanager.getTransaction().commit();
		
		
		Libro l4=new Libro("199","pepito","titulo1",(byte)0);
		LibroFacadeImpl lf=new LibroFacadeImpl();
		lf.create(l1);
		TypedQuery<Libro> consultLibrosISBN=lf.getEm().createNamedQuery("Libro.seleccionarISBN",Libro.class);
		consultLibrosISBN.setParameter("id", "199");
		Object resu=consultLibrosISBN.getSingleResult();
		System.out.println(resu);

	}

}
