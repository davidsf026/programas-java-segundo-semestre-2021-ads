package apresentacao;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VisaoCargo extends JInternalFrame {
	// Propriedades da classe
	private static final long serialVersionUID = 1L;
	
	private JPanel objPainel = new JPanel();
	
	private JLabel lblNome = new JLabel("Nome");
	private JTextField txtNome = new JTextField();
	
	private JLabel lblSalario = new JLabel("Salário");
	private JTextField txtSalario = new JTextField();
	
	private JButton btnGravar = new JButton("Gravar");
	private JButton btnLimpar = new JButton("Limpar");
	private JButton btnFechar = new JButton("Fechar");
	
	// Método construtor vazio da classe
	public VisaoCargo() {
		// Configuração da janela
		super("Cadastro de Cargos", false, true, true, false);
		
		// Configuração do painel
		objPainel.setLayout(null);
		setContentPane(objPainel);
		
		// Nome
		lblNome.setBounds(20, 20, 200, 20);
		objPainel.add(lblNome);
		txtNome.setBounds(20, 40, 500, 20);
		objPainel.add(txtNome);
		
		// Salário
		lblSalario.setBounds(20, 80, 200, 20);
		objPainel.add(lblSalario);
		txtSalario.setBounds(20, 100, 100, 20);
		objPainel.add(txtSalario);
		
		// Botões
		btnGravar.setBounds(450, 500, 100, 30);
		btnGravar.addActionListener(new ControladorGravarCargo(txtNome, txtSalario));
		objPainel.add(btnGravar);
		
		btnLimpar.setBounds(550, 500, 100, 30);
		btnLimpar.addActionListener(new ControladorLimparCargo(txtNome, txtSalario));
		objPainel.add(btnLimpar);
		
		btnFechar.setBounds(450, 500, 100, 30);
		btnFechar.addActionListener(new ControladorFechar(this));
		objPainel.add(btnFechar);
	}
}