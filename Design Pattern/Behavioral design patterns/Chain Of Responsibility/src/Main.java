public class Main {
    public static void main(String[] args) {
       LogLevel info = new Info();
       LogLevel major = new Major();
       LogLevel minor = new Minor();
       major.sendToNext(minor);
       minor.sendToNext(info);

       PrintLog p1=new PrintLog(Log.INFO);
        PrintLog p2=new PrintLog(Log.MAJOR);
        PrintLog p3=new PrintLog(Log.MINOR);

        major.displayLog(p1,"INFO log");
        major.displayLog(p2,"MAJOR log");
        major.displayLog(p3,"Minor log");
    }
}