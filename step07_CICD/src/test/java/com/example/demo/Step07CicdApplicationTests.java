package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
// 또는
import static org.junit.jupiter.api.Assertions.assertEquals; // JUnit 5
@SpringBootTest
class Step07CicdApplicationTests {
	@Test
	public void testAddition() {
		int result = 12 + 13;
		System.out.println("****비교 전****");
		
		assertEquals(25, result); // 성공: 5 == 5
		System.out.println("****비교 후****");
	}
}
