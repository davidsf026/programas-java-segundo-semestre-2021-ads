package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class ControladorSobre implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "Sistema de Teste de Controles\n"
										  + "Developed by: David\n"
										  + "Versão 1.0");
	}
}
