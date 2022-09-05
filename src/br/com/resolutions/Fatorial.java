package br.com.resolutions;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Fatorial {

	private static BigDecimal fat;
	
	
	  /*
     * Complete the 'extraLongFactorials' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void extraLongFactorials(int n) {
    	setFat(new BigDecimal(1));
    	
    	IntStream.range(1, n+1).forEach(i->{
    		setFat(getFat().multiply(new BigDecimal(i)));
    	});

    	
    	System.out.println(getFat().toString());
    }

    private static void setFat(BigDecimal fatorial){
    	fat = fatorial;
    }
	
    private static BigDecimal getFat(){
    	return fat;
    }
    
    
	public static void main(String[] args) {
		extraLongFactorials(25);
	}
}
