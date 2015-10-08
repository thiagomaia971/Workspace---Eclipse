package CC_AgendaDigital_Inteface;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainInterface extends JFrame{

	private static int width;
	private static int height;
	
	private JPanel panel;
	private JLabel msg;
	
	public MainInterface(){
		super("AgendaDigital");
	}
	
	public static void main(String[] args) {
		MainInterface i = new MainInterface();
		i.criarJanela();
		width = (int) (i.getWidth() * 8);
		height = (int) (i.getHeight() * 8);
		i.setSize(width, height);

	}
	
	public void criarJanela(){
		panel = new JPanel();
		/*msg = new JLabel("test");
		panel.add(msg);
		panel.setSize(200, 200);*/
		
		getContentPane().add(panel);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//pack();
		setVisible(true);
	}

}
