package com.qa.blackjack.BlackJackTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JackTest 
{
	@Test
	public void check()
	{
		BlackJack bj = new BlackJack();
		assertEquals(3,bj.blackJack(1, 3));
		assertEquals(3,bj.blackJack(0, 3));
		assertEquals(0,bj.blackJack(22, 22));
		assertEquals(20,bj.blackJack(20, 22));
	}
}
