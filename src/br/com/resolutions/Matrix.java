package br.com.resolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Matrix {

	private static int rigthDiagonal;
	private static int LeftDiagonal;
	
	 public static int diagonalDifference(List<List<Integer>> arr) {
		 setRigthDiagonal(0);
		 setLeftDiagonal(0);
		 
		 int lastIndex = arr.size()-1;   
		 IntStream.range(0, lastIndex+1).forEach(i->{
			 setLeftDiagonal(getLeftDiagonal()+arr.get(i).get(i));
			 setRigthDiagonal(getRigthDiagonal()+arr.get(i).get(lastIndex-i));
		 });
		 
		 int result = getLeftDiagonal()-getRigthDiagonal(); 
		 
		 return result>=0?result:result*-1;
	 }

	public static int getRigthDiagonal() {
		return rigthDiagonal;
	}

	public static void setRigthDiagonal(int rigthDiagonal) {
		Matrix.rigthDiagonal = rigthDiagonal;
	}

	public static int getLeftDiagonal() {
		return LeftDiagonal;
	}

	public static void setLeftDiagonal(int leftDiagonal) {
		LeftDiagonal = leftDiagonal;
	}
	
	 public static void main(String args[]) {
		 
		 Integer[] aa = {11,2,4};
		 Integer[] bb = {4,5,6};
		 Integer[] cc = {10,8, -12};
		 
		 List<Integer> a = Arrays.asList(aa);
		 List<Integer> b = Arrays.asList(bb);
		 List<Integer> c = Arrays.asList(bb);
		 
		 ArrayList<List<Integer>> lista = new ArrayList<>();
		 lista.add(a);
		 lista.add(b);
		 lista.add(c);
		 
		 
		 System.out.println(diagonalDifference(lista));
		 
		 
		 
		 
		 
		 
	 }
	 
	
}
