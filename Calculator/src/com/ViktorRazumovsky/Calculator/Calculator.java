package com.ViktorRazumovsky.Calculator;

public class Calculator {
	protected Operator Current;
	protected OperatorResult Old;
	protected char status;
	
	Calculator() {
		Current=new OperatorEmpty(0);
		status='f';
		Old=null;
	}
	
	public String toString() {
		if(status=='r') return Old.toString();
		else return Current.toString();
	}
	
	public void add(char arg) {
		if(arg=='0') {
			Current.add("0");
			if(status=='r') status='f';
			Old=null;
		}
		if(arg=='1') {
			Current.add("1");
			if(status=='r') status='f';
			Old=null;
		}
		if(arg=='2') {
			Current.add("2");
			if(status=='r') status='f';
			Old=null;
		}
		if(arg=='3') {
			Current.add("3");
			if(status=='r') status='f';
			Old=null;
		}
		if(arg=='4') {
			Current.add("4");
			if(status=='r') status='f';
			Old=null;
		}
		if(arg=='5') {
			Current.add("5");
			if(status=='r') status='f';
			Old=null;
		}
		if(arg=='6') {
			Current.add("6");
			if(status=='r') status='f';
			Old=null;
		}
		if(arg=='7') {
			Current.add("7");
			if(status=='r') status='f';
			Old=null;
		}
		if(arg=='8') {
			Current.add("8");
			if(status=='r') status='f';
			Old=null;
		}
		if(arg=='9') {
			Current.add("9");
			if(status=='r') status='f';
			Old=null;
		}
		if(arg=='.') {
			Current.dot();
			if(status=='r') status='f';
			Old=null;
		}
		if(arg=='z') {
			if(status=='r') {
				Current.add(Double.toString(Old.getResult()));
				Current.znak();
				status='f';
				Old=null;
			}
			else Current.znak();
		}
		if(arg=='+') addSummary();
		if(arg=='-') addSubtraction();
		if(arg=='*') addMultiplication();
		if(arg=='/') addDivision();
		if(arg=='=') addResult();
		if(arg=='c') clear();
		if(arg=='b') Current.back();
	}
	protected void addSummary() {
		if(status=='r') {
			Current=new OperatorSummary(Old.getResult());
			Old=null;
			status='s';
		}
		Current=new OperatorSummary(Current.getResult());
		status='s';
	}
	protected void addSubtraction() {
		if(status=='r') {
			Current=new OperatorSubtraction(Old.getResult());
			Old=null;
			status='s';
		}
		Current=new OperatorSubtraction(Current.getResult());
		status='s';
	}
	protected void addMultiplication() {
		if(status=='r') {
			Current=new OperatorMultiplication(Old.getResult());
			Old=null;
			status='s';
		}
		Current=new OperatorMultiplication(Current.getResult());
		status='s';
	}
	protected void addDivision() {
		if(status=='r') {
			Current=new OperatorDivision(Old.getResult());
			Old=null;
			status='s';
		}
		Current=new OperatorDivision(Current.getResult());
		status='s';
	}
	protected void addResult () {
		if(status=='s') {
			Old=new OperatorResult(0,Current);
			Current=new OperatorEmpty(0);
			status='r';
		}
		else if(status=='r') {
			Old.step();
		}
	}
	public void clear() {
		Current=new OperatorEmpty(0);
		Old=null;
		status='f';
	}
}
