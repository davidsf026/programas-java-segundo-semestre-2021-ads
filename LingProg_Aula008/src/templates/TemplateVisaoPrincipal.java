package templates;

import javax.swing.JFrame;

public class TemplateVisaoPrincipal extends JFrame{
	 //PROPRIEDADES DA CLASSE
	private static final long serialVersionUID = 1L;
	
	//MÉTODO PRINCIPAL DE EXECUÇÃO DA CLASSE
	public static void main(String[] args) {
		new TemplateVisaoPrincipal().setVisible(true);
	}
	
	//MÉTODO CONSTRUTOR VAZIO DA CLASSE
	public TemplateVisaoPrincipal() {
		//CONFIGURAÇÃO DA JANELA
		setTitle("Seu Título");
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
}
