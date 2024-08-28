

import java.util.*;
    public class Department{
    public static void main (String[]args){
    Scanner sc = new Scanner(System.in);

    String department ;
    int Jadieindicator = 0;

    String dept[][] = new String [5][2];

    for (int a = 0; a < dept.length; a++)
    {
        System.out.println("Department Name:");
        dept [a][0] = sc.nextLine();
        System.out.println("Supervisor Name:");
        dept [a][1]= sc.nextLine();
    }
    do {
    System.out.println("Search Department: ");
    department = sc.nextLine();

    boolean found = false;

     for( int a = 0; a < dept.length; a++)
     {
        if(dept[a][0].equals(department))
        {
            System.out.println("Supervisor Name: " + dept[a][1]);
            found = true;
            Jadieindicator = 1;
            break;
        }
        if(found)
        {
            break;
        }
     }
    if(!found)
        {
            System.out.println("Pataka kag type siz!");
        }
    } while(Jadieindicator <= 0);// indicates that we already found the department we've been looking for!
    sc.close();
        }
    }