package CC_AgendaDigital.Inteface;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;

import CC_AgendaDigital.Core.Familia;
import CC_AgendaDigital.DAO.DAO;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.sql.SQLException;

public class MainProgram {

	private JFrame frame;
	private static DAO db;

	/**
	 * Launch the application.
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
		db = new DAO();
		db.openConnection();
		
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

	/**
	 * Create the application.
	 */
	public MainProgram() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
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
		
		DefaultListModel<Familia> model = new DefaultListModel<Familia>();
		JList JListFamilias = new JList(model);
		JListFamilias.setBounds(0, 41, 195, 648);
		model.addElement(new Familia("Maias"));
		model.addElement(new Familia("Freitas"));
		model.addElement(new Familia("Florencio"));
		frame.getContentPane().add(JListFamilias);
		
		JLabel lblNewLabel = new JLabel("Fam\u00EDlias");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 195, 38);
		frame.getContentPane().add(lblNewLabel);
	}
}
