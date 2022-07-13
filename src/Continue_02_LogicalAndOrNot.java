public class Continue_02_LogicalAndOrNot {
    public static void main(String[] args){
        int a = 5;
        int b = 5;
        boolean boolTrue = true;
        boolean boolFalse = false;
        if (!(a==b) && boolTrue) {
            System.out.println("Это истина");
        }
        else {
            System.out.println("This is bullshit");
        }
        if (!(a==b) || boolTrue) {
            System.out.println("Это истина");
        }
        else {
            System.out.println("This is bullshit");
        }
    }
}
