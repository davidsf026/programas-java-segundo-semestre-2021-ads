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
	
	//MÉTODO CONSTRUTOR CHEIO DA CLASSE
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
		//CRÍTICA DO NOME
		if (txtNome.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "O campo nome é obrigatório!");
			return;
		}
		
		//CRÍTICA DO PREÇO
		if (txtPreco.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "O campo preço é obrigatório!");
			return;
		}
		
		try {
			Double.parseDouble(txtPreco.getText());
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "O campo preço deve ser numérico!");
			return;
		}
		
		//CRÍTICA DO TIPO
		if (comboTipo.getSelectedIndex() == 0) {
			JOptionPane.showMessageDialog(null, "O campo tipo é obrigatório!");
			return;
		}
		
		//CRÍTICA DO DETALHAMENTO
		if (txtDetalhamento.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "O campo detalhamento é obrigatório!");
			return;
		}
		
		//INSTANCIEI UM OBJETO DO TIPO PRODUTO
		Produto objProduto = new Produto();
		
		//COLOQUEI OS DADOS DO FORMULÁRIO DENTRO DO OBJETO PRODUTO ANTES INSTANCIADO
		objProduto.setNome(txtNome.getText());
		objProduto.setPreco(Double.parseDouble(txtPreco.getText()));
		objProduto.setObjTipo(new Tipo(comboTipo.getSelectedItem().toString()));
		objProduto.setPerecivel(boxPerecivel.isSelected());
		objProduto.setDetalhamento(txtDetalhamento.getText());
		
		//GRAVEI OS DADOS DO OBJPRODUTO NO BANCO DE DADOS
		/* EM BREVE*/
		
		//MOSTREI NA TELA OS DADOS GRAVADOS
		JOptionPane.showMessageDialog(null, "Nome: " + objProduto.getNome() + "\n" + 
											"Preço: R$ " + objProduto.getPreco() + "\n" + 
											"Tipo: " + objProduto.getObjTipo().getDescricao() + "\n" + 
											"Perecível: " + (objProduto.isPerecivel() ? "Sim" : "Não") + "\n" + 
											"Detalhamento: " + objProduto.getDetalhamento());
		
		//ZEREI O FORMULÁRIO
		txtNome.setText("");
		txtPreco.setText("");
		comboTipo.setSelectedIndex(0);
		boxPerecivel.setSelected(false);
		txtDetalhamento.setText("");
	}
}