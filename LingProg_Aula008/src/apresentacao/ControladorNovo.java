package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorNovo implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		new VisaoPrincipal().setVisible(true);
	}
}
