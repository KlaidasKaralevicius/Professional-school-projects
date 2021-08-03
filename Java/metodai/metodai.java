package metodai;

import java.util.Arrays;

public class metodai {
	public static void printArray(int[] a) {
		System.out.println(Arrays.toString(a));
	}
	
	public static void printArray(double[] a) {
		System.out.printf(Arrays.toString(a));
	}
	//print array ----------------------------
	
	public static int arraySum (int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	
	public static double arraySum (double[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	//array sum's -------------------------------
	
	public static double average (double [] arr) {
		return arraySum(arr) / arr.length;
	}
	//array average ----------------------------
	
	public static int random(int min, int max) {
		return (int) ((Math.random() * (max - min) + min));
	}
	
	public static double random(double min, double max) {
		double rand = ((Math.random() * (max - min) + min));
		return Math.round(rand * 100.0) / 100.0;
	}
	//creating random number -----------------------------
	
	public static int[] createArray (int n, int min, int max) {
		int [] arr = new int [n];
		
		for (int i = 0; i < arr.length; i++) {
			arr [i] = random(min,max);
		}
		return arr;
	}
	
	public static double[] createArray (int n, double min, double max) {
		double [] arr = new double [n];
		
		for (int i = 0; i < arr.length; i++) {
			arr [i] = random(min,max);
		}
		return arr;
	}
	//creating array ------------------------------------
	
	public static int maxArr(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static int maxArrIndex(int[] arr) {
		int max = arr[0];
		int maxIndex = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				maxIndex = i;
			}
		}
		return maxIndex;
	}
	
	public static double maxArr(double[] arr) {
		double max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static double maxArrIndex(double[] arr) {
		double max = arr[0];
		int maxIndex = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				maxIndex = i;
			}
		}
		return maxIndex;
	}
	//max in array (with and without index) ----------
	
	public static int minArr(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
	
	public static int minArrIndex(int[] arr) {
		int min = arr[0];
		int minIndex = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
				minIndex = i;
			}
		}
		return minIndex;
	}
	
	public static double minArr(double[] arr) {
		double min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
	
	public static double minArrIndex(double[] arr) {
		double min = arr[0];
		int minIndex = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				minIndex = i;
			}
		}
		return minIndex;
	}
	//min in array (with and without index) ----------
}

