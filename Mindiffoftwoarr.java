/*Given two sorted arrays and a number x, 
find the pair whose sum is closest to x and the pair has an element from each array. 
	We are given two arrays ar1[0…m-1] and ar2[0..n-1] and a number x,
we need to find the pair ar1[i] + ar2[j] such that absolute value of (ar1[i] + ar2[j] – x) is minimum.

Example-1: 

Input:  ar1[] = {1, 4, 5, 7};
            ar2[] = {10, 20, 30, 40};
		  x = 32      
Output:  1 and 30

Example-2: 

Input:  ar1[] = {1, 4, 5, 7};
                   ar2[] = {10, 20, 30, 40};
	          x = 50      
Output:  7 and 40
*/
import java.util.*;
public class Mindiffoftwoarr{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int brr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            brr[i]=sc.nextInt();
        }
        int k = sc.nextInt();
        // System.out.print();
        
        int res[] = solve(arr,brr,k);
        System.out.print(res[0]+" and "+res[1]);
        
    }
    public static int[] solve(int arr[],int brr[],int k){
       int n = arr.length;
       int res [] = new int[2];
       int mini = Integer.MAX_VALUE;
       for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
               int dif = Math.abs((arr[i]+brr[j])-k);
               if(dif<mini){
                   mini=dif;
                   res[0]=arr[i];
                   res[1]=brr[j];
               }
           }
       }
       return res;
    }
}