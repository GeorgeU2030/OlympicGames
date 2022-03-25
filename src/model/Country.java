package model;

import java.util.Collections;

public class Country implements Comparable<Country>{

	private String name;
	private int goldM;
	private int silverM;
	private int bronzeM;
	private int goldF;
	private int silverF;
	private int bronzeF;
	private int goldT;
	private int silverT;
	private int bronzeT;
	public Country(String name, int goldM, int silverM, int bronzeM, int goldF, int silverF,int bronzeF) {
		this.name = name;
		this.goldM = goldM;
		this.silverM = silverM;
		this.bronzeM = bronzeM;
		this.goldF = goldF;
		this.silverF = silverF;
		this.bronzeF = bronzeF;
		this.goldT=goldM+goldF;
		this.silverT=silverM+silverF;
		this.bronzeT=bronzeM+bronzeF;
		
	}
	
	
	public int getGoldT() {
		return goldT;
	}


	public void setGoldT(int goldT) {
		this.goldT = goldT;
	}


	public int getSilverT() {
		return silverT;
	}


	public void setSilverT(int silverT) {
		this.silverT = silverT;
	}


	public int getBronzeT() {
		return bronzeT;
	}


	public void setBronzeT(int bronzeT) {
		this.bronzeT = bronzeT;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGoldM() {
		return goldM;
	}
	public void setGoldM(int goldM) {
		this.goldM = goldM;
	}
	public int getSilverM() {
		return silverM;
	}
	public void setSilverM(int silverM) {
		this.silverM = silverM;
	}
	public int getBronzeM() {
		return bronzeM;
	}
	public void setBronzeM(int bronzeM) {
		this.bronzeM = bronzeM;
	}
	public int getGoldF() {
		return goldF;
	}
	public void setGoldF(int goldF) {
		this.goldF = goldF;
	}
	public int getSilverF() {
		return silverF;
	}
	public void setSilverF(int silverF) {
		this.silverF = silverF;
	}
	public int getBronzeF() {
		return bronzeF;
	}
	public void setBronzeF(int bronzeF) {
		this.bronzeF = bronzeF;
	}
	@Override
	public int compareTo(Country o) {
		Country A = this;
		Country B =o;
		
		int output =A.goldF-B.goldF;
		if(output==0) {
			int output2= A.silverF-B.silverF;
			if(output2==0) {
				return A.bronzeF-B.bronzeF;
			}else {
				return output2;
			}
		}else {
		return output;
		}
	}
	
	
	
	
}
