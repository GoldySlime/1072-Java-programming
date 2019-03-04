import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;

public class Graph extends JPanel {
	
	public void paintComponent( Graphics g ) {
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
		
		g.setColor(new Color(255, 0, 0));
		g.drawRect( 250, 250, 250, 250);
		g.drawLine(250, 375, 500, 375);
		g.drawLine(375, 250, 375, 500);
		
	}
}
