import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for(int a0 = 0; a0 < T; a0++){
            int n = in.nextInt();
            for(int a_i=0; a_i < n; a_i++){
                a.add(in.nextInt());
            }
            System.out.println(a.get(a.size()-1));
            Collections.sort(a);
            ArrayList<Integer> p1 = new ArrayList<>();
            ArrayList<Integer> p2 = new ArrayList<>();
            while(a.size() != 0) {
            	p1.add(a.get(a.size() - 1));
            	a.remove(a.size()-1);
            	if(a.size() == 0)
            		break;
            	p2.add(a.get(a.size() - 1));
            	a.remove(a.size()-1);
            }
            int sum1 = 0, sum2 = 0;
            for(int i =0; i <p1.size(); i++){
            	sum1 = sum1 + p1.get(i);
            }
            for(int i =0; i <p2.size(); i++){
            	sum2 = sum2 + p2.get(i);
            }
            if((sum1 - sum2)%3 == 0){
            	System.out.println("-----------------Koca");
            } else {
            	System.out.println("------------------Balsa");
            }
            // your code goes here
        }
    }
}
