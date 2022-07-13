import java.math.BigInteger;

public class d20220710Stepik01 {
    public static void main(String[] args) {
        int a,b,c,result4,result100,result400;
        a=400;b=400;c=5;
            result4=a/4;
            result100=a/100;
            result400=a/400;
        System.out.println(result4-result100+result400);
        if (a%400==0);
        double posInf,negInf,nanEx,decimal,a1,a2,a3,res1,res2,sumOfA;
        posInf = 1d/0d;
        negInf = -1d/0d; // infinity in double can be treated and be in mathematical expressions
        nanEx=posInf+negInf;
        System.out.println(posInf);
        System.out.println(negInf);
        System.out.println(nanEx);  //-inf + inf = NaN - Not a Number
        decimal=0.1d;
        decimal=decimal+decimal+decimal+decimal+decimal+decimal+decimal+decimal+decimal+decimal;
        System.out.println(decimal);
        double sq;
        sq=Math.sqrt(16);
        System.out.println(sq);
        System.out.println(Math.max(0,-100));
        BigInteger two = BigInteger.valueOf(2);
        System.out.println(two);
        BigInteger powerOfTwo = two.pow(100);
        System.out.println(powerOfTwo); // клёвая тема с БигИнтеджер
        a1= 1.001;
        a2= 2.002;
        a3= 3.0;
        res1=Math.abs(a1+a2);
        res2=(a1+a2)-a3;
        System.out.println(res1);
        System.out.println(res2);
        }
    }