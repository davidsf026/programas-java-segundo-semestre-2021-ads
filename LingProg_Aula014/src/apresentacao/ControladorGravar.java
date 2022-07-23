package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import negocio.Disciplina;
import negocio.Professor;
import negocio.Turma;

public class ControladorGravar implements ActionListener {
	//PROPRIEDADAS DA CLASSE
	private JComboBox<String> cboDisciplina = null;
	private JComboBox<String> cboProfessor = null;
	private JTextField txtLetra = null;
	
	//M�TODO CONSTRUTOR CHEIO DA CLASSE
	public ControladorGravar(JComboBox<String> cboDisciplina, JComboBox<String> cboProfessor, JTextField txtLetra) {
		super();
		this.cboDisciplina = cboDisciplina;
		this.cboProfessor = cboProfessor;
		this.txtLetra = txtLetra;
	}
	
	//M�TODO SOBESCRITO DA INTERFACE
	public void actionPerformed(ActionEvent e) {
		//CR�TICA DE DADOS
		if (cboDisciplina.getSelectedIndex() == 0) {
			JOptionPane.showMessageDialog(null, "Campo disciplina � obrigat�rio!");
		}
		
		if (cboProfessor.getSelectedIndex() == 0) {
			JOptionPane.showMessageDialog(null, "Campo professor � obrigat�rio!");
		}
		
		if (txtLetra.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Campo letra � obrigat�rio!");
		}
		
		Turma objTurma = new Turma();
		objTurma.setObjDisciplina(new Disciplina(cboDisciplina.getSelectedIndex(), cboDisciplina.getSelectedItem().toString()));
		objTurma.setObjProfessor(new Professor(cboProfessor.getSelectedIndex(), "", ""));
		objTurma.setLetra(txtLetra.getText());
		
		try {
			objTurma.persistir();
			JOptionPane.showMessageDialog(null, "Sucesso!");
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "Erro na grava��o da turma! \r\n" + erro);
		}
	}
}