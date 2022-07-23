package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ControladorLimpar implements ActionListener {
	//PROPRIEDADES DA CLASSE
	private JTextField txtNome = null;
	private JTextField txtPreco = null;
	private JComboBox<String> comboTipo = null;
	private JCheckBox boxPerecivel = null;
	private JTextArea txtDetalhamento = null;
	
	//MÉTODO CONSTRUTOR CHEIO DA CLASSE	
	public ControladorLimpar(JTextField txtNome, JTextField txtPreco, JComboBox<String> comboTipo,
			JCheckBox boxPerecivel, JTextArea txtDetalhamento) {
		super();
		this.txtNome = txtNome;
		this.txtPreco = txtPreco;
		this.comboTipo = comboTipo;
		this.boxPerecivel = boxPerecivel;
		this.txtDetalhamento = txtDetalhamento;
	}
	
	//MÉTODO SOBESCRITO DA CLASSE ACTIONLISTENER
	public void actionPerformed(ActionEvent e) {
		txtNome.setText("");
		txtPreco.setText("");
		comboTipo.setSelectedIndex(0);
		boxPerecivel.setSelected(false);
		txtDetalhamento.setText("");
	}
}
