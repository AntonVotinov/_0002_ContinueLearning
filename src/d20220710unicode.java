public class d20220710unicode {
    public static void main(String[] args) {
        int a,result;
        char char1;
        a=32;
        char1 ='\\';
        result = char1+a;
        System.out.println((char)result);
        int primitive = 7;
        Integer reference = Integer.valueOf(primitive);
        System.out.println(reference);
        int fromString = Integer.parseInt("123456");
        System.out.println(fromString);
        String fromLong = Long.toString(123456);
        System.out.println("This is String already: " + fromLong);
        String concatenation = "area: " + 51;
        System.out.println(concatenation);
    }
}