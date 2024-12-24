public class Main {
    public static void main(String[] args) {
        WeatherStation station1= new WeatherStation();
       Observer phone=new PhoneDisplay();
       Observer tv=new TVDisplay();

       station1.addObserver(phone);
       station1.addObserver(tv);
       station1.setWeather("Foggy");
    }
}