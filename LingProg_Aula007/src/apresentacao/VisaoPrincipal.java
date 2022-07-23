package apresentacao;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class VisaoPrincipal extends JFrame{
	//PROPRIEDADES DA CLASSE
	private static final long serialVersionUID = 1L;
	private JPanel objPainel = new PainelDesenho();
	
	//M�TODO PRINCIPAL DE EXECU��O DA CLASSE
	public static void main(String[] args) {
		new VisaoPrincipal().setVisible(true);
	}
	
	//M�TODO CONSTRUTOR VAZIO DA CLASSE
	public VisaoPrincipal() {
		setTitle("T�tulo Superior");
		setSize(800, 600); //(HORIZONTAL, VERTICAL)
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		//CONFIGURA��O DO PAINEL
		objPainel.setLayout(null);
		setContentPane(objPainel);
		setBackground(Color.blue);
	}
}
