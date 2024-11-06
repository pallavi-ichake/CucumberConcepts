package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class StepsHooks 
{
	@BeforeStep
	public static void beforeSteps()
	{
		System.out.println("Run before stpes methods");
	}
	
	@BeforeStep
	public static void afterSteps()
	{
		System.out.println("Run before steps methods");
	}
	

}
