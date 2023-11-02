package interfazEjercicio8;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class VentanaPrincipal extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnAzul;
	private JButton btnRojo;
	private JButton btnVerde;
	private JButton btnFondoAzul;
	private JButton btnFondoRojo;
	private JButton btnFondoVerde;
	private JButton btnOpaca;
	private JButton btnTransparente;
	private JTextPane etiTexto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
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
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 535, 317);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		etiTexto = new JTextPane();
		etiTexto.setToolTipText("");
		etiTexto.setFont(new Font("Tahoma", Font.PLAIN, 20));
		etiTexto.setText("Manuela");
		etiTexto.setBounds(214, 42, 110, 33);
		contentPane.add(etiTexto);
		
		btnAzul = new JButton("Azul");
		btnAzul.setBounds(10, 111, 89, 23);
		contentPane.add(btnAzul);
		btnAzul.addActionListener(this);
		
		btnRojo = new JButton("Rojo");
		btnRojo.setBounds(127, 111, 89, 23);
		contentPane.add(btnRojo);
		btnRojo.addActionListener(this);
		
		btnVerde = new JButton("Verde");
		btnVerde.setBounds(256, 111, 89, 23);
		contentPane.add(btnVerde);
		btnVerde.addActionListener(this);
		
		btnFondoAzul = new JButton("FondoAzul");
		btnFondoAzul.setBounds(10, 176, 110, 23);
		contentPane.add(btnFondoAzul);
		btnFondoAzul.addActionListener(this);
		
		btnFondoRojo = new JButton("FondoRojo");
		btnFondoRojo.setBounds(127, 176, 110, 23);
		contentPane.add(btnFondoRojo);
		btnFondoRojo.addActionListener(this);
		
		btnFondoVerde = new JButton("FondoVerde");
		btnFondoVerde.setBounds(256, 176, 110, 23);
		contentPane.add(btnFondoVerde);
		btnFondoVerde.addActionListener(this);
		
		btnTransparente = new JButton("Transparente");
		btnTransparente.setBounds(392, 176, 117, 23);
		contentPane.add(btnTransparente);
		btnTransparente.addActionListener(this);
		
		btnOpaca = new JButton("Opaca");
		btnOpaca.setBounds(392, 111, 89, 23);
		contentPane.add(btnOpaca);
		btnOpaca.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAzul) {
            etiTexto.setForeground(java.awt.Color.BLUE);
        } else if (e.getSource() == btnRojo) {
            etiTexto.setForeground(java.awt.Color.RED);
        } else if (e.getSource() == btnVerde) {
            etiTexto.setForeground(java.awt.Color.GREEN);
        } else if (e.getSource() == btnFondoAzul) {
            etiTexto.setBackground(java.awt.Color.BLUE);
        } else if (e.getSource() == btnFondoRojo) {
            etiTexto.setBackground(java.awt.Color.RED);
        } else if (e.getSource() == btnFondoVerde) {
            etiTexto.setBackground(java.awt.Color.GREEN);
        } else if (e.getSource() == btnOpaca) {
            etiTexto.setOpaque(true);
        } else if (e.getSource() == btnTransparente) {
            etiTexto.setOpaque(false);
        }
		
	}
}
