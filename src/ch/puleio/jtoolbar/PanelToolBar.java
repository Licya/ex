package ch.puleio.jtoolbar;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class PanelToolBar extends JPanel implements ActionListener
{
	private JButton btBlue;
	private JButton btRed;
	private JButton btYellow;
	private JPanel pnlContainer;
	private JPanel pnlColor;
	private JToolBar toolBar;
	
	public PanelToolBar()
	{
		pnlContainer = new JPanel();

		//Initialization of the panel pnlColor
		pnlColor = new JPanel();
		pnlColor.setPreferredSize(new Dimension(300,300));
		pnlColor.setBackground(Color.white);
		pnlColor.setVisible(true);
		pnlContainer.add(pnlColor, BorderLayout.SOUTH);
		
		//Initialization of JToolBar toolBar
		toolBar = new JToolBar();
		pnlContainer.add(toolBar);
		
		
		//Initialization of JButton btBlue
		btBlue = new JButton("Blue");
		btBlue.setPreferredSize(new Dimension(100,100));
		btBlue.addActionListener(this);
		toolBar.add(btBlue);
		
		//Initialization of JButton btRed
		btRed = new JButton("Red");
		btRed.setPreferredSize(new Dimension(100,100));
		btRed.addActionListener(this);
		toolBar.add(btRed);
		
		//Initialization of JButton btYellow
		btYellow = new JButton("Yellow");
		btYellow.setPreferredSize(new Dimension(100,100));
		btYellow.addActionListener(this);
		toolBar.add(btYellow);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btBlue)
		{
			pnlColor.setBackground(Color.blue);
		}
		
		if(e.getSource() == btRed)
		{
			pnlColor.setBackground(Color.red);
		}
		
		if(e.getSource() == btYellow)
		{
			pnlColor.setBackground(Color.yellow);
		}
	}
}
