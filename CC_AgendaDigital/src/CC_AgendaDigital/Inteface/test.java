package CC_AgendaDigital.Inteface;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class test extends JPanel {
	private static JLabel lblNewLabel_1;
	private static JLabel lblNome;
	private static JTextField txtDigiteONome;
	private static JLabel lblIdade;
	private static JTextField txtDigiteAIdade;
	private JTextField textField;
	/**
	 * Create the panel.
	 */
	public test() {
		JPanel panel = new JPanel();
		panel.setToolTipText("");
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setForeground(Color.WHITE);
		panel.setBounds(205, 0, 1166, 707);
		panel.setLayout(null);
		
		lblNewLabel_1 = new JLabel("Cadastrar");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 11, 1116, 39);
		panel.add(lblNewLabel_1);
		
		lblNome = new JLabel("Nome: ");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNome.setBounds(371, 117, 147, 28);
		panel.add(lblNome);
		
		txtDigiteONome = new JTextField();
		txtDigiteONome.setToolTipText("");
		txtDigiteONome.setFont(new Font("Tahoma", Font.ITALIC, 11));
		txtDigiteONome.setForeground(Color.BLACK);
		txtDigiteONome.setBounds(588, 125, 198, 20);
		panel.add(txtDigiteONome);
		txtDigiteONome.setColumns(10);
		
		lblIdade = new JLabel("Idade: ");
		lblIdade.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblIdade.setBounds(371, 156, 147, 28);
		panel.add(lblIdade);
		
		txtDigiteAIdade = new JTextField();
		txtDigiteAIdade.setForeground(Color.BLACK);
		txtDigiteAIdade.setFont(new Font("Tahoma", Font.ITALIC, 11));
		txtDigiteAIdade.setColumns(10);
		txtDigiteAIdade.setBounds(588, 164, 198, 20);
		panel.add(txtDigiteAIdade);
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento: ");
		lblDataDeNascimento.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDataDeNascimento.setBounds(371, 195, 147, 28);
		panel.add(lblDataDeNascimento);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setText("00/00/0000");
		textField.setForeground(Color.BLACK);
		textField.setFont(new Font("Tahoma", Font.ITALIC, 11));
		textField.setColumns(10);
		textField.setBounds(588, 201, 198, 20);
		panel.add(textField);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(958, 657, 198, 39);
		panel.add(btnCadastrar);
	}
}
