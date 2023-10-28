package lab01;

public class Bai6_6 {

    public static void main(String[] args) {
        // khởi tạo ma trận 1
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // khởi tạo ma trận 2
        int[][] matrix2 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        // kiem tra xem 2 ma tran co cung kich thuoc
        if (areMatricesSameSize(matrix1, matrix2)) {
            // cộng 2 ma trận
            int[][] resultMatrix = addMatrices(matrix1, matrix2);

            // in ra ma trận 1
            System.out.println("Ma tran 1:");
            printMatrix(matrix1);

            // in ra ma trận 2
            System.out.println("\nMa tran 2:");
            printMatrix(matrix2);

            // hiển thị kết quả
            System.out.println("\nKet qua cong 2 ma tran:");
            printMatrix(resultMatrix);
        } else {

            // 2 ma trận ko cùng kích thước
            System.out.println("Ma tran khong cung kich thuoc nen khong cong duoc!");
        }
    }

    // hàm kiểm tra xem 2 ma trận có cùng kích thước
    private static boolean areMatricesSameSize(int[][] matrix1, int[][] matrix2) {
        return matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length;
    }

    // hàm cộng 2 ma trận
    private static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        // số hàng
        int rows = matrix1.length;
        // số cột
        int columns = matrix1[0].length;

        // đại diện kích thước ma trận
        int[][] resultMatrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return resultMatrix;
    }

    // hàm in ra ma trận
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
