package lab01;

import javax.swing.JOptionPane;

public class Bai2_2_3 {
    public static void main(String[] args) { // bắt đầu chương trình
        // khởi tạo biến result
        String result;

        // nhập vào giá trị cho result
        result = JOptionPane.showInputDialog("Nguyen Hoang Quan 5127 - please enter your name");

        // in ra thông điệp
        JOptionPane.showMessageDialog(null, "Toi la Nguyen Hoang Quan, Hi" + result + "!");

        // thoát chương trình
        System.exit(0);
    }
}
