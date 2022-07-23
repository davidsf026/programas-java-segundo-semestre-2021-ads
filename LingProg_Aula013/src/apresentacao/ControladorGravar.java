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
	
	//M�TODO CONSTRUTOR CHEIO DA CLASSE
	public ControladorGravar(JTextField txtTitulo, JComboBox<String> cboAutor) {
		super();
		this.txtTitulo = txtTitulo;
		this.cboAutor = cboAutor;
	}

	//M�TODO SOBESCRITO DA INTERFACE
	public void actionPerformed(ActionEvent e) {
		if (txtTitulo.getText().length() == 0) {
			JOptionPane.showMessageDialog(null, "Campo t�tulo � obrigat�rio!");
			return;
		}
		
		if (cboAutor.getSelectedIndex() == 0) {
			JOptionPane.showMessageDialog(null, "Campo autor � obrigat�rio!");
			return;
		}
		//COMPOSI��O DO OBJETO
		Livro objLivro = new Livro();
		objLivro.setTitulo(txtTitulo.getText());
		objLivro.setObjAutor(new Autor(cboAutor.getSelectedIndex(), cboAutor.getSelectedItem().toString()));
		try {
			objLivro.persistir();
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "Erro na grava��o do banco de dados" + erro);
		}
		JOptionPane.showMessageDialog(null, "Grava��o realizada com sucesso!");

	}

}
