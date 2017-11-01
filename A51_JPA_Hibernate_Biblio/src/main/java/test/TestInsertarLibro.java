package test;

import javax.swing.JFrame;

import JPAControladorDAO.LibroFacadeImpl;
import controlador.ControladorLibrosInsertar;
import vista.VistaLibrosInsertar;

public class TestInsertarLibro {

	public static void main(String[] args) {
		JFrame frame=new JFrame();
		frame.setBounds(0, 0, 600, 400);
		VistaLibrosInsertar vista =new VistaLibrosInsertar();
		frame.add(vista);
		frame.setVisible(true);
		
		
		LibroFacadeImpl modelo= new LibroFacadeImpl();
		ControladorLibrosInsertar controlador=new ControladorLibrosInsertar(vista, modelo);
		vista.asignaControlador(controlador);

	}

}
