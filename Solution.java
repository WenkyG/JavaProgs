import java.io.*;
import java.util.*;

public class Solution {
 public static void main(String[] args) {
 	Scanner sc=new Scanner(System.in);
  StringBuffer input1= new StringBuffer(sc.next());
  String result = input1.toString();
  String input=input1.reverse().toString();
  
  System.out.println(result+"--------------"+input+"+++++++++"+input1);
  if(input.equals(result))
  System.out.println("Yes");
  else if(!input.equals(result)) 
  	System.out.println("No");
 }
} 