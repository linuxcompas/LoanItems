package LoanItems;

public class Book extends LoanItems {

    // superclass constructor
    Book(String title, String type) {
        super(title, type);
    }


    @Override
    public void title() {
        super.getTitle();
    }

    public void type() {
        super.getType();
    }
}
