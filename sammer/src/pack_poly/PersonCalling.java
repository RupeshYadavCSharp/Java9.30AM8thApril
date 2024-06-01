package pack_poly;

public class PersonCalling {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person(21);
        Person person3 = new Person("Raj");
        Person person4 = new Person(21, "Raj");

        person1.show();
        person2.show();
        person3.show();
        person4.show();


    }
}