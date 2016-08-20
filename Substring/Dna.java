import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class palind{
	private String input;
	private String complement;
	private String reversed;

	palind(String s){
		this.input = s;
		complement="";
		reversed = "";
	}

	public void complemented() {
		for(int i = 0; i < input.length(); i++){
			if(input.charAt(i) == 'A')
				complement=complement+"T";
			else if(input.charAt(i) == 'T')
				complement=complement+"A";
			else if(input.charAt(i) == 'C')
				complement=complement+"G";
			else if(input.charAt(i) =='G')
				complement=complement+"C";
		}
	}
	public void reversed() {
		for(int i = complement.length()-1; i>=0; i--) {
			reversed = reversed + complement.charAt(i);
		}
	}

	public void make_subStrings() {
		ArrayList<String> list_input = new ArrayList<>();
		ArrayList<String> list_matched = new ArrayList<>();
		
		for(int i = 0; i < input.length() -1; i++){
			for(int j = i+1; j <= input.length(); j++){
				String temp = input.substring(i,j);
				if(temp.length() > 1){
					list_input.add(temp);
				}
			}
		}
		// System.out.println(list_input);
		for(int i = 0; i < reversed.length() -1; i++){
			for(int j = i+1; j <= reversed.length(); j++){
				String temp1 = reversed.substring(i,j);
				if(temp1.length() > 1 && list_input.contains(temp1) && !list_matched.contains(temp1)){
					// System.out.println("INC");
					if(list_matched.size() == 0){
						// System.out.println("INITIAL");
						list_matched.add(temp1);
					}else{
						// System.out.println("ELSE");
						int flag = 0;
						for(int k = 0; k < list_matched.size(); k++){
							System.out.println(list_matched.get(k)+"-------------"+temp1);
							if(list_matched.get(k).length() < temp1.length()){
								System.out.println("matched");
								list_matched.clear();
								list_matched.add(temp1);
								flag++;
								break;
							} else if(list_matched.get(k).length() > temp1.length()){
								flag++;
								break;
							}
						}
						if(flag == 0){
							list_matched.add(temp1);
						}
					}
				}
			}
		}
		if(list_matched.size() == 0){
			System.out.println("No reverse palindromic substrings available");
		} else {
			Collections.sort(list_matched);
			System.out.println(list_matched);
		}
	}
}

class Dna {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		palind obj = new palind(input);
		obj.complemented();
		obj.reversed();
		obj.make_subStrings();

	}
}