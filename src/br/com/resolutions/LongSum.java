package br.com.resolutions;

import java.util.List;


public class LongSum {

	 /*
     * Complete the 'aVeryBigSum' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER_ARRAY ar as parameter.
     */

    public static long aVeryBigSum(List<Long> ar) {
    	return ar.stream().reduce(0L, (number, sum)-> sum+number);

    }

	
	
}
