public class Gugudan {
	
	public static int[] gugudan(int input) {
		int [] result = new int[9];
		for(int i = 0; i < result.length ; i++) {
			result[i] = input * (i+1); 
		}
		return result;
	}
	public static void print(int [] result) {
		for(int i = 0; i< result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
