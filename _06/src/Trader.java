public class Trader {
    private final String userName;
    private String tradeItem;


    private String HoldingItem;

    public String getUserName() {
        return userName;
    }

    public Trader(String userName) {
        this.userName = userName;
    }

    public String getTradeItem() {
        return tradeItem;
    }

    public void setTradeItem(String tradeItem) {
        this.tradeItem = tradeItem;
    }

}
