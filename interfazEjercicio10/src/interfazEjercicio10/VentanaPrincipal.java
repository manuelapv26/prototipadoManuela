    package interfazEjercicio10;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

public class VentanaPrincipal extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textPalabra1;
	private JTextField textPalabra2;
	private JLabel etiTexto;
    private JButton btnConcatenar;
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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textPalabra1 = new JTextField();
		textPalabra1.setBounds(29, 37, 126, 30);
		contentPane.add(textPalabra1);
		textPalabra1.setColumns(10);
		
		textPalabra2 = new JTextField();
		textPalabra2.setText("");
		textPalabra2.setBounds(266, 37, 126, 30);
		contentPane.add(textPalabra2);
		textPalabra2.setColumns(10);
		
		btnConcatenar = new JButton("CONCATENAR");
		btnConcatenar.setBounds(150, 117, 126, 23);
		contentPane.add(btnConcatenar);
		btnConcatenar.addActionListener(this);
		
		etiTexto = new JLabel("");
		etiTexto.setBounds(90, 188, 234, 14);
		contentPane.add(etiTexto);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnConcatenar) {
			String mensaje=textPalabra1.getText()+textPalabra2.getText();
			etiTexto.setText(mensaje);
		}
		
	}

}
