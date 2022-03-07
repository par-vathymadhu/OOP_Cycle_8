/**Write a Java program for handling mouse events. **/

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Cycle_8_qn_3 extends Frame implements MouseListener
{
	Label l;
	Cycle_8_qn_3()
    {
		addMouseListener(this);
		l = new Label();
		l.setBounds(100,100,100,30);
		add(l);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
		
	}
	public void mouseClicked(MouseEvent e)
    {
		l.setText("Mouse Clicked");
	}
	public void mouseEntered(MouseEvent e)
    {
		l.setText("Mouse Entered");
	}
	public void mouseExited(MouseEvent e)
    {
		l.setText("Mouse Exited");
	}
	public void mousePressed(MouseEvent e)
    
    {
		l.setText("Mouse Pressed");
	}
	public void mouseReleased(MouseEvent e)
    {
	}
	public static void main(String args[])
	{
		new Cycle_8_qn_3();
	}

}