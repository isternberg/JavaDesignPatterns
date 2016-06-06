package adapter;

public class GermanServiceBot implements CustomerServiceBot {
    @Override
    public void greetCustomer() {
        System.out.println("...Greeting customer politely..");
    }

    @Override
    public void answerStandardQuestions() {
        System.out.println("...Giving default answers to default questions..");
    }

    @Override
    public void forwardToRealPerson() {
        System.out.println("...Forwarding to real person..");
    }
}
