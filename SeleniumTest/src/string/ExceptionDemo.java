package string;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		try {
		int num1 = 1;
		int num2 = num1/0;
		}
		catch(Exception e) {
			
			System.out.println(e.toString());
		}
		 

	}

}
