import java.util.*;
class Per {
	String s="";
	String i="";
	int n = 0;
	Per(String s,String i, int n) {
		this.s = s; this.i = i; this.n = n;
		prefix(s,i);
	}
	public  void prefix(String ss, String ip){
			if(ss.length() == n){
				System.out.println(ss);
				return;
			}
			for(int i = 0; i<ip.length(); i++){
				prefix(ss+ip.charAt(i),ip);
			}
		}
}
class Digits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = Integer.parseInt(sc.nextLine());
		String s = sc.nextLine();
		StringTokenizer st = new StringTokenizer(s);
		String ip = "";
		while(st.hasMoreTokens()){
			ip = ip+st.nextToken();
		}
		String ss = "";
		Per o = new Per(ss,ip,length);
	}
}
	