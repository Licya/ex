package ch.puleio.jtoolbar;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ToolBar 
{
	private PanelToolBar pnlToolColor;
	private JFrame frame;
	
	public ToolBar()
	{
		//Initialization of the frame
		frame = new JFrame();
		
		pnlToolColor = new PanelToolBar();
		frame.getContentPane().add(pnlToolColor);
		//frame.setContentPane(pnlToolColor);
		
		frame.setTitle("Color from JToolBar");
		frame.setSize(400,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
		
		
		
	}
}
