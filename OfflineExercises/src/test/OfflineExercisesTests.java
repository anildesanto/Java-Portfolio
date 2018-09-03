package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import code.OfflineExercises;

public class OfflineExercisesTests {
	/*
	 * README Do not edit tests, the trainer will be running your code against a
	 * copy of the current tests here So if you edit the tests here, the changes
	 * will not reflect in the trainers version of the tests, and may result in some
	 * tests failing.
	 */
	OfflineExercises oe = new OfflineExercises();

	@Test
	public void multChar() {
		assertEquals("TTThhheee", oe.multChar("The"));
		assertEquals("AAAAAAbbbbbb", oe.multChar("AAbb"));
		assertEquals("HHHiii---TTThhheeerrreee", oe.multChar("Hi-There"));
	}

	@Test
	public void getBert() {
		assertEquals("evilc", oe.getBert("bertclivebert"));
		assertEquals("egdirf", oe.getBert("xxbertfridgebertyy"));
		assertEquals("egdirf", oe.getBert("xxBertfridgebERtyy"));
		assertEquals("", oe.getBert("xxbertyy"));
		assertEquals("", oe.getBert("xxbeRTyy"));
	}

	@Test
	public void evenlySpaced() {
		assertTrue(oe.evenlySpaced(2, 4, 6));
		assertTrue(oe.evenlySpaced(4, 6, 2));
		assertFalse(oe.evenlySpaced(4, 6, 3));
		assertFalse(oe.evenlySpaced(4, 60, 9));
	}

	@Test
	public void nTwice() {
		assertEquals("Helo", oe.nTwice("Hello", 2));
		assertEquals("Choate", oe.nTwice("Chocolate", 3));
		assertEquals("Ce", oe.nTwice("Chocolate", 1));
	}

	@Test
	public void endsDev() {
		assertTrue(oe.endsDev("cooldev"));
		assertTrue(oe.endsDev("endsDev"));
		assertFalse(oe.endsDev("jh"));
		assertFalse(oe.endsDev("coolev"));
		assertFalse(oe.endsDev("oddowiyhy"));
	}

	@Test
	public void stringClean() {
		assertEquals("xp9", oe.stringClean("xxppp9"));
		assertEquals("abcd", oe.stringClean("abbbcdd"));
		assertEquals("Helo", oe.stringClean("Heellooo"));
	}

	@Test
	public void fibonacci() {
		assertEquals(0, oe.fibonacci(0));
		assertEquals(1, oe.fibonacci(1));
		assertEquals(2, oe.fibonacci(2));
		assertEquals(4, oe.fibonacci(3));
		assertEquals(7, oe.fibonacci(4));
		assertEquals(12, oe.fibonacci(5));
		assertEquals(20, oe.fibonacci(6));
		assertEquals(33, oe.fibonacci(7));
	}

	@Test
	public void simpleRecursion() {
		assertEquals(0, oe.simpleRecursion(0));
		assertEquals(4, oe.simpleRecursion(2));
		assertEquals(8, oe.simpleRecursion(4));
		assertEquals(32, oe.simpleRecursion(16));
	}

	@Test
	public void superBlockTest() {
		assertEquals(2, oe.superBlock("hoopplla"));
		assertEquals(3, oe.superBlock("abbCCCddDDDeeEEE"));
		assertEquals(0, oe.superBlock(""));
	}

}
