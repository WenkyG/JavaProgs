import java.util.*;
class Candies {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test_cases = Integer.parseInt(sc.nextLine());
		int counter = 0;
		while(counter < test_cases){
			int array_size = Integer.parseInt(sc.nextLine());
			int lis[] = new int[array_size];
			String s = sc.nextLine();
			StringTokenizer st = new StringTokenizer(s," ");
			int c = 0;
			while(st.hasMoreTokens()){
				lis[c] = Integer.parseInt(st.nextToken());
				c++;
			}
			int x = array_size;
			int time = 0,add = 0, iterartion = 0;
			while( iterartion < array_size-1 ){
				lis = sort(lis);
				add = lis[0]+ lis[1];
				time+=add;
				if(lis.length > 2){
					lis[1] = add;
					int redef[] = new int[x-1];
					System.arraycopy(lis, 1, redef, 0,x-1);
					lis = new int[x-1];
					System.arraycopy(redef, 0, lis, 0,x-1);
				}
				x--;
				iterartion++;
			}
			System.out.print(time);
			counter++;
		}
	}
	public static int[] sort(int arr[]){
		for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index])
                    index = j;
      
            int smallerNumber = arr[index]; 
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        return arr;
	}
}