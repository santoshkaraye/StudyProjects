package main.java;

import java.util.Arrays;

public class BubbleSort {

	
	public static void main(String args[])
	{
		int a[]= {2,86,35,6,7,9,10,40,1,56};
		
		BubbleSort sort= new BubbleSort();
		
		sort.bubble_sort(a, a.length);
		
	}
	
	
	void bubble_sort( int A[ ], int n ) {
	    int temp;
	    for(int k = 0; k< n-1; k++) {
	        // (n-k-1) is for ignoring comparisons of elements which have already been compared in earlier iterations

	        for(int i = 0; i < n-k-1; i++) {
	            if(A[ i ] > A[ i+1] ) {
	                // here swapping of positions is being done.
	                temp = A[ i ];
	                A[ i ] = A[ i+1 ];
	                A[ i + 1] = temp;
	            }
	            
	            System.out.println("array--" +Arrays.toString(A));
	        }
	        
	        System.out.println("array" +Arrays.toString(A));
	    }
	}
}
