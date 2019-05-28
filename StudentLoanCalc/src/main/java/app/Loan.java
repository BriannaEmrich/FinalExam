package app;

public class Loan {
	private double loanAmount;
	private double interestRate;
	private int term;
	private double extraPayment;
	private String compounding;
	private double futureValue;
	
	public Loan(double amt, double rate, int trm, double extra, String compound, double fv) {
		loanAmount=amt;
		interestRate=rate;
		term=trm;
		extraPayment=extra;
		compounding=compound;
		futureValue=fv;
	}
	
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double amt) {
		loanAmount=amt;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double rate) {
		interestRate=rate;
	}
	public int getTerm() {
		return term;
	}
	public void setTerm(int trm) {
		term=trm;
	}
	public double getExtraPayment() {
		return extraPayment;
	}
	public void setExtraPayment(double extra) {
		extraPayment=extra;
	}
	public String getCompounding() {
		return compounding;
	}
	public void setCompounding(String compound) {
		compounding=compound;
	}
	public double getFutureValue() {
		return futureValue;
	}
	public void setFutureValue(double fv) {
		futureValue=fv;
	}

}
