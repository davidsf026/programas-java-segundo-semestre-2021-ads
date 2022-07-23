package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import negocio.Pessoa;
import negocio.Uf;

public class ControladorGravar implements ActionListener {
	//PROPRIEDADES DA CLASSE
	private JTextField txtNome = null;
	private JRadioButton optMasculino = null;
	private JTextField txtEndereco = null;
	private JComboBox<String> jcbUf = null;
	
	//MÉTODO CONSTRUTOR CHEIO
	public ControladorGravar(JTextField txtNome, JRadioButton optMasculino, JTextField txtEndereco,
			JComboBox<String> jcbUf) {
		super();
		this.txtNome = txtNome;
		this.optMasculino = optMasculino;
		this.txtEndereco = txtEndereco;
		this.jcbUf = jcbUf;
	}

	//MÉTODO SOBESCRITO DA CLASSE ActionListener
	public void actionPerformed(ActionEvent e) {
		//INSTANCIEI UM OBJPESSOA PARA ENCAPSULAR OS DADOS COLETADOS NO FORMULÁRIO
		Pessoa objPesoa = new Pessoa();
		
		//ENCAPSULEI OS DADOS COLETADOS NO FORMULÁRIO
		objPesoa.setNome(txtNome.getText());
		objPesoa.setEndereco(txtEndereco.getText());
		objPesoa.setSexo(optMasculino.isSelected());
		objPesoa.setObjUf(new Uf(jcbUf.getSelectedItem().toString()));
		
		//GRAVEI OS DADOS DO OBJPESSOA NO BANCO DE DADOS
		/*EM BREVE*/
		
		//MOSTREI OS DADOS NA TELA
		JOptionPane.showMessageDialog(null, "Nome: " + objPesoa.getNome() + "\n" + 
									  		"Endereço: " + objPesoa.getEndereco() + "\n" +
											"Sexo: " + (objPesoa.isSexo() ? "Masculino" : "Femino") + "\n" +
									  		"UF: " + objPesoa.getObjUf().getUf());
		
		//ZEREI O FORMULÁRIO
		txtEndereco.setText("");
		txtNome.setText("");
		optMasculino.setSelected(true);
		jcbUf.setSelectedIndex(0);
	}
}
