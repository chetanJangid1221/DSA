public class Sqrt {
	public static int mySqrt(int x) {
		int start = 1;
		int end = x;
		
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (mid * mid == x) {
				return mid;
			} else if (mid * mid > x) {
				end = mid - 1;
				
			} else {
				start = mid + 1;
			}

		}

		return end;
	}

	public static void main(String[] args) {
		System.out.println(mySqrt(8));
	
}
	}
