public enum Continue_07_EnumAnimals {
    dog("шарик"),cat("мурка"),frog("тортила");

    private String translation;
    private Continue_07_EnumAnimals(String translation){  //обычно конструкторы делаютя приватными
        this.translation = translation;
    }
    public String getTranslation() {
        return translation;
    }
    public String toString() {
    return "Перевод на русский язык " + translation;
    }
    }