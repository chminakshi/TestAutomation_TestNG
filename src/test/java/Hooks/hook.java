package Hooks;


import DriverThreadLocal.DriverThreadLocalClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hook {

	
	
	@Before
	public void setUp()
	{
		
	}

	@After
	public void quitdriver()
	{
		DriverThreadLocalClass.quitdriver();
		DriverThreadLocalClass.flushtest();
	}
}
