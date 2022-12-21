package myPackage;

public class ShapeMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Square object1 = new Square();
		object1.setBreadth(12);
		object1.setLength(12);
		System.out.println("The Area is:"+ object1.area());
		System.out.println("The Perimeter is:" + object1.perimeter());
		
		Shape object2 = new Rectangle();
		object2.setBreadth(12);
		object2.setLength(12);
		System.out.println("The Area is:"+ object2.area());
		System.out.println("The Perimeter is:" + object2.perimeter());
		
		object2 = new Square();
		object2.setBreadth(12);
		object2.setLength(12);
		System.out.println("The Area is:"+ object2.area());
		System.out.println("The Perimeter is:" + object2.perimeter());
	}


}
