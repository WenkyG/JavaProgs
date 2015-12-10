import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = Integer.parseInt(sc.next());
		ArrayList<Integer> lis = new ArrayList<>();
		int count = 0, sum1 = 0, sum = 0;
		while(count < input) {
			ArrayList<Integer> lis1 = new ArrayList<>();
			int length = Integer.parseInt(sc.next());
			for(int i=0; i < length; i++){
				lis.add(Integer.parseInt(sc.next()));
			}
			for(int i = 0; i <=length; i++){
				int k = 0;
				k = length;
				for(int j = k; j > i; j--){
					for(int p = i; p < j; p++){
						sum1 = sum1 + lis.get(p);
					}
					lis1.add(sum1);
				sum1 = 0;
				}
			}
			Collections.sort(lis1);
			sum1 = lis1.get(lis1.size()-1);
			lis1.clear();
			for(int i=0; i<lis.size(); i++){
				if(lis.get(i) >= 0)
					sum = sum+lis.get(i);
			 	else {
					Collections.sort(lis);
					sum = lis.get(lis.size()-1);
					break;
				}
			}
			lis.clear();
			System.out.println(sum1 +" "+sum);
			sum = 0;
			sum1 =0;
			count++;
		}
	}
}