package hust.soict.hedspi.aims.store;

import java.util.Scanner;
import javax.swing.JOptionPane;
import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.exception.DuplicateMediaException;
import hust.soict.hedspi.aims.exception.LimitExceededException;
import hust.soict.hedspi.aims.screen.CartScreen;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.screen.StoreScreen;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.Track;
import hust.soict.hedspi.aims.media.Book;


public class Aims {

	private static Scanner sc;
	private static Store store;
	private static Cart cart;
	private static StoreScreen storeScreen;
	private static CartScreen cartScreen;

	public static void main(String[] args) {
		store = new Store();
		cart = new Cart();
		Media[] sampleMedia = new Media[] {
				new DigitalVideoDisc("Путешествие к звездам", "Sci-fi", "William Parker", 120, 35.7f),
				new DigitalVideoDisc("Chuchotements d'Amour", "Romance", "Eva Thompson", 105, 42.5f),
				new DigitalVideoDisc("Темные тайны", "Horror", "Robert Smith", 88, 52.1f),
				new CompactDisc("Любовные Биты", "Pop", "Melissa Allen", "Brian Turner", 64.8f) {{
				    addTrack(new Track("Мечтательные Ночи", 6));
				    addTrack(new Track("Искренние Мелодии", 4));
				}},
				new CompactDisc("Электрическая Греза", "Electronic", "Catherine Simmons", "David Matthews", 78.5f) {{
				    addTrack(new Track("Синтезаторная Мечта", 5));
				    addTrack(new Track("Цифровой Побег", 3));
				}},
				new Book("Туманные Горы", "Mystery", 30.5f) {{
				    addAuthor("David Johnson");
				}},
				new Book("Romance Éternelle", "Romance", 45.6f) {{
				    addAuthor("Olivia Miller");
				    addAuthor("Christopher Davis");
				}},
				new CompactDisc("Sensations Pop", "Pop", "STEREO", "Groupe Mélodie", 25.5f) {{
				    addTrack(new Track("Hymne Pop", 2));
				    addTrack(new Track("Vibes Estivales", 4));
				}},
				new Book("Rêves Dévoilés", "Oneshot", 59.99f) {{
				    addAuthor("Luna Taylor");
				}}
		};

		try {
	        for (Media m : sampleMedia) {
	            store.addMedia(m);
	        }
	    } catch (DuplicateMediaException e) {
	        String errorMessage = "Error adding media to store: Duplicate Media - " + e.getMessage();
	        JOptionPane.showMessageDialog(null, errorMessage, "Error", JOptionPane.ERROR_MESSAGE);
	    } catch (LimitExceededException e) {
	        String errorMessage = "Error adding media to store: Limit Exceeded - " + e.getMessage();
	        JOptionPane.showMessageDialog(null, errorMessage, "Error", JOptionPane.ERROR_MESSAGE);
	    } catch (Exception e) {
	        String errorMessage = "Error adding media to store: " + e.getMessage();
	        JOptionPane.showMessageDialog(null, errorMessage, "Error", JOptionPane.ERROR_MESSAGE);
	    }


        openStoreScreen();
	}
	

	public static Store getStore() {
		return store;
	}

	public static Cart getCart() {
		return cart;
	}

	public static StoreScreen getStoreScreen() {
		return storeScreen;
	}

	public static CartScreen getCartScreen() {
		return cartScreen;
	}
	
	public static void openStoreScreen() {
        try {
            storeScreen = new StoreScreen(store);
        } catch (Exception e) {
            System.err.println("Error opening store screen: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void closeStoreScreen() {
        try {
            if (storeScreen != null) {
                storeScreen.setVisible(false);
                storeScreen = null;
            }
        } catch (Exception e) {
            System.err.println("Error closing store screen: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void openCartScreen() {
        try {
            cartScreen = new CartScreen(cart);
        } catch (Exception e) {
            System.err.println("Error opening cart screen: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void closeCartScreen() {
        try {
            if (cartScreen != null) {
                cartScreen.setVisible(false);
                cartScreen = null;
            }
        } catch (Exception e) {
            System.err.println("Error closing cart screen: " + e.getMessage());
            e.printStackTrace();
        }
    }
}