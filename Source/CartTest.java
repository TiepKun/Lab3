public class CartTest {
    public static void main(String[] args) {
        // Create a new cart
        Cart cart = new Cart();

        // Create new DVD objects and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        cart.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        cart.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        cart.addDigitalVideoDisc(dvd3);

        // Test the print method
        cart.print();

        // Test search by ID
        System.out.println("\nSearching for DVD with ID 1:");
        cart.searchById(1);

        System.out.println("\nSearching for DVD with ID 5:");
        cart.searchById(5);

        // Test search by title
        System.out.println("\nSearching for DVD with title 'Star Wars':");
        cart.searchByTitle("Star Wars");

        System.out.println("\nSearching for DVD with title 'Frozen':");
        cart.searchByTitle("Frozen");
    }
}
