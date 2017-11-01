package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

import JPAControladorDAO.LibroFacadeImpl;
import entidades.Libro;
import vista.VistaLibrosInsertar;

public class ControladorLibrosInsertar implements ActionListener {

	private VistaLibrosInsertar vista;
	private LibroFacadeImpl modelo;

	public ControladorLibrosInsertar(VistaLibrosInsertar vista, LibroFacadeImpl modelo){
		this.vista = vista;
		this.modelo = modelo;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		EntityManagerFactory emfactory=Persistence.createEntityManagerFactory("Persistencia");
		EntityManager emanager=emfactory.createEntityManager();
		
		//emanager.getTransaction().begin();

		
		
		//emanager.getTransaction().commit();
		
		
		
		
		if(vista.getTextoISBN().isEmpty() || vista.getTextoTitulo().isEmpty() || vista.getTextoAutor().isEmpty())
			JOptionPane.showMessageDialog(vista, "No pueden quedar campos vacíos", "Datos incorrectos", JOptionPane.ERROR_MESSAGE);
		else {
			emanager.getTransaction().begin();
			modelo.create(new Libro(vista.getTextoISBN(), vista.getTextoTitulo(), vista.getTextoAutor(), (byte)0));
			emanager.getTransaction().commit();
			
			JOptionPane.showMessageDialog(vista, "Se inserto correctamente", "Insertado", JOptionPane.INFORMATION_MESSAGE);
		}
				
		

	}


}
