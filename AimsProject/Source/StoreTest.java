public class StoreTest {
    public static void main(String[] args) {
        // Create a new store
        Store store = new Store();

        // Create sample DVDs
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);

        // Add DVDs to the store
        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.addDVD(dvd3);

        // Print the store inventory
        System.out.println("\nStore Inventory after adding DVDs:");
        store.printStore();

        // Remove a DVD from the store
        store.removeDVD("Star Wars");

        // Print the store inventory after removal
        System.out.println("\nStore Inventory after removing a DVD:");
        store.printStore();

        // Attempt to remove a DVD that doesn't exist
        store.removeDVD("Frozen");
    }
}
