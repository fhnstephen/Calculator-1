package com.ViktorRazumovsky.Calculator;

public abstract class Operator {
	protected double first;
	protected String str;
	Operator(double arg) {
		first=arg;
		str="";
	}
	public void add(String arg) {
		str=str+arg;
	}
	public void znak() {
		if(str=="") {}
		else if(str.charAt(0)=='-') str=str.substring(1);
		else str="-"+str;
	}
	public void dot() {
		if(str.contains(".")) {}
		else str+=".";
	}
	public void setFirst(double arg) {
		first=arg;
	}
	public void back() {
		if(str.length()>0) str=str.substring(0,str.length()-1);
		else str="";
	}
	public String getStr(){
		return str;
	}
	public abstract double getResult();
	public abstract String toString();
}
