import java.io.*;
import java.util.*;

class Substring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> sublist = new ArrayList<>();
		ArrayList<String> sublist2 = new ArrayList<>();
		String ip = sc.nextLine();
		for(int i = 0; i <= ip.length()-1; i++){
			for(int j= i+1; j<= ip.length(); j++) {
				sublist.add(ip.substring(i,j));
			}
		}
		String re = "";
		for(int i = ip.length()-1; i >=0; i--) {
			re = re + ip.charAt(i);
		}
		for(int i = 0; i <= re.length()-1; i++) {
			for(int j=i+1; j <= re.length(); j++) {
				String temp = re.substring(i,j);
				if(sublist.contains(temp) && !sublist2.contains(temp)){
					int t1 = ip.indexOf(temp)+temp.length();
					int t2 = re.indexOf(temp)+temp.length();
					if((ip.length() - t1) > t2){
						if(sublist2.size()!=0 && sublist2.get(0).length() < temp.length()){
							sublist2.add(0,temp);
						} else {
							sublist2.add(temp);
						}
					}	
				}
			}
		}
		if(sublist2.size()!=0){
			System.out.println(sublist2.get(0).length());
			System.out.print(sublist2.get(0));
		} else {
			System.out.println(0);
			System.out.println("there is no such substring");
		}
	}
}