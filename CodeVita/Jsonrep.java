import java.util.*;
class Jsonrep {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		ArrayList<String> seq = new ArrayList<>();
		int a=0,b=0,c=0,d=0;
		for(int i=0; i<s.length(); i++){
			String chk = s.substring(i,i+1); 
			if(i == 0){
				String start = s.substring(0,1);
				if(start.equals("{")){
					seq.add(start);
					a++;
				}
			} else if(chk.equals("{")){
				if(seq.get(seq.size()-1).equals("[") || seq.get(seq.size()-1).equals(",") || seq.get(seq.size()-1).equals("{")){
					a++;
					seq.add(chk);
				}else{
					System.out.print("-1");
					break;
				}

			} else if(chk.equals("}")){
				if(seq.get(seq.size()-1).equals("{") || seq.get(seq.size()-1).equals("]")){
					seq.add(chk);
					b++;
				} else{
					System.out.print("-1");
					break;
				}

			} else if(chk.equals("[")){
				if(seq.get(seq.size()-1).equals(",") || seq.get(seq.size()-1).equals(":")){
					seq.add(chk);
					c++;
				} else {
					System.out.print("-1");
					break;
				}
				
			} else if(chk.equals("]")){
				if(seq.get(seq.size()-1).equals("}") || seq.get(seq.size()-1).equals("[")){
					seq.add(chk);
					d++;
				} else {
					System.out.print("-1");
					break;
				}
				
			} else if(chk.equals(",")){
				if(seq.get(seq.size()-1).equals("}") || seq.get(seq.size()-1).equals("]")) {
					seq.add(chk);
				} else {
					System.out.print("-1");
					break;
				}
			} else if(chk.equals(":")){
				if(seq.get(seq.size()-1).equals("{")) {
					seq.add(chk);
				} else {
					System.out.print("-1");
					break;
				}
			}
		}
		if(a==b && c == d)
			System.out.print("1");
	}
}