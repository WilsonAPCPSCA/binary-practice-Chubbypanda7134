package apCompSci;
import java.util.Scanner;

public class BinaryConvertion {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		int num;
		do {
			System.out.print("Enter a non-negative number");
			num = in.nextInt();
		}while(num < 0);
		
		convertBinary(num);
		
	}
	public static void convertBinary(int num) {
		String binary = "";
		int max = 0;
		if(num == 0) {
			binary += "0";
		}
		while(Math.pow(2, max) <= num) {
			max++;
		}
		max--;
		for(int i = max; i >= 0; i--) {
			if(Math.pow(2, i) <= num) {
				binary += "1";
				num -= Math.pow(2, i);
			}
			else {
				binary += "0";
			}
		}
		System.out.println(binary);
	}
}
