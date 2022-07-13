import java.util.Scanner;

public class seasonsSwitch {
    public static void main(String[] args){
        do {Scanner sc = new Scanner(System.in);
        System.out.println("Input number of month");
        int mon = sc.nextInt();
        String season = null;
        switch (mon){
            case 12:case 1:case 2:
                season="Winter";break;
            case 3:case 4:case 5:
                season="Spring";break;
            case 6:case 7:case 8:
                season="Summer";break;
            case 9:case 10:case 11:
                season="Autumn";break;
            default:
                System.out.println("Wrong input");
        }
            System.out.println(season);
        }while(true);
    }
}
