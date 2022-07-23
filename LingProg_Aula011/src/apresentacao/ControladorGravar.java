package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import negocio.Fabricante;
import negocio.Veiculo;

public class ControladorGravar implements ActionListener {
	// PROPRIEDADES DA CLASSE
	private JComboBox<String> cboFabricante = new JComboBox<String>();
	private JTextField txtModelo = new JTextField();
	private JRadioButton optAmarelo = new JRadioButton();
	private JRadioButton optAzul = new JRadioButton();
	private JRadioButton optBege = new JRadioButton();
	private JCheckBox boxTetoSolar = new JCheckBox();
	
	//MÉTODO CONSTRUTOR CHEIO DA CLASSE
	public ControladorGravar(JComboBox<String> cboFabricante, JTextField txtModelo, JRadioButton optAmarelo,
			JRadioButton optAzul, JRadioButton optBege, JCheckBox boxTetoSolar) {
		super();
		this.cboFabricante = cboFabricante;
		this.txtModelo = txtModelo;
		this.optAmarelo = optAmarelo;
		this.optAzul = optAzul;
		this.optBege = optBege;
		this.boxTetoSolar = boxTetoSolar;
	}
	
	// MÉTODO SOBESCRITO DA CLASSE	
	public void actionPerformed(ActionEvent e) {
		//CRÍTICA CBOFABRICANTE
		if(cboFabricante.getSelectedIndex() == 0) {
			JOptionPane.showMessageDialog(null, "O campo fabricante é obrigatório!");
			return;
		}
		
		//CRÍTICA TXTMODELO
		if(txtModelo.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "O campo modelo é obrigatório!");
			return;
		}
		
		//INSTANCIEI UM OBJETO DO TIPO VEICULO
		Veiculo objVeiculo = new Veiculo();
		
		//COLOQUEI OS DADOS DO FORMULÁRIO NO OBJETO ANTES INSTANCIADO
		objVeiculo.setObjFabricante(new Fabricante(cboFabricante.getSelectedItem().toString()));
		objVeiculo.setModelo(txtModelo.getText());
		if (optAmarelo.isSelected()) {
			objVeiculo.setCor("Amarelo");
		} else if (optAzul.isSelected()) {
			objVeiculo.setCor("Azul");
		} else if (optBege.isSelected()) {
			objVeiculo.setCor("Bege");
		} else {
			objVeiculo.setCor("Branco");
		}
			
		objVeiculo.setTetoSolar(boxTetoSolar.isSelected());
		
		//GRAVEI OS DADOS DO OBJVEICULO NO BANCO DE DADOS
		/*EM BREVE*/
		
		//MOSTREI NA TELA OS DADOS GRAVADOS
				JOptionPane.showMessageDialog(null, "Fabricante: " + objVeiculo.getObjFabricante().getNome() + "\r\n" + 
													"Modelo: " + objVeiculo.getModelo() + "\r\n" + 
													"Cor: " + objVeiculo.getCor() + "\r\n" + 
													"Teto Solar: " + (objVeiculo.isTetoSolar() ? "Sim" : "Não"));
		
		//ZEREI O FORMULÁRIO
		cboFabricante.setSelectedIndex(0);
		txtModelo.setText("");
		boxTetoSolar.setSelected(false);
	}
}