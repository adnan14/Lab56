
public class PrimeNumber {
	
	public static void main(String[] args) {
			
	// getTime()
	// startDate = getTime();
	
	countPrimes(5, 50);
	
	}
	
	public static int countPrimes(int a, int b) {
		
		boolean prime = false;
		int totalPrimes = 0;
		int kontrolni = 0;
		
		for (int i = a; i < b; i++) {		
			for (int j = 2; j < i ; j++) {
				if (i % j == 0) {
					prime = true;
					break;
				}
			}
			
			if (prime == true) {
				System.out.println("Broj " + i + " NIJE prost broj");
			} else {
				System.out.println("Broj " + i + " JESTE prost broj.");
			}
			
			prime = false;
		}		
		return totalPrimes;
	}
}
