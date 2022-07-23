package templates;

import javax.swing.JFrame;

public class TemplateVisaoPrincipal extends JFrame{
	 //PROPRIEDADES DA CLASSE
	private static final long serialVersionUID = 1L;
	
	//M�TODO PRINCIPAL DE EXECU��O DA CLASSE
	public static void main(String[] args) {
		new TemplateVisaoPrincipal().setVisible(true);
	}
	
	//M�TODO CONSTRUTOR VAZIO DA CLASSE
	public TemplateVisaoPrincipal() {
		//CONFIGURA��O DA JANELA
		setTitle("Seu T�tulo");
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
}
