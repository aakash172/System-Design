public class PlatinumCard implements ICreditCard{
    @Override
    public String getCardType() {
        return "Platinum Card";
    }

    @Override
    public int getCardLimit() {
        return 1000000;
    }

    @Override
    public int getAnnualFees() {
        return 1500;
    }
}
