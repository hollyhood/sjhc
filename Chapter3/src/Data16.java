import java.util.Scanner;

public class Data16 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num1;
		float num2;
		
		System.out.print("첫번째 정수 입력 : ");
		num1 = scn.nextInt();
		
		System.out.print("두번째 정수 입력 : ");
		num2 = scn.nextFloat();
		
		System.out.printf("%d + %3.1f = %4.1f\n",  num1, num2,num1+num2);
		System.out.printf("%d / %3.1f = %5.0f", num1,num2, Math.floor(num1/num2));
					     
	}

}
