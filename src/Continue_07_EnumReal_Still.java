public class Continue_07_EnumReal_Still {
    public static void main(String[] args) {
        Continue_07_EnumSeason season = Continue_07_EnumSeason.Summer;
        Continue_07_EnumAnimals animal = Continue_07_EnumAnimals.dog;
        System.out.println(season.name());
        System.out.println(animal.name());

        Continue_07_EnumAnimals catty = Continue_07_EnumAnimals.valueOf("frog");
        System.out.println(catty.getTranslation());
    }
}