package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import negocio.Produto;
import negocio.Tipo;

public class ControladorGravar implements ActionListener {
	//txtNome, txtPreco, comboTipo, boxPerecivel, txtDetalhamento
	//PROPRIEDADES DA CLASSE
	private JTextField txtNome = null;
	private JTextField txtPreco = null;
	private JComboBox<String> comboTipo = null;
	private JCheckBox boxPerecivel = null;
	private JTextArea txtDetalhamento = null;
	
	//M�TODO CONSTRUTOR CHEIO DA CLASSE
	public ControladorGravar(JTextField txtNome, JTextField txtPreco, JComboBox<String> comboTipo,
			JCheckBox boxPerecivel, JTextArea txtDetalhamento) {
		super();
		this.txtNome = txtNome;
		this.txtPreco = txtPreco;
		this.comboTipo = comboTipo;
		this.boxPerecivel = boxPerecivel;
		this.txtDetalhamento = txtDetalhamento;
	}
	
	public void actionPerformed(ActionEvent e) {
		//CR�TICA DO NOME
		if (txtNome.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "O campo nome � obrigat�rio!");
			return;
		}
		
		//CR�TICA DO PRE�O
		if (txtPreco.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "O campo pre�o � obrigat�rio!");
			return;
		}
		
		try {
			Double.parseDouble(txtPreco.getText());
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "O campo pre�o deve ser num�rico!");
			return;
		}
		
		//CR�TICA DO TIPO
		if (comboTipo.getSelectedIndex() == 0) {
			JOptionPane.showMessageDialog(null, "O campo tipo � obrigat�rio!");
			return;
		}
		
		//CR�TICA DO DETALHAMENTO
		if (txtDetalhamento.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "O campo detalhamento � obrigat�rio!");
			return;
		}
		
		//INSTANCIEI UM OBJETO DO TIPO PRODUTO
		Produto objProduto = new Produto();
		
		//COLOQUEI OS DADOS DO FORMUL�RIO DENTRO DO OBJETO PRODUTO ANTES INSTANCIADO
		objProduto.setNome(txtNome.getText());
		objProduto.setPreco(Double.parseDouble(txtPreco.getText()));
		objProduto.setObjTipo(new Tipo(comboTipo.getSelectedItem().toString()));
		objProduto.setPerecivel(boxPerecivel.isSelected());
		objProduto.setDetalhamento(txtDetalhamento.getText());
		
		//GRAVEI OS DADOS DO OBJPRODUTO NO BANCO DE DADOS
		/* EM BREVE*/
		
		//MOSTREI NA TELA OS DADOS GRAVADOS
		JOptionPane.showMessageDialog(null, "Nome: " + objProduto.getNome() + "\n" + 
											"Pre�o: R$ " + objProduto.getPreco() + "\n" + 
											"Tipo: " + objProduto.getObjTipo().getDescricao() + "\n" + 
											"Perec�vel: " + (objProduto.isPerecivel() ? "Sim" : "N�o") + "\n" + 
											"Detalhamento: " + objProduto.getDetalhamento());
		
		//ZEREI O FORMUL�RIO
		txtNome.setText("");
		txtPreco.setText("");
		comboTipo.setSelectedIndex(0);
		boxPerecivel.setSelected(false);
		txtDetalhamento.setText("");
	}
}