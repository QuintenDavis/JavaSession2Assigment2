
public class JavaSession2Assignment2 {

	public static void main(String[] args) {
		
		int max = 100;
		
		System.out.println("Generate Prime numbers between 1 and " + max);
		for (int i = 2; i<max; i++) {
			boolean isPrimeNumber = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrimeNumber = false;
					break;
					
				}
			}
			
			if (isPrimeNumber) {
				System.out.print(i + " ");
			}
		}

	}

}
