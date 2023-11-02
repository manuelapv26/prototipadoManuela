package interfazEjercicio1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class VentanaPrincipal extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel etiNombre;
	private JLabel etiCiudad;
	private JButton btnOcultarNombre;
	private JButton btnVisualizarNombre;
	private JButton btnOcultarCiudad;
	private JButton btnVisualizarCiudad;

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
		
		etiNombre = new JLabel("Nombre");
		etiNombre.setFont(new Font("Tahoma", Font.PLAIN, 23));
		etiNombre.setBounds(97, 56, 112, 17);
		contentPane.add(etiNombre);
		
		etiCiudad = new JLabel("Ciudad");
		etiCiudad.setFont(new Font("Tahoma", Font.PLAIN, 23));
		etiCiudad.setBounds(275, 50, 112, 28);
		contentPane.add(etiCiudad);
		
		btnOcultarNombre = new JButton("Ocultar Nombre");
		btnOcultarNombre.setBounds(81, 123, 116, 23);
		contentPane.add(btnOcultarNombre);
		btnOcultarNombre.addActionListener(this);
		
		btnVisualizarNombre = new JButton("Visualizar Nombre");
		btnVisualizarNombre.setBounds(81, 166, 128, 23);
		contentPane.add(btnVisualizarNombre);
		btnVisualizarNombre.addActionListener(this);
		
		btnOcultarCiudad = new JButton("Ocultar Ciudad");
		btnOcultarCiudad.setBounds(264, 123, 112, 23);
		contentPane.add(btnOcultarCiudad);
		btnOcultarCiudad.addActionListener(this);
		
		btnVisualizarCiudad = new JButton("Visualizar Ciudad");
		btnVisualizarCiudad.setBounds(264, 166, 123, 23);
		contentPane.add(btnVisualizarCiudad);
		btnVisualizarCiudad.addActionListener(this);

	}

	@Override

	public void actionPerformed(ActionEvent e) {
	    if (e.getSource() == btnOcultarNombre) {
	        etiNombre.setVisible(false);
	    } else if (e.getSource() == btnVisualizarNombre) {
	        etiNombre.setVisible(true);
	    } else if (e.getSource() == btnOcultarCiudad) {
	        etiCiudad.setVisible(false);
	    } else if (e.getSource() == btnVisualizarCiudad) {
	        etiCiudad.setVisible(true);
	    }
	}

}
