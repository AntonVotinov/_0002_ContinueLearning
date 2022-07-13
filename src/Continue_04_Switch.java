import java.util.Scanner;

public class Continue_04_Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print your age");
        int age = scanner.nextInt();
            switch (age) {
                case 0 :
                    System.out.println("Yuu are newborn");
                    break;
                case 1:
                    System.out.println("you are too old to us");
                    break;
                default:
                    System.out.println("You are odd person");
                }
            if(105<age) {
            System.out.println("You are must be dead already, get the fuck out");}
            else {
            if (105 >= age && age > 17) {
                System.out.println("You are allowed");
            } else {
                System.out.println("You are not allowed");
            }
        }
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Print your age  literally");
        String age1 = scanner1.nextLine();
        switch (age1) {
            case "Ноль":
                System.out.println("Yuu are newborn");
                break;
            case "Один":
                System.out.println("you are too old to us");
                break;
            default:
                System.out.println("You are odd person");
        }
    }
}