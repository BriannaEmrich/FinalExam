package app;

public class Payment extends Loan {
	
	private int paymentID;
	private int dueDate;
	private double iPmt;
	private double pPmt;
	private double totalPrinciple;
	private double balance;
	
	public Payment(double amt, double rate, int trm, double extra, String compound, double fv, int id, int date, double ip, double pp, double tot, double bal) {
		super(amt, rate, trm, extra, compound, fv);
		paymentID=id;
		dueDate=date;
		iPmt=ip;
		pPmt=pp;
		totalPrinciple=tot;
		balance=bal;
	}
	
	public int getPaymentID() {
		return paymentID;
	}
	public void setPaymentID(int id) {
		paymentID=id;
	}
	public int getDueDate() {
		return dueDate;
	}
	public void setDueDate(int date) {
		dueDate=date;
	}
	public double getIPmt() {
		return iPmt;
	}
	public void setIPmt(double ip) {
		iPmt=ip;
	}
	public double getPPmt() {
		return pPmt;
	}
	public void setPPmt(double pp) {
		pPmt=pp;
	}
	public double getTotalPrinciple() {
		return totalPrinciple;
	}
	public void setTotalPrinciple(double tot) {
		totalPrinciple=tot;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double bal) {
		balance=bal;
	}

}
