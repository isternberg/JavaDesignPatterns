package adapter;

public class Main {

    public static void main(String[] args) {

        System.out.println("The German Bot");
        CustomerServiceBot germanBot = new GermanServiceBot();
        germanBot.greetCustomer();
        germanBot.answerStandardQuestions();
        germanBot.forwardToRealPerson();

        System.out.println("\nThe Swiss Bot");
        SwissServiceBot swissServiceBot = new SwissServiceBot();
        swissServiceBot.welcomeCustomer();
        swissServiceBot.verifyCustomerDetails();
        swissServiceBot.replyToStandardEnquiries();
        swissServiceBot.forwardToAgent();

        System.out.println("\nThe Swiss Bot adapted to German customer service");
        CustomerServiceBot toGermanServiceAdapter = new ToGermanServiceAdapter(swissServiceBot);
        toGermanServiceAdapter.greetCustomer();
        toGermanServiceAdapter.answerStandardQuestions();
        toGermanServiceAdapter.forwardToRealPerson();


    }
}
