package lab01;
import java.util.Arrays;

public class Bai6_5 {
	public static void main(String[] args) {
		int[] numbers = new int[] {3, 4, 6, 1, 8, 2, 11, 19, 12, 7, 5, 10};
		int sum = 0;
		
		// sap xep mang
		Arrays.sort(numbers);
		
		// tinh tong cac phan tu trong mang
		for (int number : numbers) {
			sum += number;
		}
		
		// hien thi ket qua
		System.out.println("Mang da sap xep: " + Arrays.toString(numbers));
		System.out.println("Gia tri trung binh cua mang la: " + (double) sum / numbers.length);
	}
		
}
