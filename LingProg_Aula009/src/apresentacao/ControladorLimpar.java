package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class ControladorLimpar implements ActionListener {
	//PROPRIEDADES DA CLASSE
	private JTextField txtNome = null;
	private JRadioButton optMasculino = null;
	private JTextField txtEndereco = null;
	private JComboBox<String> jcbUf = null;
	
	//M�TODO CONSTRUTOR CHEIO DA CLASSE
	public ControladorLimpar(JTextField txtNome, JRadioButton optMasculino, JTextField txtEndereco, JComboBox<String> jcbUf) {
		super();
		this.txtNome = txtNome;
		this.optMasculino = optMasculino; //COLOCA-SE APENAS O MASCULINO PORQUE ELE EST� EM UM BUTTON GROUP COM O FEMININO, MAS TAMB�M FUNCIONA COLOCANDO OS DOIS, S� � REDUNDANTE
		this.txtEndereco = txtEndereco;
		this.jcbUf = jcbUf;
	}
	
	//M�TODO SOBESCRITO DE ACTIONLISTENER DA CLASSE
	public void actionPerformed(ActionEvent e) {
		txtNome.setText("");
		optMasculino.setSelected(true);
		txtEndereco.setText("");
		jcbUf.setSelectedIndex(0);	
	}
}
