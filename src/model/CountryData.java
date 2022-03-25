package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CountryData {

	private ArrayList<Country>countries;
	

	public CountryData() {
		countries = new ArrayList<>();
	}
	public ArrayList<Country> getCountries() {
		return countries;
	}

	public void setCountries(ArrayList<Country> countries) {
		countries = countries;
	}
	
	public void ordenate() {
		Collections.sort(countries);
	}
	public void addCountry(Country p) {
		countries.add(p);
	}
	
	public void printM() {
		System.out.printf("%-33s|%8s|%8s|%8s","\033[33mCountry","Gold","Silver","  Bronze\u001B[0m");
		System.out.println("");
		int i=1;
		for(Country p:countries) {
			System.out.printf("%2d.%-25s|%8d|%8d|%8d",i,p.getName(),p.getGoldM(),p.getSilverM(),p.getBronzeM());
			System.out.println("");
			i++;
		}
		
		
	}
	public void printF() {
		System.out.printf("%-33s|%8s|%8s|%8s","\033[33mCountry","Gold","Silver","  Bronze\u001B[0m");
		System.out.println("");
		int i=1;
		for(Country p:countries) {
			System.out.printf("%2d.%-25s|%8d|%8d|%8d",i,p.getName(),p.getGoldF(),p.getSilverF(),p.getBronzeF());
			System.out.println("");
			i++;
		}
	}
	
	public void printCombinate() {
		System.out.printf("%-33s|%8s|%8s|%8s","\033[33mCountry","Gold","Silver","  Bronze\u001B[0m");
		System.out.println("");
		int i=1;
		for(Country p:countries) {
			System.out.printf("%2d.%-25s|%8d|%8d|%8d",i,p.getName(),p.getGoldT(),p.getSilverT(),p.getBronzeT());
			System.out.println("");
			i++;
		}
	}
	
	public void sortMale() {
		Collections.sort(countries,new Comparator<Country>(){
			@Override
			public int compare(Country A,Country B) {
				int output = B.getGoldM()-A.getGoldM();
				if(output==0) {
					int output2= B.getSilverM()-A.getSilverM();
					if(output2==0) {
						return B.getBronzeM()-A.getBronzeM();
					}else {
						return output2;
					}
				}else {
				    return output;
				}
			}
		});
	}
	public void combinate() {
	for(int i=0;i<countries.size();i++) {
		for(int j=i+1;j<countries.size();j++) {
			if(countries.get(i).getGoldT()<countries.get(j).getGoldT()) {
				Country temp=countries.get(j);
				countries.set(j, countries.get(i));
				countries.set(i, temp);
			}
			else if(countries.get(i).getGoldT()==countries.get(j).getGoldT()) {
				if(countries.get(i).getSilverT()<countries.get(j).getSilverT()) {
					Country temp=countries.get(j);
					countries.set(j, countries.get(i));
					countries.set(i, temp);
				}
				else if(countries.get(i).getSilverT()==countries.get(j).getSilverT()) {
					if(countries.get(i).getBronzeT()<countries.get(j).getBronzeT()) {
						Country temp=countries.get(j);
						countries.set(j, countries.get(i));
						countries.set(i, temp);
					}
				}
			}
		}
	}
	}
}
