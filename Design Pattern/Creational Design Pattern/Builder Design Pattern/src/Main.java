public class Main {
    public static void main(String[] args) {
        URLBuilder.Builder builder= new URLBuilder.Builder();
        builder.protocol("http://").hostname("newwebsite:").port("4040");
        URLBuilder urlBuilder =builder.build();

        System.out.print(urlBuilder.protocol);
        System.out.print(urlBuilder.hostname);
        System.out.print(urlBuilder.port);
    }
}