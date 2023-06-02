interface Animal1{
	void walk();
//	public void breathe() {
//		System.out.println("Animal is Breathing");
//	}
}
class Horse implements Animal1{
	public void walk() {
		System.out.println("walk on 4 legs");
	}
}
class Chiken implements Animal1{
	public void walk() {
		System.err.println("walk on 2 legs");
	}
}
public class Animal {
public static void main(String[] args) {
	Horse h1=new Horse();
//	h1.breathe();
	h1.walk();
}
}
