import java.util.Objects;

public class overload {
    public static void main(String[] args) {
        equals("hi", "hi");
        equals(12, 123);
    }
    public static void equals(String str1, String str2) {
        System.out.println("String: " + (Objects.equals(str1, str2)));
    }
    public static void equals(int int1, int int2) {
        System.out.println("Integer: " + (int1 == int2));
    }
}
