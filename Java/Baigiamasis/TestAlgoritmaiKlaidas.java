package Baigiamasis;

public class TestAlgoritmaiKlaidas {

	public static void main(String[] args) {

		int[] arr1 = { 5, 9, 6, 7 };
		int[] arr2 = { 1, 3, 4, 5, 8, 9 };
//		int [] arr1 = {1, 2, 3, 4, 5};
//		int [] arr2 = {1, 2, 3, 4, 5};

		AlgoritmaiKlaidas.print(arr1);
		AlgoritmaiKlaidas.print(arr2);

		AlgoritmaiKlaidas.equals(arr1, arr2);

	}

}
