public class Main {
    public static void main(String[] args) {
      /*  BaseLogger[] loggers = new BaseLogger[]{new DatabaseLogger(),new FileLogger(),new EmailLogger(),new ConsoleLogger()};
        for (BaseLogger logger:loggers) {
            logger.Log("Log mesaji");
        }*/
        customerManager customerManager = new customerManager(new DatabaseLogger());
        customerManager.add();
    }
}