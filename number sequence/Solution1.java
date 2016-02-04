import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int l = sc.nextInt();
      ArrayList<Long> lis = new ArrayList<>();
      int count =0;
      for(int i=0; i<l; i++) {
            lis.add(Long.parseLong(sc.next()));
            if(i!=0){
                  if(lis.get(i-1) >=lis.get(i)){
                        count++;
                        long temp = lis.get(i-1) + 1;
                        lis.remove(i);
                        lis.add(i,temp);
                        System.out.println(lis);
                  }
            }
      }
      System.out.println(count);
    }
}