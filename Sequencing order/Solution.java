import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t[] = new int[n];
        for(int i=0; i < n; i++){
            t[i] = in.nextInt();
        }
        for(int i=0; i < n-1; i++) {
        	System.out.println(t[i]+"....."+t[i+1]);
        	if(t[i] == t[i+1] || t[i] > t[i+1]) {
        		t[i+1] = t[i] +1;
        	}
        }
        System.out.println(t[n-1]);
    }
}
//8
// 2 2 2 2 4 4 4 6 

