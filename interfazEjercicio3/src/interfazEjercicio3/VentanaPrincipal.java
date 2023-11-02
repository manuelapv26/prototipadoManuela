package interfazEjercicio3;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;

public class VentanaPrincipal extends JFrame implements ActionListener,KeyListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textTexto;
	private JLabel etiTexto;
	JButton btnVaciar;
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
	@SuppressWarnings("null")
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 515, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textTexto = new JTextField();
		textTexto.setBounds(55, 57, 160, 30);
		contentPane.add(textTexto);
		textTexto.setColumns(10);
		Component txtTexto = null;
		txtTexto.addKeyListener(this);
		
		etiTexto = new JLabel("");
		etiTexto.setFont(new Font("Tahoma", Font.PLAIN, 18));
		etiTexto.setBounds(275, 57, 119, 30);
		contentPane.add(etiTexto);
		
		btnVaciar = new JButton("VACIAR");
		btnVaciar.setBounds(210, 140, 119, 30);
		contentPane.add(btnVaciar);
		btnVaciar.addActionListener(this);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		if(e.getSource()==textTexto) {
			String texto = textTexto.getText();
			etiTexto.setText(texto);
		}
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnVaciar) {
			textTexto.setText("");
			etiTexto.setText("");
		}
		
	}

}

