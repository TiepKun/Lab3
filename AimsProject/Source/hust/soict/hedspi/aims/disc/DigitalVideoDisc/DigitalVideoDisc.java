package hust.soict.hedspi.aims.disc.DigitalVideoDisc;
public class DigitalVideoDisc {
    //Thuoc tinh tinh de luu so luong DVD
    private static int nbDigitalVideoDiscs = 0;

    //Thuoc tinh doi tuong de luu ID duy nhat 
    private int id;

    //Thuoc tinh khac
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    // Constructor day du 
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.id = ++nbDigitalVideoDiscs; // Increment and assign unique ID
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    // Constructor rut gon 
    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this.id = ++nbDigitalVideoDiscs; 
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
    }

    // Constructor don gian
    public DigitalVideoDisc(String title, String category, float cost) {
        this.id = ++nbDigitalVideoDiscs; 
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    // Constructor chi co tieu de
    public DigitalVideoDisc(String title) {
        this.id = ++nbDigitalVideoDiscs; 
        this.title = title;
    }

    // Getters cho attributes
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }

    // Setter cho tieu de
    public void setTitle(String title) {
        this.title = title;
    }
    public String toString() {
        return "DVD - " + title + " - " + category + " - " + director + " - " + length + ": " + cost + " $";
    }
    public boolean isMatch(String title) {
        return this.title.equalsIgnoreCase(title);
    }
}
