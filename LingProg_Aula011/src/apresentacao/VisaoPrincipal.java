package apresentacao;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import negocio.Fabricante;

public class VisaoPrincipal extends JFrame{
	//PROPRIEDADES DA CLASSE
	private static final long serialVersionUID = 1L;
	
	//DECLARA��O DO PAINEL
	private JPanel objPainel = new JPanel();
	
	//DECLARA��O DO FABRICANTE
	private JLabel lblFabricante = new JLabel("Fabricante");
	private JComboBox<String> cboFabricante = new JComboBox<String>();
	
	//DECLARA��O DO MODELO
	private JLabel lblModelo = new JLabel("Modelo");
	private JTextField txtModelo = new JTextField();
	
	//DECLARA��O DA COR
	private JLabel lblCor = new JLabel("Cor");
	
	private JRadioButton optAmarelo = new JRadioButton("Amarelo");
	private JRadioButton optAzul = new JRadioButton("Azul");
	private JRadioButton optBege = new JRadioButton("Bege");
	private JRadioButton optBranco = new JRadioButton("Branco");
	private ButtonGroup grpCor = new ButtonGroup();
	
	//DECLARA��O DO TETO SOLAR
	private JCheckBox boxTetoSolar = new JCheckBox("Teto Solar?");
	
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
	public VisaoPrincipal() {
		//CONFIGURA��O DA JANELA
		setTitle("Cadastro de Ve�culos");
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		//CONFIGURA��O DO PAINEL
		objPainel.setLayout(null);
		setContentPane(objPainel);
		
		//CONFIGURA��O DO FABRICANTE
		lblFabricante.setBounds(20, 20, 60, 20);
		objPainel.add(lblFabricante);
		
		cboFabricante.addItem("");
		
		for(Fabricante tempObjFabricante : Fabricante.getAllFabricante()) {
			cboFabricante.addItem(tempObjFabricante.getNome());
		}
		
		cboFabricante.setBounds(20, 40, 100, 20);
		objPainel.add(cboFabricante);
		
		//CONFIGURA��O DO MODELO
		lblModelo.setBounds(20, 80, 50, 20);
		objPainel.add(lblModelo);
		
		txtModelo.setBounds(20, 100, 300, 20);
		objPainel.add(txtModelo);
		
		//CONFIGURA��O DO COR
		lblCor.setBounds(20, 140, 40, 20);
		objPainel.add(lblCor);
		
		optAmarelo.setBounds(20, 160, 100, 20);
		objPainel.add(optAmarelo);
		optAzul.setBounds(120, 160, 100, 20);
		objPainel.add(optAzul);
		optBege.setBounds(220, 160, 100, 20);
		objPainel.add(optBege);
		optBranco.setBounds(320, 160, 100, 20);
		objPainel.add(optBranco);
		
		grpCor.add(optAmarelo);
		grpCor.add(optAzul);
		grpCor.add(optBege);
		grpCor.add(optBranco);
		
		optAmarelo.setSelected(true);
		
		//CONFIGURA��O DO TETO SOLAR
		boxTetoSolar.setBounds(20, 200, 100, 20);
		objPainel.add(boxTetoSolar);
		
		//CONFIGURA��O DO BOT�O LIMPAR
		btnLimpar.addActionListener(new ControladorLimpar(cboFabricante, txtModelo, optAmarelo, boxTetoSolar));
		
		btnLimpar.setBounds(515, 510, 80, 20);
		objPainel.add(btnLimpar);
		
		//CONFIGURA��O DO BOT�O GRAVAR
		btnGravar.addActionListener(new ControladorGravar(cboFabricante, txtModelo, optAmarelo, optAzul, optBege, boxTetoSolar));
		
		btnGravar.setBounds(600, 510, 80, 20);
		objPainel.add(btnGravar);
		
		//CONFIGURA��O DO BOT�O SAIR
		btnSair.addActionListener(new ControladorSair());
		
		btnSair.setBounds(685, 510, 80, 20);
		objPainel.add(btnSair);
	}
}
