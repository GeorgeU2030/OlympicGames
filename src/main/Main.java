package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import model.Country;
import model.CountryData;

public class Main {

	public static void main(String[] args) throws IOException {
		
    CountryData array = new CountryData();
		String path = "src/proof/proof.txt";
		File file = new File(path);
		  //Dato de entrada desde el archivo file
			FileInputStream fis=new FileInputStream(file);
			
			//BufferedReader
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader reader = new BufferedReader(isr);
			
			String data ="";
			String line=null;
			while((line = reader.readLine())!=null) {
				data+=line+"\n";
			}
		   String[] out =data.split("\n");
		   
		   for(int i=1;i<out.length;i++) {
			   String[]value = out[i].split(";");
			   String name = value[0];
			   int goldM = Integer.parseInt(value[1]);
			   int silverM = Integer.parseInt(value[2]);
			   int bronzeM = Integer.parseInt(value[3]);
			   int goldF = Integer.parseInt(value[4]);
			   int silverF = Integer.parseInt(value[5]);
			   int bronzeF = Integer.parseInt(value[6]);
			   Country country = new Country(name,goldM,silverM,bronzeM,goldF,silverF,bronzeF);
			   array.addCountry(country);
		   }
		
		  System.out.println("Men's Medals\n");
		  array.sortMale();
		  array.printM();
		  System.out.println("----------");
		  System.out.println("Women's Medals\n");
		  array.ordenate();
		  array.printF();
		  System.out.println("----------");
		  System.out.println("Gold Medals\n");
		  array.combinate();
		  array.printCombinate();
	}

}
