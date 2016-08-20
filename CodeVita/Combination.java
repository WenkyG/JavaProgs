import java.util.*;
class Combination {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = Integer.parseInt(sc.next());
		int limit = Integer.parseInt(sc.next());
		long facto[] = new long[number+1];
		facto[0] = 1;
		long fac = 1;
		for(int i = 1; i <= number; i++){
			fac *= i;
			facto[i] = fac;
		}
		long sum = 0;
		for(int j = 0; j<= limit; j +=2){
			sum += (facto[number] / (facto[number-j] * facto[j]));
		}
		System.out.print(sum);
	}
}