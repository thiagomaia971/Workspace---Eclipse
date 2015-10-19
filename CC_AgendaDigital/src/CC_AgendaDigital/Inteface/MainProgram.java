package CC_AgendaDigital.Inteface;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;

import CC_AgendaDigital.Core.Pessoa;
import CC_AgendaDigital.DAO.SQLite;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.sql.SQLException;
import java.util.ArrayList;

public class MainProgram {

	private JFrame frame;
	private static SQLite db;

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		db = new SQLite("Database/AgendaDigitalDb.sqlite");
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainProgram window = new MainProgram();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MainProgram() {
		initialize();
		criarListFamilia();
	}

	private void initialize() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension scrnsize = toolkit.getScreenSize();

		frame = new JFrame("AgendaDigital");
		frame.setBounds(200, 200, scrnsize.width - 20, scrnsize.height - 40);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.getContentPane().setLayout(null);
	}

	private void criarListFamilia() {
		JLabel lblNewLabel = new JLabel("Pessoas");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 195, 38);
		frame.getContentPane().add(lblNewLabel);

		ArrayList<Pessoa> pessoas = db.getPessoas();
		DefaultListModel<Pessoa> model = new DefaultListModel<Pessoa>();
		JList<Pessoa> JListPessoas = new JList<Pessoa>(model);
		JListPessoas.setBounds(0, 41, 195, 648);

		for (int i = 0; i < pessoas.size(); i++) {
			model.addElement(pessoas.get(i));
		}
		frame.getContentPane().add(JListPessoas);
	}
}
