package lab01;

import javax.swing.JOptionPane;

public class HelloNameDialog {
    public static void main(String[] args) {
        String result;
        result = JOptionPane.showInputDialog("Nguyen Hoang Quan 5127 - please enter your name");
        JOptionPane.showMessageDialog(null, "Toi la Nguyen Hoang Quan, Hi" + result + "!");
        System.exit(0);
    }
}
