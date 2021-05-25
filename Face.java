//Andrew DeVoe

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class Face extends Canvas
{
	
	private Color face, eye, hair, shirt, black, background;
	
	public Face()
	{
		setSize(675, 695);
		//Colors
		face = new Color(0xF7CAA5);
		eye = new Color(0xFAFAFA);
		hair = new Color(0x996430);
		shirt = new Color(0xE7E382);
		black = new Color(0x020202);
		background = new Color(0x72716D);
	    setBackground(background);
	    setVisible(true);
	}
	
	public void paint(Graphics window)
	{
		drawSmiley(window);
	}
	
	public void drawSmiley(Graphics window)
	{
		drawShirt(window);
		drawHair(window);
		drawFace(window);
		drawEyebrows(window);
		drawEyes(window);
		drawNose(window);
		drawMouth(window);
		drawEar(window);
		//drawGrid(window);
	}
	
	public void drawShirt(Graphics window)
	{
		//Shirt Left Side
			window.setColor(shirt);
			window.fillArc(140, 325, 500, 1000, 90, 90);
			window.setColor(black);
			window.drawArc(139, 325, 500, 1000, 90, 90);
			window.drawArc(140, 325, 500, 1000, 90, 90);
			window.drawArc(141, 325, 500, 1000, 90, 90);
			window.drawArc(140, 324, 500, 1000, 90, 90);
			window.drawArc(140, 326, 500, 1000, 90, 90);
		//Shirt Right Side
			window.setColor(shirt);
			window.fillArc(360, 480, 100, 390, 0, 90);
			window.setColor(black);
			window.drawArc(359, 480, 100, 390, 0, 90);
			window.drawArc(360, 480, 100, 390, 0, 90);
			window.drawArc(361, 480, 100, 390, 0, 90);
			window.drawArc(360, 479, 100, 390, 0, 90);
			window.drawArc(360, 481, 100, 390, 0, 90);
		//Shirt Center
			window.setColor(shirt);
			window.fillRect(210, 480, 200, 410);
		//Shirt Arm
			window.setColor(black);
			window.drawArc(324, 480, 100, 390, 0, 90);
			window.drawArc(325, 480, 100, 390, 0, 90);
			window.drawArc(326, 480, 100, 390, 0, 90);
			window.drawArc(325, 479, 100, 390, 0, 90);
			window.drawArc(325, 481, 100, 390, 0, 90);
			window.setColor(shirt);
			window.fillRect(410, 500, 20, 115);
	}

	public void drawHair(Graphics window)
	{
		//Hair
			window.setColor(hair);
			window.fillOval(70, 50, 450, 450);
			window.fillOval(80, 375, 50, 50);
			window.fillOval(60, 350, 50, 50);
			window.fillRect(60, 250, 30, 125);
			window.fillOval(55, 110, 200, 240);
			window.fillOval(90, 80, 150, 100);
			window.fillOval(125, 75, 50, 50);
			window.fillOval(140, 35, 200, 100);
			window.fillOval(200, 30, 200, 100);
			window.fillOval(250, 35, 260, 300);
	}
	
	public void drawFace(Graphics window)
	{
		//Face
			window.setColor(face);
			window.fillOval(107, 90, 460, 460);
			window.setColor(black);
			window.drawOval(106, 90, 460, 460);
			window.drawOval(107, 90, 460, 460);
			window.drawOval(108, 90, 460, 460);
			window.drawOval(107, 89, 460, 460);
			window.drawOval(107, 91, 460, 460);
	}

	public void drawEyebrows(Graphics window)
	{
		//Left Eyebrow
			window.setColor(black);
			window.drawArc(249, 135, 40, 30, 290, 60);
			window.drawArc(250, 135, 40, 30, 290, 60);
			window.drawArc(251, 135, 40, 30, 290, 60);
			window.drawArc(250, 134, 40, 30, 290, 60);
			window.drawArc(250, 136, 40, 30, 290, 60);
			window.drawLine(276, 163, 230, 169);
			window.drawLine(276, 164, 230, 170);
			window.drawLine(276, 165, 230, 171);
		//Right Eyebrow
			window.drawArc(430, 125, 50, 15, 180, 150);
			window.drawArc(431, 125, 50, 15, 180, 150);
			window.drawArc(432, 125, 50, 15, 180, 150);
			window.drawArc(430, 124, 50, 15, 180, 150);
			window.drawArc(430, 126, 50, 15, 180, 150);
	}
	
	public void drawEyes(Graphics window)
	{
		//Left Eye Iris
			window.setColor(black);
			window.fillOval(180, 180, 180, 180);
			window.setColor(eye);
			window.fillOval(183, 183, 174, 174);
		//Left Eye Pupil
			window.setColor(black);
			window.fillOval(215, 270, 12, 12);
		//Right Eye Iris
			window.setColor(black);
			window.fillOval(385, 150, 180, 180);
			window.setColor(eye);
			window.fillOval(388, 153, 174, 174);
		//Right Eye Pupil
			window.setColor(black);
			window.fillOval(525, 220, 12, 12);
	}
	
	public void drawNose(Graphics window)
	{
		//Nose
			window.drawArc(375, 330, 60, 40, 240, 150);
			window.drawArc(376, 330, 60, 40, 240, 150);
			window.drawArc(377, 330, 60, 40, 240, 150);
			window.drawArc(375, 331, 60, 40, 240, 150);
			window.drawArc(375, 332, 60, 40, 240, 150);
			window.drawArc(375, 330, 60, 40, 30, 45);
			window.drawArc(376, 330, 60, 40, 30, 45);
			window.drawArc(377, 330, 60, 40, 30, 45);
			window.drawArc(375, 331, 60, 40, 30, 45);
			window.drawArc(375, 332, 60, 40, 30, 45);
	}
	
	public void drawMouth(Graphics window)
	{
		//Mouth Left Side
			window.drawArc(361, 420, 30, 70, 0, -190);
			window.drawArc(362, 420, 30, 70, 0, -190);
			window.drawArc(363, 420, 30, 70, 0, -190);
			window.drawArc(362, 419, 30, 70, 0, -190);
			window.drawArc(362, 421, 30, 70, 0, -190);
		//Mouth Right Side
			window.drawArc(389, 400, 30, 70, 60, -210);
			window.drawArc(391, 400, 30, 70, 60, -210);
			window.drawArc(390, 400, 30, 70, 60, -210);
			window.drawArc(390, 401, 30, 70, 60, -210);
			window.drawArc(390, 402, 30, 70, 60, -210);
	}
	
	public void drawEar(Graphics window)
	{
		//Ear
			window.setColor(face);
			window.fillArc(110, 360, 90, 90, 100, 200);
			window.setColor(black);
			window.drawArc(109, 360, 90, 90, 100, 200);
			window.drawArc(110, 360, 90, 90, 100, 200);
			window.drawArc(111, 360, 90, 90, 100, 200);
			window.drawArc(110, 361, 90, 90, 100, 200);
			window.drawArc(110, 362, 90, 90, 100, 200);
	}
	
	public void drawGrid(Graphics window)
	{
		//Grid Vertical
			window.setColor(black);
			window.drawLine(0, 0, 0, 675);
			window.drawLine(45, 0, 45, 675);
			window.drawLine(90, 0, 90, 675);
			window.drawLine(135, 0, 135, 675);
			window.drawLine(180, 0, 180, 675);
			window.drawLine(225, 0, 225, 675);
			window.drawLine(270, 0, 270, 675);
			window.drawLine(315, 0, 315, 675);
			window.drawLine(360, 0, 360, 675);
			window.drawLine(405, 0, 405, 675);
			window.drawLine(450, 0, 450, 675);
			window.drawLine(495, 0, 495, 675);
			window.drawLine(540, 0, 540, 675);
			window.drawLine(585, 0, 585, 675);
			window.drawLine(630, 0, 630, 675);
			window.drawLine(675, 0, 675, 675);
		//Grid Horizontal
			window.drawLine(0, 0, 675, 0);
			window.drawLine(0, 45, 675, 45);
			window.drawLine(0, 90, 675, 90);
			window.drawLine(0, 135, 675, 135);
			window.drawLine(0, 180, 675, 180);
			window.drawLine(0, 225, 675, 225);
			window.drawLine(0, 270, 675, 270);
			window.drawLine(0, 315, 675, 315);
			window.drawLine(0, 360, 675, 360);
			window.drawLine(0, 405, 675, 405);
			window.drawLine(0, 450, 675, 450);
			window.drawLine(0, 495, 675, 495);
			window.drawLine(0, 540, 675, 540);
			window.drawLine(0, 585, 675, 585);
			window.drawLine(0, 630, 675, 630);
			window.drawLine(0, 675, 675, 675);
	}
}
