package Method2;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class SmileyFace extends Canvas
{
   public SmileyFace()    //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      smileyFace(window);
   }

   public void smileyFace( Graphics window )
   {
      window.setColor(Color.BLUE);
      window.drawString("SMILEY FACE LAB ", 35, 35);

      window.setColor(Color.YELLOW);
      window.fillOval( 220, 100, 400, 400 );

      window.setColor(Color.RED);
      window.drawArc(290, 325, 255, 120, 0 ,-170);
      
      window.setColor(Color.PINK);
      window.fillOval(400, 300, 50, 50);
      
      window.setColor(Color.BLUE);
      window.fillOval(300, 200, 30, 30);
      
      window.setColor(Color.BLUE);
      window.fillOval(500, 200, 30, 30);

   }
}

