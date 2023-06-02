public class AddBinary {
	public static String addBinary(String a, String b) {
		String result="";
		int carry=0;
		int aLen=a.length();
		int bLen=b.length();
		int i=0;
		while(i<aLen||i<bLen|| carry!=0) {
			int x=0;
			if(i<aLen && a.charAt(aLen-1-i)=='1') {
				x=1;
			}
			int y=0;
			if(i<bLen && b.charAt(bLen-1-i)=='1') {
				y=1;
			
			}
			result=(x+y+carry)%2+result;
			carry=(x+y+carry)/2;
			i++;
		}
		
		return result;
	}
	public static void main(String[] args) {
		System.out.println(addBinary("11","1"));
	}
}
