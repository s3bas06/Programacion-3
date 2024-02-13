package main_ejemplo;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		
		JFrame ventana = new JFrame("Example");
		ventana.setVisible(true);
		ventana.setSize(700,900);
		ventana.setLocation(50,50);
		
		ventana.setResizable(true);
		
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		System.out.print("hola");
	}

}
