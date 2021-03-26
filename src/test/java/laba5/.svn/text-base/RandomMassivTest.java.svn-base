package laba5;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Test;

import Laba2.RandomMassiv;

public class RandomMassivTest {
static Integer [] mass;
@BeforeClass
public static void setUpBeforeClass() throws Exception {
mass = RandomMassiv.randomMass();
}

@Test
public void test() {
boolean b = false;
if (mass.length == 15) {
b = true;
}
for (int i=0; i<mass.length; i++) {
if (mass[i]==null) {
b = false;
}

}
assertTrue(b);
System.out.println(Arrays.deepToString(mass));
}


}