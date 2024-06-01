package pack_poly;

public class Person {
    private int age;
    private String name;

    public Person()
    {
        age = 19;
        name = "samir";
    }

    public Person(int a)
    {
        age = a;
        name = "Empty";
    }

    public Person(String n)
    {
        age = 0;
        name = n;
    }

    public Person(int a,String n)
    {
        age = a;
        name = n;
    }

    public void show()
    {
        System.out.println("Name is " + name);
        System.out.println("Age is  " + age);
    }

}


