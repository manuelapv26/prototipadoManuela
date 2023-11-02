package interfazEjercicio4;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextPane;

public class VentanaPrincipal extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textCiudad;
	private JButton btnAceptar;
	private JButton btnDesactivar;
	private JButton btnActivar;
	private JLabel textFrase;
	
	

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
		setBounds(100, 100, 508, 336);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textNombre = new JTextField();
		textNombre.setBounds(72, 61, 137, 29);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		textCiudad = new JTextField();
		textCiudad.setBounds(288, 61, 137, 29);
		contentPane.add(textCiudad);
		textCiudad.setColumns(10);
		
		JLabel lblIngreseNombre = new JLabel("INGRESE SU NOMBRE:");
		lblIngreseNombre.setBounds(70, 35, 139, 14);
		contentPane.add(lblIngreseNombre);
		
		JLabel lblIngreseCiudad = new JLabel("INGRESE SU CIUDAD:");
		lblIngreseCiudad.setBounds(288, 35, 137, 14);
		contentPane.add(lblIngreseCiudad);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(27, 142, 89, 23);
		contentPane.add(btnAceptar);
		btnAceptar.addActionListener(this);
		
		btnDesactivar = new JButton("Desactivar");
		btnDesactivar.setBounds(182, 142, 119, 23);
		contentPane.add(btnDesactivar);
		btnDesactivar.addActionListener(this);
		
		btnActivar = new JButton("Activar");
		btnActivar.setBounds(343, 142, 112, 23);
		contentPane.add(btnActivar);
		btnActivar.addActionListener(this);
		
		textFrase = new JLabel("");
		textFrase.setBounds(126, 223, 299, 14);
		contentPane.add(textFrase);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		 if (e.getSource() == btnAceptar) {
	            String mensaje = "Usted se llama " + textNombre.getText() + " y vive en " + textCiudad.getText() + ".";
	            textFrase.setText(mensaje);
	        } else if (e.getSource() == btnDesactivar) {
	            textNombre.setEnabled(false);
	            textCiudad.setEnabled(false);
	        } else if (e.getSource() == btnActivar) {
	            textNombre.setEnabled(true);
	            textCiudad.setEnabled(true);
	        }
		
	}
}
