package lab01;
import java.util.Scanner;

public class Bai6_2 {
	public static void main(String[] args) { // bắt đầu chương trình
		// khởi tạo scanner
		Scanner keyboard = new Scanner(System.in);
		
		// nhập vào strName
		System.out.println("What's your name?");
		String strName = keyboard.nextLine();
		
		// nhập vào iAge
		System.out.println("How old are you?");
		int iAge = keyboard.nextInt();
		
		// nhập vào dHeight
		System.out.println("How tall are you (m)?");
		double dHeight = keyboard.nextDouble();
		
		// in ra thông điệp
		System.out.println("Mrs/Ms. " + strName + ", " + iAge + "years old. "
				+ "Your height is " + dHeight + ".");
		
		// đóng scanner lại
		keyboard.close();
	}
}
