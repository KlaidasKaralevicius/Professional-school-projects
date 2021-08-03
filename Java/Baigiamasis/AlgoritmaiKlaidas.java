package Baigiamasis;


public class AlgoritmaiKlaidas {

	// ispausdinti masyva
	public static void print(int[] array) {

		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			if (i < array.length - 1) {
				System.out.print(array[i] + ", ");
			}
			if (i == array.length - 1) {
				System.out.print(array[i] + "]");
			}
		}
		System.out.println();
	}

	// sulyginti masyvus
	public static boolean equals(int[] array1, int[] array2) {
		boolean equal = false;
		for (int i = 0; i < array1.length; i++) {
			if (array1.length != array2.length) {
				break;
			} else if (array1[i] != array2[i]) {
				equal = false;
			} else {
				equal = true;
			}
		}
		System.out.println(equal);
		return equal;
	}
}
