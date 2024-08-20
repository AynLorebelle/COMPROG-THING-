
import java.util.*;

    public class product{
         public static void main(String[] args){
             Scanner num = new Scanner(System.in);
             
        int product = 1;

            System.out.println("Enters positive numbers and one negative number:");

                while(true){
                    String input = num.next();
                if(input.matches("-?\\d*")){
                    int number = Integer.parseInt(input);
                if (number < 0) break;
                    product *= number;
                }else System.out.println("XXX");

                }
                System.out.println("Product:" + product);
                
                num.close();
         }

    }


Input odd and even numbers 
Total the sum of all even numbers 
Total the sum of all odd numbers 
