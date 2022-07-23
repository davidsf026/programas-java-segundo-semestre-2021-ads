package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JInternalFrame;

public class ControladorFechar implements ActionListener {
	//PROPRIEDADES DA CLASSE
	private JInternalFrame janel = null;
	
	//MÉTODOS CONSTRUTOR CHEIO DA CLASSE
	public ControladorFechar(JInternalFrame janel) {
		super();
		this.janel = janel;
	}

	//MÉTODO SOBESCRITO DA CLASSE
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
