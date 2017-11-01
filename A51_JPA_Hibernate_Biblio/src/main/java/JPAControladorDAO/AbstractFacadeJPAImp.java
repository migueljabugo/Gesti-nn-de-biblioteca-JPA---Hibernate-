package JPAControladorDAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import util.UtilJPA;

public class AbstractFacadeJPAImp<T> implements AbstractFacadeJPA<T> {
	
	private Class<T> entityClass;
	protected EntityManager em;
	
	public  AbstractFacadeJPAImp(Class<T> entityClass){
		this.entityClass=entityClass;
		em=UtilJPA.getEntityManager();
	}
	
	@Override
	public Boolean create(T entity) {
		em.getTransaction().begin();
		try{
			em.persist(entity);
			em.getTransaction().commit();
			return true;
		}
		catch(Exception e){
			em.getTransaction().rollback();
			System.err.println("Ha ocurrido un error al GUARDAR");
			return false;
		}
	}
	
	
	@Override
	public void update(T entity) {
		EntityTransaction tx =em.getTransaction();
		tx.begin();
		try{
			em.merge(entity);
			tx.commit();
			System.out.println("Actualizacion exitosa");
		}catch(Exception e){
			tx.rollback();
			System.err.println("Ha ocurrido un error al actualizar");
			e.printStackTrace();
		}
	}
	
	
	@Override
	public void remove(T entity) {
		em.remove(entity);
	}
	
	@Override
	public T find(Object id) {
		return em.find(entityClass, id);
	}

	
	
	
	
}
