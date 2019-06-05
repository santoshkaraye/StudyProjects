package main.java;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,86,35,6,7,9,10,40,1,56};
		InsertionSort sort= new InsertionSort();
		
		sort.insertion_sort(a, a.length);

	}

	void insertion_sort ( int A[ ] , int n) 
	{
	     for( int i = 0 ;i < n ; i++ ) {
	    /*storing current element whose left side is checked for its 
	             correct position .*/

	      int temp = A[ i ];    
	      int j = i;

	       /* check whether the adjacent element in left side is greater or
	            less than the current element. */

	          while(  j > 0  && temp < A[ j -1]) {

	           // moving the left side element to one position forward.
	                A[ j ] = A[ j-1];   
	                j= j - 1;
	                
	               System.out.println("array--" +Arrays.toString(A));

	           }
	         // moving current element to its  correct position.
	           A[ j ] = temp;  
	           
	           System.out.println("array" +Arrays.toString(A));
	     }  
	}
	
}
