package lab01;
import javax.swing.JOptionPane;

public class ShowTwoNumbers {
    public static void main(String[] args) {
        String strNum1, strNum2;
        String strNotification = "Nguyen Hoang Quan - 20215127 - You've just entered: ";

        strNum1 = JOptionPane.showInputDialog(null, "Nguyen Hoang Quan 20215127 - Please input the first number: ", "Nguyen Hoang Quan 20215127 - Input the first number", JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum1 + " and ";
        strNum2 = JOptionPane.showInputDialog(null, "Nguyen Hoang Quan 20215127 - Please input the second number: ", "Nguyen Hoang Quan 20215127 - Input the second number", JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum2;

        JOptionPane.showMessageDialog(null, strNotification, "Nguyen Hoang Quan 20215127 - Show two numbers", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
