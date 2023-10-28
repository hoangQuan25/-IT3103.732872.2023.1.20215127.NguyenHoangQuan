package lab01;
import java.util.Arrays;

public class Bai6_5 {
	public static void main(String[] args) {
		// khởi tạo mảng
		int[] numbers = new int[] {3, 4, 6, 1, 8, 2, 11, 19, 12, 7, 5, 10};
		// khởi tạo tổng
		int sum = 0;
		
		// sắp xếp mảng
		Arrays.sort(numbers);
		
		// tính tổng các phần tử trong mảng
		for (int number : numbers) {
			sum += number;
		}
		
		// hiển thị mảng đã sắp xếp
		System.out.println("Mang da sap xep: " + Arrays.toString(numbers));
		// hiển thị giá trị trung bình
		System.out.println("Gia tri trung binh cua mang la: " + (double) sum / numbers.length);
	}
		
}
