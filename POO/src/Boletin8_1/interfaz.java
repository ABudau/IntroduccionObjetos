package Boletin8_1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import Ejemplos.Persona;
import java.time.LocalDate;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.net.URL;

import javax.swing.SwingConstants;

public class interfaz extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					interfaz frame = new interfaz();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public interfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTituloPrincipal = new JLabel("PIRATAGOCHI");
		lblTituloPrincipal.setHorizontalAlignment(SwingConstants.CENTER);
		lblTituloPrincipal.setFont(new Font("Arial Black", Font.BOLD, 13));
		lblTituloPrincipal.setForeground(new Color(255, 128, 64));
		lblTituloPrincipal.setBounds(72, 34, 176, 25);
		contentPane.add(lblTituloPrincipal);
		
//		URL url = new URL("D:\\Downloads\\img_interfaz\\naruto.gif");
//	    Icon icon = new ImageIcon(url);
//	    JLabel label = new JLabel(icon);
//		JLabel lblImagen = new JLabel(icon);
		
		JFrame f = new JFrame("Animation");
//	    f.getContentPane().add(lblImagen);
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    f.pack();
	    f.setLocationRelativeTo(null);
	    f.setVisible(true);
		//
//		lblImagen.setHorizontalAlignment(SwingConstants.CENTER);
////		lblImagen.setIcon(new ImageIcon("D:\\Downloads\\img_interfaz\\naruto.gif"));
//		lblImagen.setBounds(57, 70, 215, 147);
//		contentPane.add(lblImagen);

		
		JLabel lblFondo = new JLabel("New label");
		lblFondo.setIcon(new ImageIcon("D:\\Downloads\\img_interfaz\\fondo.jpeg"));
		lblFondo.setBounds(39, 23, 258, 194);
		contentPane.add(lblFondo);
	}
}
