package com.homsdev.threads.smokersalgorithm;

public class Cigarette {

	private Boolean paper;
	private Boolean tobacco;
	private Boolean lighter;

	public Cigarette() {
		this.paper = Boolean.FALSE;
		this.tobacco = Boolean.FALSE;
		this.lighter = Boolean.FALSE;
	}

	public Boolean getPaper() {
		return paper;
	}

	public void setPaper(Boolean paper) {
		this.paper = paper;
	}

	public Boolean getTobacco() {
		return tobacco;
	}

	public void setTobacco(Boolean tobacco) {
		this.tobacco = tobacco;
	}

	public Boolean getLighter() {
		return lighter;
	}

	public void setLighter(Boolean lighter) {
		this.lighter = lighter;
	}

	public Boolean isReady() {
		return paper && tobacco && lighter ? true : false;
	}

	public void reset() {
		this.lighter = Boolean.FALSE;
		this.paper = Boolean.FALSE;
		this.tobacco = Boolean.FALSE;
	}

	@Override
	public String toString() {
		return "Cigarette [paper=" + paper + ", tobacco=" + tobacco + ", lighter=" + lighter + "]";
	}

}
