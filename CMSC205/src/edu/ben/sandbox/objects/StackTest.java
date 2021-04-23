package edu.ben.sandbox.objects;

import org.junit.Test;

import student.TestCase;

public class StackTest extends TestCase {

	@Test
	public void testMain()
    {
        setSystemIn("Joe\n");  // Don't forget the newline!
        Stack.main(null);
        assertEquals("Enter your name: Hello, Joe!\n",
            systemOut().getHistory());
    }
}
