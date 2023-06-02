import java.util.List;
public class Lcm {
//--------------------------LCM of Array-----------------------------------------
	static int LCM(int[] a) {
		int[] arr = { 3, 9, 6 };
		int gcf = 1;
		int alen = a[0];
		int blen = a[a.length - 1];
		System.out.println("last element is  " + blen);

		int lcm = (alen * blen) / GCD(arr);
		System.out.print("From LCM Funtion " + lcm);
		return lcm;
	}

//--------------------------------	 GCD of an Array

	static int gcd(int a, int b) {
		if (a == 0)
			return b;
		return gcd(b % a, a);
	}

	static int GCD(int[] arr) {
		int res = arr[0];
		for (int x : arr) {
			res = gcd(x, res);
			

		}
		return res;

	}

	public static void main(String[] args) {
		int[] a = { 2, 3, 6 };
		int lcm = LCM(a);
		System.out.println("LCM is " + lcm);
		int[] b = { 42, 84 };
		int gcd = GCD(b);
		System.out.println("GCM is " + gcd);
		int cnt = 0;
		for (int i = lcm; i <= gcd; i++) {
			if (gcd % i == 0) {
				cnt++;
			}

		}
		System.out.println("total no is " + cnt);

	}
}
