package Ventanas;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ClaseVentana extends JFrame {

	public ClaseVentana() {
		setSize(500,500);
		setTitle("Jpanel");
		
		setLocationRelativeTo(null);
		
		IniciarComponentes();
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void IniciarComponentes() {
		JPanel panel = new JPanel();
		
		
		panel.setBackground(Color.GREEN);
		this.getContentPane().add(panel);
		
	}
	
	private static final long serialVersionUID = 1L;
}
