class Shape2 {
	public void area() {
		System.out.println("Area");
	}
}

class Triangle extends Shape2 {
	public void area(int h, int l) {
		System.out.println(1 / 2 * l * h);
	}
}

class Circle extends Shape2 {
	public void area(int r) {
		System.out.println(3.14 * r * r);
	}
}
public class Shape1{
	public static void main(String[] args) {
		Circle c1=new Circle();
		c1.area(5);
	}
}
