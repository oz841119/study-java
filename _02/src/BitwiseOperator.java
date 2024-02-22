public class BitwiseOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 23;
        String binaryA = Integer.toBinaryString(a);
        String binaryB = Integer.toBinaryString(b);
        System.out.println(binaryA);
        System.out.println(binaryB);
        System.out.println(a & b);
        System.out.println(a | b);
    }
}
