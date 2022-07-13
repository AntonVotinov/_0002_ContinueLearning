import java.util.Locale;
import java.util.Scanner;

public class d20220710StepikArraysReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text:");
        String inputtedText = scanner.nextLine();


        String[] array1 = inputtedText.split("");
        String[] array2 = new String[array1.length];
        for (int i = 0; i < (inputtedText.length()); i++) {
            System.out.println(array1[i]);
        }

        System.out.println();

        for (int i = (inputtedText.length() - 1); i >= 0; i--) {
            System.out.println(array1[i]);
        }

        System.out.println();

        for (int i=0; i<array1.length; i++){array2[i]=array1[i];} // потому что иначе не будет работать (средний символ не меняется при цикле обратной записи массива)
        for (int i = 0; i < inputtedText.length() / 2; i++) {
            String temp = array1[i];
            array2[i] = array1[array1.length - 1 - i];
            array2[array1.length - 1 - i] = temp;
        }
/*        for (int i = 0; i < (array2.length); i++) {
            System.out.println(array2[i]);
        }*/
        String arrayToString1 = String.join("",array1);
        String arrayToString2 = String.join("",array2);
        System.out.println(arrayToString1);
        System.out.println(arrayToString2);

        String clearedString = inputtedText.replaceAll("[^a-zA-Z0-9]","").toLowerCase(Locale.ROOT);
        System.out.println(clearedString);
    }
}