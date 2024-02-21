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

        // 二進制邏輯
        int U = 300; // 0000 0000 0000 0000 0000 0001 0010 1100
        byte Y = (byte)U; // ---- ---- ---- ---- ---- ---- 0010 1100
        System.out.println(Y); // 44

        int P = 200; // 0000 0000 0000 0000 0000 0000 1100 1000
        int L = (byte)P; // ---- ---- ---- ---- ---- ---- 1100 1000
        System.out.println(L); // -56

    }
}
