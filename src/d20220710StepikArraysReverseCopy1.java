import java.util.Locale;
import java.util.Scanner;

public class d20220710StepikArraysReverseCopy1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = scanner.nextLine();

        text = text.replaceAll("[^a-zA-Z0-9]","").toLowerCase(Locale.ROOT);
        String[] array1 = text.split("");
        for (int i=0;i<(text.length()/2);i++){
            String temp = array1[i];
            array1[i] = array1[array1.length - 1 - i];
            array1[array1.length - 1 - i] = temp;
        }
        String arrayToString1 = String.join("",array1).toLowerCase(Locale.ROOT);
        System.out.println(text);
        for (int i=0;i<array1.length;i++){
            System.out.println(array1[i]);
        }
        System.out.println(arrayToString1);
        boolean check;
        if (text.equals(arrayToString1))
            System.out.println("Equals");
    }
}