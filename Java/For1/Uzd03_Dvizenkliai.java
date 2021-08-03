package For1;

public class Uzd03_Dvizenkliai {

	public static void main(String[] args) {

		int i = 10;
		
		while (i < 100) {
			if (i % 2 == 0) {
				System.out.print(i + " ");	
			}
			i++;
		}
		
		System.out.println("");
		
		for (int j = 10; j < 100; j++) {
			if (j % 2 == 0) {
				System.out.print(j + " ");	
			}
		}
		
	}

}
