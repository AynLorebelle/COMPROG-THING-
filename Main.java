import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row;
        int col;



    do {
       
             System.out.print("Row: ");//
                 row = sc.nextInt();

            System.out.print("Col: ");//
                 col = sc.nextInt();
                 
        if (row >= 10 && col >= 10) {
             
            System.out.println("Invalid input. Please enter a number between 1 and 10.");
        }
       
     } while (row >= 10 && col >= 10);
    

       int [][] arr = new int [10][10];
        int menu;

        ARRAY a = new ARRAY(arr,row,col);
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1 - POPULATE");
            System.out.println("2 - PRINT");
            System.out.println("3 - DISPLAY ODD");
            System.out.println("4 - DISPLAY EVEN");
            System.out.println("5 - EXIT");
            System.out.print("Enter your choice: ");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    a.populateArray(sc);
                    break;
                case 2:
                    a.printArray();
                    break;
                case 3:
                    a.displayOdd();
                    break;
                case 4:
                    a.displayEven();
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (menu != 5);
        
        sc.close();
    }
}
