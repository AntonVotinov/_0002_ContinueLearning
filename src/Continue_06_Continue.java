public class Continue_06_Continue {
    public static void main(String[] args) {
        for(int i = 0; i <= 11; i++){
            if(i%2==0){
                continue;
            }
            System.out.println("This is non-*2* number: "+i);
        }
    }
}
