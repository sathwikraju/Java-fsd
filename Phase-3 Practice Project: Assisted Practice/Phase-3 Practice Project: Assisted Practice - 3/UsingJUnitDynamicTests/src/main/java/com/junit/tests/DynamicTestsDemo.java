package com.junit.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public class DynamicTestsDemo {

	@TestFactory
	@DisplayName("Dynamic Tests")
	Collection<DynamicTest> dynamicTests() {
		return Arrays.asList(dynamicTest("Simple dynamic test", () -> {
			assertTrue(true);
			System.out.println("Dynamic Test: Simple dynamic test executed.");
			}),
				dynamicTest("Test with assertions", () -> {
					int result = Calculator.add(5, 10);
					assertEquals(15, result);
					System.out.println("Dynamic Test: Test with assertions executed.");
				}),
				dynamicTest("Exception Test", () -> {
					assertThrows(RuntimeException.class, () -> {
						throw new RuntimeException("Exception Example");
					});
					System.out.println("Dynamic Test: Exception Test executed.");
				}), 
				dynamicTest("Another dynamic test", () -> {
					assertTrue(true);
					System.out.println("Dynamic Test: Another dynamic test executed.");
				}));
		}
	
	static class Calculator {
		static int add(int a, int b) {
			return a + b;
		}
	}
}
