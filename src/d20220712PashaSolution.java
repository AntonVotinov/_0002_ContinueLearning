public class d20220712PashaSolution {
    public static void main(String[] args) {
        System.out.println("Заработаю ли я себе на BMW?");
        int i=15;
        int j=i;
        System.out.println();
        while (i>0){
        System.out.println(j+1-i + ") " + d20220712PashaMagicBall.getPrediction());
        i--;
        }
    }
}