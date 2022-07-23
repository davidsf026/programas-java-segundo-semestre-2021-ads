package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JTextField;

public class ControladorLimpar implements ActionListener {
	//PROPRIEDADAS DA CLASSE
	private JComboBox<String> cboDisciplina = null;
	private JComboBox<String> cboProfessor = null;
	private JTextField txtLetra = null;
	
	//M�TODO CONSTRUTOR CHEIO DA CLASSE
	public ControladorLimpar(JComboBox<String> cboDisciplina, JComboBox<String> cboProfessor, JTextField txtLetra) {
		super();
		this.cboDisciplina = cboDisciplina;
		this.cboProfessor = cboProfessor;
		this.txtLetra = txtLetra;
	}
	
	//M�TODO SOBESCRITO DA INTERFACE
	public void actionPerformed(ActionEvent e) {
		//PROPRIEDADES DA CLASSE
		cboDisciplina.setSelectedIndex(0);
		cboProfessor.setSelectedIndex(0);
		txtLetra.setText("");		
	}
}