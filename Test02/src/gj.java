import javax.swing.JPanel;
import javax.swing.JTextField;


public class gj extends JPanel {
	private JTextField txtVocPassouPor;

	/**
	 * Create the panel.
	 */
	public gj() {
		setLayout(null);
		
		txtVocPassouPor = new JTextField();
		txtVocPassouPor.setText("Voc\u00EA passou por m\u00E9dia.");
		txtVocPassouPor.setBounds(-35, -28, 394, 140);
		add(txtVocPassouPor);
		txtVocPassouPor.setColumns(10);

	}

}
