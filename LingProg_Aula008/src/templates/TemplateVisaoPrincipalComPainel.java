package templates;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TemplateVisaoPrincipalComPainel extends JFrame{
	//PROPRIEDADES DA CLASSE
	private static final long serialVersionUID = 1L;
	
	private JPanel objPainel = new JPanel();
	
	//M�TODO PRINCIPAL DE EXECU��O DA CLASSE
	public static void main(String[] args) {
		new TemplateVisaoPrincipalComPainel().setVisible(true);
	}
	
	//M�TODO CONSTRUTOR VAZIO DA CLASSE
	public TemplateVisaoPrincipalComPainel() {
		//CONFIGURA��O DA JANELA
		setTitle("Seu T�tulo");
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		//CONFIGURA��O DO PAINEL
		objPainel.setLayout(null);
		setContentPane(objPainel);
	}

}
