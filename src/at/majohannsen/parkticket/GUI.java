package at.majohannsen.parkticket;

import java.util.Scanner;

public class GUI {
    java.util.Scanner scanner = new Scanner(System.in);

    private TicketBox box;

    public GUI(TicketBox box) {
        this.box = box;
    }

    void getTicket() {
        Ticket t1 = box.getTicket();
        System.out.println("Du hast jetzt ein Ticket:");
        System.out.println("\tID: " + t1.getId());
        System.out.println("\t" + t1.getStartTimestamp().toString());
    }

    void insertTicket() {
        System.out.println("Welche ID hat das Ticket?");
        while (true) {
            int input = scanner.nextInt();
            int responseCode = box.insertTicket(input);
            if (responseCode == 0) {
                System.out.println("Die ID ist falsch! Bitte gib sie erneut ein");
            }
            else if (responseCode == 1) {
                //success
                break;
            }
            else {
                System.out.println("Es ist schon ein Ticket im Automaten, bitte zuerst bezahlen.");
                break;
            }
        }
    }

    void getPrice() {
        double price = box.getPrice();
        if (price == Double.MAX_VALUE) {
            System.out.println("Du musst zuerst ein Ticket einschieben.");
        }
        else {
            System.out.println("Du musst " + price + " bezahlen.");
        }
    }

    void insertMoney() {
        while (true) {
            System.out.println("Wie viel Geld wirfst du ein?");
            double amount = scanner.nextDouble();
            if (box.insertMoney(amount) == 0) break;
        }
    }
}
