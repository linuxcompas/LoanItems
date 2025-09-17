package LoanItems;

// Attributes
public class LoanItems {
    String title;
    String type;

    // Constructor
    LoanItems(String title, String type) {
        this.title = title;
        this.type = type;

    }

    // Dette er vores getters
    public String getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }
    // Dette er vores setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setType(String type) {
        this.type = type;
    }

    //Her har vi vores Override & toString metode
    @Override
    public String toString() {
        return getTitle() + " " + "(" + getType() + ")";

    }
}