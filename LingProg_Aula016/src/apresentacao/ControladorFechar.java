package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JInternalFrame;

public class ControladorFechar implements ActionListener {
	//PROPRIEDADES DA CLASSE
	private JInternalFrame janel = null;
	
	//M�TODOS CONSTRUTOR CHEIO DA CLASSE
	public ControladorFechar(JInternalFrame janel) {
		super();
		this.janel = janel;
	}

	//M�TODO SOBESCRITO DA CLASSE
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
