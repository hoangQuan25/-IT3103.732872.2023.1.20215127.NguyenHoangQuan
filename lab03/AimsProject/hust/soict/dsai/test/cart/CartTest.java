package lab03.AimsProject.hust.soict.dsai.test.cart;

import lab03.AimsProject.hust.soict.dsai.aims.disc.DigitalVideoDisc;
import lab03.AimsProject.hust.soict.dsai.aims.cart.Cart;
public class CartTest {
    public static void main(String[] args) {
        //create new cart
        Cart cart = new Cart();
        
        //create new dvd objects and add them to the new cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        cart.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        cart.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        cart.addDigitalVideoDisc(dvd3);

        DigitalVideoDisc dvd4 = new DigitalVideoDisc("The Matrix", "Science Fiction", 25.65f);
        cart.addDigitalVideoDisc(dvd4);

        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Inception", "Science Fiction", 12.54f);
        cart.addDigitalVideoDisc(dvd5);

        DigitalVideoDisc dvd6 = new DigitalVideoDisc("Titanic", "Romantic", 15.25f);
        cart.addDigitalVideoDisc(dvd6);

        //test the print method
        cart.printCart();

        // search by id
        cart.searchByID(2);
        cart.searchByID(5);

        // search by title
        cart.searchByTitle("the matrix");
        cart.searchByTitle("titanic");

    }
}
