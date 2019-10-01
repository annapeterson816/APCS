package ifs;


import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Timer;
import javax.swing.JFrame;
import java.awt.Canvas;

class AnimatedCar extends Canvas
{
	private int x;
	private int y;
	private Timer timer;
	private final static int SLEEP = 1;  	
	
	public AnimatedCar(int width, int heigth)
	{
		setSize(width, heigth);
		setVisible(true);
		setBackground(Color.BLACK);

		x = 0;
		y = 50;

		ActionListener paintCaller = new ActionListener(){
			public void actionPerformed(ActionEvent event)
			{
				repaint();  			}
		};
		timer = new Timer(SLEEP, paintCaller);
		timer.start();
	}	
	
	public void update(Graphics window)
	{
	   paint(window);	
	}
	
	public void paint( Graphics window )
	{
		window.setColor(Color.BLACK);
		window.fillRect(0,0,getWidth(),getHeight());
		
		window.setColor(Color.WHITE);
		window.drawString("Animation Lab - Lab05c", 25, 50 );

		window.setColor(Color.GREEN);
		window.fillRect(x,y+20,80,40);

		
		window.setColor(Color.BLUE);
		window.fillOval(x , y+50, 20, 20);
		
		window.setColor(Color.BLUE);
		window.fillOval(x + 58, y+50, 20, 20);
		
		
		
		x=x+1;

		
		if (x> getWidth())
			{
			x=0;
			}
		
		
		
	}	
}