import java.util.Scanner;

public class d20220709stepik1 {
    public static void main(String[] args) {
        String line = GetString();
        int finalResult = 0;
        String array1[] = line.split(" ");
        for (int i = 0; i < 4; i++) {
            /*System.out.println(array1[i]);*/
            if (array1[i].equals("true"))
            {finalResult++;/*System.out.println("IF option");*/}
            else /*System.out.println("ELSE option")*/;
        }
        boolean finalMethodResult;
        if (finalResult==2)
            finalMethodResult=true;
        else finalMethodResult=false;
        System.out.println(finalMethodResult);
        }
    public static String GetString() {
        Scanner sc = new Scanner(System.in);
        /*System.out.println("Input True/False expression");*/
        return sc.nextLine();
    }
}