package com.syntax.2Darrays;

public class TwoDArray5 {

	public static void main(String[] args) {
		
		// Write a program that calculates the sum of elements from each row in a 2D array and adds them into array of integers

	
		int a[][] = {       
                {1, 2, 3},    
                {4, 5, 6},    
                {7, 8, 9}    
            };    
      
  //Calculates number of rows and columns present in given matrix    
    
  
		
//Calculates sum of each row of given matrix    
for(int i = 0; i < a.length; i++){    
	int sumRow = 0; 
    for(int j = 0; j < a[i].length; j++){    
      sumRow= sumRow+a[i][j];    
    }    
    System.out.println("Sum of " + (i+1) +" row: " + sumRow);    
}    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
