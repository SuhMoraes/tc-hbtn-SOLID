public class Main {
    public static void main(String[] args) throws Exception {
        CreditCard creditCard = new CreditCard();

        creditCard.validate();
        creditCard.collectPayment();

        DebitCard debitCard = new DebitCard();

        debitCard.validate();
        debitCard.collectPayment();

        BankRewards card = new BankRewards();

    }
}
