package lab01;
import javax.swing.JOptionPane;

public class Bai6_1 {
    public static void main(String[] args) { // bắt đầu chương trình
    	// in ra thông báo
        int option = JOptionPane.showConfirmDialog(null, "Do you want to change to the first class ticket?");
        
        // in ra option yes/no và thông báo mình vừa chọn gì
        JOptionPane.showMessageDialog(null, "You've chosen: " + (option == JOptionPane.YES_OPTION?"YES":"NO"));
        
        // kết thúc chương trình
        System.exit(0);
    }
}
