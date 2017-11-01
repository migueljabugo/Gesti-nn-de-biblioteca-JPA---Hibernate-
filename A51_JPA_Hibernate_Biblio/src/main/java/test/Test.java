package test;

import java.util.List;

import JPAControladorDAO.LibroFacadeImpl;
import entidades.Libro;

public class Test {
	
	public static void main(String[] args){
		Libro l1=new Libro("199","pepito","titulo1",(byte)0);
		Libro l2=new Libro("200","autor1","titulo2",(byte)0);
		Libro l3=new Libro("300","autor2","titulo3",(byte)0);
		Libro l4=new Libro("400","autor3","titulo4",(byte)0);
		
		LibroFacadeImpl lf=new LibroFacadeImpl();
		lf.create(l1);
		lf.create(l2);
		lf.create(l3);
		lf.create(l4);
		
		
		System.out.println("Consultas");
		List<Libro> listaLibrosPorAutor=lf.buscarPorAutor("autor1");
		System.out.println(listaLibrosPorAutor);
		List<Libro> listaLibrosPorMarca=lf.buscarPorTitulo("titulo2");
		System.out.println(listaLibrosPorMarca);
		System.out.println(lf.buscarTodos());
		System.out.println(lf.contador());
		
		
	}
}
