package LoanItems;

import java.util.Scanner;

public class LoanItemsTest {
    public static void main(String[] args){
        loanItems();
    }

    public static void loanItems() {
        // Opretter scanner "sc"
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the library");
        System.out.println("How many loan items do you want to regiter?: ");
        int numberOfLoanItems = sc.nextInt();
        //Meget vigtig line! Ik slet
        sc.nextLine();

        // Opretter Array til LoanItems
        LoanItems[] Loanitems = new LoanItems[numberOfLoanItems];

        //Vi vælger at benytte for & if statements.
        for (int i = 0; i < numberOfLoanItems; i++) {
            System.out.println("Do you want to loan a book or video?: ");
            String type = sc.nextLine();

            if (type.equalsIgnoreCase("book")) {
                System.out.println("What book do you want to loan?: " + (i + 1) + ": ");
                String name = sc.nextLine();

                Loanitems[i] = new Book(name, "Book");
            } else if (type.equalsIgnoreCase("video")) {
                System.out.println("What video do you want to loan?: " + (i + 1) + ": ");
                String name = sc.nextLine();

                Loanitems[i] = new Video(name, "Video");
            }
            else {
                System.out.println("Invalid Input! Try again");
                i--;
            }
        }
        //Her har vi tilføjet vores output
        System.out.println("LIST OF LOAN ITEMS\n ----------");
        for (LoanItems items : Loanitems){
            System.out.println(items);
        }

    }
}