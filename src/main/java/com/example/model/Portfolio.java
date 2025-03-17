package com.example.model;

public class Portfolio {
	int portfolio_id;
	int userid;
	String scripname;
	int quantities;
	double buyavg;
	double invstamt;
	double ltp;
	double curramt;
	double p_and_l;
	double p_and_l_percentage;
	public int getPortfolio_id() {
		return portfolio_id;
	}
	public void setPortfolio_id(int portfolio_id) {
		this.portfolio_id = portfolio_id;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getScripname() {
		return scripname;
	}
	public void setScripname(String scripname) {
		this.scripname = scripname;
	}
	public int getQuantities() {
		return quantities;
	}
	public void setQuantities(int quantities) {
		this.quantities = quantities;
	}
	public double getBuyavg() {
		return buyavg;
	}
	public void setBuyavg(double buyavg) {
		this.buyavg = buyavg;
	}
	public double getInvstamt() {
		return invstamt;
	}
	public void setInvstamt(double invstamt) {
		this.invstamt = invstamt;
	}
	public double getLtp() {
		return ltp;
	}
	public void setLtp(double ltp) {
		this.ltp = ltp;
	}
	public double getCurramt() {
		return curramt;
	}
	public void setCurramt(double curramt) {
		this.curramt = curramt;
	}
	public double getP_and_l() {
		return p_and_l;
	}
	public void setP_and_l(double p_and_l) {
		this.p_and_l = p_and_l;
	}
	public double getP_and_l_percentage() {
		return p_and_l_percentage;
	}
	public void setP_and_l_percentage(double p_and_l_percentage) {
		this.p_and_l_percentage = p_and_l_percentage;
	}
	
	
}
