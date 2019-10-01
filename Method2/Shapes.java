package Method2;

import java.awt.Color;
import java.awt.Graphics;

public class Shapes {
	// instance variables
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private Color color;

	public Shapes(int x, int y, int wid, int ht, Color col) {
		xPos = x;
		yPos = y;
		width = wid;
		height = ht;
		color = col;
	}

	public void draw2(Graphics window) {
		window.setColor(color);
		window.fillOval(xPos, yPos, width, height);

	}

	public String toString() {
		return xPos + " " + yPos + " " + width + " " + height + " " + color;
	}

	public void draw(Graphics window) {
		window.setColor(color);
		window.fillOval(xPos, yPos, width, height);

		window.setColor(color);
		window.fillOval(xPos, yPos, width, height);
		
		window.setColor(new Color(160, 97, 86));
		window.fillRect(xPos + 180 , yPos -80 , width - 350, height - 300);
		
		window.setColor(Color.ORANGE);
		window.fillOval(xPos + 15, yPos + 15, width - 30, height - 30);
		
		window.setColor(Color.BLACK);
		window.fillRect(xPos + 100 , yPos + 100, width - 350, height - 350);
		
		window.setColor(Color.BLACK);
		window.fillRect(xPos + 250 , yPos + 100, width - 350, height - 350);
		

		window.setColor(Color.BLACK);
		window.fillArc(230, 370, 255, 120, 0 ,-180);
		
		
		
		//window.setColor(Color.ORANGE);
		//window.drawLine(xPos - 10, yPos - 10, xPos, yPos);
		//window.drawLine(xPos + width, yPos, xPos + width, yPos - 10);
		//window.setColor(Color.ORANGE);
		int hm = width / 5;

	}

}
