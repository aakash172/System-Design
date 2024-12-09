public class Main {
    public static void main(String[] args) {
        Image img = new Proxy("Pic.jpg");

        img.setLocation(1.0, 0.0);
        double[] loc = img.getLocation();

        img.setBorder(true);
        System.out.println("\n-- Image Details --");
        System.out.println("Image Border : " + img.getBorder());
        System.out.println("Image location : (" + loc[0] + "," + loc[1] + ")");
        System.out.println("\n\n-- Displaying image now --");
        img.display();
    }
}