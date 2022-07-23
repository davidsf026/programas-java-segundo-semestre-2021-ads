package apresentacao;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class VisaoPrincipal extends JFrame{
	//PROPRIEDADES DA CLASSE
	private static final long serialVersionUID = 1L;
	private JPanel objPainel = new PainelDesenho();
	
	//MÉTODO PRINCIPAL DE EXECUÇÃO DA CLASSE
	public static void main(String[] args) {
		new VisaoPrincipal().setVisible(true);
	}
	
	//MÉTODO CONSTRUTOR VAZIO DA CLASSE
	public VisaoPrincipal() {
		setTitle("Título Superior");
		setSize(800, 600); //(HORIZONTAL, VERTICAL)
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		//CONFIGURAÇÃO DO PAINEL
		objPainel.setLayout(null);
		setContentPane(objPainel);
		setBackground(Color.blue);
	}
}
