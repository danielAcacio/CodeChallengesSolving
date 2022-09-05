package br.com.resolutions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray {

	public static void reverseArray(Object[] arr) {
		int arrayLastIndex = arr.length-1;
		for(int i=0 ; i<=arrayLastIndex;i++) {
			if(i>arrayLastIndex-i)
				break;
			else {
				Object aux = arr[i];
				arr[i] = arr[arrayLastIndex-i];
				arr[arrayLastIndex-i]=aux;
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		Integer[] arr = {1,2,3,4,5,6}; 
		
		List<Integer> list= Arrays.asList(arr); 
		Collections.reverse(list);
		System.out.println(list);
		
		reverseArray(arr);
		System.out.println(arr);
	}
	
}
