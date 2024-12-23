public class Main {
    public static void main(String[] args) {
        System.out.println("Making payment through UPI");
        PaymentMaker upi=new PayByUPI();
        upi.makePayment();

        System.out.println("Making payment through Card");
        PaymentMaker card=new PayByCard();
        card.makePayment();
    }
}