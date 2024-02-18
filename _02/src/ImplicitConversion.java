public class ImplicitConversion {
    public static void main(String[] args) {
        /*
         *  Promotion: byte -> short -> int -> long -> float -> double
         *  (byte short char) -> int
         */

        int int_ten = 10;
        double db_ten = int_ten;
        System.out.println(db_ten); // 10.0
        System.out.println(int_ten + db_ten); // 20.0
        byte b_127 = 127;
        byte b_126 = 126;
        System.out.println(b_127 + b_126);
    }
}
