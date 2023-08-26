import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
            Receiver amAly = new Receiver();
            int amount;
            System.out.println("Am Aly's currentr balance " + amAly.getMoney());
            Scanner s = new Scanner(System.in);
            System.out.println("Enter amount you would like to send to 'Am Aly.");
            amount = s.nextInt();
            Command sendMon = new SendMoneyCommand(amAly, amount);
            Invoker Samir = new Invoker();
            Samir.execute(sendMon);
            System.out.println("Am Aly's currentr balance " + amAly.getMoney());
            System.out.println("Enter amount you want to take from 'Am Aly.");
            int amount2;
            amount2 = s.nextInt();
            Command takeMon = new TakeMoneyCommand(amAly, amount2);
            Samir.execute(takeMon);
            System.out.println("Am Aly's currentr balance " + amAly.getMoney());
    }
}