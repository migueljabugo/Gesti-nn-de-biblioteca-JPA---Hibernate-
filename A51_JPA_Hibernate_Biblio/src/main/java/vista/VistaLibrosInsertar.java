package vista;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controlador.ControladorLibrosInsertar;

import java.awt.Color;
import javax.swing.SwingConstants;

public class VistaLibrosInsertar extends JPanel {

	private static final long serialVersionUID = -5376036951616948266L;
	private JTextField textoAutor;
	private JTextField textoTitulo;
	private JTextField textoISBN;
	private JButton btnInsertar;
	private JLabel lblAutor;
	private JLabel lblTitulo;
	private JLabel lblIsbn;


	public String getTextoAutor() {
		return textoAutor.getText();
	}

	public void setTextoAutor(String autor) {
		this.textoAutor.setText(autor);;
	}

	public String getTextoTitulo() {
		return textoTitulo.getText();
	}

	public void setTextoTitulo(String titulo) {
		this.textoTitulo.setText(titulo);;
	}

	public String getTextoISBN() {
		return textoISBN.getText();
	}

	public void setTextoISBN(String isbn) {
		this.textoISBN.setText(isbn);;
	}

	public VistaLibrosInsertar() {
		setBounds(100, 100, 550, 370);
		
		this.setBackground(Color.LIGHT_GRAY);
		this.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setLayout(null);
		
		JLabel etiquetaTituloVentana = new JLabel("INSERTAR LIBRO");
		etiquetaTituloVentana.setHorizontalAlignment(SwingConstants.CENTER);
		etiquetaTituloVentana.setBounds(67, 11, 400, 14);
		this.add(etiquetaTituloVentana);
		
		btnInsertar = new JButton("Insertar");
		btnInsertar.setBounds(232, 297, 89, 23);
		this.add(btnInsertar);
		
		textoAutor = new JTextField();
		textoAutor.setBounds(155, 231, 253, 20);
		this.add(textoAutor);
		textoAutor.setColumns(10);
		
		textoTitulo = new JTextField();
		textoTitulo.setBounds(155, 160, 253, 20);
		this.add(textoTitulo);
		textoTitulo.setColumns(10);
		
		textoISBN = new JTextField();
		textoISBN.setBounds(155, 90, 253, 20);
		this.add(textoISBN);
		textoISBN.setColumns(10);
		
		lblAutor = new JLabel("Autor: ");
		lblAutor.setBounds(99, 237, 46, 14);
		this.add(lblAutor);
		
		lblTitulo = new JLabel("Titulo: ");
		lblTitulo.setBounds(99, 166, 46, 14);
		this.add(lblTitulo);
		
		lblIsbn = new JLabel("ISBN:");
		lblIsbn.setBounds(99, 96, 46, 14);
		this.add(lblIsbn);
	}
	
	public void asignaControlador(ControladorLibrosInsertar controlador){
		this.btnInsertar.addActionListener(controlador);
	}
}
