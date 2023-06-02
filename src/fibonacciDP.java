public class fibonacciDP {
	public static int Fibon(int n, int []qb) {
		if(n==0||n==1) {
			return n;
		}
		if(qb[n]!=0) {
			return qb[n];
		}
		int fib=Fibon(n-1,qb)+Fibon(n-2,qb);
//		System.out.print(fib+"\t");
		qb[n]=fib;
		return fib;
	}
	public static void main(String[] args) {
		int n=7;
		System.out.println(Fibon(n ,new int[n+1]));
	}
}
