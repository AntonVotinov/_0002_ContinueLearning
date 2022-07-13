import java.util.Random;
import java.util.Scanner;

public class d20220712PashaTaskWithRandom {
    public static void main(String[] args) {
        while (true) {
            int inputtedLimit = scannerYo();
            int randomNumber = randomMethodOutside(inputtedLimit);
            System.out.println(randomNumber);
        }

    }
    public static int randomMethodOutside(int a){
        Random randomMethod = new Random();
        int upperLimit = a;
        int randomMethodOutside = randomMethod.nextInt(upperLimit);
        return  randomMethodOutside;
    }
    public static int scannerYo (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number from 1 to 8");
        return sc.nextInt();
    }
}
