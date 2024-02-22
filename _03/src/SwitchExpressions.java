public class SwitchExpressions {
    public static void main(String[] args) {
        // JDK12之後的特性 可以省略switch不使用break帶來的穿透問題 也可以使用yield做為結果讓變數接收
        int num = 100;
        String str = switch (num) {
            case 1 -> {
                System.out.println("一");
                yield "啊哈";
            }
            case 50 -> {
                System.out.println("五十");
                yield "啊哈";
            }
            case 100 -> {
                System.out.println("一百");
                yield "啊哈100";
            }
            case 102 -> {
                System.out.println("一百零二");
                yield "啊哈";
            }
            default -> "啊哈";
        };
        System.out.println(str);
    }
}
