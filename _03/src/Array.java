public class Array {
    public static void main(String[] args) {
        int[] intArr = new int[]{ 12, 23, 44 };
        int intArr2[] = new int[]{ 1, 2, 3, 4, 5 }; // C style
        double[] dArr = { 12.1, 23.3, 34.4 }; // 省略 new

        String[] initStrLength = new String[4];
        initStrLength[1] = "Andy";
        System.out.println(initStrLength[0]); // null
        System.out.println(initStrLength[1]);
        // Init value
        // int: 0
        // double: 0.0
        // char: \u0000
        // boolean: false
        // reference: null
    }
}
