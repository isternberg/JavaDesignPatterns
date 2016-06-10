package facade;

public class Main {
    public static void main(String[] args) {
        HelpDesk helpDesk = new HelpDesk();
        helpDesk.readFAQ();
        helpDesk.postQuestion();
        helpDesk.viewTicketHistory();
    }
}
