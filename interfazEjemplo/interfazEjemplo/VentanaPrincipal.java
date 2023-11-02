package interfazEjemplo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.w3c.dom.events.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class VentanaPrincipal extends JFrame implements MouseListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textoNombre;
	private JTextField nota1;
	private JTextField nota2;
	private JLabel lblResult;
	private JButton btnPresioname;
	private JLabel lblNombre;
	private JLabel lblNota1;
	private JLabel lblNota2;
	private JLabel lblTitulo;
	

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
		setBounds(100, 100, 491, 323);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textoNombre = new JTextField();
		textoNombre.setBounds(33, 79, 151, 20);
		contentPane.add(textoNombre);
		textoNombre.setColumns(10);
		
		lblTitulo = new JLabel("BIENVENIDOS");
		lblTitulo.setBounds(151, 11, 125, 25);
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(lblTitulo);
		
		nota1 = new JTextField();
		nota1.setBounds(240, 79, 86, 20);
		contentPane.add(nota1);
		nota1.setColumns(10);
		
		nota2 = new JTextField();
		nota2.setBounds(355, 79, 86, 20);
		contentPane.add(nota2);
		nota2.setColumns(10);
		
		btnPresioname = new JButton("CALCULAR");
		btnPresioname.setForeground(new Color(0, 128, 64));
		btnPresioname.setBounds(166, 130, 110, 23);
		contentPane.add(btnPresioname);
		btnPresioname.addMouseListener(this);
		
	    lblNombre = new JLabel("Ingrese su nombre:");
		lblNombre.setBounds(57, 54, 110, 14);
		contentPane.add(lblNombre);
		
		lblNota1 = new JLabel("Nota 1:");
		lblNota1.setBounds(253, 54, 46, 14);
		contentPane.add(lblNota1);
		
		lblNota2 = new JLabel("Nota 2:");
		lblNota2.setBounds(369, 54, 46, 14);
		contentPane.add(lblNota2);
		
		lblResult = new JLabel("Resultado:");
		lblResult.setBounds(89, 187, 308, 14);
		contentPane.add(lblResult);
	}

	@Override
	public void mouseClicked(java.awt.event.MouseEvent e) {
		if(e.getSource()==btnPresioname) {
	    	  sumar();
	    }else if(e.getSource()==lblTitulo) {
			JOptionPane.showMessageDialog(null, "Presionó el titulo");
	    }
	}

	@Override
	public void mousePressed(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
private void sumar() {
	int num1=0,num2=0,bandera=0;
	
	
	try {
		num1=Integer.parseInt(nota1.getText());
		nota1.setBackground(Color.white);
	} catch (Exception e) {
		//JOptionPane.showMessageDialog(null,"Verifique el campo 1","Datos incorrectos"
		//		,JOptionPane.ERROR_MESSAGE);
		lblResult.setText("Error en la nota 1");
		nota1.setBackground(Color.red);
		bandera=1;
	}
	
	try {
		num2=Integer.parseInt(nota2.getText());	
		nota2.setBackground(Color.white);
	} catch (Exception e) {

		lblResult.setText("Error en la nota 2");
		nota2.setBackground(Color.red);
		bandera=1;
	}

	
	if (bandera==0) {
		int suma=num1+num2;
		lblResult.setText(textoNombre.getText()+" la suma es: "+suma);
	}
	
}
}

