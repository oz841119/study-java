import java.util.UUID;

public class Person {
    public String name;
    public int age;
    private final UUID uuid;
    public Person() {
        name = "DEFAULT_NAME";
        age = 0;
        System.out.println("Using default constructor::");
        System.out.println("Hello " + name + ", " + "you are " + age + ".");
        System.out.print("You are created");
        this.uuid = UUID.randomUUID();
    }
    public Person(String name, int age) {
        System.out.println("Hello " + name + ", you are " + age + ".");
        System.out.print("You are created");
        this.name = name;
        this.age = age;
        this.uuid = UUID.randomUUID();
    }

    public void SayName() {
        System.out.println("My name is " + this.name);
    }
    public UUID GetUUID() {
        return this.uuid;
    }
}
