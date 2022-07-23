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
	
	//DECLARAÇÃO DO PAINEL
	private JPanel objPainel = new JPanel();
	
	//DECLARAÇÃO DO FABRICANTE
	private JLabel lblFabricante = new JLabel("Fabricante");
	private JComboBox<String> cboFabricante = new JComboBox<String>();
	
	//DECLARAÇÃO DO MODELO
	private JLabel lblModelo = new JLabel("Modelo");
	private JTextField txtModelo = new JTextField();
	
	//DECLARAÇÃO DA COR
	private JLabel lblCor = new JLabel("Cor");
	
	private JRadioButton optAmarelo = new JRadioButton("Amarelo");
	private JRadioButton optAzul = new JRadioButton("Azul");
	private JRadioButton optBege = new JRadioButton("Bege");
	private JRadioButton optBranco = new JRadioButton("Branco");
	private ButtonGroup grpCor = new ButtonGroup();
	
	//DECLARAÇÃO DO TETO SOLAR
	private JCheckBox boxTetoSolar = new JCheckBox("Teto Solar?");
	
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
	public VisaoPrincipal() {
		//CONFIGURAÇÃO DA JANELA
		setTitle("Cadastro de Veículos");
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		//CONFIGURAÇÃO DO PAINEL
		objPainel.setLayout(null);
		setContentPane(objPainel);
		
		//CONFIGURAÇÃO DO FABRICANTE
		lblFabricante.setBounds(20, 20, 60, 20);
		objPainel.add(lblFabricante);
		
		cboFabricante.addItem("");
		
		for(Fabricante tempObjFabricante : Fabricante.getAllFabricante()) {
			cboFabricante.addItem(tempObjFabricante.getNome());
		}
		
		cboFabricante.setBounds(20, 40, 100, 20);
		objPainel.add(cboFabricante);
		
		//CONFIGURAÇÃO DO MODELO
		lblModelo.setBounds(20, 80, 50, 20);
		objPainel.add(lblModelo);
		
		txtModelo.setBounds(20, 100, 300, 20);
		objPainel.add(txtModelo);
		
		//CONFIGURAÇÃO DO COR
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
		
		//CONFIGURAÇÃO DO TETO SOLAR
		boxTetoSolar.setBounds(20, 200, 100, 20);
		objPainel.add(boxTetoSolar);
		
		//CONFIGURAÇÃO DO BOTÃO LIMPAR
		btnLimpar.addActionListener(new ControladorLimpar(cboFabricante, txtModelo, optAmarelo, boxTetoSolar));
		
		btnLimpar.setBounds(515, 510, 80, 20);
		objPainel.add(btnLimpar);
		
		//CONFIGURAÇÃO DO BOTÃO GRAVAR
		btnGravar.addActionListener(new ControladorGravar(cboFabricante, txtModelo, optAmarelo, optAzul, optBege, boxTetoSolar));
		
		btnGravar.setBounds(600, 510, 80, 20);
		objPainel.add(btnGravar);
		
		//CONFIGURAÇÃO DO BOTÃO SAIR
		btnSair.addActionListener(new ControladorSair());
		
		btnSair.setBounds(685, 510, 80, 20);
		objPainel.add(btnSair);
	}
}
