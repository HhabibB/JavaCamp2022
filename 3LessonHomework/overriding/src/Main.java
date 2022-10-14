public class Main {
    public static void main(String[] args) {

        BaseKrediManager[] krediManager = new BaseKrediManager[]
                {new OgretmenKrediManager(), new TarimKrediManager(), new OgrenciKrediManager()};

        for (BaseKrediManager krediManagers:krediManager) {
            System.out.println(krediManagers.hesabla(7500));
        }
    }
}