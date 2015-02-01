
public class MatrixAdd {
	
	public static void main(String[] args) {
			
	int [][] matrixA = new int [][] {{5, 7, 2}, {4, 6, 6}, {3, 4, 1}};
	int [][] matrixB = new int [][] {{3, 1, 2}, {1, 2, 2}, {2, 5, 8}};
	
	addMatrix(matrixA);
	
	for (int i = 0; i < matrixB.length; i++) {
		for (int j = 0; j < matrixB.length; j++) {
			
			System.out.print(matrixB[i][j] + " ");	
		}
		System.out.println();
	}
	
	System.out.println();	
	
	for (int i = 0; i < matrixB.length; i++) {
		for (int j = 0; j < matrixB.length; j++) {
			
			System.out.print(matrixA[i][j] + matrixB[i][j] + " ");	
		}
		System.out.println();
	}
	
	
	
	}

	public static void addMatrix(int [][] matrixA) {
		
		for (int i = 0; i < matrixA.length; i++) {
			for (int j = 0; j < matrixA.length; j++) {
				
				System.out.print(matrixA[i][j] + " ");	
			}
			System.out.println();
		}
		
		System.out.println();
		
	}
	
}
