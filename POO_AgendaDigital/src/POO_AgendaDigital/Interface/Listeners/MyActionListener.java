package POO_AgendaDigital.Interface.Listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		Object s = e.getSource();
		String a = s.toString();
		System.out.println("evento!");
		
	}

}
