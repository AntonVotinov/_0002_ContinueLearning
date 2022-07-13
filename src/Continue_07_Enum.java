public class Continue_07_Enum {
    private static final int dog = 0;
    private static final int cat = 1;
    private static final int frog = 2;

    public static void main(String[] args) {
        int animal = frog;

        switch (animal) {
            case dog:
                System.out.println("it's a dog");
                break;
            case cat:
                System.out.println("it's a cat");
                break;
            case frog:
                System.out.println("it's a frog");
                break;
            default:
                System.out.println("it's not an animal");
        }
    }
}
// below we see how it is not worth to do, please see next files (EnumReal)
