package ru.layouts.swing;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

class TestLine {
	
	public boolean checking(String str){
		
		Pattern p = Pattern.compile("(\\d+)|(\\d+.*\\d+)");
		Matcher m = p.matcher(str);
		if(m.matches())
			return true;
		else
		{
			JOptionPane.showMessageDialog(null, "Некорректный ввод!", "Ошибка.", 0);
			return false;
		}
	} 
	
	public boolean checkingEqually(String str){
		
		Pattern p = Pattern.compile("(\\d+).+\\d+");
		Matcher m = p.matcher(str.replace(".", ""));
		if(m.matches())
			return true;
		else
		{
			JOptionPane.showMessageDialog(null, "Некорректный ввод!", "Ошибка.", 0);
			return false;
		}
	}
	
	
}
