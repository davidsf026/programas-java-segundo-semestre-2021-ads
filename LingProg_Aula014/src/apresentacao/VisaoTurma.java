package apresentacao;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import negocio.Disciplina;
import negocio.Professor;

public class VisaoTurma extends JFrame{
	//PROPRIEDADES DA CLASSE
	private static final long serialVersionUID = 1L;
	
	//INSTANCIA��O PAINEL
	private JPanel objPainel = new JPanel();
	
	//INSTANCIA��O DISCIPLINA
	private JLabel lblDisciplina = new JLabel("Disciplina");
	private JComboBox<String> cboDisciplina = new JComboBox<String>();
	
	//INSTANCIA��O PROFESSOR
	private JLabel lblProfessor = new JLabel("Professor");
	private JComboBox<String> cboProfessor = new JComboBox<String>();
	
	//INSTANCIA��O LETRA
	private JLabel lblLetra = new JLabel("Letra");
	private JTextField txtLetra = new JTextField();
	
	//INSTANCIA��O BOT�O GRAVAR
	private JButton btnGravar = new JButton("Gravar");
	
	//INSTANCIA��O BOT�O LIMPAR
	private JButton btnLimpar = new JButton("Limpar");
	
	//INSTANCIA��O BOT�O SAIR
	private JButton btnSair = new JButton("Sair");
	
	//M�TODO PRINCIPAL DE EXECU��O DA CLASSE
	public static void main(String[] args) {
		new VisaoTurma().setVisible(true);
	}
	
	//M�TODO CONSTRUTOR VAZIO DA CLASSE
	public VisaoTurma() {
		//CONFIGURA��O DA JANELA
		setTitle("Cadastro de Turmas");
		setSize(800, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		objPainel.setLayout(null);
		setContentPane(objPainel);
		
		//CONFIGURA��O DA DISCIPLINA
		lblDisciplina.setBounds(20, 20, 200, 20);
		objPainel.add(lblDisciplina);
		cboDisciplina.setBounds(20, 40, 400, 30);
		objPainel.add(cboDisciplina);
		cboDisciplina.addItem("");
		try {
			for(Disciplina objDisciplina : Disciplina.getTodos()) {
				cboDisciplina.addItem(objDisciplina.getNome());
			}
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "Erro na combo de disciplina! \r\n" + erro);
		}
		
		//CONFIGURA��O DO PROFESSOR
		lblProfessor.setBounds(20, 90, 200, 20);
		objPainel.add(lblProfessor);
		cboProfessor.setBounds(20, 110, 400, 30);
		objPainel.add(cboProfessor);
		cboProfessor.addItem("");
		try {
			for(Professor objProfessor : Professor.getTodos()) {
				cboProfessor.addItem(objProfessor.getNome() + " (" + objProfessor.getTitulacao() + ")");
			}
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "Erro na combo de disciplina! \r\n" + erro);
		}
		
		//CONFIGURA��O DA LETRA
		lblLetra.setBounds(20, 160, 200, 20);
		objPainel.add(lblLetra);
		txtLetra.setBounds(20, 180, 100, 30);
		objPainel.add(txtLetra);
		
		//CONFIGURA��O DO BOT�O GRAVAR
		btnGravar.setBounds(450, 500, 80, 20);
		btnGravar.addActionListener(new ControladorGravar(cboDisciplina, cboProfessor, txtLetra));
		objPainel.add(btnGravar);
		
		//CONFIGURA��O DO BOT�O LIMPAR
		btnLimpar.setBounds(550, 500, 80, 20);
		btnLimpar.addActionListener(new ControladorLimpar(cboDisciplina, cboProfessor, txtLetra));
		objPainel.add(btnLimpar);
		
		//CONFIGURA��O DO BOT�O SAIR
		btnSair.setBounds(650, 500, 80, 20);
		btnSair.addActionListener(new ControladorSair());
		objPainel.add(btnSair);
	}
}
