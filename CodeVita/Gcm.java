class Gcm{
	public static void main(String[] args) {
		int n1 = 6, n2 = 5;
		System.out.println(lcm(n1,n2));
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