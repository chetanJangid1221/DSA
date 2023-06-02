import java.awt.Label;
import java.util.ArrayList;
import java.util.List;

public class arrayManupulation {
	public static void main(String[] args) {
		int[] arr = new int[6];
		List<List<Integer>> queries = new ArrayList();
		List<Integer> l1 = new ArrayList<>();
		List<Integer> l2 = new ArrayList<>();
		List<Integer> l3 = new ArrayList<>();
		l1.add(1);
		l1.add(2);
		l1.add(100);

		l2.add(2);
		l2.add(5);
		l2.add(100);

		l3.add(3);
		l3.add(4);
		l3.add(100);

		queries.add(l1);
		queries.add(l2);
		queries.add(l3);

		
		for(int i=0;i<queries.size();i++) {
			List<Integer> temp= queries.get(i);
			System.out.println(temp.toString());
			int a =temp.get(0);
			int b = temp.get(1);
			int k =temp.get(2);
			for (int j = a; j <= b; j++) {
				arr[j] =arr[j]+ k;
		}
		}int maxx=0;
		for(int i=1;i<arr.length;i++) {
			if(maxx<arr[i]) {
				maxx=arr[i];
			}
			
			
			
		}
		System.out.println("max is "+maxx);

	}
}
