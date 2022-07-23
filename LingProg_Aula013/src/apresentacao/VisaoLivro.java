package apresentacao;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import negocio.Autor;

public class VisaoLivro extends JFrame{
	//PROPRIEDADES DA CLASSE
	private static final long serialVersionUID = 1L;
	
	//DECLARANDO JPANEL
	private JPanel objPainel = new JPanel();
	
	//DECLARANDO TITULO
	private JLabel lblTitulo = new JLabel("Título");
	private JTextField txtTitulo = new JTextField();
	
	//DECLARANDO AUTOR
	private JLabel lblAutor = new JLabel("Autor");
	private JComboBox<String> cboAutor = new JComboBox<String>();
	
	//BOTÃO GRAVAR
	private JButton btnGravar = new JButton("Gravar");
	
	//BOTÃO LIMPAR
	private JButton btnLimpar = new JButton("Limpar");
	
	//BOTÃO SAIR
	private JButton btnSair = new JButton("Sair");
	
	
	//MÉTODO PRINCIPAL DE EXECUÇÃO DA CLASSE
	public static void main(String[] args) {
		new VisaoLivro().setVisible(true);
	}
	
	//MÉTODO CONSTRUTOR VAZIO DA CLASSE
	public VisaoLivro() {
		//CONFIGURAÇÃO DA JANELA
		setTitle("Programa Livraria");
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		//CONFIGURAÇÃO DO PAINEL
		objPainel.setLayout(null);
		setContentPane(objPainel);
		
		//CONFIGURAÇÃO TÍTULO
		lblTitulo.setBounds(20, 20, 200, 20);
		objPainel.add(lblTitulo);
		
		txtTitulo.setBounds(20, 40, 200, 20);
		objPainel.add(txtTitulo);
		
		//CONFIGURAÇÃO AUTOR
		lblAutor.setBounds(20, 80, 200, 20);
		objPainel.add(lblAutor);
		
		cboAutor.setBounds(20, 100, 200, 20);
		objPainel.add(cboAutor);
		
		cboAutor.addItem("");
		
		try {
			for (Autor objAutor : Autor.getTodos()) {
				cboAutor.addItem(objAutor.getNome());
			}
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, erro);
		}
		
		//BOTÕES
		btnGravar.setBounds(450, 500, 80, 20);
		btnGravar.addActionListener(new ControladorGravar(txtTitulo, cboAutor));
		objPainel.add(btnGravar);
		
		btnLimpar.setBounds(550, 500, 80, 20);
		btnLimpar.addActionListener(new ControladorLimpar(txtTitulo, cboAutor));
		objPainel.add(btnLimpar);
		
		btnSair.setBounds(650, 500, 80, 20);
		btnSair.addActionListener(new ControladorSair());
		objPainel.add(btnSair);
	}
}
