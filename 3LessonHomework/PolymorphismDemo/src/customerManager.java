public class customerManager {
    private BaseLogger baseLogger;

    public customerManager(BaseLogger baseLogger){
        this.baseLogger = baseLogger;
    }
    public void add(){
        System.out.println("Musteri eklendi.");
        baseLogger.log("Loglandi.");
    }
}
