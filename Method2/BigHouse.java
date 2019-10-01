package Method2;

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class BigHouse extends Canvas
{
 public BigHouse()  //constructor - sets up the class
 {
    setSize(800,600);
    setBackground(Color.WHITE);
    setVisible(true);
 }

 public void paint( Graphics window )
 {
    bigHouse(window);
 }

 public void bigHouse( Graphics window )
 {
    window.setColor(Color.BLUE);
    window.drawString( "BIG HOUSE ", 50, 50 );

    window.setColor(Color.BLUE);
    window.fillRect( 200, 200, 400, 400 );
    
    window.setColor(Color.BLACK);
    window.fillPolygon(new int[] {125, 388, 650}, new int[] {200, 20, 200}, 3);
    
    window.setColor(Color.GRAY);
    window.fillRect(340, 400, 150, 200);
    
    window.setColor(Color.YELLOW);
    window.fillRect(250, 250, 75, 75);
    
    window.setColor(Color.YELLOW);
    window.fillRect(450, 250, 75, 75);
    
    
    //**EXTRA CREDIT
    window.setColor(new Color(66,   37,   3));
    window.fillRect(50, 400, 75, 200);
    
    window.setColor(Color.GREEN);
    window.fillOval(25, 300, 125, 125);
    
    

 }
 

}