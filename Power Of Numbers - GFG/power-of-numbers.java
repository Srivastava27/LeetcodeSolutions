//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
    
    // compute reverse of a number
    public static long rev(long n)
    {
        long rev_num = 0;
         while(n > 0) 
          { 
            rev_num = rev_num*10 + n%10; 
            n = n/10; 
          } 
          return rev_num;
    }
    
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
        //testcases
		int T=sc.nextInt();
		while(T-->0)
		{
		    Solution obj=new Solution();
		    
		    int N;
		    
		    
            //input N
		    N=sc.nextInt();
		    int R=0;
		    
		    	    
            // reverse the given number n
		    R=(int)rev(N);
	
            //power of the number to it's reverse
		    long ans=(long)obj.power(N,R);
		    System.out.println(ans);
		    
		    
		}
		
	}
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
        
    long power(int n,int r)
    {
        // long res=0;
        // if(r==0){
        //     return 1;
        // }
        // if(r>0){
        //     res=n*power(n,r-1);
        // }
        // return res;
        
        
        if(r==0)return 1;
        if(r==1)return n;
        long Mod=1000000007;
        
        long res=(power(n,r/2))%Mod;
        res=(res*res)%Mod;
        if(r%2==0){
            return (res)%Mod;
        }else{
            return (res*n)%Mod;
        }
        
        
        
        
        
        // if(r<=0){
        //     return 1;
        // }else{
        //     return (n*power(n,n-1));
        // }
    }

}
