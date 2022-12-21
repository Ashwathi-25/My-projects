package junitpack;

import java.util.Arrays;
import java.util.Collection;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)

public class JunitSecondTest {
	
	public String name;
	public int age;
	public JunitSecondTest(String name, int age) {
		this.age = age;
		this.name =name;
		
	}
	
	@Test
	public void test() {
		System.out.println("Name is: "+ name + " Age is: " + age);
	
	}
	
	@Parameters
	public static Collection<Object[]> parameter(){
		Object[][] data = new Object[2][2];
		data[0][0] = "Ashwathi";
		data[0][1] = 28;
		data[1][0] = "Beulah";
		data[1][1] = 53;
		return Arrays.asList(data);
	}
	


}
