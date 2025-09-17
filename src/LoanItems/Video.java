package LoanItems;

public class Video extends LoanItems {

    // superclass constructor
    Video(String title, String type){
        super(title, type); }


        @Override
        public void title() {
            super.getTitle();
        }

        public void type() {
            super.getType();
    }
}