public class reCapDemo1 {
    public static void main(String[] args) {
        int a = 120;
        int b = 25;
        int c = 32;

        // my program 
        if(a > b){
            if(a > c){
                System.out.println(a + " en buyukdur.");
            }else{
                System.out.println(c + " en buyuktur.");
            }
        }else{
            if(b>c){
                System.out.println(b + " en buyuktur.");
            }else{
                System.out.println(c + " en buyuktur.");
            }
        }
        
        //teacher program
        int enbuyuk = a;

        if(enbuyuk < b){
            enbuyuk = b;
        }
        if(enbuyuk < c){
            enbuyuk = c;
        }

        System.out.println("En buyuk sayi: " + enbuyuk);
    }
}
