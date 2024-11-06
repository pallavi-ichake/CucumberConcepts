package Ruuner;

import org.junit.runner.RunWith;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
features= {"C:\\Users\\danga\\eclipse-workspace\\CucmberConcepts\\src\\test\\java\\Features\\tags.feature"},
		 // "C:\\Users\\danga\\eclipse-workspace\\CucmberConcepts\\src\\test\\java\\Features\\keyswods.feature"}, 
           //"C:\\Users\\danga\\eclipse-workspace\\CucmberConcepts\\src\\test\\java\\Features\\DataDrivenExample.feature"},
           
glue="StepDefination",
dryRun = false,
monochrome = true,
tags = "@sanity or @smoke",
plugin = {"pretty","html:target/cucumber-reports/tagsreports.html"}
		  //"pretty","html:target/cucumber-reports/reports1.xml",
		// "pretty","html:target/cucumber-reports/reports2.json"}
)
public class Run extends AbstractTestNGCucumberTests{
}