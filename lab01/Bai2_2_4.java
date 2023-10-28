package lab01;
import javax.swing.JOptionPane;

public class Bai2_2_4 {
    public static void main(String[] args) { // bắt đầu chương trình
        // khởi tạo 2 biến string để nhập vào
        String strNum1, strNum2;
        // khởi tạo biến string thứ 3
        String strNotification = "Nguyen Hoang Quan - 20215127 - You've just entered: ";

        // nhập vào string 1
        strNum1 = JOptionPane.showInputDialog(null, "Nguyen Hoang Quan 20215127 - Please input the first number: ", "Nguyen Hoang Quan 20215127 - Input the first number", JOptionPane.INFORMATION_MESSAGE);

        // cập nhật string 3
        strNotification += strNum1 + " and ";

        // nhập vào string 2
        strNum2 = JOptionPane.showInputDialog(null, "Nguyen Hoang Quan 20215127 - Please input the second number: ", "Nguyen Hoang Quan 20215127 - Input the second number", JOptionPane.INFORMATION_MESSAGE);

        // cập nhật string 3
        strNotification += strNum2;

        // in ra thông điệp
        JOptionPane.showMessageDialog(null, strNotification, "Nguyen Hoang Quan 20215127 - Show two numbers", JOptionPane.INFORMATION_MESSAGE);
        // thoát chương trình
        System.exit(0);
    }
}
