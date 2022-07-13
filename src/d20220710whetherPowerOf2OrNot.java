public class d20220710whetherPowerOf2OrNot {
    public static void main(String[] args) {
        double a = 512;
        double result;
        result = customLog(2,a);
        System.out.println(result);
    if (result%1 == 0)
        System.out.println("true");
        System.out.println(isPowerOfTwo(-1024));
        System.out.println(Integer.bitCount((int) a));
    }
    private static double customLog (double base, double logNumber){
        return Math.log(logNumber)/Math.log(base);

        }
    public static boolean isPowerOfTwo(int value) {
        return ((Math.log(Math.abs(value))/Math.log(2))% 1) == 0; // you implementation here
    }
}