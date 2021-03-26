package laba5;

import static org.junit.Assert.*;

import org.junit.Test;

import Laba2.Random;

public class RandTest {

	//Проверка на диапазон сгенерированного числа
	@Test
	public void testRand() {
	Random rnd = new Random();
	int num = rnd.rand();
	int cel = num % 1;
	assertTrue(num >= 900 && num <=1200 && cel == 0);
	System.out.println(num);
	}
}
