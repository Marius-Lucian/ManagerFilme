package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class MainFrame extends JFrame {
	private final static int mainFrameX = 600; //600
	private final static int mainFrameY = 420; //420
	
	public static int GetX() { return mainFrameX; }
	public static int GetY() { return mainFrameY; }
	
	MainFrame(){	
		super("Manager Filme");
		this.setLayout(new BorderLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(mainFrameX, mainFrameY);
		this.setResizable(false);
		this.add(new MainPanel());
		this.pack();
		this.setVisible(true);
	}
	
	
}
