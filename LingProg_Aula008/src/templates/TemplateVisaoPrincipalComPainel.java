package templates;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TemplateVisaoPrincipalComPainel extends JFrame{
	//PROPRIEDADES DA CLASSE
	private static final long serialVersionUID = 1L;
	
	private JPanel objPainel = new JPanel();
	
	//MÉTODO PRINCIPAL DE EXECUÇÃO DA CLASSE
	public static void main(String[] args) {
		new TemplateVisaoPrincipalComPainel().setVisible(true);
	}
	
	//MÉTODO CONSTRUTOR VAZIO DA CLASSE
	public TemplateVisaoPrincipalComPainel() {
		//CONFIGURAÇÃO DA JANELA
		setTitle("Seu Título");
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		//CONFIGURAÇÃO DO PAINEL
		objPainel.setLayout(null);
		setContentPane(objPainel);
	}

}
