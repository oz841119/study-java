public class Trade {
    private Trader trader1;
    private Trader trader2;
    public Trade() {}
    public Trade(Trader trader1, Trader trader2) {
        this.trader1 = trader1;
        this.trader2 = trader2;
        System.out.println("交易開始");
    }
    public void runTrade() {
        var user1Name = trader1.getUserName();
        var user2Name = trader2.getUserName();
        var trader1Item = trader1.getTradeItem();
        var trader2Item = trader2.getTradeItem();
        trader1.setTradeItem(null);
        trader2.setTradeItem(null);
        System.out.println(user1Name + " 將 " + trader1Item + " 交給了 " + user2Name);
        System.out.println(user2Name + " 將 " + trader2Item + " 交給了 " + user1Name);
        System.out.println("交易完成");
    }
}
