package br.com.resolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class NoDivisor {

	
	
	private static boolean somaDivisivelPork(int k, int valor,List<Integer> s) {
		for(int i = 0 ; i<s.size();i++) {
			if((valor+s.get(i))%k==0)
				return false;
		}
		return true;
	}
	
	public static int nonDivisibleSubset(int k, List<Integer> s) {
		
		ArrayList<Integer> ints = new ArrayList<>();
		for(int i=0;i<s.size();i++) {
			for(int j=0;j<s.size();j++) {
				if(s.get(i)!= s.get(j)) {
					if((s.get(i) + s.get(j))%k==0)
						break;
					else
						if(!ints.contains(s.get(i)) && somaDivisivelPork(k, s.get(i), ints))
							ints.add(s.get(i));
				}
			}
		}
		
		return ints.size();
	
	}



	public static void main(String[] args) {
		Integer[] v = {19,10,12,10,24,25,22};

		List<Integer> value = Arrays.asList(v);
		System.out.println(nonDivisibleSubset(4, value)); 
	}

}
