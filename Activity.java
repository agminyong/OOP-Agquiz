public class Activity{

    public static void main(String[] args) {
        
        Dog edog = new Dog();
        edog .setNumberPuppies(3);

        Dog edog1 = new Dog();
        edog1 .setName( "b");
        edog1 .isMale = true;

        Dog edog2 = new Dog();
        edog2 .setName( "Von");
        edog2 .isMale = true;

        edog.addPuppies(edog1);
        edog.addPuppies(edog2);

        
        edog1.bark();
        edog2.bark();

        edog.ShowNumberPuppies();
        
        edog.ShowAllPuppies();

        
    }
}