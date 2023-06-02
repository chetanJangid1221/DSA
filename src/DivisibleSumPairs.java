import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DivisibleSumPairs {
	public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
		int n1 = 6;
		List<Integer> inputArr = new ArrayList<Integer>();
		inputArr.add(1);
		inputArr.add(3);
		inputArr.add(2);
		inputArr.add(6);
		inputArr.add(1);
		inputArr.add(2);
		int cnt = 0;
		for (int i = 0; i < n1; i++) {
			for (int j = i+1; j< n1; j++) {
				if ( (inputArr.get(i)+inputArr.get(j))% k==0) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
		return cnt;
	}

	public static void main(String[] args) {
		divisibleSumPairs(6, 3, null);
		
	}
}
