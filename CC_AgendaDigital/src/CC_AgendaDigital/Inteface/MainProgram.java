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

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		db = new SQLite("Database/AgendaDigitalDb.sqlite");
		 db.insertFamilia(new Familia("Maia"));
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
		JLabel lblNewLabel = new JLabel("Familias");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 195, 38);
		frame.getContentPane().add(lblNewLabel);

		ArrayList<Familia> familias = db.getFamilias();
		DefaultListModel<Familia> model = new DefaultListModel<Familia>();
		JList<Familia> JListFamilias = new JList<Familia>(model);
		JListFamilias.setBounds(0, 41, 195, 648);

		for (int i = 0; i < familias.size(); i++) {
			model.addElement(familias.get(i));
		}
		frame.getContentPane().add(JListFamilias);
	}
}
