
public class ARRAY{
    private int[][] array;
    private int row;
    private int col;

    public ARRAY(int[][] array, int row, int col){

        this.array = array;
        this.row = row;
        this.col = col;

    }



    public void populateArray(java.util.Scanner scanner) {

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }
    }
    
    public void printArray() {
        if (array == null) {
            System.out.println("Array is not populated yet.");
            return;
        }

        System.out.println("Array contents:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void displayOdd() {
        if (array == null) {
            System.out.println("Array is not populated yet.");
            return;
        }

        int oddCount = 0;
        int oddSum = 0;

        System.out.println("Odd numbers in the array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (array[i][j] % 2 != 0) {
                    System.out.print(array[i][j] + "\t");
                    oddCount++;
                    oddSum += array[i][j];
                }
            }
        }

        System.out.println("\nCount of odd numbers: " + oddCount);
        System.out.println("Sum of odd numbers: " + oddSum);
    }

    public void displayEven() {
        if (array == null) {
            System.out.println("Array is not populated yet.");
            return;
        }

        int evenCount = 0;
        int evenSum = 0;

        System.out.println("Even numbers in the array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (array[i][j] % 2 == 0) {
                    System.out.print(array[i][j] + "\t");
                    evenCount++;
                    evenSum += array[i][j];
                }
            }
        }

        System.out.println("\nCount of even numbers: " + evenCount);
        System.out.println("Sum of even numbers: " + evenSum);
    }
}
