import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int l = sc.nextInt();
      ArrayList<LongInteger> lis = new ArrayList<>();
      for(int i=0; i<l; i++) {
      	lis.add(Integer.parseInt(sc.next()));
      }
      int count =0;
      for(int i=0; i<l-1; i++) {
      	for(int j=i+1; j<l;j++) {
      		if(lis.get(i) >= lis.get(j)){
      			count++;
      			int temp = lis.get(j-1) + 1;
      			lis.remove(j);
      			lis.add(j,temp);
      			System.out.println(lis);
      			break;
      		}
      	}
      }
      System.out.println(count);
    }
}