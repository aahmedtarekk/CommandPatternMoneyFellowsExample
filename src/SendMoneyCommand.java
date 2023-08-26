public class SendMoneyCommand implements Command{

    private Receiver receiver;
    private int amount;
    public SendMoneyCommand(Receiver r, int amount)
    {
        receiver = r;
        this.amount=amount;
    }
    public void execute() {
        receiver.sendMoney(amount);
    }
}
