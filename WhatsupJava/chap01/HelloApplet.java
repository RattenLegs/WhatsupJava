package chap01;

import java.applet.*;
import java.awt.*;
import java.awt.Graphics;

public class HelloApplet extends Applet {

	public void paint(Graphics g)
	{
		g.drawString("Hello, Applet!", 50, 100);
	}

}
