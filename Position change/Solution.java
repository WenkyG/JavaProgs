import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int a0 = 0; a0 < T; a0++){
            int n = in.nextInt();
            int q[] = new int[n];
            for(int q_i=0; q_i < n; q_i++){
                q[q_i] = in.nextInt();
            }
            int temp[] = new int[n];
            for(int i=0; i < n; i++){
            	temp[i] = q[i];
            }
            Arrays.sort(temp);
            int flag = 0, flg = 0, count = 0;
            for(int i=n-1; i>=0; i--){
            	if(temp[i] != q[i]){
            		// int temp = 0;
            		for(int j=i; j>=0; j--){
            			int tempp = 0;
            			if(q[j] == temp[i])
            				tempp = (i-j);
            			if(tempp>2)
            				flag = 1;
            			else
            				count = count + tempp;
            			}
            		// flag = 0;
            		if(flag == 1){
            			System.out.println("Too chaotic");
            			break;
            		}
   
            	}
            }
            if(flag!=1)
            	System.out.println(count);
        }
    }
}
