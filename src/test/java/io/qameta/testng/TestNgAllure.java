package io.qameta.testng;

import org.testng.annotations.Test;

import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;


public class TestNgAllure {
	
	@Test
	@Feature("UserFree Functionality")
	@Severity(SeverityLevel.CRITICAL)
	
	public void testoutput(){
		testAllure();
	}
	@Step
	public void testAllure(){
		
	}

}
