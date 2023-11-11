package lab03;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    
    // khởi tạo giỏ hàng
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    // khởi tạo số đĩa đã thêm vào giỏ
    private int qtyOrdered;
    
    // hàm thêm đĩa vào giỏ hàng
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
    	// nếu giỏ chưa đầy thì thêm đĩa vào
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added.");
        } else {
        	// giỏ đầy thì không thêm
            System.out.println("The cart is almost full. Cannot add more discs.");
        }
    }

    // New method with a different type of parameter (array of DVDs)
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        // Add a list of DVDs to the current cart
        for (DigitalVideoDisc dvd : dvdList) {
            addDigitalVideoDisc(dvd); // Reuse the existing method
        }
    }

    // // Another method allowing an arbitrary number of DVD arguments
    // public void addDigitalVideoDisc(DigitalVideoDisc... dvdArray) {
    //     // Add an arbitrary number of DVDs to the current cart
    //     for (DigitalVideoDisc dvd : dvdArray) {
    //         addDigitalVideoDisc(dvd); // Reuse the existing method
    //     }
    // }

    // Overloading by differing the number of parameters
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        // Add two DVDs to the current cart
        addDigitalVideoDisc(dvd1);
        addDigitalVideoDisc(dvd2);
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
    	// khởi tạo biến found 
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
        	// tìm thấy đĩa cần xóa trong giỏ hàng
            if (itemsOrdered[i].equals(disc)) {
                // nâng chỉ số của các đĩa đứng sau đĩa vừa tìm thấy lên 1
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                // xóa đĩa ở vị trí đó
                itemsOrdered[qtyOrdered - 1] = null; // Set the last element to null
                qtyOrdered--;
                found = true;
                System.out.println("The disc has been removed.");
                break; // thoát chương trình khi đã tìm và xóa đĩa
            }
        }
        // không tìm thấy đĩa
        if (!found) {
            System.out.println("Disc not found in the cart. Cannot remove.");
        }
    }
    
    // hàm tính tổng tiền
    public float totalCost() {
    	// khởi tạo biến total
        float total = 0.0f;
        // lặp qua giỏ hàng để cộng các cost lại
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }
    
    // hàm in thông tin tất cả các đĩa trong giỏ hàng (để kiểm tra sau khi xóa đĩa khỏi giỏ)
    public String toString() {
    	String result = "";
        for (int i = 0; i < qtyOrdered; i++) {
            result += itemsOrdered[i].toString();
            result += "\n";
        }
        return result;
    }

    
}

