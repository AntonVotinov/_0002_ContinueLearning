public class Continue_05_BreakAndWhile {
    public static void main(String[] args){
        byte i=0,o=0;
        while (true) {
            if (i==10 | o==-6){
                break;
            }
            System.out.println(i);
            i++;
            System.out.println(o);
            o--;
        }
        System.out.println("The End, Linkin park");
    }
}