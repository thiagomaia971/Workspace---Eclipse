import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;


public class Media extends JFrame {

	private JPanel contentPane;
	private JTextField ntd;
	private JTextField vp;
	private JTextField vg;
	private JTextField result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Media frame = new Media();
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
	public Media() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ntd = new JTextField();
		ntd.setBounds(146, 32, 86, 20);
		contentPane.add(ntd);
		ntd.setColumns(10);
		
		vp = new JTextField();
		vp.setBounds(146, 73, 86, 20);
		contentPane.add(vp);
		vp.setColumns(10);
		
		vg = new JTextField();
		vg.setBounds(146, 116, 86, 20);
		contentPane.add(vg);
		vg.setColumns(10);
		
		result = new JTextField();
		result.setBounds(146, 207, 86, 20);
		contentPane.add(result);
		result.setColumns(10);
		
		JButton btnCalcular = new JButton("calcular");
		btnCalcular.setBounds(141, 156, 91, 23);
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int vP, vG, nTd;
				float vResult;
				

				vP = Integer.parseInt (vp.getText());
				vG = Integer.parseInt( vg.getText() );
				nTd = Integer.parseInt( ntd.getText() );
				
				vResult = (vP + vG + nTd)/3 ;
				
				result.setText( String.valueOf(vResult) );
				
				if (vResult >= 7){
					result.setText(String.valueOf(vResult)+ "Média aceita.");
					
				}
				
			}
		});
		contentPane.add(btnCalcular);
		
		JLabel lblPrimeiraNota = new JLabel("Nota de Trabalho:");
		lblPrimeiraNota.setBounds(36, 35, 112, 14);
		contentPane.add(lblPrimeiraNota);
		
		JLabel lblSegundaNota = new JLabel("Verifica\u00E7\u00E3o Parcial:");
		lblSegundaNota.setBounds(36, 76, 98, 14);
		contentPane.add(lblSegundaNota);
		
		JLabel lblVerificaoGlobal = new JLabel("Verifica\u00E7\u00E3o Global:");
		lblVerificaoGlobal.setBounds(36, 119, 98, 14);
		contentPane.add(lblVerificaoGlobal);
		
		JLabel lblMdia = new JLabel("M\u00E9dia:");
		lblMdia.setBounds(57, 210, 46, 14);
		contentPane.add(lblMdia);
	}
}
