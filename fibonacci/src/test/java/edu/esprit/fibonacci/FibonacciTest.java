package edu.esprit.fibonacci;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FibonacciTest {

	Fibonacci fibonacci;
	@Before
	public void init(){
		fibonacci = new Fibonacci();
	}
	
	@Test
	public void itShouldReturnZeroWhenZeroIn() {
		assertEquals(0, fibonacci.fibo(0));
	}
	
	@Test
	public void itShouldReturnOneWhenOneIn() {
		assertEquals(1, fibonacci.fibo(1));
	}
	
	@Test
	public void itShouldReturnOneWhenTwoIn() {
		assertEquals(1, fibonacci.fibo(2));
	}
	
	@Test
	public void itShouldReturn13When7In() {
		assertEquals(13, fibonacci.fibo(7));
	}

}
