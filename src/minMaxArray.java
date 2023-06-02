import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class minMaxArray {
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>();
		int[] a = { 1, 2, 3, 4, 5 };
		for (int x : a) {
			arr.add(x);
		}
		int minn = Collections.min(arr);
		int maxx = Collections.max(arr);
		long sum = 0;

		for (int i = 0; i < arr.size(); i++) {
			sum=sum+arr.get(i);

		}
		
		System.out.println((sum-maxx)+" "+(sum-minn));
	}
}
