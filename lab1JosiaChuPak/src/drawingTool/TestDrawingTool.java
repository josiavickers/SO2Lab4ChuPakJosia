/**
 * Provides a test application window with a panel "DrawingArea".
 * 
 * @author Björn Gottfried
 * @version 1.0
 * @runsWith JAVA 1.8
 * 
 * In this file, you just have to change the title of your window.
 * 
 */

package drawingTool;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class TestDrawingTool extends JFrame implements ActionListener{ // JFrame to get a window on screen, here it is inherited
	private DrawingArea drawing;
	private JPanel buttonPanel;
	
	private JButton addButtonBlack;
	private JButton addButtonGreen;
	private JButton addButtonPink;
	private JButton addButtonAll;
	private JButton removeButtonAll;

	public TestDrawingTool(String title) { // constructor
		super(title);

		Dimension screenSize = getToolkit().getScreenSize();
		setBounds(0, 0, screenSize.width, screenSize.height);

		this.setLayout(new BorderLayout()); // set layout manager for the JFrame
		
		constructButtonPanel();
		constructDrawingArea();
		constructButtons();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // to stop the application when closing (JFrame method)
		setVisible(true);
	}
	
	private void constructButtons() {
		addButtonBlack = new JButton("Create Black Monkeys");
		addButtonBlack.setToolTipText("Click to generate monkeys!");
		addButtonBlack.addActionListener(this);
		buttonPanel.add(addButtonBlack);
		
		addButtonGreen = new JButton("Create Green Monkeys");
		addButtonGreen.setToolTipText("Click to generate monkeys!");
		addButtonGreen.addActionListener(this);
		buttonPanel.add(addButtonGreen);
		
		addButtonPink = new JButton("Create Pink Monkeys");
		addButtonPink.setToolTipText("Click to generate monkeys!");
		addButtonPink.addActionListener(this);
		buttonPanel.add(addButtonPink);
		
		addButtonAll = new JButton("Create All Monkeys");
		addButtonAll.setToolTipText("Click to generate monkeys!");
		addButtonAll.addActionListener(this);
		buttonPanel.add(addButtonAll);
		
		removeButtonAll = new JButton("Remove All");
		removeButtonAll.setToolTipText("Click to remove monkeys!");
		removeButtonAll.addActionListener(this);
		buttonPanel.add(removeButtonAll);
	}

	private void constructDrawingArea() {
		drawing = new DrawingArea();
		this.add(drawing, BorderLayout.CENTER);
	}

	private void constructButtonPanel() {
		buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(5,1)); // layout having 2 rows and 1 column
		this.add(buttonPanel, BorderLayout.WEST);
		
	}

	public static void main(String[] args) {
		new TestDrawingTool("Draw a monkey"); // passing title to constructor and then super class JFrame
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == addButtonBlack) {
			System.out.println("Black monkeys");
			drawing.getScene().setBlackMonkeys();
			drawing.repaint();
		} else if (e.getSource() == addButtonGreen) {
			System.out.println("Green monkeys");
			drawing.getScene().setGreenMonkeys();
			drawing.repaint();
		} else if (e.getSource() == addButtonPink) {
			System.out.println("Pink monkeys");
			drawing.getScene().setPinkMonkeys();
			drawing.repaint();
		} else if (e.getSource() == addButtonAll) {
			System.out.println("All monkeys");
			drawing.getScene().setAllMonkeys();
			drawing.repaint();
		} else if (e.getSource() == removeButtonAll) {
			System.out.println("No monkeys");
			drawing.getScene().setNoMonkeys();
			drawing.repaint();
		}
		
	}
}

/*
 * JFrame useful methods:
 * 
 * String getTitle()
 * void setTitle(String newTitle)
 * 
 * Regarding screen size (can we resize the screen with the cursor?):
 * void setResizable(boolean b)
 * boolean isResizable() 
 * 
 * JFrame is a subclass of Component (a GUI component), useful methods of Component:
 * 
 * void setSize (Dimension d) is a setter for its size
 * Dimension getSize() is a getter for its size
 * void setLocation(Point p) is a setter for its position
 * Point getLocation() is a getter for its position
 * void setVisible(boolean b) is a setter for whether or not it's visible
 */

