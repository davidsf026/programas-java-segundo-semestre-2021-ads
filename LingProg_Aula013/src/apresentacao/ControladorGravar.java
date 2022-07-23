package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import negocio.Autor;
import negocio.Livro;

public class ControladorGravar implements ActionListener {
	//PROPRIEDADES DA CLASSE
	private JTextField txtTitulo = null;
	private JComboBox<String> cboAutor = null;
	
	//MÉTODO CONSTRUTOR CHEIO DA CLASSE
	public ControladorGravar(JTextField txtTitulo, JComboBox<String> cboAutor) {
		super();
		this.txtTitulo = txtTitulo;
		this.cboAutor = cboAutor;
	}

	//MÉTODO SOBESCRITO DA INTERFACE
	public void actionPerformed(ActionEvent e) {
		if (txtTitulo.getText().length() == 0) {
			JOptionPane.showMessageDialog(null, "Campo título é obrigatório!");
			return;
		}
		
		if (cboAutor.getSelectedIndex() == 0) {
			JOptionPane.showMessageDialog(null, "Campo autor é obrigatório!");
			return;
		}
		//COMPOSIÇÃO DO OBJETO
		Livro objLivro = new Livro();
		objLivro.setTitulo(txtTitulo.getText());
		objLivro.setObjAutor(new Autor(cboAutor.getSelectedIndex(), cboAutor.getSelectedItem().toString()));
		try {
			objLivro.persistir();
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "Erro na gravação do banco de dados" + erro);
		}
		JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso!");

	}

}
