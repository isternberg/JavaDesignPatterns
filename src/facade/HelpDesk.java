package facade;

public class HelpDesk {

    public HelpDesk() {
        this.faqService = new FAQService();
        this.contactForm = new ContactForm();
        this.historyService = new HistoryService();
    }

    private FAQService faqService;
    private ContactForm contactForm;
    private HistoryService historyService;

    public void readFAQ() {
        faqService.getFAQ();
    }

    public void postQuestion() {
        contactForm.getUserInput();
    }

    public void viewTicketHistory() {
        historyService.getHistory();
    }
}
