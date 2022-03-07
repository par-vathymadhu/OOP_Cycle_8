/**Write a Java program for handling key events using Adapter classes (general). **/

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Cycle_8_qn_4 extends Frame implements KeyListener
{
	Label l;
	Cycle_8_qn_4()
    {
		addKeyListener(this);
		l = new Label();
		l.setBounds(100,100,100,30);
		add(l);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
		
	}
	public void keyPressed(KeyEvent e)
    {
		l.setText("Key Pressed");
	}
	public void keyReleased(KeyEvent e)
    {
		l.setText("Key Released");
	}
	public void keyTyped(KeyEvent e)
    {
		l.setText("Typing....");
	}
	
	public static void main(String args[])
	{
		new Cycle_8_qn_4();
	}
}