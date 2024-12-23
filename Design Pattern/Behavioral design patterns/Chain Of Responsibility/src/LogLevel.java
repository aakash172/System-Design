public interface LogLevel {
    void displayLog(PrintLog log,String message);
    void sendToNext(LogLevel nextLogHandler);
}
