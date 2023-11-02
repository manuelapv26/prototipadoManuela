package interfazEjercicio9;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class VentanaPrincipal extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textPrimerTrimestre;
	private JTextField textSegundoTrimestre;
	private JTextField textTercerTrimestre;
	private JButton btnCalcular;
    private JLabel etiNotaFinal;
    private JLabel etiResultado;
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
		setBounds(100, 100, 450, 408);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textPrimerTrimestre = new JTextField();
		textPrimerTrimestre.setBounds(34, 42, 86, 20);
		contentPane.add(textPrimerTrimestre);
		textPrimerTrimestre.setColumns(10);
		
		textSegundoTrimestre = new JTextField();
		textSegundoTrimestre.setBounds(34, 105, 86, 20);
		contentPane.add(textSegundoTrimestre);
		textSegundoTrimestre.setColumns(10);
		
		textTercerTrimestre = new JTextField();
		textTercerTrimestre.setBounds(34, 168, 86, 20);
		contentPane.add(textTercerTrimestre);
		textTercerTrimestre.setColumns(10);
		
		JLabel lblPrimer = new JLabel("INGRESE LA NOTA DEL PRIMER TRIMESTRE:");
		lblPrimer.setBounds(34, 11, 257, 20);
		contentPane.add(lblPrimer);
		
		JLabel lblSegundo = new JLabel("INGRESE LA NOTA DEL SEGUNDO TRIMESTRE:");
		lblSegundo.setBounds(34, 73, 280, 14);
		contentPane.add(lblSegundo);
		
		JLabel lblTercer = new JLabel("INGRESE LA NOTA DEL TERCER TRIMESTRE:");
		lblTercer.setBounds(34, 143, 280, 14);
		contentPane.add(lblTercer);
		
		btnCalcular = new JButton("CALCULAR");
		btnCalcular.setBounds(183, 226, 115, 23);
		contentPane.add(btnCalcular);
		btnCalcular.addActionListener(this);
		
		etiNotaFinal = new JLabel("");
		etiNotaFinal.setBounds(34, 272, 211, 14);
		contentPane.add(etiNotaFinal);
		
		etiResultado = new JLabel("");
		etiResultado.setBounds(34, 311, 211, 14);
		contentPane.add(etiResultado);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		 if (e.getSource()==btnCalcular) {
	            try {
	                double nota1 = Double.parseDouble(textPrimerTrimestre.getText());
	                double nota2 = Double.parseDouble(textSegundoTrimestre.getText());
	                double nota3 = Double.parseDouble(textTercerTrimestre.getText());

	                double notaFinal = (nota1 + nota2 + nota3) / 3;
	                etiNotaFinal.setText("Nota Final: " + notaFinal);

	                if (notaFinal >= 5.0) {
	                    etiResultado.setText("Aprobado");
	                } else {
	                    etiResultado.setText("Reprobado");
	                }
	            } catch (NumberFormatException ex) {
	                etiNotaFinal.setText("Ingrese valores válidos");
	            }
	        }
		
	}

}
