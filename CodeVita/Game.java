import java.util.*;
class Game{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int darrel = 0;
		int sally = 0;
		int no_of_lines = Integer.parseInt(sc.nextLine());
		int counter = 0;
		String question = "", fi="";
		String answer = "";
		StringTokenizer st;
		boolean flag1 = false;
		while(counter < no_of_lines){
			int gcm = 0, ans_i = 0;
			String temp1 = "", temp2 = "",l ="",ans = "";
			question = sc.nextLine();
			answer = sc.nextLine();
			st = new StringTokenizer(question," ");
			if(st.countTokens() < 2){
				System.out.print("Invalid Input");
				flag1 = true;
				break;
			}
			else{ 
				temp1 = st.nextToken();
				if(counter <= 0)
					fi = temp1;
				l = st.nextToken();
				gcm = caliculateGcm(l);
				System.out.println(temp1+"'s question is: "+ l);
			}
			st = new StringTokenizer(answer, " ");
			if(st.countTokens() == 3){
				if(st.nextToken().equals("A")){
					temp2 = st.nextToken();
					ans = st.nextToken();
					if(ans.equals("PASS")){
						System.out.println("Question is PASSed");
						System.out.println("Answer is: "+gcm);
						System.out.println(temp2+ ":0 points");
						counter += 2;
						continue;
					}
					else
						ans_i = Integer.parseInt(ans);
					if(temp1.equals(temp2)){
						System.out.print("Invalid Input");
						flag1 = true;
						break;
					}
					else{
						if(ans_i == gcm){
							System.out.println("Correct Answer");
							if(temp2.equals("Sally"))
								sally+= 10;
							else if(temp2.equals("Darrell"))
								darrel += 10;
							System.out.println(temp2+": 10points");
						} else{
							System.out.println("Wrong Answer");
							System.out.println(temp2+": 0points");
						}
					}
				}
			}
			counter += 2;
		}
		if(!flag1){
			System.out.print("Total Points:");
			if(fi.equals("Darrell")){
				System.out.println("Darrell :"+ darrel + " points");	
				System.out.println("Sally:"+ sally + " points");	
			} else {
				System.out.println("Sally:"+ sally + "points");	
				System.out.println("Darrell:"+ darrel + "points");	
			}
			String win = "";
			if(sally == darrel)
				win = "";
			else if(sally > darrel)
				win = "Sally";
			else
				win = "Darrell";
			if(win == "")
				System.out.println("Game Result: Draw");
			else
				System.out.print("Game Result:"+win+" is winner");			
		}
	}
	public static int caliculateGcm(String s){
		int gcm = 0;
		StringTokenizer st = new StringTokenizer(s, ",");
		ArrayList<Integer> lis = new ArrayList<>();
		while(st.hasMoreTokens()){
			lis.add(Integer.parseInt(st.nextToken()));
		}
		while(lis.size() >= 2){
			int t1 = lis.get(lis.size()-1);
			int t2 = lis.get(lis.size()-2);
			lis.remove(lis.get(lis.size()-1));
			lis.remove(lis.get(lis.size()-1));
			lis.add(lcm(t1,t2));
		}
		gcm = lis.get(0);
		return gcm;
	}
	public static int gcd(int a, int b){
    if (a<b) return gcd(b,a);
    if (a%b==0) return b;
    else return gcd(b, a%b);
	}
	public static int lcm(int a, int b){
    return ((a*b)/gcd(a,b));
  }
}