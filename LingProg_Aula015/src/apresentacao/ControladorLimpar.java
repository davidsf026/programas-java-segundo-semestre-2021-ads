package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class ControladorLimpar implements ActionListener {
	//PROPRIEDADES DA CLASSE
		private JComboBox<String> cboProduto = null;
		private JComboBox<String> cboCliente = null;
		private JTextField txtData = null;
		private JTextField txtQuantidade = null;
		private DefaultListModel<String> dlmCompras = null;
		
	
	//MÉTODO CONSTRUTOR DA CLASSE
	public ControladorLimpar(JComboBox<String> cboProduto, JComboBox<String> cboCliente, JTextField txtData,
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
		cboProduto.setSelectedIndex(0);
		cboCliente.setSelectedIndex(0);
		txtData.setText("");
		txtQuantidade.setText("");
		dlmCompras.clear();
	}
}