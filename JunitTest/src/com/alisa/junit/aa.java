package com.alisa.junit;

import java.util.ArrayList;

public class aa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int x = -123456;
		 String result="";
	     String numInput = Integer.toString(x);
	     ArrayList<Character> array = new ArrayList<Character>();
	     for(int i=0; i<numInput.length();i++) {
	    	 array.add( numInput.charAt(i));
	    	 System.out.println(numInput.charAt(i)); 
	    	}
	     
	     System.out.println(array); 
	     
	     for(int i=array.size()-1;i >= 0; i--) {
	    	 System.out.println(array.get(i));
	    	 result += array.get(i);
	     }
	     System.out.println(result);
	   
	}
	     
	        
	

}

	
/*	int N = 93003;
	int result = 1;
    for(int i = 1; i <= N/2; i++){
        int  temp = 2*(N-i);
        int topvalue = (int)Math.sqrt(temp);
        for(int j = 1;j <= topvalue; j++) {
        	//(i+i+j)*(j+1)/2 = N
        	int temp2 = j * (j + 2*i + 1);
        	if(temp2 == temp){
         	   result = result + 1;    
         	}else if(temp2 > temp) {
         		break;
         	}
        }
        
    }    
    
    System.out.println(result);
}*/
	
	
/*
 * class Solution {
    public int consecutiveNumbersSum(int N) {
        int result = 1;
        for(int i = 1; i <= N/2; i++){
            int sum = 0;
             //for(int j = i; j <= N/2 + 1; j++){
              for(int j = i; (j^2 )< (2*N -i + i^2); j++){
                 sum = sum + j;
                 if(sum == N){
                     result = result + 1;                     
                 }else if(sum > N){
                     break;
                 }         
             }
        }
        
        return result;
        
    }
}

*
*	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 93003;
		int result = 1;
        for(int i = 1; i <= N/2; i++){
            int topvalue = (2*N) - i + i*i;
            int temp = (int)Math.sqrt(topvalue);
            if((temp * (temp + 1)) == topvalue ) {
        	   result = result + 1;    
        	}
        }    
        
        System.out.println(result);
	}

}
*/
 