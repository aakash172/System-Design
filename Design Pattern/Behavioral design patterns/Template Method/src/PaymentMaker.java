public abstract class PaymentMaker {
    public abstract void validateRequest();
    public abstract void calculateFees();
    public abstract void debitAmount();
    public abstract void creditAmount();

    // This template for payment flow
    public  final void makePayment(){
        //step1
        validateRequest();

        //step2
        calculateFees();


        //step3
        debitAmount();

         //step4
        creditAmount();
    }

}
