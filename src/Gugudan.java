import java.util.Scanner;

public class Gugudan {
	public static void main(String [] args) {
	
//		Scanner scan = new Scanner(System.in);
//		// int 타입을 가진 result라는 이름을 가진 배열 , 크기가 9인 배열을 생성
		int [] result = new int[9];
//		int input = scan.nextInt();
//		
		for(int j = 2; j < 10; j++) {
			for(int i = 0 ; i < result.length; i++) {
				result[i] = j *(i+1);
				System.out.println(result[i]);
			}
		}
		
		
		
	}
	
}
