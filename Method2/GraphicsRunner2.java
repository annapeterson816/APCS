package Method2;


import javax.swing.JFrame;

public class GraphicsRunner2 extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public GraphicsRunner2()
	{
		super("Graphics Runner");

		setSize(WIDTH,HEIGHT);

		//getContentPane().add(new SmileyFace());
		//getContentPane().add(new BigHouse());
		getContentPane().add(new Robot());
		//getContentPane().add(new ShapePanel());
		
		
		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main( String args[] )
	{
		GraphicsRunner2 run = new GraphicsRunner2();
	}
}