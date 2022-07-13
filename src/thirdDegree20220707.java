import java.util.Scanner;


public class thirdDegree20220707 {
    static void printError1(String s) {
        System.out.println(s);
    }

    static void printError10() {
        System.out.println("Error");
    }

    static void printError20() {
        System.out.println("Error 20");
    }

    static long ninthDegree(long input) {
        long outputOfNinthDegree = (long) cube(cube(input));
        return outputOfNinthDegree;
    }

    static long cube(long input) {
        long outputCube = (long) Math.pow(input, 3);
        return outputCube;
    }

    public static void main(String[] args) {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Write number to be in 9th degree:");
            long a = sc.nextLong();
            switch ((int) a) {
                case 1:
                    printError1("Freaking 1 error");
                    break;
                case 10:
                    printError10();
                case 20:
                    printError20();
                    break;
                default: {
                    long resultOfMain = ninthDegree(a);
                    char charIk = 'r';
                    System.out.println(a + " ^9= " + resultOfMain + charIk); //here i just use different types of variables to be concatenated
                }
            }
        }
        while (true);
    }
}

/*
// save it, run it!
Alex Lee*/

/*double check*/