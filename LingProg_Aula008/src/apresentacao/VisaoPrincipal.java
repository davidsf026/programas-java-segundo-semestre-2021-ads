package apresentacao;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class VisaoPrincipal extends JFrame{
	//PROPRIEDADES DA CLASSE
	private static final long serialVersionUID = 1L;
	
	//MENU
	private JMenuBar objBarraDeMenu = new JMenuBar();
	
	private JMenu mnuArquivo = new JMenu("Arquivo");
	private JMenuItem mniNovo = new JMenuItem ("Novo");
	private JMenuItem mniAbrir = new JMenuItem ("Abrir");
	private JMenuItem mniSair = new JMenuItem ("Sair");
	
	private JMenu mnuEditar = new JMenu("Editar");
	private JMenuItem mniCopiar = new JMenuItem ("Copiar");
	private JMenuItem mniColar = new JMenuItem ("Colar");
	
	private JMenu mnuAjuda = new JMenu("Ajuda");
	private JMenuItem mniSobre = new JMenuItem ("Sobre");
	
	//PAINEL
	private JPanel objPainel =  new JPanel();
	
	//NOME
	private JLabel lblNome = new JLabel("Nome");
	private JTextField txtNome = new JTextField();
	
	//ENDERE�O
	private JLabel lblEndereco = new JLabel("Endere�o");
	private JTextField txtEndereco = new JTextField();
	
	//BAIRRO
	private JLabel lblBairro = new JLabel("Bairro");
	private JComboBox<String> cboBairro = new JComboBox<String>();
	
	//OBSERVA��O
	private JLabel lblObservacoes = new JLabel("Observa��es");
	private JTextArea txtObservacoes = new JTextArea();
	private JScrollPane jspObservacoes =  new JScrollPane(txtObservacoes);
	
	//DEFICIENTE F�SICO?
	private JCheckBox jcbDeficiente =  new JCheckBox("Deficiente F�sico");
	
	//TIPO DO IMOVEL
	private JLabel lblTipoImovel = new JLabel("Tipo do Im�vel");
	private DefaultListModel<String> lsmTipoImovel = new DefaultListModel<String>();
	private JList<String> lstTipoImovel = new JList<String>();
	
	//SEXO
	private JLabel lblSexo = new JLabel("Sexo");
	private ButtonGroup grpSexo = new ButtonGroup();
	private JRadioButton optMasculino = new JRadioButton("Masculino");
	private JRadioButton optFeminino = new JRadioButton("Feminino");
	
	//BOT�O SAIR
	private JButton btnSair = new JButton("Sair");
	
	//M�TODO PRINCIPAL DE EXECU��O DA CLASSE
	public static void main(String[] args) {
		new VisaoPrincipal().setVisible(true);
	}
	
	//M�TODO CONSTRUTOR DA CLASSE
	public VisaoPrincipal() {
		//CONFIGURA��O DA JANELA
		setTitle("Janela de Teste de Controles");
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		//CONFIGURA��O DO MENU
		setJMenuBar(objBarraDeMenu);
		
		objBarraDeMenu.add(mnuArquivo);
		mniNovo.addActionListener(new ControladorNovo()); //A��O DO BOT�O
		mnuArquivo.add(mniNovo);
		mnuArquivo.add(mniAbrir);
		mnuArquivo.addSeparator();
		mniSair.addActionListener(new ControladorSair()); //A��O DO BOT�O
		mnuArquivo.add(mniSair);
		
		objBarraDeMenu.add(mnuEditar);
		mnuEditar.add(mniCopiar);
		mnuEditar.add(mniColar);
		
		objBarraDeMenu.add(mnuAjuda);
		mniSobre.addActionListener(new ControladorSobre()); //A��O DO BOT�O
		mnuAjuda.add(mniSobre);
		
		//CONFIGURA��O DO PAINEL
		objPainel.setLayout(null);
		setContentPane(objPainel);
		
		//NOME
		lblNome.setBounds(20, 20, 50, 20);
		objPainel.add(lblNome);
		
		txtNome.setBounds(20, 40, 300, 20);
		objPainel.add(txtNome);
		
		//ENDERECO
		lblEndereco.setBounds(20, 80, 100, 20);
		objPainel.add(lblEndereco);
		
		txtEndereco.setBounds(20, 100, 300, 20);
		objPainel.add(txtEndereco);
		
		//BAIRRO
		lblBairro.setBounds(540, 80, 50, 20);
		objPainel.add(lblBairro);
		
		cboBairro.setBounds(540, 100, 222, 20);
		objPainel.add(cboBairro);
		
		cboBairro.addItem("");
		cboBairro.addItem("Asa Norte");
		cboBairro.addItem("Asa Sul");
		cboBairro.addItem("Lago Norte");
		cboBairro.addItem("Lago Sul");
		
		//OBSERVA��O
		lblObservacoes.setBounds(20, 140, 100, 20);
		objPainel.add(lblObservacoes);
		
		jspObservacoes.setBounds(20, 160, 745, 200);
		objPainel.add(jspObservacoes);
		txtObservacoes.setLineWrap(true); //QUEBRA DE LINHA AUTOM�TICA ATIVADA
		
		//DEFICIENTE F�SICO?
		jcbDeficiente.setBounds(20, 380, 150, 20);
		objPainel.add(jcbDeficiente);
		
		//TIPO DO IM�VEL
		lblTipoImovel.setBounds(350, 380, 100, 20);
		objPainel.add(lblTipoImovel);
		
		lsmTipoImovel.addElement("Apartamento");
		lsmTipoImovel.addElement("Casa");
		lsmTipoImovel.addElement("Ch�cara");
		lsmTipoImovel.addElement("Kitnet");
		
		lstTipoImovel.setModel(lsmTipoImovel);
		
		lstTipoImovel.setBounds(350, 400, 120, 80);
		objPainel.add(lstTipoImovel);
		
		//SEXO
		lblSexo.setBounds(20, 420, 50, 20);
		objPainel.add(lblSexo);
		
		grpSexo.add(optMasculino);
		grpSexo.add(optFeminino);
		optMasculino.setSelected(true);
		
		optMasculino.setBounds(20, 440, 100, 20);
		objPainel.add(optMasculino);
		
		optFeminino.setBounds(150, 440, 100, 20);
		objPainel.add(optFeminino);
		
		//BOT�O SAIR
		btnSair.addActionListener(new ControladorSair()); //A��O DO BOT�O
		btnSair.setBounds(665, 480, 100, 20);
		objPainel.add(btnSair);
	}
}