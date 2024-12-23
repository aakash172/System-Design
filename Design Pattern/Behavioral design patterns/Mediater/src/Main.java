public class Main {
    public static void main(String[] args) {
        AirTrafficControlTower controlTower = new AirportControlTower();

        Airplane airplane1 = new CommercialAirplane(controlTower);
        Airplane airplane2 = new CommercialAirplane(controlTower);

        airplane1.requestTakeoff();
        airplane1.notifyAirTrafficControl("Take Off Success");
        airplane2.requestLanding();
        airplane2.notifyAirTrafficControl("Landing Success");

    }
}