package com.junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

@DisplayName("JUnit 5 Conditional Tests Example")
public class ConditionalTestExecution {

	@Test
	@EnabledOnOs(OS.WINDOWS) // This test will only run on Windows OS
	public void testOnWindows() {
		System.out.println("This test runs only on Windows OS.");
	}

	@Test
	@EnabledOnOs(OS.LINUX) // This test will only run on Linux OS
	public void testOnLinux() {
		System.out.println("This test runs only on Linux OS.");
	}

	@Test // This test will run on any OS
	public void testOnAllOS() {
		System.out.println("This test runs on all operating systems.");
	}

}
