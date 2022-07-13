import java.util.Scanner;

public class seasonsIfElse {
 public static void main(String[]args) {
     do {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the month's number:");
     int mon = sc.nextInt();

     if (mon == 12 || mon == 1 || mon == 2)
         System.out.println(mon + " is Winter");
     else if (mon == 3 || mon == 4 || mon == 5)
         System.out.println(mon + " is Spring");
     else if (mon == 6 || mon == 7 || mon == 8)
         System.out.println(mon + " is Summer");
     else if (mon == 9 || mon == 10 || mon == 11)
         System.out.println(mon + " is Autumn");
     else System.out.println("Wrong input");
     } while (true);
     }
}
