package Method2;

import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShapePanel extends JPanel
{
	public ShapePanel()
	{
		setBackground(Color.WHITE);
		setVisible(true);
	}

	public void update(Graphics window)
	{
		paint(window);
	}

	/*
	 *All of your test code should be placed in paint.
	 */
	public void paint(Graphics window)
	{
		window.setColor(Color.WHITE);
		window.fillRect(0,0,getWidth(), getHeight());
		window.setColor(Color.ORANGE);
		window.drawRect(20,20,getWidth()-40,getHeight()-40);
		window.setColor(Color.ORANGE);
		window.setFont(new Font("TAHOMA",Font.BOLD, 75));
		window.drawString("HAPPY HALLOWEEN!!",30,100);


	
	
		
		Shapes sh1 = new Shapes (150, 150, 400, 400, Color.ORANGE);
		sh1.draw(window);
		
		//Shapes sh2 = new Shapes(150, 150, 200 ,200, Color.ORANGE);
		//sh2.draw(window);
		
		//Shapes sh3 = new Shapes (245, 400, 55, 40, Color.ORANGE);
		//sh3.draw(window);
		
		//Shapes sh4 = new Shapes (400, 150, 110, 110, Color.ORANGE);
		//sh4.draw(window);
		
		//Shapes sh5 = new Shapes (600, 100, 130, 130, Color.BLUE);
		//sh5.draw(window);
	}
	
	
}