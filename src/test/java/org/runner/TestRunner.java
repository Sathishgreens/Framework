package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Lenovo\\eclipse-workspace\\LanuageDetails\\Framework\\Feature\\Featute.feature",
glue="com.stepdefinition")

public class TestRunner {
	
	

}
