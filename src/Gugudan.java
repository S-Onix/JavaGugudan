import java.util.Scanner;

public class Gugudan {
	public static void main(String [] args) {
	
		boolean flag = true;
		while(flag) {
			System.out.println("������ ����� ����?(0 �Է½� ����) ");
			Scanner scan = new Scanner(System.in);
			int input = scan.nextInt();
			if(input >0 && input <10) {
				for(int i = 1; i < 10; i++) {
					System.out.println(input * i);
				}
			}else if(input == 0){
				flag = false;
			}
			else System.out.println("2�̻� 9 ���ϸ� �Է����ּ���");
			}
		}
	
}
