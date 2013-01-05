package com.ViktorRazumovsky.Calculator;

public class Calculator {
	protected Operator Current;
	protected OperatorResult Old;
	protected char status;
	protected boolean statMem;
	protected boolean statMemC;
	protected String MemStr;
	
	Calculator() {
		Current=new OperatorEmpty(0);
		status='f';
		Old=null;
		statMem=false;
		statMemC=false;
		MemStr="";
	}
	
	public Stat getStat() {
		String tmp;
		if(status=='r') tmp=Old.toString();
		else tmp=Current.toString();
		return (new Stat(tmp,statMem,statMemC));
	}
	
	public void add(char arg) {
		if(arg=='0') {
			Current.add("0");
			if(status=='r') status='f';
			Old=null;
			if(!statMemC) statMem=true;
			else statMem=false;
		}
		if(arg=='1') {
			Current.add("1");
			if(status=='r') status='f';
			Old=null;
			if(!statMemC) statMem=true;
			else statMem=false;
		}
		if(arg=='2') {
			Current.add("2");
			if(status=='r') status='f';
			Old=null;
			if(!statMemC) statMem=true;
			else statMem=false;
		}
		if(arg=='3') {
			Current.add("3");
			if(status=='r') status='f';
			Old=null;
			if(!statMemC) statMem=true;
			else statMem=false;
		}
		if(arg=='4') {
			Current.add("4");
			if(status=='r') status='f';
			Old=null;
			if(!statMemC) statMem=true;
			else statMem=false;
		}
		if(arg=='5') {
			Current.add("5");
			if(status=='r') status='f';
			Old=null;
			if(!statMemC) statMem=true;
			else statMem=false;
		}
		if(arg=='6') {
			Current.add("6");
			if(status=='r') status='f';
			Old=null;
			if(!statMemC) statMem=true;
			else statMem=false;
		}
		if(arg=='7') {
			Current.add("7");
			if(status=='r') status='f';
			Old=null;
			if(!statMemC) statMem=true;
			else statMem=false;
		}
		if(arg=='8') {
			Current.add("8");
			if(status=='r') status='f';
			Old=null;
			if(!statMemC) statMem=true;
			else statMem=false;
		}
		if(arg=='9') {
			Current.add("9");
			if(status=='r') status='f';
			Old=null;
			if(!statMemC) statMem=true;
			else statMem=false;
		}
		if(arg=='.') {
			Current.dot();
			if(status=='r') status='f';
			Old=null;
			if(!statMemC) statMem=true;
			else statMem=false;
		}
		if(arg=='z') {
			if(status=='r') {
				Current.add(Double.toString(Old.getResult()));
				Current.znak();
				status='f';
				Old=null;
				if(!statMemC) statMem=true;
				else statMem=false;
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
		if(arg=='m') {
			if(statMem) memPlus();
		}
		if(arg=='s') {
			if(statMemC) memClear();
		}
	}
	protected void addSummary() {
		if(status=='r') {
			Current=new OperatorSummary(Old.getResult());
			Old=null;
			status='s';
			if(statMemC) statMem=true;
			else statMem=false;
		}
		Current=new OperatorSummary(Current.getResult());
		status='s';
		if(statMemC) statMem=true;
		else statMem=false;
	}
	protected void addSubtraction() {
		if(status=='r') {
			Current=new OperatorSubtraction(Old.getResult());
			Old=null;
			status='s';
			if(statMemC) statMem=true;
			else statMem=false;
		}
		Current=new OperatorSubtraction(Current.getResult());
		status='s';
		if(statMemC) statMem=true;
		else statMem=false;
	}
	protected void addMultiplication() {
		if(status=='r') {
			Current=new OperatorMultiplication(Old.getResult());
			Old=null;
			status='s';
			if(statMemC) statMem=true;
			else statMem=false;
		}
		Current=new OperatorMultiplication(Current.getResult());
		status='s';
		if(statMemC) statMem=true;
		else statMem=false;
	}
	protected void addDivision() {
		if(status=='r') {
			Current=new OperatorDivision(Old.getResult());
			Old=null;
			status='s';
			if(statMemC) statMem=true;
			else statMem=false;
		}
		Current=new OperatorDivision(Current.getResult());
		status='s';
		if(statMemC) statMem=true;
		else statMem=false;
	}
	protected void addResult () {
		if(status=='s') {
			Old=new OperatorResult(0,Current);
			Current=new OperatorEmpty(0);
			status='r';
			statMem=true;
			
		}
		else if(status=='r') {
			Old.step();
			statMem=true;
		}
	}
	public void clear() {
		Current=new OperatorEmpty(0);
		Old=null;
		status='f';
		statMem=false;
		statMemC=false;
		MemStr="";
	}
	public void memPlus() {
		if(statMemC) {
			Current.add(MemStr);
			if(status=='r') status='f';
			statMem=false;
		}
		else {
			if(status=='r') {
				MemStr=Old.toString();
				statMemC=true;
				statMem=false;
			}
			else {
				MemStr=Current.getStr();
				statMemC=true;
			}
		}
	}
	public void memClear() {
		statMemC=false;
		MemStr="";
	}
}
