public class Receiver {
    private int money=0;

    public void setMoney(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }
    public void sendMoney(int m)
    {
        money+=m;
    }
    public void takeMoney(int m)
    {
        money-=m;
    }
}
