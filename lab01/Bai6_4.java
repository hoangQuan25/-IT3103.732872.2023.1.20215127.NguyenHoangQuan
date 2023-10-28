package lab01;

import java.util.Scanner;

public class Bai6_4 {

    public static void main(String[] args) { // bắt đầu chương trình
    	// khởi tạo scanner
        Scanner scanner = new Scanner(System.in);

        // khởi tạo string tháng
        String inputMonth;
        do {
        	// nhập tháng 
            System.out.print("Nhap thang: ");
            inputMonth = scanner.nextLine().toLowerCase();
        } while (!isValidMonth(inputMonth)); // nếu không hợp lệ nhập lại

        // khởi tạo int năm
        int inputYear;
        do {
        	// nhập năm
            System.out.print("Nhap nam: ");
            while (!scanner.hasNextInt()) { // không hợp lệ thì nhập lại
                System.out.println("Nam khong hop le. Vui long nhap lai");
                scanner.next(); 
            }
            inputYear = scanner.nextInt();
        } while (inputYear < 0); // check xem năm có âm không

        // đóng scanner
        scanner.close();

        // đọc số ngày trong tháng từ dữ liệu vừa nhập
        int daysInMonth = getDaysInMonth(inputMonth, inputYear);

        // hiển thị kết quả
        System.out.println("So ngay trong thang " + inputMonth + " " + inputYear + ": " + daysInMonth + " ngay");
    }

    // hàm kiểm tra tháng có hợp lệ không
    private static boolean isValidMonth(String month) {
    	
    	// các string hợp lệ cho tháng
        String[] validMonths = {"january", "jan.", "jan", "1", "february", "feb.", "feb", "2", "march", "mar.", "mar", "3",
                "april", "apr.", "apr", "4", "may", "5", "june", "jun", "6", "july", "jul", "7", "august", "aug.", "aug",
                "8", "september", "sep.", "sep", "9", "october", "oct.", "oct", "10", "november", "nov.", "nov", "11",
                "december", "dec.", "dec", "12"};
        
        // nếu string tháng vừa nhập vào nằm trong validMonths thì hợp lệ
        for (String validMonth : validMonths) {
            if (month.equals(validMonth)) {
                return true;
            }
        }

        // in ra thông điệp yêu cầu nhập lại
        System.out.println("Thang khong hop le. Vui long nhap lai.");
        return false;
    }

    // hàm đọc số ngày từ tháng và năm vừa nhập
    private static int getDaysInMonth(String month, int year) {
    	
    	// các trường hợp số ngày của tháng
        switch (month) {
            case "january", "jan.", "jan", "1", "march", "mar.", "mar", "3",
            "may", "5", "july", "jul", "7", "august", "aug.", "aug",
            "8", "october", "oct.", "oct", "10", "december", "dec.", "dec", "12":
                return 31;
            case "april", "apr.", "apr", "4", "june", "jun", "6", "september", 
            "sep.", "sep", "9", "november", "nov.", "nov", "11":
                return 30;
            case "february", "feb.", "feb", "2":
                return isLeapYear(year) ? 29 : 28; // nếu là năm nhuận thì tháng 2 có 29 ngày
            default:
                return -1; // tháng vừa nhập không hợp lệ
        }
    }

    // hàm kiểm tra năm nhuận
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

