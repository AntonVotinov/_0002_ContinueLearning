import java.util.Random;

public class d20220712PashaMagicBall {
    private static final String CERTAIN = "Бесспорно";
    private static final String DEFINITELY = "Определённо да";
    private static final String MOST_LIKELY = "Вероятнее всего";
    private static final String OUTLOOK_GOOD = "Хорошие перспективы";
    private static final String ASK_AGAIN_LATER = "Спроси позже";
    private static final String TRY_AGAIN = "Попробуй снова";
    private static final String NO = "Мой ответ — нет";
    private static final String VERY_DOUBTFUL = "Весьма сомнительно";

    public static String getPrediction() {
        Random randomMethod = new Random();
        int upperLimit = 8;
        String output = new String();
        int randomMethodOutside = randomMethod.nextInt(upperLimit);
        switch (randomMethodOutside) {
            case 0:
                output = CERTAIN;
                break;
            case 1:
                output = DEFINITELY;
                break;
            case 2:
                output = MOST_LIKELY;
                break;
            case 3:
                output = OUTLOOK_GOOD;
                break;
            case 4:
                output = ASK_AGAIN_LATER;
                break;
            case 5:
                output = TRY_AGAIN;
                break;
            case 6:
                output = NO;
                break;
            case 7:
                output = VERY_DOUBTFUL;
                break;
        }
        return output;
    }
}

/*
public class d20220712PashaTaskWithRandom_1 {
public static void main(String[] args) {
System.out.println("Weather will be amazing?");
String output = getPrediction();
System.out.println(output);
}
public static String getPrediction(){
Random randomMethod = new Random();
int upperLimit = 7;
String output = new String();
int randomMethodOutside = randomMethod.nextInt(upperLimit);
switch (randomMethodOutside)
{
case 0:
output="Бесспорно";
break;
case 1:
output="Определённо да";
break;
case 2:
output="Вероятнее всего";
break;
case 3:
output="Хорошие перспективы";
break;
case 4:
output="Спроси позже";
break;
case 5:
output="Попробуй снова";
break;
case 6:
output="Мой ответ — нет";
break;
case 7:
output="Весьма сомнительно";
break;
}
return  output;
}
*/