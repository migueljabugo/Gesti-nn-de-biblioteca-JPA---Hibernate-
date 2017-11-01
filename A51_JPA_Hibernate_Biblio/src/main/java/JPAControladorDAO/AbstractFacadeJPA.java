package JPAControladorDAO;

public interface AbstractFacadeJPA<T> {

	
	
	void update(T entity);
	
	void remove(T entity);
	
	T find(Object id);

	Boolean create(T entity);
	
}
