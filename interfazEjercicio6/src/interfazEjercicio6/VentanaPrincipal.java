package interfazEjercicio6;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Color;
import javax.swing.JButton;

public class VentanaPrincipal extends JFrame implements ActionListener,MouseListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextPane etiNombre;
	private JButton btnEsquina;
	private JButton btnCentro;
	private JButton btnAgrandar;
	private JButton btnAchicar;

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
		setBounds(100, 100, 460, 302);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		etiNombre = new JTextPane();
		etiNombre.setBounds(176, 97, 77, 31);
		etiNombre.setBackground(new Color(0, 128, 128));
		etiNombre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		etiNombre.setText("Nombre");
		contentPane.add(etiNombre);
		
		btnEsquina = new JButton("Esquina");
		btnEsquina.setBounds(10, 227, 89, 23);
		contentPane.add(btnEsquina);
		btnEsquina.addActionListener(this);
		
		btnCentro = new JButton("Centro");
		btnCentro.setBounds(109, 227, 89, 23);
		contentPane.add(btnCentro);
		btnCentro.addActionListener(this);
		
		btnAgrandar = new JButton("Agrandar");
		btnAgrandar.setBounds(208, 227, 89, 23);
		contentPane.add(btnAgrandar);
		btnAgrandar.addActionListener(this);
		
		btnAchicar = new JButton("Achicar");
		btnAchicar.setBounds(307, 227, 89, 23);
		contentPane.add(btnAchicar);
		btnAchicar.addActionListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		 etiNombre.setText("");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		 if (e.getSource() == btnEsquina) {
	            etiNombre.setLocation(10, 10);
	        } else if (e.getSource() == btnCentro) {
	            etiNombre.setLocation(176, 97);
	        } else if (e.getSource() == btnAgrandar) {
	            Font font = etiNombre.getFont();
	            etiNombre.setFont(new Font(font.getName(), font.getStyle(), font.getSize() + 2));
	        } else if (e.getSource() == btnAchicar) {
	            Font font = etiNombre.getFont();
	            etiNombre.setFont(new Font(font.getName(), font.getStyle(), font.getSize() - 2));
	        }
		
	}
}
