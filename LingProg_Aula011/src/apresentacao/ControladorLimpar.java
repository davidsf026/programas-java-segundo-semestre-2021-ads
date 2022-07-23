package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class ControladorLimpar implements ActionListener {
	// PROPRIEDADES DA CLASSE
	private JComboBox<String> cboFabricante = new JComboBox<String>();
	private JTextField txtModelo = new JTextField();
	private JRadioButton optAmarelo = new JRadioButton();
	private JCheckBox boxTetoSolar = new JCheckBox();
	
	//MÉTODO CONSTRUTOR DA CLASSE
	public ControladorLimpar(JComboBox<String> cboFabricante, JTextField txtModelo, JRadioButton optAmarelo,
			JCheckBox boxTetoSolar) {
		super();
		this.cboFabricante = cboFabricante;
		this.txtModelo = txtModelo;
		this.optAmarelo = optAmarelo;
		this.boxTetoSolar = boxTetoSolar;
	}

	// MÉTODO SOBESCRITO DA CLASSE
	public void actionPerformed(ActionEvent e) {
		cboFabricante.setSelectedIndex(0);
		txtModelo.setText("");
		optAmarelo.setSelected(true);
		boxTetoSolar.setSelected(false);
	}
}