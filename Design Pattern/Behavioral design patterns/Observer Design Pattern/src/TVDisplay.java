public class TVDisplay implements  Observer{
    private String weather;
    @Override
    public void update(String weather) {
        this.weather=weather;
        Display();
    }
    void Display(){
        System.out.println("Weather update in TV to "+weather);
    }
}
