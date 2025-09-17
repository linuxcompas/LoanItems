package LoanItems;
//dette er vores subklasse for bøger
public class Book extends LoanItems {

    // superclass constructor
    Book(String title, String type) {
        super(title, type);
    }
//superclass Override
    @Override
    public String getTitle() {
        super.getTitle();
        return title;
    }

    @Override
    public String getType() {
        super.getType();
        return type;
    }
}
