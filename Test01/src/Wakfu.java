import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Wakfu {

	private JFrame frame;
	private JTextField pers;
	private JTextField control;
	private JTextField result;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Wakfu window = new Wakfu();
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
	public Wakfu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(50, 100, 381, 220);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Calculando Nivel de Invocado.");
		
		JLabel lblLevelDoPersonagem = new JLabel("Level do Personagem:");
		lblLevelDoPersonagem.setBounds(23, 43, 144, 23);
		frame.getContentPane().add(lblLevelDoPersonagem);
		
		pers = new JTextField();
		pers.setToolTipText("");
		pers.setBounds(245, 47, 86, 20);
		frame.getContentPane().add(pers);
		pers.setColumns(10);
		
		JLabel lblNmeroDeControle = new JLabel("Numero de Controle:");
		lblNmeroDeControle.setBounds(23, 74, 150, 14);
		frame.getContentPane().add(lblNmeroDeControle);
		
		control = new JTextField();
		control.setBounds(245, 78, 86, 20);
		frame.getContentPane().add(control);
		control.setColumns(10);
		
		
		JLabel lblResultadoDoNmero = new JLabel("Resultado do n\u00FAmero de invocado:");
		lblResultadoDoNmero.setBounds(23, 148, 214, 14);
		frame.getContentPane().add(lblResultadoDoNmero);
		
		result = new JTextField();
		result.setBounds(245, 145, 86, 20);
		frame.getContentPane().add(result);
		result.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int vPers, vControl;
				float vResult;
				
				vPers = Integer.parseInt( pers.getText() ) ;
				vControl = Integer.parseInt( control.getText() );
				
				vResult = vPers + ( (vPers * vControl ) / 8 ) ;
				
				result.setText( String.valueOf(vResult) );
						
				
			}
		});
		btnCalcular.setBounds(137, 105, 91, 23);
		frame.getContentPane().add(btnCalcular);
		
		JMenu mnNewMenu = new JMenu("New menu");
		mnNewMenu.setBounds(10, 0, 83, 19);
		frame.getContentPane().add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("New menu item");
		mnNewMenu.add(mntmNewMenuItem);
		
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("New menu item");
		mnNewMenu.add(mntmNewMenuItem_1);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
