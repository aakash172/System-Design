public class SilverCard implements ICreditCard{

    @Override
    public String getCardType() {
        return "Silver Card";
    }

    @Override
    public int getCardLimit() {
        return 10000;
    }

    @Override
    public int getAnnualFees() {
        return 500;
    }
}
