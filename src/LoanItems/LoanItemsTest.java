package LoanItems;

import java.util.Scanner;

public class LoanItemsTest {
    public static void main(String[] args){
        loanItems();
    }

    public static void loanItems(){
        // opretter scanner "sc"
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the library");
        System.out.println("How many loan items do you want to regiter?: ");
        int numberOfLoanItems = sc.nextInt();


        LoanItems[] Loanitems = new LoanItems[numberOfLoanItems];

        for (int i = 0; i < numberOfLoanItems; i++){
            System.out.println("Do you want to loan a book or video?: ");
            String type = sc.nextLine();
            System.out.println("What " + type + "do you want to loan?: ");
            String name = sc.nextLine();
            if (type.equalsIgnoreCase("book")) {
                Loanitems[i] = new Book(name,type);
            }
            else if (type.equalsIgnoreCase("video")){
                Loanitems[i] = new Video(name, type);
            }
        }
    }
}