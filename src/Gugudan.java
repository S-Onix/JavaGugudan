public class Gugudan {
	
	public static int[][] gugudan(int input) {
		int [][] result = new int[input-1][input];
		for(int i = 2; i < input+1 ; i++) {
			for(int j = 0 ; j < input; j++) {
			result[i-2][j] = i* (j+1); 
			}
		}
		return result;
	}
	
	public static int[][] gugudan(int number1, int number2) {
		int [][] result = new int[number1-1][number2];
		for(int i = 2; i < number1 +1 ; i++) {
			for(int j = 0 ; j < number2; j++) {
			result[i-2][j] = i* (j+1); 
			}
		}
		return result;
	}
	
	public static void print(int [][] result) {
		for(int i = 0; i< result.length; i++) {
			for(int j = 0; j < result[i].length; j++)
			System.out.println(result[i][j]);
		}
	}
}
