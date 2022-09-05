package br.com.resolutions;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Encription {

	
	public static String encryption(String s) {
	    String retorno="";
		
		s = s.replace(" ", "");
	    Integer countCharacter = s.replace(" ", "").length();
	    
	    int floor = (int) Math.floor(Math.sqrt(countCharacter));
	    int ceil = (int) Math.ceil(Math.sqrt(countCharacter));
	    
	    
		for(int column=0;column<ceil;column++) {
			for(int line=0;line<=floor;line++) {
				int index = line*ceil+column;
				
				if(index<countCharacter)
					retorno+=s.charAt(index);
			
			}
			
			retorno+=" ";
		}

		return retorno;
	    }
	
	
	public static void main(String args[]) {
		System.out.println(encryption("haveaniceday"));
	}
}
