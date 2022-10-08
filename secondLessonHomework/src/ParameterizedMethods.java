import java.sql.SQLOutput;

public class ParameterizedMethods {
    public static void main(String[] args) {
        String mesaj = "Bugun hava cok guzel.";
        String yeniMesaj = city();

        add();
        delete();
        update();
        System.out.println("------------------------");

        int number = sum(5,7);
        System.out.println(number);

        int sum = sum2(1,3,4,6);
        System.out.println(sum);
    }

    public static void add(){
        System.out.println("Added.");
    }
    public static void delete(){
        System.out.println("Deleted.");
    }
    public static void update(){
        System.out.println("Updated.");
    }
    public static String city(){
        return "Ankara";
    }
    public static int sum(int number1, int number2){
        return number1+number2;
    }
    public static int sum2(int... numbers){
        int sum =0;

        for(int num: numbers ){
            sum +=num;
        }
        return sum;
    }
}
