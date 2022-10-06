public class miniProjeAsalSayi {
    public static void main(String[] args) {
        int number = -3;
        boolean primeNumber = true;

        if(number == 1){
            System.out.println(number + " is not prime number.");
            return;
        } else if (number < 1) {
            System.out.println("Gecersiz sayi !!!");
            return;
        }

        for(int i=2;i<number;i++){
            if(number % i == 0){
                primeNumber = false;
            }
        }

        if(primeNumber){
            System.out.println(number + " is prime number.");
        }else{
            System.out.println(number + " is not prime number.");
        }
    }
}