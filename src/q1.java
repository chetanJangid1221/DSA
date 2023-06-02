import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class q1{
	 public static  List<String> letterCombinations(String digits){
		 List<String>result=new ArrayList<String>();
		if(digits.length()==0) {
			return result;
		}
		 Map<Character, String > hp = new HashMap<Character, String >();
			hp.put('2',"abc");
	        hp.put('3',"def");
	        hp.put('4',"ghi");
	        hp.put('5',"jkl");
	        hp.put('6',"mno");
	        hp.put('7',"pqrs");
	        hp.put('8',"tuv");
	        hp.put('9',"wxyz");
	        
	        backTrack(digits, 0, hp, new StringBuilder() , result);
		 
		 return result;
	 }
	 public static void backTrack(String digits,int i,Map<Character, String> hm,StringBuilder sb, List<String> result) {
		 if(i==digits.length()) {
			 result.add(sb.toString());
			 return ;
		 }
		 String currentString=hm.get(digits.charAt(i));
		 for(int j=0;j<currentString.length();j++) {
			sb.append(currentString.charAt(j));
			backTrack(digits, i+1, hm, sb, result);
			sb.deleteCharAt(sb.length()-1);
		 }
		 		
	 }
	 public static void main(String[] args) {
		 List<String> r=letterCombinations("23");
		 System.out.println(r);
	}
}