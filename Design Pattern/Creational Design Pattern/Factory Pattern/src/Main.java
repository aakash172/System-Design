public class Main {
    public static void printDetails(ICreditCard card){
        if(card==null){
            System.out.println("Card is not valid");
            return;
        }
        System.out.println(card.getCardType());
        System.out.println(card.getCardLimit());
        System.out.println(card.getAnnualFees());
    }
    public static void main(String[] args) {
        ICreditCard card1=CreditCardFactory.getCreditCardDetails("Platinum");
        printDetails(card1);

        ICreditCard card2=CreditCardFactory.getCreditCardDetails("Silver");
        printDetails(card2);

        ICreditCard card3=CreditCardFactory.getCreditCardDetails("abc");
        printDetails(card3);

    }
}