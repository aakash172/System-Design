public class PayByUPI extends  PaymentMaker{
    @Override
    public void validateRequest() {
        System.out.println("Validate UPI");
    }

    @Override
    public void calculateFees() {
        System.out.println("calculate UPI transaction fees");
    }

    @Override
    public void debitAmount() {
        System.out.println("Debit account from sender account to UPI");
    }

    @Override
    public void creditAmount() {
        System.out.println("Credit to receiver Bank by UPI");
    }
}
