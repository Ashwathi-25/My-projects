package banktest;

public class ICICI extends Bank{
	
	private int time;
	
	


	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public String mybranch() {
		return getBranch();
	}
	
	public double interest() {
		return (getBalance()* getInterestrate()*time)/100;
		
		
	}
	
		
	
	
	
	
	
}
