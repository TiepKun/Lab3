public class Store {
    // Maximum number of DVDs that the store can hold
    public static final int MAX_NUMBERS_IN_STORE = 100;

    // Array to hold DVDs available in the store
    private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[MAX_NUMBERS_IN_STORE];

    // Number of DVDs currently in the store
    private int qtyInStore = 0;

    // Method to add a DVD to the store
    public void addDVD(DigitalVideoDisc dvd) {
        if (qtyInStore < MAX_NUMBERS_IN_STORE) {
            itemsInStore[qtyInStore] = dvd;
            qtyInStore++;
            System.out.println("The DVD has been added to the store: " + dvd.getTitle());
        } else {
            System.out.println("The store is full. Cannot add more DVDs.");
        }
    }

    // Method to remove a DVD from the store by title
    public void removeDVD(String title) {
        boolean found = false;
        for (int i = 0; i < qtyInStore; i++) {
            if (itemsInStore[i].getTitle().equalsIgnoreCase(title)) {
                found = true;
                // Shift remaining items to the left
                for (int j = i; j < qtyInStore - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }
                itemsInStore[qtyInStore - 1] = null; // Clear last item
                qtyInStore--;
                System.out.println("The DVD has been removed from the store: " + title);
                break;
            }
        }
        if (!found) {
            System.out.println("The DVD was not found in the store: " + title);
        }
    }

    // Method to print the list of DVDs in the store
    public void printStore() {
        System.out.println("*************** STORE INVENTORY ***************");
        for (int i = 0; i < qtyInStore; i++) {
            System.out.println((i + 1) + ". " + itemsInStore[i].toString());
        }
        System.out.println("***********************************************");
    }
}
