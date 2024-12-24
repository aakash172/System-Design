public class PhoneDisplay implements  Observer{
    private String weather;
    @Override
    public void update(String weather) {
        this.weather=weather;
        Display();
    }
    void Display(){
        System.out.println("Weather update in phone to "+weather);
    }
}
