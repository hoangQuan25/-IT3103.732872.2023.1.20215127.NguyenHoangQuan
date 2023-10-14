package lab01;

import java.util.Scanner;

public class Bai6_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // nhap vao chieu cao cua tam giac
        System.out.print("Enter the height of the triangle: ");
        int n = scanner.nextInt();
        scanner.close();

        // xay dung ham de in ra tam giac
        printTriangle(n);
    }

    private static void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            // in ra khoang trong truoc moi dong
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // in ra cac ngoi sao tren moi dong
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // xuong dong tiep theo
            System.out.println();
        }
    }
}

