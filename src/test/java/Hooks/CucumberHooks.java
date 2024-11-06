package Hooks;

import io.cucumber.java.*;

public class CucumberHooks 
{
	@Before
	public static void beforeHooks()
	{
		System.out.println("Run before start methods");
	}
	
	@After
	public static void AfterHooks()
	{
		System.out.println("Run before start methods");
	}
	
	

}
