package Method2;


	import java.awt.Graphics;
	import java.awt.Color;
	import java.awt.Canvas;

	class Robot extends Canvas
	{
	   public Robot()    //constructor method - sets up the class
	   {
	      setSize(800,600);
	      setBackground(Color.WHITE);   	
	      setVisible(true);
	   }

	   public void paint( Graphics window )
	   {
		  
	      window.setColor(Color.BLUE);

	      window.drawString("Robot LAB ", 35, 35 );
	      
	      

	      
	      head(window);
	      body(window);
	      limbs(window);
	      
	      
	      
	   }

	   public void head( Graphics window )
	   {
	      window.setColor(Color.GRAY);
	      window.fillRect(300, 100, 200, 100);
	      
	      window.setColor(Color.BLUE);
	      window.fillRect(325, 125, 25, 25);
	      
	      window.setColor(Color.BLUE);
	      window.fillRect(450, 125, 25, 25);
	      
	      window.setColor(Color.RED);
	      window.fillRect(360, 165, 75, 20);

			
	   }

	   public void body( Graphics window )
	   {
		   window.setColor(Color.GRAY);
		   window.fillRect(380, 200, 40, 20);
		   
		   	window.setColor(Color.GRAY);
			window.fillRect(325, 220, 150, 150);
			
			window.setColor(Color.BLACK);
			window.fillRect(390, 240, 69, 114);
			
			window.setColor(Color.RED);
			window.fillRect(345, 240, 30, 30);
			
			window.setColor(Color.YELLOW);
			window.fillRect(345, 280, 30, 30);
			
			window.setColor(Color.RED);
			window.fillRect(345, 320, 30, 30);
			
			
	   }

	   public void limbs( Graphics window )
	   
	   {
		   window.setColor(Color.GRAY);
		   window.fillRect(275, 280, 50, 10);
		   
		   window.setColor(Color.GRAY);
		   window.fillRect(475, 280, 50, 10);
		   
		   window.setColor(Color.GRAY);
		   window.fillRect(362, 370, 10, 70);
		   
		   window.setColor(Color.GRAY);
		   window.fillRect(437, 370, 10, 70);
		   
		
	   }
	}
