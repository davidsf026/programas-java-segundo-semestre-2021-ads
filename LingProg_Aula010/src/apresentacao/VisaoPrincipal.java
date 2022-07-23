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
	
	//INSTANCIA��O DO PAINEL
	private JPanel objPainel = new JPanel();
	
	//INSTANCIA��O DO NOME
	private JLabel lblNome = new JLabel("Nome");
	private JTextField txtNome = new JTextField();
	
	//INSTANCIA��O DO PRE�O
	private JLabel lblPreco = new JLabel("Pre�o");
	private JTextField txtPreco = new JTextField();
	
	//INSTANCIA��O DO TIPO
	private JLabel lblTipo =  new JLabel("Tipo");
	private JComboBox<String> comboTipo = new JComboBox<String>();
	
	//INSTANCIA��O DO PEREC�VEL
	private JCheckBox boxPerecivel =  new JCheckBox("Perec�vel?");
	
	//INSTANCIA��O DO DETALHAMENTO
	private JLabel lblDetalhamento = new JLabel("Detalhamento");
	private JTextArea txtDetalhamento = new JTextArea();
	private JScrollPane paneDetalhamento = new JScrollPane(txtDetalhamento);
	
	//INSTANCIA��O DO BOT�O GRAVAR
	private JButton btnGravar = new JButton("Gravar");
	
	//INSTANCIA��O DO BOT�O LIMPAR
	private JButton btnLimpar = new JButton("Limpar");
	
	//INSTANCIA��O DO BOT�O SAIR
	private JButton btnSair = new JButton("Sair");
	
	//M�TODO PRINCIPAL DE EXECU��O DA CLASSE
	public static void main(String[] args) {
		new VisaoPrincipal().setVisible(true);
	}
	
	//M�TODO CONSTRUTOR VAZIO DA CLASSE
	private VisaoPrincipal() {
		//CONFIGURA��O DA TELA
		setTitle("Cadastro de Produtos");
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		//CONFIGURA��O DO PAINEL
		objPainel.setLayout(null);
		setContentPane(objPainel);
		
		//CONFIGURA��O DO NOME
		lblNome.setBounds(20, 20, 50, 20);
		objPainel.add(lblNome);
		
		txtNome.setBounds(20, 40, 300, 20);
		objPainel.add(txtNome);
		
		//CONFIGURA��O DO PRE�O
		lblPreco.setBounds(20, 80, 50, 20);
		objPainel.add(lblPreco);
		
		txtPreco.setBounds(20, 100, 80, 20);
		objPainel.add(txtPreco);
		
		//CONFIGURA��O DO TIPO
		lblTipo.setBounds(20, 140, 80, 20);
		objPainel.add(lblTipo);
		
		comboTipo.addItem("");
		
		for (Tipo tempObjTipo : Tipo.getAllTipo()) {
			comboTipo.addItem(tempObjTipo.getDescricao());
		}
		
		comboTipo.setBounds(20, 160, 120, 20);
		objPainel.add(comboTipo);
		
		//CONFIGURA��O DO PEREC�VEL
		boxPerecivel.setBounds(20, 200, 100, 20);
		objPainel.add(boxPerecivel);		
		
		//CONFIGURA��O DO DETALHAMENTO
		lblDetalhamento.setBounds(20, 240, 80, 20);
		objPainel.add(lblDetalhamento);
		
		txtDetalhamento.setLineWrap(true);
		
		paneDetalhamento.setBounds(20, 260, 745, 200);
		objPainel.add(paneDetalhamento);
		
		//CONFIGURA��O DO BOT�O LIMPAR
		btnLimpar.addActionListener(new ControladorLimpar(txtNome, txtPreco, comboTipo, boxPerecivel, txtDetalhamento));
		
		btnLimpar.setBounds(515, 510, 80, 20);
		objPainel.add(btnLimpar);
		
		//CONFIGURA��O DO BOT�O GRAVAR
		btnGravar.addActionListener(new ControladorGravar(txtNome, txtPreco, comboTipo, boxPerecivel, txtDetalhamento));
		
		btnGravar.setBounds(600, 510, 80, 20);
		objPainel.add(btnGravar);
		
		//CONFIGURA��O DO BOT�O SAIR
		btnSair.addActionListener(new ControladorSair());
		
		btnSair.setBounds(685, 510, 80, 20);
		objPainel.add(btnSair);
	}
}
