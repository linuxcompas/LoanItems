package LoanItems;

public class Video extends LoanItems {

    // superclass constructor
    Video(String title, String type) {
        super(title, type);
    }


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