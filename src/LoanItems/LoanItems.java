package LoanItems;

//Attributes
public class LoanItems {
    String title;
    String type;

    //constructor
    LoanItems(String title, String type) {
        this.title = title;
        this.type = type;

    }

    //Here we have our getters
    public String getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }
//These are our setters

    public void setTitle(String title) {
        this.title = title;
    }

    public void setType(String type) {
        this.type = type;
    }


    @Override
    public String toString() {
        return getTitle() + " " + "(" + getType() + ")";

    }
}
     //Move method