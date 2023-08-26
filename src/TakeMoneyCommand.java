public class TakeMoneyCommand implements Command{
    private Receiver receiver;
    private int amount;
    public TakeMoneyCommand(Receiver r, int amount)
    {
        receiver = r;
        this.amount=amount;
    }
    public void execute() {
        receiver.takeMoney(amount);
    }
}

