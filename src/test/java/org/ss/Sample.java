package org.ss;

import org.testng.annotations.DataProvider;

public class Sample {
	
	@DataProvider(name="data")
	public Object[][] data(){
		
		Object input[][] = new Object[2][2];
		
		input[0][0]=11;
		input[0][1]=111;
		input[1][0]=999;
		input[1][1]=22;
		return input;
		
	}

}
