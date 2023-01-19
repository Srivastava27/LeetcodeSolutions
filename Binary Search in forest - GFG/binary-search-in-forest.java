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
        for(int machine_height=start;machine_height<end;machine_height++){
            int wood_collected=0;
            
            
            
            
///////////////------height of tree which will be cut------////////////////////
            for(int i=0;i<length;i++){
                if(machine_height<tree[i]){
                wood_collected+=tree[i]-machine_height;
                }
            }
            
            
            
//////////////-------wood collected at that height is same then the machine height is accurate------////////////            
            if(wood_collected==total_wood){
                return machine_height;
            }
        
        }
        return -1;
    }
}