package apresentacao;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import negocio.Cliente;
import negocio.Compra;
import negocio.Produto;

public class VisaoAmazon extends JFrame{
	//PROPRIEDADES DA CLASSE
	private static final long serialVersionUID = 1L;
	
	private JPanel objPainel = new JPanel();
	
	//INSTANCIA��O PRODUTO
	private JLabel lblProduto = new JLabel("Produto");
	private JComboBox<String> cboProduto = new JComboBox<String>();
	
	//INSTANCIA��O CLIENTE
	private JLabel lblCliente = new JLabel("Cliente");
	private JComboBox<String> cboCliente = new JComboBox<String>();
	
	//INSTANCIA��O DATA
	private JLabel lblData = new JLabel("Data (dd/mm/aaaa)");
	private JTextField txtData = new JTextField();
	
	//INSTANCIA��O QUANTIDADE
	private JLabel lblQuantidade = new JLabel("Quantidade");
	private JTextField txtQuantidade = new JTextField();
	
	//INSTANCIA��O LISTA DE COMPRAS
	private JLabel lblCompras = new JLabel("Compras Realizadas");
	private JList<String> lstCompras = new JList<String>();
	private DefaultListModel<String> dlmCompras = new DefaultListModel<String>();
	private JScrollPane jspCompras = new JScrollPane(lstCompras);
	
	//INSTANCIA��O BOT�O GRAVAR
	private JButton btnGravar = new JButton("Gravar");
	
	//INSTANCIA��O BOT�O LIMPAR
	private JButton btnLimpar = new JButton("Limpar");
	
	//INSTANCIA��O BOT�O SAIR
	private JButton btnSair = new JButton("Sair");
	
	//M�TODO PRINCIPAL DE EXECU��O DA CLASSE
	public static void main(String[] args) {
		new VisaoAmazon().setVisible(true);
	}
	
	//M�TODO CONSTRUTOR VAZIO DA CLASSE
	public VisaoAmazon() {
		//CONFIGURA��O DA JANELA
		setTitle("Cadastro de Compras Amazon");
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		//CONFIGURA��O DO PAINEL
		objPainel.setLayout(null);
		setContentPane(objPainel);
		
		//PRODUTO
		lblProduto.setBounds(20, 20, 200, 20);
		objPainel.add(lblProduto);
		cboProduto.setBounds(20, 40, 500, 30);
		objPainel.add(cboProduto);
		cboProduto.addItem("");
		
		try {
			for (Produto objProduto : Produto.getTodos()) {
				cboProduto.addItem(objProduto.getNome());
			}
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "Erro na compo do produto: " + erro);
		}
		
		//CLIENTE
		lblCliente.setBounds(20, 90, 200, 20);
		objPainel.add(lblCliente);
		cboCliente.setBounds(20, 110, 500, 30);
		objPainel.add(cboCliente);
		cboCliente.addItem("");
		
		try {
			for (Cliente objCliente : Cliente.getTodos()) {
				cboCliente.addItem(objCliente.getNome());
			}
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "Erro na compo do cliente: " + erro);
		}
		
		//DATA
		lblData.setBounds(20, 160, 200, 20);
		objPainel.add(lblData);
		txtData.setBounds(20, 180, 150, 30);
		objPainel.add(txtData);
		
		//QUANTIDADE
		lblQuantidade.setBounds(20, 220, 200, 20);
		objPainel.add(lblQuantidade);
		txtQuantidade.setBounds(20, 240, 150, 30);
		objPainel.add(txtQuantidade);
		
		//COMPRAS
		lblCompras.setBounds(20, 280, 200, 20);
		objPainel.add(lblCompras);
		jspCompras.setBounds(20, 300, 700, 100);
		objPainel.add(jspCompras);
		lstCompras.setModel(dlmCompras);
		dlmCompras.clear();
		dlmCompras.addElement("Cliente          Produto          Data          Valor Total");
		try {
			for (Compra objCompra : Compra.getTodos()) {
				dlmCompras.addElement(objCompra.getObjCliente().getNome() + "          " +
									  objCompra.getObjProduto().getNome() + "          " +
									  objCompra.getDataParaApresentacao() + "          " +
									  (objCompra.getObjProduto().getPreco() * objCompra.getQuantidade()));
			}
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "Erro na lista de compras: " + erro);
		}
		
		//CONFIGURA��O BOT�O GRAVAR
		btnGravar.setBounds(450, 500, 80, 20);
		btnGravar.addActionListener(new ControladorGravar(cboProduto, cboCliente, txtData, txtQuantidade, dlmCompras));
		objPainel.add(btnGravar);
		
		//CONFIGURA��O BOT�O LIMPAR
		btnLimpar.setBounds(550, 500, 80, 20);
		btnLimpar.addActionListener(new ControladorLimpar(cboProduto, cboCliente, txtData, txtQuantidade, dlmCompras));
		objPainel.add(btnLimpar);
		
		//CONFIGURA��O BOT�O SAIR
		btnSair.setBounds(650, 500, 80, 20);
		btnSair.addActionListener(new ControladorSair());
		objPainel.add(btnSair);
	}
}
