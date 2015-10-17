package CC_AgendaDigital.Inteface;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;

import CC_AgendaDigital.Core.Familia;
import CC_AgendaDigital.DAO.SQLite;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.sql.SQLException;
import java.util.ArrayList;

public class MainProgram {

	private JFrame frame;
	private static SQLite db;

	public MainProgram() {
		initialize();
		criarListFamilia();
	}
	
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
		DefaultListModel<Familia> model = new DefaultListModel<Familia>();
		ArrayList<Familia> familias = db.getFamilias();
		JList JListFamilias = new JList(model);
		JListFamilias.setBounds(0, 41, 195, 648);

		for (int i = 0; i < familias.size(); i++) {
			model.addElement(familias.get(i));
		}
		frame.getContentPane().add(JListFamilias);

		JLabel lblNewLabel = new JLabel("Fam\u00EDlias");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 195, 38);
		frame.getContentPane().add(lblNewLabel);
	}
}
