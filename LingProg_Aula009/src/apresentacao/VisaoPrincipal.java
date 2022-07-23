package apresentacao;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import negocio.Uf;

public class VisaoPrincipal extends JFrame{
	//PROPRIEDADES DA CLASSE
	private static final long serialVersionUID = 1L;
	
	//PAINEL
	private JPanel objPainel = new JPanel();
	
	//NOME
	private JLabel lblNome = new JLabel("Nome");
	private JTextField txtNome = new JTextField();
	
	//SEXO
	private JLabel lblSexo = new JLabel("Sexo");
	private ButtonGroup grpSexo = new ButtonGroup();
	private JRadioButton optMasculino = new JRadioButton("Masculino");
	private JRadioButton optFeminino = new JRadioButton("Feminino");
	
	//ENDERECO
	private JLabel lblEndereco = new JLabel("Endere�o");
	private JTextField txtEndereco = new JTextField();
	
	//UF
	private JLabel lblUf = new JLabel("UF");
	private JComboBox<String> jcbUf = new JComboBox<String>();
	
	//BOT�O GRAVAR
	private JButton btnGravar = new JButton("Gravar");
	
	//BOT�O LIMPAR
	private JButton btnLimpar = new JButton("Limpar");
	
	//BOT�O SAIR
	private JButton btnSair = new JButton("Sair");
	
	//M�TODO PRINCIPAL DE EXECU��O DA CLASSE
	public static void main(String[] args) {
		new VisaoPrincipal().setVisible(true);
	}
	
	//M�TODO CONSTRUTOR VAZIO DA CLASSE
	public VisaoPrincipal() {
		//CONFIGURA��ES DA TELA
		setTitle("Cadastro de Pessoas");
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		//CONFIGURA��ES DO PAINEL
		setContentPane(objPainel);
		objPainel.setLayout(null);
		
		//CONFIGURA��O NOME
		lblNome.setBounds(20, 20, 50, 20);
		objPainel.add(lblNome);
		
		txtNome.setBounds(20, 40, 300, 20);
		objPainel.add(txtNome);
		
		//CONFIGURA��O SEXO
		lblSexo.setBounds(20, 80, 80, 20);
		objPainel.add(lblSexo);
		
		grpSexo.add(optMasculino);
		grpSexo.add(optFeminino);
		
		optMasculino.setSelected(true);
		
		optMasculino.setBounds(20, 100, 90, 20);
		objPainel.add(optMasculino);
		
		optFeminino.setBounds(120, 100, 80, 20);
		objPainel.add(optFeminino);
		
		//CONFIGURA��O ENDERE�O
		lblEndereco.setBounds(20, 140, 90, 20);
		objPainel.add(lblEndereco);
		
		txtEndereco.setBounds(20, 160, 450, 20);
		objPainel.add(txtEndereco);
		
		//CONFIGURA��O UF
		lblUf.setBounds(20, 200, 20, 20);
		objPainel.add(lblUf);
		
		jcbUf.addItem("");
		for (Uf objUfTemp : Uf.getAllUf()) {
			jcbUf.addItem(objUfTemp.getUf());
		}
			
		jcbUf.setBounds(20, 220, 60, 20);
		objPainel.add(jcbUf);
		
		//BOT�O GRAVAR
		btnGravar.addActionListener(new ControladorGravar(txtNome, optMasculino, txtEndereco, jcbUf));
		
		btnGravar.setBounds(470, 500, 80, 20);
		objPainel.add(btnGravar);
		
		//BOT�O LIMPAR
		btnLimpar.addActionListener(new ControladorLimpar(txtNome, optMasculino, txtEndereco, jcbUf)); //COLOCA-SE APENAS O MASCULINO PORQUE ELE EST� EM UM BUTTON GROUP COM O FEMININO, MAS TAMB�M FUNCIONA COLOCANDO OS DOIS, S� � REDUNDANTE
		
		btnLimpar.setBounds(570, 500, 80, 20);
		objPainel.add(btnLimpar);
		
		//BOT�O SAIR
		btnSair.addActionListener(new ControladorSair());
		
		btnSair.setBounds(670, 500, 80, 20);
		objPainel.add(btnSair);
	}
}
