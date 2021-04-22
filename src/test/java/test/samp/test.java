package test.samp;

import org.testng.Assert;
import org.testng.annotations.Test;

import driver.driver;

public class test {
	
	driver dr = new driver();
	
	@Test(priority = 1)
	public void main() {
		  
		dr.chrome("https://www.facebook.com/");
		Assert.assertTrue(dr.driver.getTitle().contains("Facebook"));
		dr.driver.close();
		
	}
}
