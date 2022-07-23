package apresentacao;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class PainelDesenho extends JPanel{
	//PROPRIEDADES DA CLASSE
	private static final long serialVersionUID = 1L;
	
	//MÉTODOS SOBESCRITOS DA CLASSE
	public void paintComponent(Graphics g) {
		
		//CÉU
		g.setColor(Color.blue); //NÃO PRECISAVA DESSE PORQUE O BACKGROUND JÁ É AZUL
		g.fillRect(0, 0, 800, 600); //NÃO PRECISAVA DESSE PORQUE O BACKGROUND JÁ É AZUL
		
		//CHÃO
		g.setColor(Color.green);
		g.fillRect(0, 350, 800, 250);
		
		//SOL
		g.setColor(Color.yellow);
		g.fillOval(650, 30, 100, 100);
		
		//CABEÇA DO BONECO
		g.setColor(Color.BLACK);
		g.fillOval(600, 350, 50, 50);
		
		//OLHOS DO BONECO
		g.setColor(Color.WHITE);
		g.fillOval(607, 360, 15, 15);
		
		g.setColor(Color.WHITE);
		g.fillOval(628, 360, 15, 15);
		
		//TRONCO DO BONECO
		g.setColor(Color.black);
		g.drawLine(625, 475, 625, 400); //(H1, V1, H2, V2)
		
		//BRAÇOS DO BONECO
		g.drawLine(590, 440, 625, 405); //(H1, V1, H2, V2)
		g.drawLine(660, 440, 625, 405); //(H1, V1, H2, V2)
		
		//PERNAS DO BONECO
		g.drawLine(605, 510, 625, 475); //(H1, V1, H2, V2)
		g.drawLine(645, 510, 625, 475); //(H1, V1, H2, V2)
		
		//CASA
		g.drawRect(50, 300, 200, 200);
		g.drawLine(250, 500, 450, 475); //(H1, V1, H2, V2)
		g.drawLine(250, 300, 450, 275); //(H1, V1, H2, V2)
		g.drawLine(450, 275, 450, 475); //(H1, V1, H2, V2)
		g.drawLine(50, 300, 150, 200); //(H1, V1, H2, V2)
		g.drawLine(250, 300, 150, 200); //(H1, V1, H2, V2)
		g.drawLine(350, 175, 150, 200); //(H1, V1, H2, V2)
		g.drawLine(350, 175, 450, 275); //(H1, V1, H2, V2)
	}
}
