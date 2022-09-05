package br.com.resolutions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Triplet {

	
	class Result {

	    /*
	     * Complete the 'compareTriplets' function below.
	     *
	     * The function is expected to return an INTEGER_ARRAY.
	     * The function accepts following parameters:
	     *  1. INTEGER_ARRAY a
	     *  2. INTEGER_ARRAY b
	     */

	    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
	    ArrayList<Integer> result = new ArrayList<Integer>();
	    result.add(0);
	    result.add(0);
	    
	    IntStream.range(0, a.size()).forEach(index->{
	    	if(a.get(index)>b.get(index))
	    		result.set(0, result.get(0)+1);
	    	if(a.get(index)<b.get(index))
	    		result.set(1, result.get(1)+1);
	    });
	    
	    
	    
	    return result;
	    }

	}
	
	
	
	  public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
	            .map(Integer::parseInt)
	            .collect(toList());

	        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
	            .map(Integer::parseInt)
	            .collect(toList());

	        List<Integer> result = Result.compareTriplets(a, b);

	        bufferedWriter.write(
	            result.stream()
	                .map(Object::toString)
	                .collect(joining(" "))
	            + "\n"
	        );

	        bufferedReader.close();
	        bufferedWriter.close();
	    }
	
}
