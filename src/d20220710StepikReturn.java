import java.util.Scanner;

public class d20220710StepikReturn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("name?");
        String name = sc.nextLine();
        for (int i=0; i<2;i++){
            String output = getGreetings(name);
            System.out.println(output);
        }
        System.out.println();
        /*System.out.println(getGreetings(name));*/
    }

    public static String getGreetings(String name) {
        if (name == null) {
            return "Hello noname";
        } else {
            return "Hello, dear " + name + "!";
        }
    }
}