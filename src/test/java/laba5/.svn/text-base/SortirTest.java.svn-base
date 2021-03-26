package laba5;
	import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.AfterClass;
	import org.junit.BeforeClass;
	import org.junit.Test;

	import Laba2.Sortir;
	import Laba2.RandomMassiv;

	public class SortirTest {
		static Integer[] mass;
		@BeforeClass
		public static void setUpBeforeClass() throws Exception {
			mass = Sortir.BubbleS(RandomMassiv.randomMass());
		}

		@AfterClass
		public static void tearDownAfterClass() throws Exception {
		}

		@Test
		public void test() {
			boolean correct = true;
			for (int i = 0; i < mass.length -1 ; i++) {
				if (mass[i] > mass[i + 1]) {
					correct = false;
				}
			}
			assertTrue(correct);
			System.out.println(Arrays.deepToString(mass));
		}

	}
