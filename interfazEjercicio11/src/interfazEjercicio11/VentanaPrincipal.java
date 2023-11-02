package interfazEjercicio11;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

public class VentanaPrincipal extends JFrame implements MouseListener,ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel etiUno;
	private JLabel etiDos;
	private JLabel etiTres;
	private JLabel etiCuatro;
	private JLabel etiCinco;
	private JLabel etiSeis;
	private JLabel etiSiete;
	private JLabel etiOcho;
	private JLabel etiNueve;
	private JLabel etiCero;
	private JButton btnBorrar;
	private JLabel textNumero;

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
		
		etiDos = new JLabel("2");
		etiDos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		etiDos.setBounds(173, 11, 18, 25);
		contentPane.add(etiDos);
		etiDos.addMouseListener(this);

		
		etiUno = new JLabel("1");
		etiUno.setFont(new Font("Tahoma", Font.PLAIN, 20));
		etiUno.setBounds(125, 11, 18, 25);
		contentPane.add(etiUno);
		etiUno.addMouseListener(this);

		
		etiCero = new JLabel("0");
		etiCero.setFont(new Font("Tahoma", Font.PLAIN, 20));
		etiCero.setBounds(80, 11, 18, 25);
		contentPane.add(etiCero);
		etiCero.addMouseListener(this);

		
		etiTres = new JLabel("3");
		etiTres.setFont(new Font("Tahoma", Font.PLAIN, 20));
		etiTres.setBounds(223, 11, 24, 25);
		contentPane.add(etiTres);
		etiTres.addMouseListener(this);

		
		etiCuatro = new JLabel("4");
		etiCuatro.setFont(new Font("Tahoma", Font.PLAIN, 20));
		etiCuatro.setBounds(80, 62, 18, 25);
		contentPane.add(etiCuatro);
		etiCuatro.addMouseListener(this);

		
		etiCinco = new JLabel("5");
		etiCinco.setFont(new Font("Tahoma", Font.PLAIN, 20));
		etiCinco.setBounds(125, 62, 24, 25);
		contentPane.add(etiCinco);
		etiCinco.addMouseListener(this);

		
		etiSeis = new JLabel("6");
		etiSeis.setFont(new Font("Tahoma", Font.PLAIN, 20));
		etiSeis.setBounds(173, 62, 18, 25);
		contentPane.add(etiSeis);
		etiSeis.addMouseListener(this);

		
		etiNueve = new JLabel("9");
		etiNueve.setFont(new Font("Tahoma", Font.PLAIN, 20));
		etiNueve.setBounds(173, 98, 18, 25);
		contentPane.add(etiNueve);
		etiNueve.addMouseListener(this);

		
		etiSiete = new JLabel("7");
		etiSiete.setFont(new Font("Tahoma", Font.PLAIN, 20));
		etiSiete.setBounds(223, 62, 18, 25);
		contentPane.add(etiSiete);
		etiSiete.addMouseListener(this);

		
		etiOcho = new JLabel("8");
		etiOcho.setFont(new Font("Tahoma", Font.PLAIN, 20));
		etiOcho.setBounds(125, 98, 18, 25);
		contentPane.add(etiOcho);
		etiOcho.addMouseListener(this);
		
		btnBorrar = new JButton("BORRAR");
		btnBorrar.setBounds(114, 156, 103, 23);
		contentPane.add(btnBorrar);
		btnBorrar.addActionListener(this);
		
		
		textNumero = new JLabel("");
		textNumero.setBounds(42, 211, 283, 14);
		contentPane.add(textNumero);
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
		String txt;
		if(e.getSource()==etiCero) {
            txt = etiCero.getText();
            textNumero.setText(textNumero.getText()+txt);
        }else if(e.getSource()==etiUno) {
            txt = etiUno.getText();
            textNumero.setText(textNumero.getText()+txt);

        }else if(e.getSource()==etiDos) {
            txt = etiDos.getText();
            textNumero.setText( textNumero.getText()+txt);

        }else if(e.getSource()==etiTres) {
            txt = etiTres.getText();
            textNumero.setText( textNumero.getText()+txt);

        }else if(e.getSource()==etiCuatro) {
            txt = etiCuatro.getText();
            textNumero.setText( textNumero.getText()+txt);

        }else if(e.getSource()==etiCinco) {
            txt = etiCinco.getText();
            textNumero.setText( textNumero.getText()+txt);

        }else if(e.getSource()==etiSeis) {
            txt = etiSeis.getText();
            textNumero.setText( textNumero.getText()+txt);

        }else if(e.getSource()==etiSiete) {
            txt = etiSiete.getText();
            textNumero.setText( textNumero.getText()+txt);

        }else if(e.getSource()==etiOcho) {
            txt = etiOcho.getText();
            textNumero.setText( textNumero.getText()+txt);
        }else if(e.getSource()==etiNueve) {
            txt = etiNueve.getText();
            textNumero.setText( textNumero.getText()+txt);

        }		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnBorrar) {
			 textNumero.setText("");
		}
		
	}
}
