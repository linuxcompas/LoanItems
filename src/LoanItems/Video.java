package LoanItems;
//dette er vores subklasse for videoer.
public class Video extends LoanItems {

    // superclass constructor
    Video(String title, String type) {
        super(title, type);
    }

//Superclass Override
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