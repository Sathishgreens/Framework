package org.junitpractice;

import java.util.List;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class RunnerClass  {
	public static void main(String[] args) {
		
		Result runClasses = JUnitCore.runClasses(SuiteExecution.class);
		
		List<Failure> failures = runClasses.getFailures();
		for (Failure failure : failures) {
			System.out.println(failure.getMessage());
		}
		boolean wasSuccessful = runClasses.wasSuccessful();
		System.out.println(wasSuccessful);
		
	}

}
