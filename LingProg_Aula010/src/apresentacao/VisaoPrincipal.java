package apresentacao;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import negocio.Tipo;

public class VisaoPrincipal extends JFrame{
	//PROPRIEDADES DA CLASSE
	private static final long serialVersionUID = 1L;
	
	//INSTANCIAÇÃO DO PAINEL
	private JPanel objPainel = new JPanel();
	
	//INSTANCIAÇÃO DO NOME
	private JLabel lblNome = new JLabel("Nome");
	private JTextField txtNome = new JTextField();
	
	//INSTANCIAÇÃO DO PREÇO
	private JLabel lblPreco = new JLabel("Preço");
	private JTextField txtPreco = new JTextField();
	
	//INSTANCIAÇÃO DO TIPO
	private JLabel lblTipo =  new JLabel("Tipo");
	private JComboBox<String> comboTipo = new JComboBox<String>();
	
	//INSTANCIAÇÃO DO PERECÍVEL
	private JCheckBox boxPerecivel =  new JCheckBox("Perecível?");
	
	//INSTANCIAÇÃO DO DETALHAMENTO
	private JLabel lblDetalhamento = new JLabel("Detalhamento");
	private JTextArea txtDetalhamento = new JTextArea();
	private JScrollPane paneDetalhamento = new JScrollPane(txtDetalhamento);
	
	//INSTANCIAÇÃO DO BOTÃO GRAVAR
	private JButton btnGravar = new JButton("Gravar");
	
	//INSTANCIAÇÃO DO BOTÃO LIMPAR
	private JButton btnLimpar = new JButton("Limpar");
	
	//INSTANCIAÇÃO DO BOTÃO SAIR
	private JButton btnSair = new JButton("Sair");
	
	//MÉTODO PRINCIPAL DE EXECUÇÃO DA CLASSE
	public static void main(String[] args) {
		new VisaoPrincipal().setVisible(true);
	}
	
	//MÉTODO CONSTRUTOR VAZIO DA CLASSE
	private VisaoPrincipal() {
		//CONFIGURAÇÃO DA TELA
		setTitle("Cadastro de Produtos");
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		//CONFIGURAÇÃO DO PAINEL
		objPainel.setLayout(null);
		setContentPane(objPainel);
		
		//CONFIGURAÇÃO DO NOME
		lblNome.setBounds(20, 20, 50, 20);
		objPainel.add(lblNome);
		
		txtNome.setBounds(20, 40, 300, 20);
		objPainel.add(txtNome);
		
		//CONFIGURAÇÃO DO PREÇO
		lblPreco.setBounds(20, 80, 50, 20);
		objPainel.add(lblPreco);
		
		txtPreco.setBounds(20, 100, 80, 20);
		objPainel.add(txtPreco);
		
		//CONFIGURAÇÃO DO TIPO
		lblTipo.setBounds(20, 140, 80, 20);
		objPainel.add(lblTipo);
		
		comboTipo.addItem("");
		
		for (Tipo tempObjTipo : Tipo.getAllTipo()) {
			comboTipo.addItem(tempObjTipo.getDescricao());
		}
		
		comboTipo.setBounds(20, 160, 120, 20);
		objPainel.add(comboTipo);
		
		//CONFIGURAÇÃO DO PERECÍVEL
		boxPerecivel.setBounds(20, 200, 100, 20);
		objPainel.add(boxPerecivel);		
		
		//CONFIGURAÇÃO DO DETALHAMENTO
		lblDetalhamento.setBounds(20, 240, 80, 20);
		objPainel.add(lblDetalhamento);
		
		txtDetalhamento.setLineWrap(true);
		
		paneDetalhamento.setBounds(20, 260, 745, 200);
		objPainel.add(paneDetalhamento);
		
		//CONFIGURAÇÃO DO BOTÃO LIMPAR
		btnLimpar.addActionListener(new ControladorLimpar(txtNome, txtPreco, comboTipo, boxPerecivel, txtDetalhamento));
		
		btnLimpar.setBounds(515, 510, 80, 20);
		objPainel.add(btnLimpar);
		
		//CONFIGURAÇÃO DO BOTÃO GRAVAR
		btnGravar.addActionListener(new ControladorGravar(txtNome, txtPreco, comboTipo, boxPerecivel, txtDetalhamento));
		
		btnGravar.setBounds(600, 510, 80, 20);
		objPainel.add(btnGravar);
		
		//CONFIGURAÇÃO DO BOTÃO SAIR
		btnSair.addActionListener(new ControladorSair());
		
		btnSair.setBounds(685, 510, 80, 20);
		objPainel.add(btnSair);
	}
}
