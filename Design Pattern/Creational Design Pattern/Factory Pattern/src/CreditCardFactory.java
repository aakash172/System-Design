public class CreditCardFactory {
    public static ICreditCard getCreditCardDetails(String cardType){
        ICreditCard creditCard=null;
        if(cardType.equals("Platinum")){
            creditCard=new PlatinumCard();
        }else if(cardType.equals("Silver")){
            creditCard=new SilverCard();
        }else{
            System.out.println("Invalid Card Type");
        }
        return creditCard;
    }
}
