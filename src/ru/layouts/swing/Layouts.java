package ru.layouts.swing;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Layouts {
	final static boolean shouldFill = true;
	final static boolean shouldWeightX = true;
	final static boolean RIGHT_TO_LEFT = false;
	
	private JTextField displayRez = new JTextField();
	private Color colorTextField = new Color(0,0,0); 
	private JLabel labelRez = new JLabel();
	
	private JButton buttonOne = new JButton("1"); 
	private JButton buttonTwo = new JButton("2");
	private JButton buttonThree = new JButton("3");
	private JButton buttonFour = new JButton("4");
	private JButton buttonFive = new JButton("5");
	private JButton buttonSix = new JButton("6");
	private JButton buttonSeven = new JButton("7");
	private JButton buttonEight = new JButton("8");
	private JButton buttonNine = new JButton("9");
	private JButton buttonZero = new JButton("0");
	private JButton buttonPlus = new JButton("+");
	private JButton buttonMinus = new JButton("-");
	private JButton buttonDivide = new JButton("/");
	private JButton buttonMultiply = new JButton("*");
	private JButton buttonComma = new JButton(",");
	private JButton buttonEqually = new JButton("=");
	private JButton buttonCancel = new JButton("c");
	
	
	
	
	public void addComponentsToPane(Container pane){
		if(RIGHT_TO_LEFT){
			pane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		}
		
		pane.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		if(shouldFill){
			c.fill = GridBagConstraints.BOTH;
		}
		if(shouldWeightX){
			c.weightx = 0.5;
		}
			
		
		
		 JLabel label = new JLabel("Выражение: ");
		 c.gridx = 0;
		 c.gridy = 1;
		 c.gridwidth = 1;
		 c.insets = new Insets(3,10,0,0);
		 c.anchor = GridBagConstraints.EAST;
		 c.weighty = 0.2;
		 pane.add(label, c);
		 
		
		 c.gridx = 1;
		 c.gridy = 1;
		 c.gridwidth = 4;
		 c.insets = new Insets(3,10,0,0);
		 c.anchor = GridBagConstraints.WEST;
		 pane.add(labelRez, c);
		
		
		 displayRez.setEnabled(false);
		 c.ipady = 5;
		 c.gridx = 0;
		 c.gridy = 2;
		 c.gridwidth = 5;
		 c.insets = new Insets(3, 10, 0, 10);
		 c.anchor = GridBagConstraints.NORTH;
		 c.weighty = 0.2;
		 displayRez.setDisabledTextColor(colorTextField);  
		 pane.add(displayRez, c);
		 
		
		 c.gridx = 3;
		 c.gridy = 4;
		 c.gridwidth = 1;
		 c.insets = new Insets(10, 10, 0, 10);
		 buttonPlus.addActionListener(new ButtonPlusListener());
		 pane.add(buttonPlus, c);
		    
		   
		 c.gridx = 4;
		 c.gridy = 4;
		 c.gridwidth = 1;
		 c.insets = new Insets(10, 10, 0, 10);
		 buttonMinus.addActionListener(new ButtonMinusListener());
		 pane.add(buttonMinus, c);
		 
		 
		 c.gridx = 3;
		 c.gridy = 3;
		 c.gridwidth = 1;
		 c.insets = new Insets(10, 10, 0, 10);
		 buttonMultiply.addActionListener(new ButtonMultiplyListener());
		 pane.add(buttonMultiply, c);
		    
		    
		c.gridx = 4;
		c.gridy = 3;
		c.gridwidth = 1;
		c.insets = new Insets(10, 10, 0, 10);
		buttonDivide.addActionListener(new ButtonDivideListener());
		pane.add(buttonDivide, c);
		 
		
		c.gridx = 0;
		c.gridy = 3;
		c.gridwidth = 1;
		c.insets = new Insets(10, 10, 0, 10);
		buttonOne.addActionListener(new ButtonOneListener());
		pane.add(buttonOne, c);
		
		
		c.gridx = 1;
		c.gridy = 3;
		c.gridwidth = 1;
		c.insets = new Insets(10, 10, 0, 10);
		buttonTwo.addActionListener(new ButtonTwoListener());
		pane.add(buttonTwo, c);
		
	    c.gridx = 2;
	    c.gridy = 3;
	    c.gridwidth = 1;
	    c.insets = new Insets(10, 10, 0, 10);
	    buttonThree.addActionListener(new ButtonThreeListener());
	    pane.add(buttonThree, c);
	    
	    
	    c.gridx = 0;
	    c.gridy = 4;
	    c.gridwidth = 1;
	    c.insets = new Insets(10, 10, 0, 10);
	    buttonFour.addActionListener(new ButtonFourListener());
	    pane.add(buttonFour, c);
	    
	  
	    c.gridx = 1;
	    c.gridy = 4;
	    c.gridwidth = 1;
	    c.insets = new Insets(10, 10, 0, 10);
	    buttonFive.addActionListener(new ButtonFiveListener());
	    pane.add(buttonFive, c);
	    
	   
	    c.gridx = 2;
	    c.gridy = 4;
	    c.gridwidth = 1;
	    c.insets = new Insets(10, 10, 0, 10);
	    buttonSix.addActionListener(new ButtonSixListener());
	    pane.add(buttonSix, c);
	    
	   
	    c.gridx = 0;
	    c.gridy = 5;
	    c.gridwidth = 1;
	    c.insets = new Insets(10, 10, 0, 10);
	    buttonSeven.addActionListener(new ButtonSevenListener());
	    pane.add(buttonSeven, c);
	    
	    
	    c.gridx = 1;
	    c.gridy = 5;
	    c.gridwidth = 1;
	    c.insets = new Insets(10, 10, 0, 10);
	    buttonEight.addActionListener(new ButtonEightListener());
	    pane.add(buttonEight, c);
	    
	    
	    c.gridx = 2;
	    c.gridy = 5;
	    c.gridwidth = 1;
	    c.insets = new Insets(10, 10, 0, 10);
	    buttonNine.addActionListener(new ButtonNineListener());
	    pane.add(buttonNine, c);
	    
	    
	    c.gridx = 1;
	    c.gridy = 6;
	    c.gridwidth = 1;
	    c.insets = new Insets(10, 10, 10, 10);
	    c.fill = GridBagConstraints.BOTH;
	    buttonZero.addActionListener(new ButtonZeroListener());
	    pane.add(buttonZero, c);
	   
	    c.gridx = 3;
	    c.gridy = 5;
	    c.gridwidth = 2;
	    c.insets = new Insets(10, 10, 0, 10);
	    buttonCancel.addActionListener(new ButtonCancelListener());
	    pane.add(buttonCancel, c);
	    
	   
	    c.gridx = 0;
	    c.gridy = 6;
	    c.gridwidth = 1;
	    c.insets = new Insets(10, 10, 10, 10);
	    c.fill = GridBagConstraints.BOTH;
	    buttonComma.addActionListener(new ButtonCommalListener());
	    pane.add(buttonComma, c);
	    
	   
	    c.gridx = 2;
	    c.gridy = 6;
	    c.gridwidth = 3;
	    c.insets = new Insets(10, 10, 10, 10);
	    c.fill = GridBagConstraints.BOTH;
	    buttonEqually.addActionListener(new ButtonEquallyListener());
	    pane.add(buttonEqually, c);
	    
	    
	    
	}
	
	
	private static void createAndShowGUI(){
		JFrame frame = new JFrame("Калькулятор");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Layouts appl = new Layouts();
		
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("Файл");
		JMenuItem about = new JMenuItem("О программе");
		JMenuItem exit = new JMenuItem("Выход");
		about.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Крутой калькулятор!\nАвтор: Pelmen.\nКомпиляция: 05.01.2012 18:47.", "Калькулятор.", 2);
				
			}
		});
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
				
			}
		});
		menu.add(about);
		menu.add(exit);
		menuBar.add(menu);
		frame.setJMenuBar(menuBar);	
		
		
		appl.addComponentsToPane(frame.getContentPane());
		
		
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
					createAndShowGUI();
			}
		});
	}


	
	// Классы-слушатели событий 
	

	class ButtonPlusListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String text = labelRez.getText();
			
			TestLine check = new TestLine();
			if(!check.checking(text))
				return;
			
			if(  (text.indexOf("+") !=-1) || (text.indexOf("-") !=-1) || (text.indexOf("*") !=-1) || (text.indexOf("/") !=-1) ) {
				
				Calculation operations = new Calculation();
				String rez = operations.culc(text);
				displayRez.setText(rez.toString());
				labelRez.setText(rez.toString());
				rez = null;
				
			}
			else {
				StringBuffer sb = new StringBuffer();
				sb.append(text);
				sb.append("+");
				labelRez.setText(sb.toString());
			}
			text = null;
		}
		
	}
	
	class ButtonMinusListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String text = labelRez.getText();
			
			TestLine check = new TestLine();
			if(!check.checking(text))
				return;
			
			if(  (text.indexOf("+") !=-1) || (text.indexOf("-") !=-1) || (text.indexOf("*") !=-1) || (text.indexOf("/") !=-1) ) {
				
				Calculation operations = new Calculation();
				String rez = operations.culc(text);
				displayRez.setText(rez.toString());
				labelRez.setText(rez.toString());
				rez = null;
				
			}
			else {
				StringBuffer sb = new StringBuffer();
				sb.append(text);
				sb.append("-");
				labelRez.setText(sb.toString());
			}
			text = null;
			
		}
		
	} 
	
	class ButtonMultiplyListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String text = labelRez.getText();
			
			TestLine check = new TestLine();
			if(!check.checking(text))
				return;
			
			if(  (text.indexOf("+") !=-1) || (text.indexOf("-") !=-1) || (text.indexOf("*") !=-1) || (text.indexOf("/") !=-1) ) {
				
				Calculation operations = new Calculation();
				String rez = operations.culc(text);
				displayRez.setText(rez.toString());
				labelRez.setText(rez.toString());
				rez = null;
				
			}
			else {
				StringBuffer sb = new StringBuffer();
				sb.append(text);
				sb.append("*");
				labelRez.setText(sb.toString());
			}
			text = null;
			
		}
		
	}
	
	class ButtonDivideListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String text = labelRez.getText();
			
			TestLine check = new TestLine();
			if(!check.checking(text))
				return;
			
			if(  (text.indexOf("+") !=-1) || (text.indexOf("-") !=-1) || (text.indexOf("*") !=-1) || (text.indexOf("/") !=-1) ) {
				
				Calculation operations = new Calculation();
				String rez = operations.culc(text);
				displayRez.setText(rez.toString());
				labelRez.setText(rez.toString());
				rez = null;
				
			}
			else {
				StringBuffer sb = new StringBuffer();
				sb.append(text);
				sb.append("/");
				labelRez.setText(sb.toString());
			}
			text = null;
			
		}
		
	}
	
	
	class ButtonEquallyListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String text = labelRez.getText();
			
			TestLine check = new TestLine();
			if(!check.checkingEqually(text))
				return;
			
			if(  (text.indexOf("+") !=-1) || (text.indexOf("-") !=-1) || (text.indexOf("*") !=-1) || (text.indexOf("/") !=-1) ) {
				
				Calculation operations = new Calculation();
				String rez = operations.culc(text);
				
				
				
				displayRez.setText(rez.toString());
				labelRez.setText(rez.toString());
				rez = null;
				
			}
			text = null;
		}
		
	}
	
	
	class ButtonCancelListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			displayRez.setText("");
			labelRez.setText("");
		}
		
	}
	
	
	class ButtonCommalListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			TestLine check = new TestLine();
			if(!check.checking(labelRez.getText()))
				return;
			
			StringBuffer sb = new StringBuffer();
			sb.append(labelRez.getText());
			sb.append(".");
			labelRez.setText(sb.toString());
		}
		
	}
	
	
	class ButtonOneListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			StringBuffer sb = new StringBuffer();
			sb.append(labelRez.getText());
			sb.append("1");
			labelRez.setText(sb.toString());
			
		}
		
	}
	
	class ButtonTwoListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			StringBuffer sb = new StringBuffer();
			sb.append(labelRez.getText());
			sb.append("2");
			labelRez.setText(sb.toString());
			
		}
		
	}
	
	class ButtonThreeListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			StringBuffer sb = new StringBuffer();
			sb.append(labelRez.getText());
			sb.append("3");
			labelRez.setText(sb.toString());
			
		} 
		
	}
	
	class ButtonFourListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			StringBuffer sb = new StringBuffer();
			sb.append(labelRez.getText());
			sb.append("4");
			labelRez.setText(sb.toString());
			
		}
		
	}
	
	class ButtonFiveListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			StringBuffer sb = new StringBuffer();
			sb.append(labelRez.getText());
			sb.append("5");
			labelRez.setText(sb.toString());
			
		}
		
	}
	
	class ButtonSixListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			StringBuffer sb = new StringBuffer();
			sb.append(labelRez.getText());
			sb.append("6");
			labelRez.setText(sb.toString());
			
		}
		
	}
	
	class ButtonSevenListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			StringBuffer sb = new StringBuffer();
			sb.append(labelRez.getText());
			sb.append("7");
			labelRez.setText(sb.toString());
			
		}
		
	}
	
	class ButtonEightListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			StringBuffer sb = new StringBuffer();
			sb.append(labelRez.getText());
			sb.append("8");
			labelRez.setText(sb.toString());
			
		}
		
	}
	
	class ButtonNineListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			StringBuffer sb = new StringBuffer();
			sb.append(labelRez.getText());
			sb.append("9");
			labelRez.setText(sb.toString());
			
		}
		
	}
	
	class ButtonZeroListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			StringBuffer sb = new StringBuffer();
			sb.append(labelRez.getText());
			sb.append("0");
			labelRez.setText(sb.toString());
			
		}
		
	}

}
