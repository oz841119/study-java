import java.util.UUID;

public class PersonTest {
    public static void main(String[] args) {
        System.out.println("--------------------------------------");
        Person person1 = new Person("Andy", 18);
        person1.SayName();
        UUID personUUID = person1.GetUUID();
        System.out.println(personUUID);
        System.out.println("--------------------------------------");
        Person person2 = new Person();
        System.out.println(person2);
        System.out.println("--------------------------------------");
    }
}
