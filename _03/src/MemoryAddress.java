
public class MemoryAddress {
    public static void main(String[] args) {
        int[] ints = {1, 3, 5, 7, 8};
        System.out.println(ints); // [I@a09ee92
        // [ : Array | I : integer | @ : 間隔符 | a09ee92: 址(16進制)
        double[] dou = {1.32, 4.33, 2};
        System.out.println(dou);
    }
}
