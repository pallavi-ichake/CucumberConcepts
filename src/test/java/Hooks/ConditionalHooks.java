package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class ConditionalHooks 
{
	@Before("@sanity")
	public static void beforeHooks()
	{
		System.out.println("Run before sanity methods");
	}
	
	@Before("@regression")
	public static void AfterHooks()
	{
		System.out.println("Run before regression methods");
	}
	

}
