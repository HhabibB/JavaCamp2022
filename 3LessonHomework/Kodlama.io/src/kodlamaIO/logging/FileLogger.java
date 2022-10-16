package kodlamaIO.logging;

public class FileLogger implements ILogger{
    @Override
    public void log(String data) {
        System.out.println("Fayla loglandi : " + data);
    }
}
