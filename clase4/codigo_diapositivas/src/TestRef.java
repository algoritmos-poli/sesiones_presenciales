class Person {
    String name;
    int edad;
    boolean isSuperHeroe;

    public Person(String name, int edad) {
        this.name = name;
        this.edad = edad;
        this.isSuperHeroe = false;
    }
}

public class TestRef {
    public static void main(String[] args) {
        Person clark = new Person("Clark Kent", 44);
        Person superman = null;
        superman = clark;
        superman.isSuperHeroe = true; // clark.isSuperHeroe = true
    }
}