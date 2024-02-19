public class CastingUp {
    public static void main(String[] args) {
        double db = 128.98;
        int i = (int) db;
        System.out.println(i); // 128

        byte b = (byte) i;
        System.out.println(b); // -128

        byte b1 = 60;
        byte b2 = 69;
        byte b1b2 = (byte) (b1 + b2);
        System.out.println(b1b2);
    }
}
