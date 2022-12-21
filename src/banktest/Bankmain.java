package banktest;

public class Bankmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ICICI ic = new ICICI();
		ic.setBranch("Chennai");
		ic.setInterestrate(6.5);
		ic.setBalance(10000);
		ic.setTime(1);
		
		System.out.println(ic.mybranch());
		System.out.println(ic.getInterestrate());
		System.out.println(ic.interest());
		System.out.println(ic.interest()+ic.getBalance());
		
	}

}
