package com.ViktorRazumovsky.Calculator;

public class OperatorResult extends Operator {
	protected Operator Old;

	public OperatorResult(double arg, Operator opr) {
		super(arg);
		Old=opr;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getResult() {
		// TODO Auto-generated method stub
		return Old.getResult();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return Double.toString(Old.getResult());
	}
	public void step() {
		Old.setFirst(Old.getResult());
	}

}
