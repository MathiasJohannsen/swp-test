package at.majohannsen.parkticket;

public class Main {
    public static void main(String[] args) {
        TicketBox b1 = new TicketBox();
        GUI boxGui = new GUI(b1);

        boxGui.getTicket();

        System.out.println("Du bist fertig mit dem Parken und willst jetzt zahlen.");

        boxGui.insertTicket();
        boxGui.getPrice();
        boxGui.insertMoney();
    }
}
