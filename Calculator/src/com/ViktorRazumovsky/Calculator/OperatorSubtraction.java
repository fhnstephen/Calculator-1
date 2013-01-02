package com.ViktorRazumovsky.Calculator;

public class OperatorSubtraction extends Operator {

	public OperatorSubtraction(double arg) {
		super(arg);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getResult() {
		// TODO Auto-generated method stub
		if(str=="" || str=="." || str=="-") str="0";
		return first-Double.valueOf(str);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return Double.toString(first)+"-"+str;
	}

}
