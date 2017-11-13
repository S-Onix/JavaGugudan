import java.util.Scanner;

public class Gugudan {
	public static void main(String [] args) {
	
		boolean flag = true;
		while(flag) {
			System.out.println("구구단 출력할 단은?(0 입력시 종료) ");
			Scanner scan = new Scanner(System.in);
			int input = scan.nextInt();
			if(input >0 && input <10) {
				for(int i = 1; i < 10; i++) {
					System.out.println(input * i);
				}
			}else if(input == 0){
				flag = false;
			}
			else System.out.println("2이상 9 이하를 입력해주세요");
			}
		}
	
}
