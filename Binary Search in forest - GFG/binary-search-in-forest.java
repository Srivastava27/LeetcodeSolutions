//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GfG
{
    public static void main (String[] args)
	{
        Scanner in = new Scanner(System.in);
        
        int t = in.nextInt();
        while(t-->0)
        {
            int n = in.nextInt();
            
            int tree[]= new int[n];
            for(int i=0; i<n; i++)
                tree[i] = in.nextInt();
            int k = in.nextInt();
            
            Solution x = new Solution();
            System.out.println( x.find_height(tree,n,k) );
        }
	}
}
// } Driver Code Ends


class Solution
{
    static int find_height(int tree[], int length, int total_wood)
    {
        int start=0;
        int end=0;
        // int machine_height=0;
        for(int i=0;i<length;i++){
            if(tree[i]>end){
                end=tree[i];
            }
        }
        
        ///////////////---wood collected-----////////////////////////
        while(start<=end){
            int wood_collected=0;
            int machine_height=(start+end)/2;
            for(int i=0;i<length;i++){
                if(machine_height<tree[i]){
                    wood_collected+=tree[i]-machine_height;
                }
            }
        
        /////////---checking whether wood collected is equal to the required total wood or not---//////    
            if(wood_collected==total_wood){
                return machine_height;
            }else if(wood_collected>total_wood){
                start=machine_height+1;
            }else{
                end=machine_height-1;
            }
        }
        return -1;
    }
}