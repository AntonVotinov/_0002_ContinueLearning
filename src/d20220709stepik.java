import java.security.MessageDigest;

public class d20220709stepik {

    public static void main(String[] args) throws Exception {/*
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] digest = md.digest("abracadabra".getBytes("UTF-8"));
        for (byte b : digest) {
            System.out.printf("%02x", b);
        }*/
        boolean a=false;
        boolean b=false;
        boolean s1=a&b;
        boolean s2=(a==b);
        System.out.println(s1);
        System.out.println(s2);
    }
}