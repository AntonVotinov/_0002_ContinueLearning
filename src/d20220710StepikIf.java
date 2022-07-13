import java.util.Scanner;

public class d20220710StepikIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is temperature?");
        int a = sc.nextInt();

        System.out.println("It`s " + (a > 18 ? "warm today" : "cold today")); // Good way to use if in different way

        String string1 = "Weather";
        int [] array;
        array= new int[]{1, 2, 3, 4, 5};
        for (int arrayElement : array) System.out.println(arrayElement);

    }
}