package interfazEjercicio5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.GridBagConstraints;
import java.awt.Color;
import javax.swing.JTextField;

public class VentanaPrincipal extends JFrame implements MouseListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField etiOcultar;
	private JLabel etiPal1;
	private JLabel etiPal2;
	private JLabel etiPal3;
	private JLabel etiPal4;
	

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
		
		etiPal1 = new JLabel("Manuela");
		etiPal1.setBounds(38, 52, 49, 17);
		etiPal1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_etiPal1 = new GridBagConstraints();
		gbc_etiPal1.anchor = GridBagConstraints.NORTHWEST;
		gbc_etiPal1.gridx = 1;
		gbc_etiPal1.gridy = 0;
		contentPane.add(etiPal1, gbc_etiPal1);
		
		etiPal2 = new JLabel("Antonia");
		etiPal2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		etiPal2.setBounds(118, 53, 46, 14);
		contentPane.add(etiPal2);
		
		etiPal3 = new JLabel("Velasquez");
		etiPal3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		etiPal3.setBounds(198, 53, 75, 14);
		contentPane.add(etiPal3);
		
		etiPal4 = new JLabel("Patiño");
		etiPal4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		etiPal4.setBounds(295, 53, 46, 14);
		contentPane.add(etiPal4);
		
		etiOcultar = new JTextField();
		etiOcultar.setFont(new Font("Tahoma", Font.PLAIN, 31));
		etiOcultar.setText("OCULTAR");
		etiOcultar.setBackground(new Color(255, 128, 255));
		etiOcultar.setBounds(132, 123, 141, 44);
		contentPane.add(etiOcultar);
		etiOcultar.setColumns(10);
		 etiOcultar.addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
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
		 if (e.getSource() == etiOcultar) {
	            etiPal1.setVisible(false);
	            etiPal2.setVisible(false);
	            etiPal3.setVisible(false);
	            etiPal4.setVisible(false);
	        }
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		if (e.getSource() == etiOcultar) {
            etiPal1.setVisible(true);
            etiPal2.setVisible(true);
            etiPal3.setVisible(true);
            etiPal4.setVisible(true);
        }
		
	}
}
