public class Continue_03_If {
    public static void main(String[] args){
        int myInt = 15;
        if(myInt == 5){
            System.out.println("True");
        } else {
            System.out.println("Bullshit");
        }
        if(myInt > 11){
            System.out.println("True");
        } else {
            System.out.println("Bullshit");
        }
        int myInt2 = 15;
        if (myInt2<10){
            System.out.println("Outside range higher"); // проверятеся верхнее условие
        }
        else if(myInt2<20) {
            System.out.println("Outside range lower");
        }
        else {
            System.out.println("Inside range");
        }
    }
}
