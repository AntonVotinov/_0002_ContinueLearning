public class Continue_07_EnumReal {
    public static void main(String[] args) {
        Continue_07_EnumAnimals animals = Continue_07_EnumAnimals.frog;
        System.out.println(animals);
        Continue_07_EnumSeason seaseason = Continue_07_EnumSeason.Winter;
        System.out.println(seaseason.getTemperature());
        Continue_07_EnumAnimals animal = Continue_07_EnumAnimals.frog;
        /*
        сюда мы не можем положить что то не из списка
        */
        switch (animal) {
            case cat:
                System.out.println("it's a cat");
                break;
            case dog:
                System.out.println("it's a dog");
                break;
            case frog:
                System.out.println("it's a frog");
            default:
                System.out.println("it's not an animal");
Continue_07_EnumSeason season = Continue_07_EnumSeason.Spring;
                System.out.println(season);
                switch (season) {
                    case Winter:
                        System.out.println("And it's cold outside");
                        break;
                    case Spring:
                        System.out.println("And it's getting greener everyday");
                        break;
                    case Summer:
                        System.out.println("And it's hot outside");
                        break;
                    case Autumn:
                        System.out.println("And it's getting yellower everyday");
                        break;
                }
                System.out.println(season instanceof Continue_07_EnumSeason);
                System.out.println(season.getClass());
                System.out.println(animal.getClass());
        }
    }
}
// in general Enum is used for Enumeration