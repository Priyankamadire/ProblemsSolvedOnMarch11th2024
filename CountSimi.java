/*Mr. Param is working with Strings.
He is given a String S. He has to find the palindromes in S, 
A palindrome can be a substring of S (Strictly substrings only, not subsequences).

Your task is to find the count the number of palindromes can be formed from S.

NOTE: Count each occurence of palindromes if duplicate substrings found. 

Input Format:
-------------
A string S

Output Format:
--------------
Print an integer, number of palindromes.


Sample Input-1:
---------------
divider

Sample Output-1:
----------------
9

Explanation:
-------------
Palindromes are d, i, v, i, d, e, r, ivi, divid

Sample Input-2:
---------------
abcdef

Sample Output-2:
----------------
6

Explanation:
-------------
Palindromes are a, b, c, d, e, f.
 */
import java.util.*;
public class CountSimi{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.print(solve(s));
    }
    public static int solve(String s){
        int n = s.length();
        int cnt=0;
        for(int i=0;i<n;i++){
            cnt+=helper(s,i,i);
        }
        for(int i=0;i<n-1;i++){
            cnt+=helper(s,i,i+1);
        }
        return cnt;
    }
    public static int helper(String s,int l,int r){
        int cnt=0;
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            cnt++;
            l--;
            r++;
        }
        return cnt;
    }
}