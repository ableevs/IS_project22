package Laba2;

public class Sortir {
	public static Integer[] BubbleS(Integer[] mass) {
		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass.length; j++) {
				if (mass[j] > mass[i]) {
					int element1 = mass[j];
					int element2 = mass[i];
					mass[j] = element2;
					mass[i] = element1;
				}
			}
		}
		return mass;
	}
}

