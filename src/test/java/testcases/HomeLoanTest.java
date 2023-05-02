package testcases;


import org.testng.annotations.Test;

public class HomeLoanTest extends BaseClass{
	
	
	
	@Test(priority=1)
	public void test1() {
		
		System.out.println("Inside home loan test 1");
	}
	
	
	@Test(priority=0)
	public void test2() {
		
		System.out.println("Inside home loan test 2");
	}
	

}
