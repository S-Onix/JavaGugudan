import java.util.Scanner;

public class Gugudan {
	public static void main(String [] args) {
	
//		Scanner scan = new Scanner(System.in);
//		// int Ÿ���� ���� result��� �̸��� ���� �迭 , ũ�Ⱑ 9�� �迭�� ����
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
