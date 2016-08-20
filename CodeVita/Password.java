import java.util.*;
class Password {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String encode = sc.nextLine();
		String characters = sc.nextLine().trim();
		String sk = encode.substring(encode.length()-1).toString().trim();
		int key_index = Integer.parseInt(sk);
		HashMap<String, ArrayList<Integer>> charpos = new HashMap<String,ArrayList<Integer>>();
		HashMap<Integer,String> charindex = new HashMap<Integer,String>();
		for(int i=0; i<characters.length(); i++){
			charindex.put(i,characters.substring(i,i+1));
		}
		int yt = 0;
		StringTokenizer st = new StringTokenizer(encode, "||");
		int counn = st.countTokens();
		if(st.countTokens()!=11 || characters.length()!=10)
			System.out.print("-1");
		else {
			int itr = 0,length = 0;;
			String kk = "";
			while(st.hasMoreTokens()){
				String p = st.nextToken();
				if(itr == 10){
					kk = p;
					break;
				}	else {
					ArrayList<Integer> x = new ArrayList<>();
					if(p.length() > 0){
						yt = 0;
						while(yt < p.length()-1){
							int g = Integer.parseInt(p.substring(yt,yt+1));
							length++;
							x.add(g);
							yt++;
						}
						charpos.put(p.substring(yt),x);
					}
				}
				itr++;
			}
		int ku[] = new int[length]; 
			for(int i = 0; i<length;i++){
				ku[i] = 0;
			}
			yt = 0;
			ArrayList<Integer> keyposs = new ArrayList<>();
			while(yt < kk.length()-1){
				int g = Integer.parseInt(kk.substring(yt,yt+1));
				keyposs.add(g);
				yt++;
			}
			kk="";
			Set<String> keys = charpos.keySet();
			String gog = "";
 	    Iterator<String> ietr = keys.iterator();
	    while (ietr.hasNext()) { 
       gog = ietr.next();
       for(int i = 0; i<charpos.get(gog).size(); i++){
       	ku[charpos.get(gog).get(i)] = Integer.parseInt(gog.trim());
       }
     }for(int i=0; i<ku.length; i++){
     			if(keyposs.contains(i)){
     				ku[i] = ku[i] + 10;
     			}
     		}
     		 yt = key_index;
     		for(int i=0; i<ku.length; i++){
     			ku[i] = ku[i] - yt;
     			yt = ku[i];
     		}
     		for(int i = 0; i<ku.length-1;i++){
     			kk = kk + charindex.get(ku[i]);
     		}
     		kk = charindex.get(ku[ku.length-1]) + kk; 
			System.out.print(kk);
		}
	}
}