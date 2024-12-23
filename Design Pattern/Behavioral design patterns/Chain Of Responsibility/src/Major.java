public class Major implements LogLevel {
    private LogLevel nextloghandler;
    @Override
    public void displayLog(PrintLog log,String message) {
        if(log.getLog()==Log.MAJOR){
            System.out.println("Displaying Major Log : "+message);
        }else if(nextloghandler!=null){
            nextloghandler.displayLog(log, message);
        }else{
            System.out.println("Can't print this log");
        }
    }
    @Override
    public void sendToNext(LogLevel nextloghandler) {
        this.nextloghandler=nextloghandler;
    }
}
