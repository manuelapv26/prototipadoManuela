package interfazEjercico2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextPane textTexto;
	private JButton btnTraspasa1;
	private JButton btnTraspasa2;
	private JLabel etiTexto1;
	private JLabel etiTexto2;
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
		
		textTexto = new JTextPane();
		textTexto.setBounds(146, 52, 138, 20);
		contentPane.add(textTexto);
		
		btnTraspasa1 = new JButton("Traspasa 1");
		btnTraspasa1.setBounds(38, 114, 127, 23);
		contentPane.add(btnTraspasa1);
		btnTraspasa1.addActionListener(this);
		
		btnTraspasa2 = new JButton("Traspasa 2");
		btnTraspasa2.setBounds(258, 114, 121, 23);
		contentPane.add(btnTraspasa2);
		btnTraspasa2.addActionListener(this);
		 
		etiTexto1 = new JLabel("");
		etiTexto1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		etiTexto1.setBounds(38, 176, 89, 14);
		contentPane.add(etiTexto1);

		
		etiTexto2 = new JLabel("");
		etiTexto2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		etiTexto2.setBounds(290, 176, 89, 14);
		contentPane.add(etiTexto2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnTraspasa1) {
            etiTexto1.setText(textTexto.getText());
        } else if (e.getSource() == btnTraspasa2) {
            etiTexto2.setText(textTexto.getText());
        }
    }

}
