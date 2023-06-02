import java.util.ArrayList;
import java.util.List;

public class hourGlass {
	public static void main(String[] args) {
		List<String> string = new ArrayList<String>();
		List<String> query = new ArrayList<String>();
		string.add("abcde");
		string.add("sdaklfj");
		string.add("asdjf");
		string.add("na");
		string.add("basdn");
		string.add("sdaklfj");
		string.add("asdjf");
		string.add("na");
		string.add("asdjf");
		string.add("na");
		string.add("basdn");
		string.add("sdaklfj");
		string.add("asdjf");

		query.add("abcde");
		query.add("sdaklfj");
		query.add("asdjf");
		query.add("na");
		query.add("basdn");
		query.add("asdjf");
		List<Integer> res1 = new ArrayList<Integer>();
		for (int i = 0; i < query.size(); i++) {
			int count = 0;
			for (int j = 0; j < string.size(); j++) {
				if (string.get(j).equals(query.get(i))) {
					count++;
				}

			}
			res1.add(count);
		}
		for (int x : res1) {
			System.out.println(x);
		}
	}
}
