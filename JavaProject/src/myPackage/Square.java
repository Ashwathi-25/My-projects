package myPackage;

public class Square extends Shape {

	public double area(){
		return getLength()*getBreadth();
	}
	
	public double perimeter() {
		return 2*(getLength() * getBreadth());
	}
}
