package JPAControladorDAO;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import entidades.Libro;

public class LibroFacadeImpl extends AbstractFacadeJPAImp<Libro> implements LibroFacade{

	
	public LibroFacadeImpl() {
		super(Libro.class);
		
	}

	@Override
	public List<Libro> buscarPorAutor(String autor) {
		TypedQuery<Libro> q= em.createQuery("SELECT p FROM Libro AS p WHERE (p.autor LIKE :patron)",Libro.class);
		q.setParameter("patron", "%"+autor+"%");
		return q.getResultList();
	}

	@Override
	public List<Libro> buscarPorTitulo(String titulo) {
		TypedQuery<Libro> q=em.createQuery("SELECT p FROM Libro AS p WHERE (p.titulo LIKE :patron)",Libro.class);
		q.setParameter("patron", "%"+titulo+"%");
				return q.getResultList();
	}

	@Override
	public List<Libro> buscarTodos() {
		TypedQuery<Libro>q=em.createQuery("SELECT p FROM Libro AS p", Libro.class);
		return q.getResultList();
	}

	@Override
	public Object contador() {
		try{
		Query q= em.createQuery("SELECT COUNT(p) FROM Libro AS p");
		Object result=q.getSingleResult();
		return result;
		}
		catch(Exception e){
			System.out.println("jpql incorrecto");
		}
		return -1;
	}

	public EntityManager getEm() {
		return em;
	}

	
	
	
	
	


}
