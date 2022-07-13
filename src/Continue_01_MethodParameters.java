public class Continue_01_MethodParameters {
    public static void main(String[] args) {
        PersonS person1 = new PersonS();
        person1.setNameAndAge("Roman",50);
        String s1 = "Papa";
        PersonS person2 = new PersonS();
        person2.age = 21;
        person2.setNameAndAge(s1,22);
        person1.speak();
        System.out.println();
        person2.speak();
    }
}
class PersonS {
    String name;
    int age;
    void setNameAndAge(String userName, int userAge){
        name = userName;
        age = userAge;
    }
    int calculateYearsToRetirement(){
        int years = 65 - age;
        return years;
    }
    void speak(){
        for(int i = 0; i<2; i++){
            System.out.println("My name is " + name + ", I'm " + age + " years old");}
    }
    void sayHello(){
        System.out.println("Hello");
    }
}