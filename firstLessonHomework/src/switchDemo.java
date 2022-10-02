public class switchDemo {
    public static void main(String[] args){
        char grade = 'C';

        switch (grade) {
            case 'A':
                System.out.println("Mukemmel :Gectiniz.");
                break;
            case 'B':
                System.out.println("Cok guzel :Gecdiniz.");
                break;
            case 'C':
                System.out.println("Iyi :Gecdiniz.");
                break;
            case 'D':
                System.out.println("Fena Degil :Gecdiniz.");
                break;
            case 'F':
                System.out.println("Malesef :Kaldiniz.");
                break;
            default:
                System.out.println("Gecersiz not girdiniz.");
                break;
        }
    }

}
