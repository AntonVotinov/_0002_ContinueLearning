import sun.security.util.Length;

import javax.crypto.spec.PSource;
import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Locale;

public class d20220710Arrays {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int length = numbers.length;
        System.out.println(length);
        int firstNumber = numbers[0];
        int lastNumber = numbers[numbers.length-1];
        System.out.println("First is: " + firstNumber + "\n"+"Last is: " + lastNumber);
        int[][] array1;
        int[][] array2;
        array1 = new int[][] {{1, 2, 3, 44},{1, 2, 3, 44}};
        array2 = new int[][] {{1, 2, 3, 44},{1, 2, 3, 44}};
        boolean b = Arrays.deepEquals(array1,array2);
        System.out.println(b);
        System.out.println(Arrays.deepToString(array1));
        String s="123456789IS";
        char ch1 = s.charAt(s.length()-1);
        System.out.println(ch1);
        System.out.println(s.endsWith("is")); // Круто)
        System.out.println(s.contains("9is")); // Круто)
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase(Locale.ROOT));

    }
}