import java.math.BigInteger;
import java.util.Scanner;

public class d20220710StepikFactorial {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Write number:");
            BigInteger a = BigInteger.valueOf(sc.nextInt());
            BigInteger factorial = BigInteger.valueOf(1);

            for (int i = 0; i < a.intValue(); i++) {
                factorial = factorial.multiply(BigInteger.valueOf(i + 1));
            }
            System.out.println(factorial);
        }
    }
}