public enum Continue_07_EnumSeason {
    Winter(-2), Spring(4), Summer(19), Autumn(5);
/*ниже мы создаём конструктор, после которого при декларации каждого
    времени года, выше по коду, нужно присваивать температуру*/

    private int temperature;
    Continue_07_EnumSeason (int temperature){
        this.temperature = temperature;
    }
    public int getTemperature() {
        return temperature;
    }
}