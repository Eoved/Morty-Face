//Andrew DeVoe

import javax.swing.JFrame;

public class Runner extends JFrame
{
	 private static final int WIDTH = 675;
	 private static final int HEIGHT = 695;

	 public Runner()
	 {
		 super("Mortimer");
		 setSize(WIDTH,HEIGHT);
		 getContentPane().add(new Face());
		 setVisible(true);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 }

	 public static void main( String args[] )
	 {
		 Runner run = new Runner();
	 }
}
