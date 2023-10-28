package lab01;
import javax.swing.JOptionPane;

public class Bai2_2_5 {
    public static void main(String[] args) { // bắt đầu chương trình
        
        // nhập vào giá trị num1 qua input dialog
        String input1 = JOptionPane.showInputDialog("Enter the first double number:");
        double num1 = Double.parseDouble(input1);

        // nhập vào giá trị num2 qua input dialog
        String input2 = JOptionPane.showInputDialog("Enter the second double number:");
        double num2 = Double.parseDouble(input2);

        // tính và in ra tổng
        double sum = num1 + num2;
        JOptionPane.showMessageDialog(null, "Sum: " + sum);

        // tính và in ra hiệu
        double difference = num1 - num2;
        JOptionPane.showMessageDialog(null, "Difference: " + difference);

        // tính và in ra tích
        double product = num1 * num2;
        JOptionPane.showMessageDialog(null, "Product: " + product);

        // Kiem tra neu so thu 2 bang 0 truoc khi thuc hien phep chia
        if (num2 != 0) {
            
            // tính và in ra thương
            double quotient = num1 / num2;
            JOptionPane.showMessageDialog(null, "Quotient: " + quotient);
        } else {
            // báo lỗi nếu số chia = 0
            JOptionPane.showMessageDialog(null, "Cannot divide by zero. Quotient is undefined.");
        }
    }
}
