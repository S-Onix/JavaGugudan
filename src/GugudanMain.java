import java.util.Scanner;

public class GugudanMain {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		int number = scan.nextInt();
		
		int [][]result = Gugudan.gugudan(number);
		Gugudan.print(result);
		
		//String type data
		String rawValue = scan2.nextLine();
		String []spliteValue = rawValue.split(",");
		
		
		//������ ���ڿ��� ������ ���ο� int ������ ����
		int number1 = Integer.parseInt(spliteValue[0]);
		int number2 = Integer.parseInt(spliteValue[1]);
		
		int [][] result2 = Gugudan.gugudan(number1, number2);
		Gugudan.print(result2);
		
	}
	
}
