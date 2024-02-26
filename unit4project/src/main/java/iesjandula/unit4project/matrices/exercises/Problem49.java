package iesjandula.unit4project.matrices.exercises;

public class Problem49 {

	public static void main(String[] args) {

		int[][] arrayInt = {{1,2,3},
							{4,5,6},
							{7,8,9}
		
				
		};
		
	for (int i = 0; i < arrayInt.length; i++) {
		
		for ( int j = 0; j < arrayInt[i].length; j++) {
			
			System.out.format("%1$4d %2$s", arrayInt[i][j], "|");
		}
		
		System.out.println();
		
	}
		
	}

}
