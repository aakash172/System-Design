public class PayByCard extends  PaymentMaker{
    @Override
    public void validateRequest() {
        System.out.println("Validate Payment by Card Details");
    }

    @Override
    public void calculateFees() {
        System.out.println("calculate Card fees");
    }

    @Override
    public void debitAmount() {
        System.out.println("Debit account from sender account to card");
    }

    @Override
    public void creditAmount() {
        System.out.println("Credit to receiver Bank from card");
    }
}
