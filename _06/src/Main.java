public class Main {
    public static void main(String[] args) {
        Trader Andy = new Trader("Andy");
        Trader John = new Trader("John");
        Trade currTrade = new Trade(Andy, John);
        Andy.setTradeItem("+9熟鐵刀");
        John.setTradeItem("忘卻藥水E");
        currTrade.runTrade();
    }
}