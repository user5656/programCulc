package ru.layouts.swing;

class Calculation {
	

	public String culc(String text){
		if(text.indexOf("+") != -1){
			int token = text.indexOf("+");
			String numberOne = text.substring(0, token);
			String numberTwo = text.substring((token+1), text.length());
			double n1 = Double.parseDouble(numberOne);
			double n2 = Double.parseDouble(numberTwo);
			Double rez = new Double((n1+n2));
			
			return rez.toString();
		}
		else if(text.indexOf("-") != -1){
			int token = text.indexOf("-");
			String numberOne = text.substring(0, token);
			String numberTwo = text.substring((token+1), text.length());
			double n1 = Double.parseDouble(numberOne);
			double n2 = Double.parseDouble(numberTwo);
			Double rez = new Double((n1-n2));
			
			return rez.toString();
		}
		else if(text.indexOf("*") != -1){
			int token = text.indexOf("*");
			String numberOne = text.substring(0, token);
			String numberTwo = text.substring((token+1), text.length());
			double n1 = Double.parseDouble(numberOne);
			double n2 = Double.parseDouble(numberTwo);
			Double rez = new Double((n1*n2));
			
			return rez.toString();
		}
		else if(text.indexOf("/") != -1){
			int token = text.indexOf("/");
			String numberOne = text.substring(0, token);
			String numberTwo = text.substring((token+1), text.length());
			double n1 = Double.parseDouble(numberOne);
			double n2 = Double.parseDouble(numberTwo);
			Double rez = new Double((n1/n2));
			
			return rez.toString();
		}
		else
			return "Ошибка вычисления";
	}
	
}
