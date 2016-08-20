import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Fibonacci {
  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine();
			BigInteger term1 = null, term2 =null,term3 =null;
			int limit =0;
		StringTokenizer st = new StringTokenizer(inp," ");
		while(st.hasMoreTokens()){
			term1 = new BigInteger(st.nextToken());
			term2 = new BigInteger(st.nextToken());
			limit = Integer.parseInt(st.nextToken());
		}
		int count = 2;
		while(count < limit){
			term3 = term2.pow(2) ;
			term3 = term3.add(term1);
			term1 = term2;
			term2 = term3;
			count++;
		}
		System.out.println(term3);
  }
}