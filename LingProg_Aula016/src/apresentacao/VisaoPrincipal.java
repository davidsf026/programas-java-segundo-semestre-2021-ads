package apresentacao;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Color;

public class VisaoPrincipal extends JFrame {
	// Propriedades da classe
	private static final long serialVersionUID = 1L;
	
	private JDesktopPane jdpPainel = new JDesktopPane();
	
	private JMenuBar barraDeMenu = new JMenuBar();
	
	private JMenu mnuCadastro = new JMenu("Cadastro");
	private JMenuItem mniCargo = new JMenuItem("Cargo");
	private JMenuItem mniColaborador = new JMenuItem("Colaborador");
	private JMenuItem mniSair = new JMenuItem("Sair");
	
	private JMenu mnuFolhaDePagamento = new JMenu("Folha de Pagamento");
	private JMenuItem mniCalcular = new JMenuItem("Calcular");
	
	// M�todo principal de execu��o do sistema
	public static void main(String[] args) {
		new VisaoPrincipal().setVisible(true);
	}
	
	// M�todo construtor vazio da classe
	public VisaoPrincipal() {
		// Configura��o da janela
		setTitle("Sistema de C�lculo de Folha de Pagamento das Organiza��o Tabajara !");
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		// Configura��o do painel
		jdpPainel.setBackground(Color.gray);
		setContentPane(jdpPainel);
		
		// Configura��o do menu
		setJMenuBar(barraDeMenu);
		
		barraDeMenu.add(mnuCadastro);
		barraDeMenu.add(mnuFolhaDePagamento);
		
		mnuCadastro.add(mniCargo);
		mnuCadastro.add(mniColaborador);
		mnuCadastro.addSeparator();
		mnuCadastro.add(mniSair);
		
		mnuFolhaDePagamento.add(mniCalcular);
		
		// A��es do menu
		/*
		mniCargo.addActionListener(new ControladorCargo(jdpPainel));
		
		mniColaborador.addActionListener(new ControladorColaborador(jdpPainel));
		
		mniSair.addActionListener(new ControladorSair());
		
		mniCalcular.addActionListener(new ControladorCalcular(jdpPainel));
		*/
	}
}