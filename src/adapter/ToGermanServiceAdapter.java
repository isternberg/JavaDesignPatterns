package adapter;

public class ToGermanServiceAdapter implements CustomerServiceBot {

    SwissServiceBot swissServiceBot;

    public ToGermanServiceAdapter(SwissServiceBot swissServiceBot) {
        this.swissServiceBot = swissServiceBot;
    }

    @Override
    public void greetCustomer() {
        swissServiceBot.welcomeCustomer();
    }

    @Override
    public void answerStandardQuestions() {
        swissServiceBot.replyToStandardEnquiries();
    }

    @Override
    public void forwardToRealPerson() {
        swissServiceBot.forwardToAgent();
    }
}
