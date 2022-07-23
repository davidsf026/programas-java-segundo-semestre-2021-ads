package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import negocio.Cliente;
import negocio.Compra;
import negocio.Produto;

public class ControladorGravar implements ActionListener {
	//PROPRIEDADES DA CLASSE
		private JComboBox<String> cboProduto = null;
		private JComboBox<String> cboCliente = null;
		private JTextField txtData = null;
		private JTextField txtQuantidade = null;
		private DefaultListModel<String> dlmCompras = null;
		
	
	//MÉTODO CONSTRUTOR DA CLASSE
	public ControladorGravar(JComboBox<String> cboProduto, JComboBox<String> cboCliente, JTextField txtData,
		JTextField txtQuantidade, DefaultListModel<String> dlmCompras) {
		super();
		this.cboProduto = cboProduto;
		this.cboCliente = cboCliente;
		this.txtData = txtData;
		this.txtQuantidade = txtQuantidade;
		this.dlmCompras = dlmCompras;
		}
	
	//MÉTODO SOBESCRITO DA CLASSE
	public void actionPerformed(ActionEvent e) {
		 //CRÍTICA DE DADOS
		if (cboProduto.getSelectedIndex() == 0) {
			JOptionPane.showMessageDialog(null, "Escolher um produto é obrigatório!");
			return;
		}
		
		if (cboCliente.getSelectedIndex() == 0) {
			JOptionPane.showMessageDialog(null, "Escolher um cliente é obrigatório!");
			return;
		}
		
		if (txtData.getText().length() != 10) {
			JOptionPane.showMessageDialog(null, "Data inválida, tem quer ter 10 caracteres!");
			return;
		}
		
		try {
			Compra objCompra = new Compra();
			objCompra.setDataDaApresentaca(txtData.getText());
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "Data inválida, formato errado!");
			return;
		}
		
		if (txtQuantidade.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Definir quantiade é obrigatório!");
			return;
		}
		
		try {
			Integer.parseInt(txtQuantidade.getText());
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "Quantidade deve ser numérico");
			return;
		}
		
		//COMPOSIÇÃO DO OBJETO
		Compra objCompra = new Compra();
		objCompra.setObjProduto(new Produto(cboProduto.getSelectedIndex(), "", 0));
		objCompra.setObjCliente(new Cliente(cboCliente.getSelectedIndex(), "", ""));
		objCompra.setDataDaApresentaca(txtData.getText());
		objCompra.setQuantidade(Integer.parseInt(txtQuantidade.getText()));
		try {
			objCompra.persistir();
			JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso !");
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "Erro na gravação da compra: " + erro);
		}
		
		//ATUALIZAÇÃO DA LISTA DE COMPRAS
		dlmCompras.clear();
		dlmCompras.addElement("Cliente          Produto          Data          Valor Total");
		try {
			for (Compra objCompras : Compra.getTodos()) {
				dlmCompras.addElement(objCompras.getObjCliente().getNome() + "          " +
									  objCompras.getObjProduto().getNome() + "          " +
									  objCompras.getDataParaApresentacao() + "          " +
									  (objCompras.getObjProduto().getPreco() * objCompras.getQuantidade()));
			}
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "Erro na lista de compras: " + erro);
		}
	}
}