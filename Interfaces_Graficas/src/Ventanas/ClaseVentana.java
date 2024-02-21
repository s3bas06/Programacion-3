package Ventanas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ClaseVentana extends JFrame {

	public ClaseVentana() {
		
		this.setSize(1000,500);

		this.setVisible(true);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setLocation(200,100);

		this.setResizable(true);

		this.setTitle("Mi ventana");

		this.setMinimumSize(new Dimension(250,250));

		this.setMaximumSize(new Dimension(1000,750));

		this.setLocationRelativeTo(null);

		IniciarComponentes();

		this.setLayout(null);
	}
	
	private void IniciarComponentes() {
		
		//Login
		JPanel login = new JPanel();
		login.setSize(this.getWidth()/2,this.getHeight());
		login.setBackground(Color.GRAY);
		login.setLayout(null);

		JLabel login_tittle = new JLabel("ACCEDER",0); //El 0 es para centrar el texto dentro del JLabel.
		login_tittle.setSize(330,40);
		login_tittle.setFont(new Font("ARIAL", Font.BOLD, 40));
		login_tittle.setForeground(Color.BLACK);
		login_tittle.setLocation(90,30); //SetBounds es una alternativa.
		login_tittle.setOpaque(true);
		login_tittle.setBackground(Color.RED);
		login.add(login_tittle);
		
		JLabel user_tittle = new JLabel("Nombre de usuario:");
		user_tittle.setBounds(20,80,500,30);
		user_tittle.setFont(new Font("ARIAL", Font.BOLD, 25));
		user_tittle.setForeground(Color.black);
		user_tittle.setLayout(null);
		login.add(user_tittle);
		
		
		JTextField user = new JTextField();
		user.setSize(300,40);
		user.setLocation(20,120);
		login.add(user);	
		
		JLabel password_tittle = new JLabel("Contraseña:");
		password_tittle.setBounds(20,170,500,30);
		password_tittle.setFont(new Font("ARIAL", Font.BOLD, 25));
		password_tittle.setForeground(Color.black);
		password_tittle.setLayout(null);
		login.add(password_tittle);
		
		JPasswordField password = new JPasswordField();
		password.setSize(300,40);
		password.setLocation(20,210);
		login.add(password);
		
		JCheckBox recordarme = new JCheckBox();
		recordarme.setSize(120,15);
		recordarme.setText("Recordarme");
		recordarme.setFont(new Font("ARIAL",Font.BOLD,14));
		recordarme.setForeground(Color.black);
		recordarme.setBackground(Color.GRAY);
		recordarme.setLocation(20,260);
		login.add(recordarme);		
		
		JLabel olvidaste = new JLabel("¿Olvidó su contraseña?");
		olvidaste.setBounds(150,260,500,15);
		olvidaste.setFont(new Font("ARIAL", Font.BOLD, 14));
		olvidaste.setForeground(Color.black);
		olvidaste.setLayout(null);
		login.add(olvidaste);
		
		JButton acceder = new JButton();
		acceder.setBounds(60,300, 200, 50);
		acceder.setText("Acceder");
		acceder.setFont(new Font("ARIAL",Font.BOLD,25));
		login.add(acceder);
		
		/*Register
		JPanel register = new JPanel();
		login.setSize(this.getWidth()/2,this.getHeight());
		register.setLocation(500,0);
		register.setBackground(Color.RED);
		register.setLayout(null);
		
		*/

		this.add(login);
		//this.add(register);
	}
	
	private static final long serialVersionUID = 1L;
}
