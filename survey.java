import java.util.*;

public class survey{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] object = new int [17][5];
        int num = 1;
            for(int i = 0; i < 17; i++){
                System.out.printf("%d. : \n", num);
                int j = 1;
                while(j != 0){
                    System.out.print("- ");
                    int choice = sc.nextInt();
                    switch(choice){
                        case 1:
                            object[i][choice-1] += 1;
                            break;
                        case 2:
                            object[i][choice-1] += 1;
                            break;
                        case 3:
                            object[i][choice-1] += 1;
                            break;
                        case 4:
                            object[i][choice-1] += 1;
                            break;
                        case 5:
                            object[i][choice-1] += 1;
                            break;
                        default:
                            j = 0;
                            break;
                    }
                }
            }
        }
    }